package typings.googleapis.booksV1Mod.booksV1

import typings.googleapis.anon.ContentVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVolumeannotation extends StObject {
  
  /**
    * The annotation data id for this volume annotation.
    */
  var annotationDataId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Link to get data for this annotation.
    */
  var annotationDataLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of annotation this is.
    */
  var annotationType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The content ranges to identify the selected text.
    */
  var contentRanges: js.UndefOr[ContentVersion | Null] = js.undefined
  
  /**
    * Data for this annotation.
    */
  var data: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates that this annotation is deleted.
    */
  var deleted: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Unique id of this volume annotation.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource Type
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Layer this annotation is for.
    */
  var layerId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Pages the annotation spans.
    */
  var pageIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Excerpt from the volume.
    */
  var selectedText: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URL to this resource.
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Timestamp for the last time this anntoation was updated. (RFC 3339 UTC date-time format).
    */
  var updated: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Volume this annotation is for.
    */
  var volumeId: js.UndefOr[String | Null] = js.undefined
}
object SchemaVolumeannotation {
  
  inline def apply(): SchemaVolumeannotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVolumeannotation]
  }
  
  extension [Self <: SchemaVolumeannotation](x: Self) {
    
    inline def setAnnotationDataId(value: String): Self = StObject.set(x, "annotationDataId", value.asInstanceOf[js.Any])
    
    inline def setAnnotationDataIdNull: Self = StObject.set(x, "annotationDataId", null)
    
    inline def setAnnotationDataIdUndefined: Self = StObject.set(x, "annotationDataId", js.undefined)
    
    inline def setAnnotationDataLink(value: String): Self = StObject.set(x, "annotationDataLink", value.asInstanceOf[js.Any])
    
    inline def setAnnotationDataLinkNull: Self = StObject.set(x, "annotationDataLink", null)
    
    inline def setAnnotationDataLinkUndefined: Self = StObject.set(x, "annotationDataLink", js.undefined)
    
    inline def setAnnotationType(value: String): Self = StObject.set(x, "annotationType", value.asInstanceOf[js.Any])
    
    inline def setAnnotationTypeNull: Self = StObject.set(x, "annotationType", null)
    
    inline def setAnnotationTypeUndefined: Self = StObject.set(x, "annotationType", js.undefined)
    
    inline def setContentRanges(value: ContentVersion): Self = StObject.set(x, "contentRanges", value.asInstanceOf[js.Any])
    
    inline def setContentRangesNull: Self = StObject.set(x, "contentRanges", null)
    
    inline def setContentRangesUndefined: Self = StObject.set(x, "contentRanges", js.undefined)
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataNull: Self = StObject.set(x, "data", null)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedNull: Self = StObject.set(x, "deleted", null)
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLayerId(value: String): Self = StObject.set(x, "layerId", value.asInstanceOf[js.Any])
    
    inline def setLayerIdNull: Self = StObject.set(x, "layerId", null)
    
    inline def setLayerIdUndefined: Self = StObject.set(x, "layerId", js.undefined)
    
    inline def setPageIds(value: js.Array[String]): Self = StObject.set(x, "pageIds", value.asInstanceOf[js.Any])
    
    inline def setPageIdsNull: Self = StObject.set(x, "pageIds", null)
    
    inline def setPageIdsUndefined: Self = StObject.set(x, "pageIds", js.undefined)
    
    inline def setPageIdsVarargs(value: String*): Self = StObject.set(x, "pageIds", js.Array(value*))
    
    inline def setSelectedText(value: String): Self = StObject.set(x, "selectedText", value.asInstanceOf[js.Any])
    
    inline def setSelectedTextNull: Self = StObject.set(x, "selectedText", null)
    
    inline def setSelectedTextUndefined: Self = StObject.set(x, "selectedText", js.undefined)
    
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
