package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Asset extends js.Object {
  var aliasId: js.UndefOr[js.Array[String]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[js.Array[String]] = js.undefined
  var matchPolicy: js.UndefOr[AssetMatchPolicy] = js.undefined
  var matchPolicyEffective: js.UndefOr[AssetMatchPolicy] = js.undefined
  var matchPolicyMine: js.UndefOr[AssetMatchPolicy] = js.undefined
  var metadata: js.UndefOr[Metadata] = js.undefined
  var metadataEffective: js.UndefOr[Metadata] = js.undefined
  var metadataMine: js.UndefOr[Metadata] = js.undefined
  var ownership: js.UndefOr[RightsOwnership] = js.undefined
  var ownershipConflicts: js.UndefOr[OwnershipConflicts] = js.undefined
  var ownershipEffective: js.UndefOr[RightsOwnership] = js.undefined
  var ownershipMine: js.UndefOr[RightsOwnership] = js.undefined
  var status: js.UndefOr[String] = js.undefined
  var timeCreated: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object Asset {
  @scala.inline
  def apply(
    aliasId: js.Array[String] = null,
    id: String = null,
    kind: String = null,
    label: js.Array[String] = null,
    matchPolicy: AssetMatchPolicy = null,
    matchPolicyEffective: AssetMatchPolicy = null,
    matchPolicyMine: AssetMatchPolicy = null,
    metadata: Metadata = null,
    metadataEffective: Metadata = null,
    metadataMine: Metadata = null,
    ownership: RightsOwnership = null,
    ownershipConflicts: OwnershipConflicts = null,
    ownershipEffective: RightsOwnership = null,
    ownershipMine: RightsOwnership = null,
    status: String = null,
    timeCreated: String = null,
    `type`: String = null
  ): Asset = {
    val __obj = js.Dynamic.literal()
    if (aliasId != null) __obj.updateDynamic("aliasId")(aliasId)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (label != null) __obj.updateDynamic("label")(label)
    if (matchPolicy != null) __obj.updateDynamic("matchPolicy")(matchPolicy)
    if (matchPolicyEffective != null) __obj.updateDynamic("matchPolicyEffective")(matchPolicyEffective)
    if (matchPolicyMine != null) __obj.updateDynamic("matchPolicyMine")(matchPolicyMine)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (metadataEffective != null) __obj.updateDynamic("metadataEffective")(metadataEffective)
    if (metadataMine != null) __obj.updateDynamic("metadataMine")(metadataMine)
    if (ownership != null) __obj.updateDynamic("ownership")(ownership)
    if (ownershipConflicts != null) __obj.updateDynamic("ownershipConflicts")(ownershipConflicts)
    if (ownershipEffective != null) __obj.updateDynamic("ownershipEffective")(ownershipEffective)
    if (ownershipMine != null) __obj.updateDynamic("ownershipMine")(ownershipMine)
    if (status != null) __obj.updateDynamic("status")(status)
    if (timeCreated != null) __obj.updateDynamic("timeCreated")(timeCreated)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Asset]
  }
}

