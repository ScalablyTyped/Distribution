package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEvent extends js.Object {
  var e: stdLib.Event
  var target: js.UndefOr[Object] = js.undefined
  var transform: js.UndefOr[fabricLib.Anon_Corner] = js.undefined
}

object IEvent {
  @scala.inline
  def apply(e: stdLib.Event, target: Object = null, transform: fabricLib.Anon_Corner = null): IEvent = {
    val __obj = js.Dynamic.literal(e = e)
    if (target != null) __obj.updateDynamic("target")(target)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    __obj.asInstanceOf[IEvent]
  }
}

