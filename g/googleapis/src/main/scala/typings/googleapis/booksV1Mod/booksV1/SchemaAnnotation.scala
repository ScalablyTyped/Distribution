package typings.googleapis.booksV1Mod.booksV1

import typings.googleapis.anon.AllowedCharacterCount
import typings.googleapis.anon.CfiRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAnnotation extends StObject {
  
  /**
    * Anchor text after excerpt. For requests, if the user bookmarked a screen that has no flowing text on it, then this field should be empty.
    */
  var afterSelectedText: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Anchor text before excerpt. For requests, if the user bookmarked a screen that has no flowing text on it, then this field should be empty.
    */
  var beforeSelectedText: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Selection ranges sent from the client.
    */
  var clientVersionRanges: js.UndefOr[CfiRange | Null] = js.undefined
  
  /**
    * Timestamp for the created time of this annotation.
    */
  var created: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Selection ranges for the most recent content version.
    */
  var currentVersionRanges: js.UndefOr[CfiRange | Null] = js.undefined
  
  /**
    * User-created data for this annotation.
    */
  var data: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates that this annotation is deleted.
    */
  var deleted: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The highlight style for this annotation.
    */
  var highlightStyle: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Id of this annotation, in the form of a GUID.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The layer this annotation is for.
    */
  var layerId: js.UndefOr[String | Null] = js.undefined
  
  var layerSummary: js.UndefOr[AllowedCharacterCount | Null] = js.undefined
  
  /**
    * Pages that this annotation spans.
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
    * Timestamp for the last time this annotation was modified.
    */
  var updated: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The volume that this annotation belongs to.
    */
  var volumeId: js.UndefOr[String | Null] = js.undefined
}
object SchemaAnnotation {
  
  inline def apply(): SchemaAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnnotation]
  }
  
  extension [Self <: SchemaAnnotation](x: Self) {
    
    inline def setAfterSelectedText(value: String): Self = StObject.set(x, "afterSelectedText", value.asInstanceOf[js.Any])
    
    inline def setAfterSelectedTextNull: Self = StObject.set(x, "afterSelectedText", null)
    
    inline def setAfterSelectedTextUndefined: Self = StObject.set(x, "afterSelectedText", js.undefined)
    
    inline def setBeforeSelectedText(value: String): Self = StObject.set(x, "beforeSelectedText", value.asInstanceOf[js.Any])
    
    inline def setBeforeSelectedTextNull: Self = StObject.set(x, "beforeSelectedText", null)
    
    inline def setBeforeSelectedTextUndefined: Self = StObject.set(x, "beforeSelectedText", js.undefined)
    
    inline def setClientVersionRanges(value: CfiRange): Self = StObject.set(x, "clientVersionRanges", value.asInstanceOf[js.Any])
    
    inline def setClientVersionRangesNull: Self = StObject.set(x, "clientVersionRanges", null)
    
    inline def setClientVersionRangesUndefined: Self = StObject.set(x, "clientVersionRanges", js.undefined)
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedNull: Self = StObject.set(x, "created", null)
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setCurrentVersionRanges(value: CfiRange): Self = StObject.set(x, "currentVersionRanges", value.asInstanceOf[js.Any])
    
    inline def setCurrentVersionRangesNull: Self = StObject.set(x, "currentVersionRanges", null)
    
    inline def setCurrentVersionRangesUndefined: Self = StObject.set(x, "currentVersionRanges", js.undefined)
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataNull: Self = StObject.set(x, "data", null)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedNull: Self = StObject.set(x, "deleted", null)
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setHighlightStyle(value: String): Self = StObject.set(x, "highlightStyle", value.asInstanceOf[js.Any])
    
    inline def setHighlightStyleNull: Self = StObject.set(x, "highlightStyle", null)
    
    inline def setHighlightStyleUndefined: Self = StObject.set(x, "highlightStyle", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLayerId(value: String): Self = StObject.set(x, "layerId", value.asInstanceOf[js.Any])
    
    inline def setLayerIdNull: Self = StObject.set(x, "layerId", null)
    
    inline def setLayerIdUndefined: Self = StObject.set(x, "layerId", js.undefined)
    
    inline def setLayerSummary(value: AllowedCharacterCount): Self = StObject.set(x, "layerSummary", value.asInstanceOf[js.Any])
    
    inline def setLayerSummaryNull: Self = StObject.set(x, "layerSummary", null)
    
    inline def setLayerSummaryUndefined: Self = StObject.set(x, "layerSummary", js.undefined)
    
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
