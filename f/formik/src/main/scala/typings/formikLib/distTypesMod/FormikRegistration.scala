package typings
package formikLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormikRegistration extends js.Object {
  def registerField(name: java.lang.String, Comp: reactLib.reactMod.Component[_, js.Object, _]): scala.Unit
  def unregisterField(name: java.lang.String): scala.Unit
}

object FormikRegistration {
  @scala.inline
  def apply(
    registerField: (java.lang.String, reactLib.reactMod.Component[_, js.Object, _]) => scala.Unit,
    unregisterField: java.lang.String => scala.Unit
  ): FormikRegistration = {
    val __obj = js.Dynamic.literal(registerField = js.Any.fromFunction2(registerField), unregisterField = js.Any.fromFunction1(unregisterField))
  
    __obj.asInstanceOf[FormikRegistration]
  }
}

