package typings.firefoxWebextBrowser.browser.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Lists the changes to the state of the tab that was updated. */
@js.native
trait OnUpdatedChangeInfo extends js.Object {
  
  /** The tab's new attention state. */
  var attention: js.UndefOr[Boolean] = js.native
  
  /** The tab's new audible state. */
  var audible: js.UndefOr[Boolean] = js.native
  
  /** True while the tab is not loaded with content. */
  var discarded: js.UndefOr[Boolean] = js.native
  
  /**
    * The tab's new favicon URL. This property is only present if the extension's manifest includes the `"tabs"` permission.
    */
  var favIconUrl: js.UndefOr[String] = js.native
  
  /** The tab's new hidden state. */
  var hidden: js.UndefOr[Boolean] = js.native
  
  /** Whether the document in the tab can be rendered in reader mode. */
  var isArticle: js.UndefOr[Boolean] = js.native
  
  /** The tab's new muted state and the reason for the change. */
  var mutedInfo: js.UndefOr[MutedInfo] = js.native
  
  /** The tab's new pinned state. */
  var pinned: js.UndefOr[Boolean] = js.native
  
  /** The tab's new sharing state for screen, microphone and camera. */
  var sharingState: js.UndefOr[SharingState] = js.native
  
  /** The status of the tab. Can be either _loading_ or _complete_. */
  var status: js.UndefOr[String] = js.native
  
  /**
    * The title of the tab if it has changed. This property is only present if the extension's manifest includes the `"tabs"` permission.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * The tab's URL if it has changed. This property is only present if the extension's manifest includes the `"tabs"` permission.
    */
  var url: js.UndefOr[String] = js.native
}
object OnUpdatedChangeInfo {
  
  @scala.inline
  def apply(): OnUpdatedChangeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnUpdatedChangeInfo]
  }
  
  @scala.inline
  implicit class OnUpdatedChangeInfoOps[Self <: OnUpdatedChangeInfo] (val x: Self) extends AnyVal {
    
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
    def setAttention(value: Boolean): Self = this.set("attention", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttention: Self = this.set("attention", js.undefined)
    
    @scala.inline
    def setAudible(value: Boolean): Self = this.set("audible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudible: Self = this.set("audible", js.undefined)
    
    @scala.inline
    def setDiscarded(value: Boolean): Self = this.set("discarded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiscarded: Self = this.set("discarded", js.undefined)
    
    @scala.inline
    def setFavIconUrl(value: String): Self = this.set("favIconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFavIconUrl: Self = this.set("favIconUrl", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
    @scala.inline
    def setIsArticle(value: Boolean): Self = this.set("isArticle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsArticle: Self = this.set("isArticle", js.undefined)
    
    @scala.inline
    def setMutedInfo(value: MutedInfo): Self = this.set("mutedInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMutedInfo: Self = this.set("mutedInfo", js.undefined)
    
    @scala.inline
    def setPinned(value: Boolean): Self = this.set("pinned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePinned: Self = this.set("pinned", js.undefined)
    
    @scala.inline
    def setSharingState(value: SharingState): Self = this.set("sharingState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharingState: Self = this.set("sharingState", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
