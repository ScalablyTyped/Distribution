package typings.googleapis.booksV1Mod.booksV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceMylibraryAnnotationsList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The content version for the requested volume.
    */
  var contentVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The layer ID to limit annotation by.
    */
  var layerId: js.UndefOr[String] = js.undefined
  
  /**
    * The layer ID(s) to limit annotation by.
    */
  var layerIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Maximum number of results to return
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * The value of the nextToken from the previous page.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Set to true to return deleted annotations. updatedMin must be in the
    * request to use this. Defaults to false.
    */
  var showDeleted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * String to identify the originator of this request.
    */
  var source: js.UndefOr[String] = js.undefined
  
  /**
    * RFC 3339 timestamp to restrict to items updated prior to this timestamp
    * (exclusive).
    */
  var updatedMax: js.UndefOr[String] = js.undefined
  
  /**
    * RFC 3339 timestamp to restrict to items updated since this timestamp
    * (inclusive).
    */
  var updatedMin: js.UndefOr[String] = js.undefined
  
  /**
    * The volume to restrict annotations to.
    */
  var volumeId: js.UndefOr[String] = js.undefined
}
object ParamsResourceMylibraryAnnotationsList {
  
  @scala.inline
  def apply(): ParamsResourceMylibraryAnnotationsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMylibraryAnnotationsList]
  }
  
  @scala.inline
  implicit class ParamsResourceMylibraryAnnotationsListMutableBuilder[Self <: ParamsResourceMylibraryAnnotationsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setContentVersion(value: String): Self = StObject.set(x, "contentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentVersionUndefined: Self = StObject.set(x, "contentVersion", js.undefined)
    
    @scala.inline
    def setLayerId(value: String): Self = StObject.set(x, "layerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerIdUndefined: Self = StObject.set(x, "layerId", js.undefined)
    
    @scala.inline
    def setLayerIds(value: js.Array[String]): Self = StObject.set(x, "layerIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerIdsUndefined: Self = StObject.set(x, "layerIds", js.undefined)
    
    @scala.inline
    def setLayerIdsVarargs(value: String*): Self = StObject.set(x, "layerIds", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setShowDeleted(value: Boolean): Self = StObject.set(x, "showDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowDeletedUndefined: Self = StObject.set(x, "showDeleted", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setUpdatedMax(value: String): Self = StObject.set(x, "updatedMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedMaxUndefined: Self = StObject.set(x, "updatedMax", js.undefined)
    
    @scala.inline
    def setUpdatedMin(value: String): Self = StObject.set(x, "updatedMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedMinUndefined: Self = StObject.set(x, "updatedMin", js.undefined)
    
    @scala.inline
    def setVolumeId(value: String): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeIdUndefined: Self = StObject.set(x, "volumeId", js.undefined)
  }
}
