package typings.googleapis.booksV1Mod.booksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLayersVolumeannotationsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the volume annotation to retrieve.
    */
  var annotationId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID for the layer to get the annotations.
    */
  var layerId: js.UndefOr[String] = js.undefined
  
  /**
    * The locale information for the data. ISO-639-1 language and ISO-3166-1 country code. Ex: 'en_US'.
    */
  var locale: js.UndefOr[String] = js.undefined
  
  /**
    * String to identify the originator of this request.
    */
  var source: js.UndefOr[String] = js.undefined
  
  /**
    * The volume to retrieve annotations for.
    */
  var volumeId: js.UndefOr[String] = js.undefined
}
object ParamsResourceLayersVolumeannotationsGet {
  
  inline def apply(): ParamsResourceLayersVolumeannotationsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLayersVolumeannotationsGet]
  }
  
  extension [Self <: ParamsResourceLayersVolumeannotationsGet](x: Self) {
    
    inline def setAnnotationId(value: String): Self = StObject.set(x, "annotationId", value.asInstanceOf[js.Any])
    
    inline def setAnnotationIdUndefined: Self = StObject.set(x, "annotationId", js.undefined)
    
    inline def setLayerId(value: String): Self = StObject.set(x, "layerId", value.asInstanceOf[js.Any])
    
    inline def setLayerIdUndefined: Self = StObject.set(x, "layerId", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setVolumeId(value: String): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
    
    inline def setVolumeIdUndefined: Self = StObject.set(x, "volumeId", js.undefined)
  }
}
