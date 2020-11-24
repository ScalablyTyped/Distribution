package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Claim extends js.Object {
  
  var appliedPolicy: js.UndefOr[Policy] = js.native
  
  var assetId: js.UndefOr[String] = js.native
  
  var blockOutsideOwnership: js.UndefOr[Boolean] = js.native
  
  var contentType: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var isPartnerUploaded: js.UndefOr[Boolean] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var matchInfo: js.UndefOr[ClaimMatchInfo] = js.native
  
  var origin: js.UndefOr[ClaimOrigin] = js.native
  
  var policy: js.UndefOr[Policy] = js.native
  
  var status: js.UndefOr[String] = js.native
  
  var timeCreated: js.UndefOr[String] = js.native
  
  var videoId: js.UndefOr[String] = js.native
}
object Claim {
  
  @scala.inline
  def apply(): Claim = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Claim]
  }
  
  @scala.inline
  implicit class ClaimOps[Self <: Claim] (val x: Self) extends AnyVal {
    
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
    def setAppliedPolicy(value: Policy): Self = this.set("appliedPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppliedPolicy: Self = this.set("appliedPolicy", js.undefined)
    
    @scala.inline
    def setAssetId(value: String): Self = this.set("assetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssetId: Self = this.set("assetId", js.undefined)
    
    @scala.inline
    def setBlockOutsideOwnership(value: Boolean): Self = this.set("blockOutsideOwnership", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockOutsideOwnership: Self = this.set("blockOutsideOwnership", js.undefined)
    
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIsPartnerUploaded(value: Boolean): Self = this.set("isPartnerUploaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPartnerUploaded: Self = this.set("isPartnerUploaded", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setMatchInfo(value: ClaimMatchInfo): Self = this.set("matchInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchInfo: Self = this.set("matchInfo", js.undefined)
    
    @scala.inline
    def setOrigin(value: ClaimOrigin): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    
    @scala.inline
    def setPolicy(value: Policy): Self = this.set("policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicy: Self = this.set("policy", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTimeCreated(value: String): Self = this.set("timeCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeCreated: Self = this.set("timeCreated", js.undefined)
    
    @scala.inline
    def setVideoId(value: String): Self = this.set("videoId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoId: Self = this.set("videoId", js.undefined)
  }
}
