package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssetRelationship extends js.Object {
  var childAssetId: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var parentAssetId: js.UndefOr[java.lang.String] = js.undefined
}

object AssetRelationship {
  @scala.inline
  def apply(
    childAssetId: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    parentAssetId: java.lang.String = null
  ): AssetRelationship = {
    val __obj = js.Dynamic.literal()
    if (childAssetId != null) __obj.updateDynamic("childAssetId")(childAssetId)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (parentAssetId != null) __obj.updateDynamic("parentAssetId")(parentAssetId)
    __obj.asInstanceOf[AssetRelationship]
  }
}

