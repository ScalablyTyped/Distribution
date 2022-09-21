package typings.googleapis.booksV1Mod.booksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceVolumesUseruploadedList
  extends StObject
     with StandardParameters {
  
  /**
    * ISO-639-1 language and ISO-3166-1 country code. Ex: 'en_US'. Used for generating recommendations.
    */
  var locale: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum number of results to return.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * The processing state of the user uploaded volumes to be returned.
    */
  var processingState: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * String to identify the originator of this request.
    */
  var source: js.UndefOr[String] = js.undefined
  
  /**
    * Index of the first result to return (starts at 0)
    */
  var startIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * The ids of the volumes to be returned. If not specified all that match the processingState are returned.
    */
  var volumeId: js.UndefOr[js.Array[String]] = js.undefined
}
object ParamsResourceVolumesUseruploadedList {
  
  inline def apply(): ParamsResourceVolumesUseruploadedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceVolumesUseruploadedList]
  }
  
  extension [Self <: ParamsResourceVolumesUseruploadedList](x: Self) {
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setProcessingState(value: js.Array[String]): Self = StObject.set(x, "processingState", value.asInstanceOf[js.Any])
    
    inline def setProcessingStateUndefined: Self = StObject.set(x, "processingState", js.undefined)
    
    inline def setProcessingStateVarargs(value: String*): Self = StObject.set(x, "processingState", js.Array(value*))
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
    
    inline def setVolumeId(value: js.Array[String]): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
    
    inline def setVolumeIdUndefined: Self = StObject.set(x, "volumeId", js.undefined)
    
    inline def setVolumeIdVarargs(value: String*): Self = StObject.set(x, "volumeId", js.Array(value*))
  }
}
