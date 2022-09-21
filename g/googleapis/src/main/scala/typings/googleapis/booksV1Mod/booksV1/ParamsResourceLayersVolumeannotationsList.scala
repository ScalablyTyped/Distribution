package typings.googleapis.booksV1Mod.booksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLayersVolumeannotationsList
  extends StObject
     with StandardParameters {
  
  /**
    * The content version for the requested volume.
    */
  var contentVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The end offset to end retrieving data from.
    */
  var endOffset: js.UndefOr[String] = js.undefined
  
  /**
    * The end position to end retrieving data from.
    */
  var endPosition: js.UndefOr[String] = js.undefined
  
  /**
    * The ID for the layer to get the annotations.
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
    * Set to true to return deleted annotations. updatedMin must be in the request to use this. Defaults to false.
    */
  var showDeleted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * String to identify the originator of this request.
    */
  var source: js.UndefOr[String] = js.undefined
  
  /**
    * The start offset to start retrieving data from.
    */
  var startOffset: js.UndefOr[String] = js.undefined
  
  /**
    * The start position to start retrieving data from.
    */
  var startPosition: js.UndefOr[String] = js.undefined
  
  /**
    * RFC 3339 timestamp to restrict to items updated prior to this timestamp (exclusive).
    */
  var updatedMax: js.UndefOr[String] = js.undefined
  
  /**
    * RFC 3339 timestamp to restrict to items updated since this timestamp (inclusive).
    */
  var updatedMin: js.UndefOr[String] = js.undefined
  
  /**
    * The version of the volume annotations that you are requesting.
    */
  var volumeAnnotationsVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The volume to retrieve annotations for.
    */
  var volumeId: js.UndefOr[String] = js.undefined
}
object ParamsResourceLayersVolumeannotationsList {
  
  inline def apply(): ParamsResourceLayersVolumeannotationsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLayersVolumeannotationsList]
  }
  
  extension [Self <: ParamsResourceLayersVolumeannotationsList](x: Self) {
    
    inline def setContentVersion(value: String): Self = StObject.set(x, "contentVersion", value.asInstanceOf[js.Any])
    
    inline def setContentVersionUndefined: Self = StObject.set(x, "contentVersion", js.undefined)
    
    inline def setEndOffset(value: String): Self = StObject.set(x, "endOffset", value.asInstanceOf[js.Any])
    
    inline def setEndOffsetUndefined: Self = StObject.set(x, "endOffset", js.undefined)
    
    inline def setEndPosition(value: String): Self = StObject.set(x, "endPosition", value.asInstanceOf[js.Any])
    
    inline def setEndPositionUndefined: Self = StObject.set(x, "endPosition", js.undefined)
    
    inline def setLayerId(value: String): Self = StObject.set(x, "layerId", value.asInstanceOf[js.Any])
    
    inline def setLayerIdUndefined: Self = StObject.set(x, "layerId", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setShowDeleted(value: Boolean): Self = StObject.set(x, "showDeleted", value.asInstanceOf[js.Any])
    
    inline def setShowDeletedUndefined: Self = StObject.set(x, "showDeleted", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setStartOffset(value: String): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
    
    inline def setStartOffsetUndefined: Self = StObject.set(x, "startOffset", js.undefined)
    
    inline def setStartPosition(value: String): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
    
    inline def setStartPositionUndefined: Self = StObject.set(x, "startPosition", js.undefined)
    
    inline def setUpdatedMax(value: String): Self = StObject.set(x, "updatedMax", value.asInstanceOf[js.Any])
    
    inline def setUpdatedMaxUndefined: Self = StObject.set(x, "updatedMax", js.undefined)
    
    inline def setUpdatedMin(value: String): Self = StObject.set(x, "updatedMin", value.asInstanceOf[js.Any])
    
    inline def setUpdatedMinUndefined: Self = StObject.set(x, "updatedMin", js.undefined)
    
    inline def setVolumeAnnotationsVersion(value: String): Self = StObject.set(x, "volumeAnnotationsVersion", value.asInstanceOf[js.Any])
    
    inline def setVolumeAnnotationsVersionUndefined: Self = StObject.set(x, "volumeAnnotationsVersion", js.undefined)
    
    inline def setVolumeId(value: String): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
    
    inline def setVolumeIdUndefined: Self = StObject.set(x, "volumeId", js.undefined)
  }
}
