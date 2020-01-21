package typings.firebaseAnalyticsTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Promotion extends js.Object {
  var creative_name: js.UndefOr[String] = js.undefined
  var creative_slot: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object Promotion {
  @scala.inline
  def apply(creative_name: String = null, creative_slot: String = null, id: String = null, name: String = null): Promotion = {
    val __obj = js.Dynamic.literal()
    if (creative_name != null) __obj.updateDynamic("creative_name")(creative_name.asInstanceOf[js.Any])
    if (creative_slot != null) __obj.updateDynamic("creative_slot")(creative_slot.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Promotion]
  }
}

