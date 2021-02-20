package typings.googleapis.booksV1Mod.booksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaLayersummary extends StObject {
  
  /**
    * The number of annotations for this layer.
    */
  var annotationCount: js.UndefOr[Double] = js.native
  
  /**
    * The list of annotation types contained for this layer.
    */
  var annotationTypes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Link to get data for this annotation.
    */
  var annotationsDataLink: js.UndefOr[String] = js.native
  
  /**
    * The link to get the annotations for this layer.
    */
  var annotationsLink: js.UndefOr[String] = js.native
  
  /**
    * The content version this resource is for.
    */
  var contentVersion: js.UndefOr[String] = js.native
  
  /**
    * The number of data items for this layer.
    */
  var dataCount: js.UndefOr[Double] = js.native
  
  /**
    * Unique id of this layer summary.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Resource Type
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The layer id for this summary.
    */
  var layerId: js.UndefOr[String] = js.native
  
  /**
    * URL to this resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * Timestamp for the last time an item in this layer was updated. (RFC 3339
    * UTC date-time format).
    */
  var updated: js.UndefOr[String] = js.native
  
  /**
    * The current version of this layer&#39;s volume annotations. Note that
    * this version applies only to the data in the
    * books.layers.volumeAnnotations.* responses. The actual annotation data is
    * versioned separately.
    */
  var volumeAnnotationsVersion: js.UndefOr[String] = js.native
  
  /**
    * The volume id this resource is for.
    */
  var volumeId: js.UndefOr[String] = js.native
}
object SchemaLayersummary {
  
  @scala.inline
  def apply(): SchemaLayersummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLayersummary]
  }
  
  @scala.inline
  implicit class SchemaLayersummaryMutableBuilder[Self <: SchemaLayersummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotationCount(value: Double): Self = StObject.set(x, "annotationCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationCountUndefined: Self = StObject.set(x, "annotationCount", js.undefined)
    
    @scala.inline
    def setAnnotationTypes(value: js.Array[String]): Self = StObject.set(x, "annotationTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationTypesUndefined: Self = StObject.set(x, "annotationTypes", js.undefined)
    
    @scala.inline
    def setAnnotationTypesVarargs(value: String*): Self = StObject.set(x, "annotationTypes", js.Array(value :_*))
    
    @scala.inline
    def setAnnotationsDataLink(value: String): Self = StObject.set(x, "annotationsDataLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationsDataLinkUndefined: Self = StObject.set(x, "annotationsDataLink", js.undefined)
    
    @scala.inline
    def setAnnotationsLink(value: String): Self = StObject.set(x, "annotationsLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationsLinkUndefined: Self = StObject.set(x, "annotationsLink", js.undefined)
    
    @scala.inline
    def setContentVersion(value: String): Self = StObject.set(x, "contentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentVersionUndefined: Self = StObject.set(x, "contentVersion", js.undefined)
    
    @scala.inline
    def setDataCount(value: Double): Self = StObject.set(x, "dataCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataCountUndefined: Self = StObject.set(x, "dataCount", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLayerId(value: String): Self = StObject.set(x, "layerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerIdUndefined: Self = StObject.set(x, "layerId", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    
    @scala.inline
    def setVolumeAnnotationsVersion(value: String): Self = StObject.set(x, "volumeAnnotationsVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeAnnotationsVersionUndefined: Self = StObject.set(x, "volumeAnnotationsVersion", js.undefined)
    
    @scala.inline
    def setVolumeId(value: String): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeIdUndefined: Self = StObject.set(x, "volumeId", js.undefined)
  }
}
