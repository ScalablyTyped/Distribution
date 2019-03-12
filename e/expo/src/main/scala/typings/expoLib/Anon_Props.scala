package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Props[P] extends js.Object {
  var renderInteractiveComponent: js.UndefOr[js.Function1[/* props */ P, reactLib.reactMod.ReactNs.ReactElement[P]]] = js.undefined
}

object Anon_Props {
  @scala.inline
  def apply[P](renderInteractiveComponent: /* props */ P => reactLib.reactMod.ReactNs.ReactElement[P] = null): Anon_Props[P] = {
    val __obj = js.Dynamic.literal()
    if (renderInteractiveComponent != null) __obj.updateDynamic("renderInteractiveComponent")(js.Any.fromFunction1(renderInteractiveComponent))
    __obj.asInstanceOf[Anon_Props[P]]
  }
}

