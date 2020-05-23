package typings.firebase.anon

import org.scalablytyped.runtime.StringDictionary
import typings.firebase.mod.analytics.Item
import typings.firebase.mod.analytics.Promotion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contentid
  extends /* key */ StringDictionary[js.Any] {
  var content_id: js.UndefOr[String] = js.undefined
  var content_type: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[js.Array[Item]] = js.undefined
  var promotions: js.UndefOr[js.Array[Promotion]] = js.undefined
}

object Contentid {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    content_id: String = null,
    content_type: String = null,
    items: js.Array[Item] = null,
    promotions: js.Array[Promotion] = null
  ): Contentid = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (content_id != null) __obj.updateDynamic("content_id")(content_id.asInstanceOf[js.Any])
    if (content_type != null) __obj.updateDynamic("content_type")(content_type.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (promotions != null) __obj.updateDynamic("promotions")(promotions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contentid]
  }
}

