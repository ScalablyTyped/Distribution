package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_NameSlotMs extends js.Object {
  var name: js.UndefOr[String] = js.native
  var slotMs: js.UndefOr[String] = js.native
}

object Anon_NameSlotMs {
  @scala.inline
  def apply(name: String = null, slotMs: String = null): Anon_NameSlotMs = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (slotMs != null) __obj.updateDynamic("slotMs")(slotMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NameSlotMs]
  }
}

