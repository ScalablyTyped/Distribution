package typings.firebase

import org.scalablytyped.runtime.StringDictionary
import typings.firebase.mod.analytics.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPromotionid
  extends /* key */ StringDictionary[js.Any] {
  var items: js.UndefOr[js.Array[Item]] = js.undefined
  var promotion_id: js.UndefOr[String] = js.undefined
  var promotion_name: js.UndefOr[String] = js.undefined
}

object AnonPromotionid {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    items: js.Array[Item] = null,
    promotion_id: String = null,
    promotion_name: String = null
  ): AnonPromotionid = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (promotion_id != null) __obj.updateDynamic("promotion_id")(promotion_id.asInstanceOf[js.Any])
    if (promotion_name != null) __obj.updateDynamic("promotion_name")(promotion_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPromotionid]
  }
}

