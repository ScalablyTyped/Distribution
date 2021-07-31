package typings.googleapis.booksV1Mod.booksV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBookshelvesVolumesList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Maximum number of results to return
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * ID of bookshelf to retrieve volumes.
    */
  var shelf: js.UndefOr[String] = js.undefined
  
  /**
    * Set to true to show pre-ordered books. Defaults to false.
    */
  var showPreorders: js.UndefOr[Boolean] = js.undefined
  
  /**
    * String to identify the originator of this request.
    */
  var source: js.UndefOr[String] = js.undefined
  
  /**
    * Index of the first element to return (starts at 0)
    */
  var startIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * ID of user for whom to retrieve bookshelf volumes.
    */
  var userId: js.UndefOr[String] = js.undefined
}
object ParamsResourceBookshelvesVolumesList {
  
  @scala.inline
  def apply(): ParamsResourceBookshelvesVolumesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBookshelvesVolumesList]
  }
  
  @scala.inline
  implicit class ParamsResourceBookshelvesVolumesListMutableBuilder[Self <: ParamsResourceBookshelvesVolumesList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setShelf(value: String): Self = StObject.set(x, "shelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShelfUndefined: Self = StObject.set(x, "shelf", js.undefined)
    
    @scala.inline
    def setShowPreorders(value: Boolean): Self = StObject.set(x, "showPreorders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowPreordersUndefined: Self = StObject.set(x, "showPreorders", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
