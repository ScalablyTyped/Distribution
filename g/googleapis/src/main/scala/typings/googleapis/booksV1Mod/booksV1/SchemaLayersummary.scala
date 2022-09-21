package typings.googleapis.booksV1Mod.booksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLayersummary extends StObject {
  
  /**
    * The number of annotations for this layer.
    */
  var annotationCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The list of annotation types contained for this layer.
    */
  var annotationTypes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Link to get data for this annotation.
    */
  var annotationsDataLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The link to get the annotations for this layer.
    */
  var annotationsLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The content version this resource is for.
    */
  var contentVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of data items for this layer.
    */
  var dataCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Unique id of this layer summary.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource Type
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The layer id for this summary.
    */
  var layerId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URL to this resource.
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Timestamp for the last time an item in this layer was updated. (RFC 3339 UTC date-time format).
    */
  var updated: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The current version of this layer's volume annotations. Note that this version applies only to the data in the books.layers.volumeAnnotations.* responses. The actual annotation data is versioned separately.
    */
  var volumeAnnotationsVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The volume id this resource is for.
    */
  var volumeId: js.UndefOr[String | Null] = js.undefined
}
object SchemaLayersummary {
  
  inline def apply(): SchemaLayersummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLayersummary]
  }
  
  extension [Self <: SchemaLayersummary](x: Self) {
    
    inline def setAnnotationCount(value: Double): Self = StObject.set(x, "annotationCount", value.asInstanceOf[js.Any])
    
    inline def setAnnotationCountNull: Self = StObject.set(x, "annotationCount", null)
    
    inline def setAnnotationCountUndefined: Self = StObject.set(x, "annotationCount", js.undefined)
    
    inline def setAnnotationTypes(value: js.Array[String]): Self = StObject.set(x, "annotationTypes", value.asInstanceOf[js.Any])
    
    inline def setAnnotationTypesNull: Self = StObject.set(x, "annotationTypes", null)
    
    inline def setAnnotationTypesUndefined: Self = StObject.set(x, "annotationTypes", js.undefined)
    
    inline def setAnnotationTypesVarargs(value: String*): Self = StObject.set(x, "annotationTypes", js.Array(value*))
    
    inline def setAnnotationsDataLink(value: String): Self = StObject.set(x, "annotationsDataLink", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsDataLinkNull: Self = StObject.set(x, "annotationsDataLink", null)
    
    inline def setAnnotationsDataLinkUndefined: Self = StObject.set(x, "annotationsDataLink", js.undefined)
    
    inline def setAnnotationsLink(value: String): Self = StObject.set(x, "annotationsLink", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsLinkNull: Self = StObject.set(x, "annotationsLink", null)
    
    inline def setAnnotationsLinkUndefined: Self = StObject.set(x, "annotationsLink", js.undefined)
    
    inline def setContentVersion(value: String): Self = StObject.set(x, "contentVersion", value.asInstanceOf[js.Any])
    
    inline def setContentVersionNull: Self = StObject.set(x, "contentVersion", null)
    
    inline def setContentVersionUndefined: Self = StObject.set(x, "contentVersion", js.undefined)
    
    inline def setDataCount(value: Double): Self = StObject.set(x, "dataCount", value.asInstanceOf[js.Any])
    
    inline def setDataCountNull: Self = StObject.set(x, "dataCount", null)
    
    inline def setDataCountUndefined: Self = StObject.set(x, "dataCount", js.undefined)
    
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
    
    inline def setVolumeAnnotationsVersion(value: String): Self = StObject.set(x, "volumeAnnotationsVersion", value.asInstanceOf[js.Any])
    
    inline def setVolumeAnnotationsVersionNull: Self = StObject.set(x, "volumeAnnotationsVersion", null)
    
    inline def setVolumeAnnotationsVersionUndefined: Self = StObject.set(x, "volumeAnnotationsVersion", js.undefined)
    
    inline def setVolumeId(value: String): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
    
    inline def setVolumeIdNull: Self = StObject.set(x, "volumeId", null)
    
    inline def setVolumeIdUndefined: Self = StObject.set(x, "volumeId", js.undefined)
  }
}
