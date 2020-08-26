package typings.formik.typesMod

import typings.formik.anon.Validate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormikRegistration extends js.Object {
  def registerField(name: String, fns: Validate): Unit = js.native
  def unregisterField(name: String): Unit = js.native
}

object FormikRegistration {
  @scala.inline
  def apply(registerField: (String, Validate) => Unit, unregisterField: String => Unit): FormikRegistration = {
    val __obj = js.Dynamic.literal(registerField = js.Any.fromFunction2(registerField), unregisterField = js.Any.fromFunction1(unregisterField))
    __obj.asInstanceOf[FormikRegistration]
  }
  @scala.inline
  implicit class FormikRegistrationOps[Self <: FormikRegistration] (val x: Self) extends AnyVal {
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
    def setRegisterField(value: (String, Validate) => Unit): Self = this.set("registerField", js.Any.fromFunction2(value))
    @scala.inline
    def setUnregisterField(value: String => Unit): Self = this.set("unregisterField", js.Any.fromFunction1(value))
  }
  
}

