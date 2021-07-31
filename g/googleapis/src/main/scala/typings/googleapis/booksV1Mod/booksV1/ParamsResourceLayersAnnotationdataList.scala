package typings.googleapis.booksV1Mod.booksV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLayersAnnotationdataList
  extends StObject
     with StandardParameters {
  
  /**
    * The list of Annotation Data Ids to retrieve. Pagination is ignored if
    * this is set.
    */
  var annotationDataId: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The content version for the requested volume.
    */
  var contentVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The requested pixel height for any images. If height is provided width
    * must also be provided.
    */
  var h: js.UndefOr[Double] = js.undefined
  
  /**
    * The ID for the layer to get the annotation data.
    */
  var layerId: js.UndefOr[String] = js.undefined
  
  /**
    * The locale information for the data. ISO-639-1 language and ISO-3166-1
    * country code. Ex: 'en_US'.
    */
  var locale: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum number of results to return
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * The value of the nextToken from the previous page.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The requested scale for the image.
    */
  var scale: js.UndefOr[Double] = js.undefined
  
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
    * The volume to retrieve annotation data for.
    */
  var volumeId: js.UndefOr[String] = js.undefined
  
  /**
    * The requested pixel width for any images. If width is provided height
    * must also be provided.
    */
  var w: js.UndefOr[Double] = js.undefined
}
object ParamsResourceLayersAnnotationdataList {
  
  @scala.inline
  def apply(): ParamsResourceLayersAnnotationdataList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLayersAnnotationdataList]
  }
  
  @scala.inline
  implicit class ParamsResourceLayersAnnotationdataListMutableBuilder[Self <: ParamsResourceLayersAnnotationdataList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotationDataId(value: js.Array[String]): Self = StObject.set(x, "annotationDataId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationDataIdUndefined: Self = StObject.set(x, "annotationDataId", js.undefined)
    
    @scala.inline
    def setAnnotationDataIdVarargs(value: String*): Self = StObject.set(x, "annotationDataId", js.Array(value :_*))
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setContentVersion(value: String): Self = StObject.set(x, "contentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentVersionUndefined: Self = StObject.set(x, "contentVersion", js.undefined)
    
    @scala.inline
    def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHUndefined: Self = StObject.set(x, "h", js.undefined)
    
    @scala.inline
    def setLayerId(value: String): Self = StObject.set(x, "layerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerIdUndefined: Self = StObject.set(x, "layerId", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
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
    
    @scala.inline
    def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWUndefined: Self = StObject.set(x, "w", js.undefined)
  }
}
