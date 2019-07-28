package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs

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
    if (childAssetId != null) __obj.updateDynamic("childAssetId")(childAssetId)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (parentAssetId != null) __obj.updateDynamic("parentAssetId")(parentAssetId)
    __obj.asInstanceOf[AssetRelationship]
  }
}

