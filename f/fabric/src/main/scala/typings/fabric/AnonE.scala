package typings.fabric

import typings.fabric.fabricImplMod.Object
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonE extends js.Object {
  var e: js.UndefOr[Event_] = js.undefined
  var `object`: js.UndefOr[Object] = js.undefined
}

object AnonE {
  @scala.inline
  def apply(e: Event_ = null, `object`: Object = null): AnonE = {
    val __obj = js.Dynamic.literal()
    if (e != null) __obj.updateDynamic("e")(e.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonE]
  }
}

