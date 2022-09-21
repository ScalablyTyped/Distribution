package typings.googleapis.booksV1Mod.booksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLayersAnnotationdataList
  extends StObject
     with StandardParameters {
  
  /**
    * The list of Annotation Data Ids to retrieve. Pagination is ignored if this is set.
    */
  var annotationDataId: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The content version for the requested volume.
    */
  var contentVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The requested pixel height for any images. If height is provided width must also be provided.
    */
  var h: js.UndefOr[Double] = js.undefined
  
  /**
    * The ID for the layer to get the annotation data.
    */
  var layerId: js.UndefOr[String] = js.undefined
  
  /**
    * The locale information for the data. ISO-639-1 language and ISO-3166-1 country code. Ex: 'en_US'.
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
    * RFC 3339 timestamp to restrict to items updated prior to this timestamp (exclusive).
    */
  var updatedMax: js.UndefOr[String] = js.undefined
  
  /**
    * RFC 3339 timestamp to restrict to items updated since this timestamp (inclusive).
    */
  var updatedMin: js.UndefOr[String] = js.undefined
  
  /**
    * The volume to retrieve annotation data for.
    */
  var volumeId: js.UndefOr[String] = js.undefined
  
  /**
    * The requested pixel width for any images. If width is provided height must also be provided.
    */
  var w: js.UndefOr[Double] = js.undefined
}
object ParamsResourceLayersAnnotationdataList {
  
  inline def apply(): ParamsResourceLayersAnnotationdataList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLayersAnnotationdataList]
  }
  
  extension [Self <: ParamsResourceLayersAnnotationdataList](x: Self) {
    
    inline def setAnnotationDataId(value: js.Array[String]): Self = StObject.set(x, "annotationDataId", value.asInstanceOf[js.Any])
    
    inline def setAnnotationDataIdUndefined: Self = StObject.set(x, "annotationDataId", js.undefined)
    
    inline def setAnnotationDataIdVarargs(value: String*): Self = StObject.set(x, "annotationDataId", js.Array(value*))
    
    inline def setContentVersion(value: String): Self = StObject.set(x, "contentVersion", value.asInstanceOf[js.Any])
    
    inline def setContentVersionUndefined: Self = StObject.set(x, "contentVersion", js.undefined)
    
    inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
    
    inline def setLayerId(value: String): Self = StObject.set(x, "layerId", value.asInstanceOf[js.Any])
    
    inline def setLayerIdUndefined: Self = StObject.set(x, "layerId", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setUpdatedMax(value: String): Self = StObject.set(x, "updatedMax", value.asInstanceOf[js.Any])
    
    inline def setUpdatedMaxUndefined: Self = StObject.set(x, "updatedMax", js.undefined)
    
    inline def setUpdatedMin(value: String): Self = StObject.set(x, "updatedMin", value.asInstanceOf[js.Any])
    
    inline def setUpdatedMinUndefined: Self = StObject.set(x, "updatedMin", js.undefined)
    
    inline def setVolumeId(value: String): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
    
    inline def setVolumeIdUndefined: Self = StObject.set(x, "volumeId", js.undefined)
    
    inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    inline def setWUndefined: Self = StObject.set(x, "w", js.undefined)
  }
}
