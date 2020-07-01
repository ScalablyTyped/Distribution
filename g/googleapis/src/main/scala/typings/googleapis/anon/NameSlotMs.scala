package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NameSlotMs extends js.Object {
  var name: js.UndefOr[String] = js.native
  var slotMs: js.UndefOr[String] = js.native
}

object NameSlotMs {
  @scala.inline
  def apply(name: String = null, slotMs: String = null): NameSlotMs = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (slotMs != null) __obj.updateDynamic("slotMs")(slotMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameSlotMs]
  }
}

