package typings.fabric.anon

import typings.fabric.fabricImplMod.Object
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait E extends js.Object {
  var e: js.UndefOr[Event] = js.undefined
  var `object`: js.UndefOr[Object] = js.undefined
}

object E {
  @scala.inline
  def apply(e: Event = null, `object`: Object = null): E = {
    val __obj = js.Dynamic.literal()
    if (e != null) __obj.updateDynamic("e")(e.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[E]
  }
}

