package typings.fabric

import typings.fabric.fabricDashImplMod.Object
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_E extends js.Object {
  var e: js.UndefOr[Event] = js.undefined
  var `object`: js.UndefOr[Object] = js.undefined
}

object Anon_E {
  @scala.inline
  def apply(e: Event = null, `object`: Object = null): Anon_E = {
    val __obj = js.Dynamic.literal()
    if (e != null) __obj.updateDynamic("e")(e)
    if (`object` != null) __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[Anon_E]
  }
}

