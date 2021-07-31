package typings.googleapis.booksV1Mod.booksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAnnotationdata extends StObject {
  
  /**
    * The type of annotation this data is for.
    */
  var annotationType: js.UndefOr[String] = js.undefined
  
  var data: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Base64 encoded data for this annotation data.
    */
  var encoded_data: js.UndefOr[String] = js.undefined
  
  /**
    * Unique id for this annotation data.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Resource Type
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The Layer id for this data. *
    */
  var layerId: js.UndefOr[String] = js.undefined
  
  /**
    * URL for this resource. *
    */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * Timestamp for the last time this data was updated. (RFC 3339 UTC
    * date-time format).
    */
  var updated: js.UndefOr[String] = js.undefined
  
  /**
    * The volume id for this data. *
    */
  var volumeId: js.UndefOr[String] = js.undefined
}
object SchemaAnnotationdata {
  
  @scala.inline
  def apply(): SchemaAnnotationdata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnnotationdata]
  }
  
  @scala.inline
  implicit class SchemaAnnotationdataMutableBuilder[Self <: SchemaAnnotationdata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotationType(value: String): Self = StObject.set(x, "annotationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationTypeUndefined: Self = StObject.set(x, "annotationType", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setEncoded_data(value: String): Self = StObject.set(x, "encoded_data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncoded_dataUndefined: Self = StObject.set(x, "encoded_data", js.undefined)
    
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
    def setVolumeId(value: String): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeIdUndefined: Self = StObject.set(x, "volumeId", js.undefined)
  }
}
