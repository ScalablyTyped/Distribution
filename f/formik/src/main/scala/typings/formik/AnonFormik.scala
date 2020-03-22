package typings.formik

import typings.formik.typesMod.FormikContextType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFormik[Values] extends js.Object {
  var formik: FormikContextType[Values]
}

object AnonFormik {
  @scala.inline
  def apply[Values](formik: FormikContextType[Values]): AnonFormik[Values] = {
    val __obj = js.Dynamic.literal(formik = formik.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFormik[Values]]
  }
}

