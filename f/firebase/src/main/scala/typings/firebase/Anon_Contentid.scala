package typings.firebase

import org.scalablytyped.runtime.StringDictionary
import typings.firebase.firebaseMod.analyticsNs.Item
import typings.firebase.firebaseMod.analyticsNs.Promotion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Contentid
  extends /* key */ StringDictionary[js.Any] {
  var content_id: js.UndefOr[String] = js.undefined
  var content_type: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[js.Array[Item]] = js.undefined
  var promotions: js.UndefOr[js.Array[Promotion]] = js.undefined
}

object Anon_Contentid {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    content_id: String = null,
    content_type: String = null,
    items: js.Array[Item] = null,
    promotions: js.Array[Promotion] = null
  ): Anon_Contentid = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (content_id != null) __obj.updateDynamic("content_id")(content_id)
    if (content_type != null) __obj.updateDynamic("content_type")(content_type)
    if (items != null) __obj.updateDynamic("items")(items)
    if (promotions != null) __obj.updateDynamic("promotions")(promotions)
    __obj.asInstanceOf[Anon_Contentid]
  }
}

