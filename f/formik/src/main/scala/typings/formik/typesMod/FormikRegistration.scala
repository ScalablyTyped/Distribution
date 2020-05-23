package typings.formik.typesMod

import typings.formik.anon.Validate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormikRegistration extends js.Object {
  def registerField(name: String, fns: Validate): Unit
  def unregisterField(name: String): Unit
}

object FormikRegistration {
  @scala.inline
  def apply(registerField: (String, Validate) => Unit, unregisterField: String => Unit): FormikRegistration = {
    val __obj = js.Dynamic.literal(registerField = js.Any.fromFunction2(registerField), unregisterField = js.Any.fromFunction1(unregisterField))
    __obj.asInstanceOf[FormikRegistration]
  }
}

