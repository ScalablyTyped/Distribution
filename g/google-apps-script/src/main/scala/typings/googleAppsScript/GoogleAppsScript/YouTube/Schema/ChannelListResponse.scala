package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelListResponse extends js.Object {
  
  var etag: js.UndefOr[String] = js.native
  
  var eventId: js.UndefOr[String] = js.native
  
  var items: js.UndefOr[js.Array[Channel]] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var nextPageToken: js.UndefOr[String] = js.native
  
  var pageInfo: js.UndefOr[PageInfo] = js.native
  
  var prevPageToken: js.UndefOr[String] = js.native
  
  var tokenPagination: js.UndefOr[js.Any] = js.native
  
   // Schema.TokenPagination
  var visitorId: js.UndefOr[String] = js.native
}
object ChannelListResponse {
  
  @scala.inline
  def apply(): ChannelListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelListResponse]
  }
  
  @scala.inline
  implicit class ChannelListResponseOps[Self <: ChannelListResponse] (val x: Self) extends AnyVal {
    
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
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setEventId(value: String): Self = this.set("eventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventId: Self = this.set("eventId", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: Channel*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[Channel]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setPageInfo(value: PageInfo): Self = this.set("pageInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageInfo: Self = this.set("pageInfo", js.undefined)
    
    @scala.inline
    def setPrevPageToken(value: String): Self = this.set("prevPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevPageToken: Self = this.set("prevPageToken", js.undefined)
    
    @scala.inline
    def setTokenPagination(value: js.Any): Self = this.set("tokenPagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokenPagination: Self = this.set("tokenPagination", js.undefined)
    
    @scala.inline
    def setVisitorId(value: String): Self = this.set("visitorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitorId: Self = this.set("visitorId", js.undefined)
  }
}
