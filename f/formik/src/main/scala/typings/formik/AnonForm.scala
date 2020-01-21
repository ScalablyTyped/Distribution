package typings.formik

import typings.formik.typesMod.FormikProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonForm extends js.Object {
  var form: FormikProps[_]
  var name: String
}

object AnonForm {
  @scala.inline
  def apply(form: FormikProps[_], name: String): AnonForm = {
    val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonForm]
  }
}

