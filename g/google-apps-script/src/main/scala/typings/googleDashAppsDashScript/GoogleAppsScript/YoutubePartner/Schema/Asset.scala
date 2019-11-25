package typings.googleDashAppsDashScript.GoogleAppsScript.YoutubePartner.Schema

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
    if (aliasId != null) __obj.updateDynamic("aliasId")(aliasId.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (matchPolicy != null) __obj.updateDynamic("matchPolicy")(matchPolicy.asInstanceOf[js.Any])
    if (matchPolicyEffective != null) __obj.updateDynamic("matchPolicyEffective")(matchPolicyEffective.asInstanceOf[js.Any])
    if (matchPolicyMine != null) __obj.updateDynamic("matchPolicyMine")(matchPolicyMine.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (metadataEffective != null) __obj.updateDynamic("metadataEffective")(metadataEffective.asInstanceOf[js.Any])
    if (metadataMine != null) __obj.updateDynamic("metadataMine")(metadataMine.asInstanceOf[js.Any])
    if (ownership != null) __obj.updateDynamic("ownership")(ownership.asInstanceOf[js.Any])
    if (ownershipConflicts != null) __obj.updateDynamic("ownershipConflicts")(ownershipConflicts.asInstanceOf[js.Any])
    if (ownershipEffective != null) __obj.updateDynamic("ownershipEffective")(ownershipEffective.asInstanceOf[js.Any])
    if (ownershipMine != null) __obj.updateDynamic("ownershipMine")(ownershipMine.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (timeCreated != null) __obj.updateDynamic("timeCreated")(timeCreated.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Asset]
  }
}

