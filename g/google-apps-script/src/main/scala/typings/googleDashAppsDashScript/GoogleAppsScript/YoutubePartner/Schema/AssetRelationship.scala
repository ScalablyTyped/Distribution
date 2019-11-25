package typings.googleDashAppsDashScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssetRelationship extends js.Object {
  var childAssetId: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var parentAssetId: js.UndefOr[String] = js.undefined
}

object AssetRelationship {
  @scala.inline
  def apply(childAssetId: String = null, id: String = null, kind: String = null, parentAssetId: String = null): AssetRelationship = {
    val __obj = js.Dynamic.literal()
    if (childAssetId != null) __obj.updateDynamic("childAssetId")(childAssetId.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (parentAssetId != null) __obj.updateDynamic("parentAssetId")(parentAssetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetRelationship]
  }
}

