package typings.formik.anon

import typings.formik.typesMod.FormikContextType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Formik[Values] extends js.Object {
  
  var formik: FormikContextType[Values] = js.native
}
object Formik {
  
  @scala.inline
  def apply[Values](formik: FormikContextType[Values]): Formik[Values] = {
    val __obj = js.Dynamic.literal(formik = formik.asInstanceOf[js.Any])
    __obj.asInstanceOf[Formik[Values]]
  }
  
  @scala.inline
  implicit class FormikOps[Self <: Formik[_], Values] (val x: Self with Formik[Values]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFormik(value: FormikContextType[Values]): Self = this.set("formik", value.asInstanceOf[js.Any])
  }
}
