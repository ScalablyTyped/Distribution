package typings.firebase.anon

import org.scalablytyped.runtime.StringDictionary
import typings.firebase.mod.analytics.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Itemlistid
  extends /* key */ StringDictionary[js.Any] {
  var item_list_id: js.UndefOr[String] = js.undefined
  var item_list_name: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[js.Array[Item]] = js.undefined
}

object Itemlistid {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    item_list_id: String = null,
    item_list_name: String = null,
    items: js.Array[Item] = null
  ): Itemlistid = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (item_list_id != null) __obj.updateDynamic("item_list_id")(item_list_id.asInstanceOf[js.Any])
    if (item_list_name != null) __obj.updateDynamic("item_list_name")(item_list_name.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[Itemlistid]
  }
}

