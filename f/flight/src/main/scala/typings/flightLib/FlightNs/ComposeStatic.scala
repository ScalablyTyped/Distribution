package typings
package flightLib.FlightNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposeStatic extends js.Object {
  def mixin(base: js.Object, mixins: js.Array[js.Function]): scala.Unit
}

object ComposeStatic {
  @scala.inline
  def apply(mixin: js.Function2[js.Object, js.Array[js.Function], scala.Unit]): ComposeStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mixin")(mixin)
    __obj.asInstanceOf[ComposeStatic]
  }
}

