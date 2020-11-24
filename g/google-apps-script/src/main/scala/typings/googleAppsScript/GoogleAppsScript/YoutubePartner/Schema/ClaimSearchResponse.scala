package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClaimSearchResponse extends js.Object {
  
  var items: js.UndefOr[js.Array[ClaimSnippet]] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var nextPageToken: js.UndefOr[String] = js.native
  
  var pageInfo: js.UndefOr[PageInfo] = js.native
  
  var previousPageToken: js.UndefOr[String] = js.native
}
object ClaimSearchResponse {
  
  @scala.inline
  def apply(): ClaimSearchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClaimSearchResponse]
  }
  
  @scala.inline
  implicit class ClaimSearchResponseOps[Self <: ClaimSearchResponse] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: ClaimSnippet*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[ClaimSnippet]): Self = this.set("items", value.asInstanceOf[js.Any])
    
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
    def setPreviousPageToken(value: String): Self = this.set("previousPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousPageToken: Self = this.set("previousPageToken", js.undefined)
  }
}
