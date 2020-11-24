package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClaimSnippet extends js.Object {
  
  var assetId: js.UndefOr[String] = js.native
  
  var contentType: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var isPartnerUploaded: js.UndefOr[Boolean] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var origin: js.UndefOr[ClaimSnippetOrigin] = js.native
  
  var status: js.UndefOr[String] = js.native
  
  var thirdPartyClaim: js.UndefOr[Boolean] = js.native
  
  var timeCreated: js.UndefOr[String] = js.native
  
  var timeStatusLastModified: js.UndefOr[String] = js.native
  
  var videoId: js.UndefOr[String] = js.native
  
  var videoTitle: js.UndefOr[String] = js.native
  
  var videoViews: js.UndefOr[String] = js.native
}
object ClaimSnippet {
  
  @scala.inline
  def apply(): ClaimSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClaimSnippet]
  }
  
  @scala.inline
  implicit class ClaimSnippetOps[Self <: ClaimSnippet] (val x: Self) extends AnyVal {
    
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
    def setAssetId(value: String): Self = this.set("assetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssetId: Self = this.set("assetId", js.undefined)
    
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
    def setOrigin(value: ClaimSnippetOrigin): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setThirdPartyClaim(value: Boolean): Self = this.set("thirdPartyClaim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThirdPartyClaim: Self = this.set("thirdPartyClaim", js.undefined)
    
    @scala.inline
    def setTimeCreated(value: String): Self = this.set("timeCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeCreated: Self = this.set("timeCreated", js.undefined)
    
    @scala.inline
    def setTimeStatusLastModified(value: String): Self = this.set("timeStatusLastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeStatusLastModified: Self = this.set("timeStatusLastModified", js.undefined)
    
    @scala.inline
    def setVideoId(value: String): Self = this.set("videoId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoId: Self = this.set("videoId", js.undefined)
    
    @scala.inline
    def setVideoTitle(value: String): Self = this.set("videoTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoTitle: Self = this.set("videoTitle", js.undefined)
    
    @scala.inline
    def setVideoViews(value: String): Self = this.set("videoViews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoViews: Self = this.set("videoViews", js.undefined)
  }
}
