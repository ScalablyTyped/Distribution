package typings.firebase

import org.scalablytyped.runtime.StringDictionary
import typings.firebase.mod.analytics.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemlistid
  extends /* key */ StringDictionary[js.Any] {
  var item_list_id: js.UndefOr[String] = js.undefined
  var item_list_name: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[js.Array[Item]] = js.undefined
}

object AnonItemlistid {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    item_list_id: String = null,
    item_list_name: String = null,
    items: js.Array[Item] = null
  ): AnonItemlistid = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (item_list_id != null) __obj.updateDynamic("item_list_id")(item_list_id.asInstanceOf[js.Any])
    if (item_list_name != null) __obj.updateDynamic("item_list_name")(item_list_name.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemlistid]
  }
}

