package typings.googleapis.booksV1Mod.booksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLayersAnnotationdataGet
  extends StObject
     with StandardParameters {
  
  /**
    * For the dictionary layer. Whether or not to allow web definitions.
    */
  var allowWebDefinitions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the annotation data to retrieve.
    */
  var annotationDataId: js.UndefOr[String] = js.undefined
  
  /**
    * The content version for the volume you are trying to retrieve.
    */
  var contentVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The requested pixel height for any images. If height is provided width must also be provided.
    */
  var h: js.UndefOr[Double] = js.undefined
  
  /**
    * The ID for the layer to get the annotations.
    */
  var layerId: js.UndefOr[String] = js.undefined
  
  /**
    * The locale information for the data. ISO-639-1 language and ISO-3166-1 country code. Ex: 'en_US'.
    */
  var locale: js.UndefOr[String] = js.undefined
  
  /**
    * The requested scale for the image.
    */
  var scale: js.UndefOr[Double] = js.undefined
  
  /**
    * String to identify the originator of this request.
    */
  var source: js.UndefOr[String] = js.undefined
  
  /**
    * The volume to retrieve annotations for.
    */
  var volumeId: js.UndefOr[String] = js.undefined
  
  /**
    * The requested pixel width for any images. If width is provided height must also be provided.
    */
  var w: js.UndefOr[Double] = js.undefined
}
object ParamsResourceLayersAnnotationdataGet {
  
  inline def apply(): ParamsResourceLayersAnnotationdataGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLayersAnnotationdataGet]
  }
  
  extension [Self <: ParamsResourceLayersAnnotationdataGet](x: Self) {
    
    inline def setAllowWebDefinitions(value: Boolean): Self = StObject.set(x, "allowWebDefinitions", value.asInstanceOf[js.Any])
    
    inline def setAllowWebDefinitionsUndefined: Self = StObject.set(x, "allowWebDefinitions", js.undefined)
    
    inline def setAnnotationDataId(value: String): Self = StObject.set(x, "annotationDataId", value.asInstanceOf[js.Any])
    
    inline def setAnnotationDataIdUndefined: Self = StObject.set(x, "annotationDataId", js.undefined)
    
    inline def setContentVersion(value: String): Self = StObject.set(x, "contentVersion", value.asInstanceOf[js.Any])
    
    inline def setContentVersionUndefined: Self = StObject.set(x, "contentVersion", js.undefined)
    
    inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
    
    inline def setLayerId(value: String): Self = StObject.set(x, "layerId", value.asInstanceOf[js.Any])
    
    inline def setLayerIdUndefined: Self = StObject.set(x, "layerId", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setVolumeId(value: String): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
    
    inline def setVolumeIdUndefined: Self = StObject.set(x, "volumeId", js.undefined)
    
    inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    inline def setWUndefined: Self = StObject.set(x, "w", js.undefined)
  }
}
