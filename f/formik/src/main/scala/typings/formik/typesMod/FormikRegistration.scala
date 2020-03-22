package typings.formik.typesMod

import typings.formik.AnonValidate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormikRegistration extends js.Object {
  def registerField(name: String, fns: AnonValidate): Unit
  def unregisterField(name: String): Unit
}

object FormikRegistration {
  @scala.inline
  def apply(registerField: (String, AnonValidate) => Unit, unregisterField: String => Unit): FormikRegistration = {
    val __obj = js.Dynamic.literal(registerField = js.Any.fromFunction2(registerField), unregisterField = js.Any.fromFunction1(unregisterField))
  
    __obj.asInstanceOf[FormikRegistration]
  }
}

