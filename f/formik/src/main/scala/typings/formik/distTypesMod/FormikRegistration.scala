package typings.formik.distTypesMod

import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormikRegistration extends js.Object {
  def registerField(name: String, Comp: Component[_, js.Object, _]): Unit
  def unregisterField(name: String): Unit
}

object FormikRegistration {
  @scala.inline
  def apply(registerField: (String, Component[_, js.Object, _]) => Unit, unregisterField: String => Unit): FormikRegistration = {
    val __obj = js.Dynamic.literal(registerField = js.Any.fromFunction2(registerField), unregisterField = js.Any.fromFunction1(unregisterField))
  
    __obj.asInstanceOf[FormikRegistration]
  }
}

