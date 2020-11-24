package typings.googleapis.booksV1Mod.booksV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceBookshelvesVolumesList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Maximum number of results to return
    */
  var maxResults: js.UndefOr[Double] = js.native
  
  /**
    * ID of bookshelf to retrieve volumes.
    */
  var shelf: js.UndefOr[String] = js.native
  
  /**
    * Set to true to show pre-ordered books. Defaults to false.
    */
  var showPreorders: js.UndefOr[Boolean] = js.native
  
  /**
    * String to identify the originator of this request.
    */
  var source: js.UndefOr[String] = js.native
  
  /**
    * Index of the first element to return (starts at 0)
    */
  var startIndex: js.UndefOr[Double] = js.native
  
  /**
    * ID of user for whom to retrieve bookshelf volumes.
    */
  var userId: js.UndefOr[String] = js.native
}
object ParamsResourceBookshelvesVolumesList {
  
  @scala.inline
  def apply(): ParamsResourceBookshelvesVolumesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBookshelvesVolumesList]
  }
  
  @scala.inline
  implicit class ParamsResourceBookshelvesVolumesListOps[Self <: ParamsResourceBookshelvesVolumesList] (val x: Self) extends AnyVal {
    
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setShelf(value: String): Self = this.set("shelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShelf: Self = this.set("shelf", js.undefined)
    
    @scala.inline
    def setShowPreorders(value: Boolean): Self = this.set("showPreorders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowPreorders: Self = this.set("showPreorders", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setStartIndex(value: Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartIndex: Self = this.set("startIndex", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
}
