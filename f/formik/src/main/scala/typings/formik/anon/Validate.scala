package typings.formik.anon

import typings.formik.typesMod.FieldValidator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Validate extends js.Object {
  
  var validate: js.UndefOr[FieldValidator] = js.native
}
object Validate {
  
  @scala.inline
  def apply(): Validate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Validate]
  }
  
  @scala.inline
  implicit class ValidateOps[Self <: Validate] (val x: Self) extends AnyVal {
    
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
    def setValidate(value: /* value */ js.Any => String | Unit | (js.Promise[String | Unit])): Self = this.set("validate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
  }
}
