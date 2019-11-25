package typings.formik

import typings.formik.distTypesMod.FormikProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Form extends js.Object {
  var form: FormikProps[_]
  var name: String
}

object Anon_Form {
  @scala.inline
  def apply(form: FormikProps[_], name: String): Anon_Form = {
    val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Form]
  }
}

