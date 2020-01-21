package typings.formik

import typings.formik.typesMod.FormikContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFormik extends js.Object {
  var formik: FormikContext[_]
}

object AnonFormik {
  @scala.inline
  def apply(formik: FormikContext[_]): AnonFormik = {
    val __obj = js.Dynamic.literal(formik = formik.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFormik]
  }
}

