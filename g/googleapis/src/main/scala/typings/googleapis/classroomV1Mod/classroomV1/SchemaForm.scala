package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaForm extends StObject {
  
  /**
    * URL of the form.
    */
  var formUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URL of the form responses document. Only set if respsonses have been recorded and only when the requesting user is an editor of the form. Read-only.
    */
  var responseUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URL of a thumbnail image of the Form. Read-only.
    */
  var thumbnailUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Title of the Form. Read-only.
    */
  var title: js.UndefOr[String | Null] = js.undefined
}
object SchemaForm {
  
  inline def apply(): SchemaForm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaForm]
  }
  
  extension [Self <: SchemaForm](x: Self) {
    
    inline def setFormUrl(value: String): Self = StObject.set(x, "formUrl", value.asInstanceOf[js.Any])
    
    inline def setFormUrlNull: Self = StObject.set(x, "formUrl", null)
    
    inline def setFormUrlUndefined: Self = StObject.set(x, "formUrl", js.undefined)
    
    inline def setResponseUrl(value: String): Self = StObject.set(x, "responseUrl", value.asInstanceOf[js.Any])
    
    inline def setResponseUrlNull: Self = StObject.set(x, "responseUrl", null)
    
    inline def setResponseUrlUndefined: Self = StObject.set(x, "responseUrl", js.undefined)
    
    inline def setThumbnailUrl(value: String): Self = StObject.set(x, "thumbnailUrl", value.asInstanceOf[js.Any])
    
    inline def setThumbnailUrlNull: Self = StObject.set(x, "thumbnailUrl", null)
    
    inline def setThumbnailUrlUndefined: Self = StObject.set(x, "thumbnailUrl", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
