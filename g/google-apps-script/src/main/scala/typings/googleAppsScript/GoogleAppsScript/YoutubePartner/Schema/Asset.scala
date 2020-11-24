package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Asset extends js.Object {
  
  var aliasId: js.UndefOr[js.Array[String]] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var label: js.UndefOr[js.Array[String]] = js.native
  
  var matchPolicy: js.UndefOr[AssetMatchPolicy] = js.native
  
  var matchPolicyEffective: js.UndefOr[AssetMatchPolicy] = js.native
  
  var matchPolicyMine: js.UndefOr[AssetMatchPolicy] = js.native
  
  var metadata: js.UndefOr[Metadata] = js.native
  
  var metadataEffective: js.UndefOr[Metadata] = js.native
  
  var metadataMine: js.UndefOr[Metadata] = js.native
  
  var ownership: js.UndefOr[RightsOwnership] = js.native
  
  var ownershipConflicts: js.UndefOr[OwnershipConflicts] = js.native
  
  var ownershipEffective: js.UndefOr[RightsOwnership] = js.native
  
  var ownershipMine: js.UndefOr[RightsOwnership] = js.native
  
  var status: js.UndefOr[String] = js.native
  
  var timeCreated: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object Asset {
  
  @scala.inline
  def apply(): Asset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Asset]
  }
  
  @scala.inline
  implicit class AssetOps[Self <: Asset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAliasIdVarargs(value: String*): Self = this.set("aliasId", js.Array(value :_*))
    
    @scala.inline
    def setAliasId(value: js.Array[String]): Self = this.set("aliasId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAliasId: Self = this.set("aliasId", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLabelVarargs(value: String*): Self = this.set("label", js.Array(value :_*))
    
    @scala.inline
    def setLabel(value: js.Array[String]): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setMatchPolicy(value: AssetMatchPolicy): Self = this.set("matchPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchPolicy: Self = this.set("matchPolicy", js.undefined)
    
    @scala.inline
    def setMatchPolicyEffective(value: AssetMatchPolicy): Self = this.set("matchPolicyEffective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchPolicyEffective: Self = this.set("matchPolicyEffective", js.undefined)
    
    @scala.inline
    def setMatchPolicyMine(value: AssetMatchPolicy): Self = this.set("matchPolicyMine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchPolicyMine: Self = this.set("matchPolicyMine", js.undefined)
    
    @scala.inline
    def setMetadata(value: Metadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setMetadataEffective(value: Metadata): Self = this.set("metadataEffective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadataEffective: Self = this.set("metadataEffective", js.undefined)
    
    @scala.inline
    def setMetadataMine(value: Metadata): Self = this.set("metadataMine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadataMine: Self = this.set("metadataMine", js.undefined)
    
    @scala.inline
    def setOwnership(value: RightsOwnership): Self = this.set("ownership", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnership: Self = this.set("ownership", js.undefined)
    
    @scala.inline
    def setOwnershipConflicts(value: OwnershipConflicts): Self = this.set("ownershipConflicts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnershipConflicts: Self = this.set("ownershipConflicts", js.undefined)
    
    @scala.inline
    def setOwnershipEffective(value: RightsOwnership): Self = this.set("ownershipEffective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnershipEffective: Self = this.set("ownershipEffective", js.undefined)
    
    @scala.inline
    def setOwnershipMine(value: RightsOwnership): Self = this.set("ownershipMine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnershipMine: Self = this.set("ownershipMine", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTimeCreated(value: String): Self = this.set("timeCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeCreated: Self = this.set("timeCreated", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
