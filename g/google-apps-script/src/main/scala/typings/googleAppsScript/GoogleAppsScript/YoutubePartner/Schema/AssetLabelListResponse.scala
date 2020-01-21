package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssetLabelListResponse extends js.Object {
  var items: js.UndefOr[js.Array[AssetLabel]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object AssetLabelListResponse {
  @scala.inline
  def apply(items: js.Array[AssetLabel] = null, kind: String = null): AssetLabelListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetLabelListResponse]
  }
}

