package typings.googleapis.booksV1Mod.booksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDictionaryAnnotationdata extends StObject {
  
  /**
    * The type of annotation this data is for.
    */
  var annotationType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * JSON encoded data for this dictionary annotation data. Emitted with name 'data' in JSON output. Either this or geo_data will be populated.
    */
  var data: js.UndefOr[SchemaDictlayerdata] = js.undefined
  
  /**
    * Base64 encoded data for this annotation data.
    */
  var encodedData: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Unique id for this annotation data.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource Type
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Layer id for this data. *
    */
  var layerId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URL for this resource. *
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Timestamp for the last time this data was updated. (RFC 3339 UTC date-time format).
    */
  var updated: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The volume id for this data. *
    */
  var volumeId: js.UndefOr[String | Null] = js.undefined
}
object SchemaDictionaryAnnotationdata {
  
  inline def apply(): SchemaDictionaryAnnotationdata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDictionaryAnnotationdata]
  }
  
  extension [Self <: SchemaDictionaryAnnotationdata](x: Self) {
    
    inline def setAnnotationType(value: String): Self = StObject.set(x, "annotationType", value.asInstanceOf[js.Any])
    
    inline def setAnnotationTypeNull: Self = StObject.set(x, "annotationType", null)
    
    inline def setAnnotationTypeUndefined: Self = StObject.set(x, "annotationType", js.undefined)
    
    inline def setData(value: SchemaDictlayerdata): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setEncodedData(value: String): Self = StObject.set(x, "encodedData", value.asInstanceOf[js.Any])
    
    inline def setEncodedDataNull: Self = StObject.set(x, "encodedData", null)
    
    inline def setEncodedDataUndefined: Self = StObject.set(x, "encodedData", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLayerId(value: String): Self = StObject.set(x, "layerId", value.asInstanceOf[js.Any])
    
    inline def setLayerIdNull: Self = StObject.set(x, "layerId", null)
    
    inline def setLayerIdUndefined: Self = StObject.set(x, "layerId", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedNull: Self = StObject.set(x, "updated", null)
    
    inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    
    inline def setVolumeId(value: String): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
    
    inline def setVolumeIdNull: Self = StObject.set(x, "volumeId", null)
    
    inline def setVolumeIdUndefined: Self = StObject.set(x, "volumeId", js.undefined)
  }
}
