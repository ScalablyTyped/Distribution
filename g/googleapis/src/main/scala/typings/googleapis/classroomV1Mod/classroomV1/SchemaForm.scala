package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Google Forms item.
  */
trait SchemaForm extends StObject {
  
  /**
    * URL of the form.
    */
  var formUrl: js.UndefOr[String] = js.undefined
  
  /**
    * URL of the form responses document. Only set if respsonses have been
    * recorded and only when the requesting user is an editor of the form.
    * Read-only.
    */
  var responseUrl: js.UndefOr[String] = js.undefined
  
  /**
    * URL of a thumbnail image of the Form.  Read-only.
    */
  var thumbnailUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Title of the Form.  Read-only.
    */
  var title: js.UndefOr[String] = js.undefined
}
object SchemaForm {
  
  @scala.inline
  def apply(): SchemaForm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaForm]
  }
  
  @scala.inline
  implicit class SchemaFormMutableBuilder[Self <: SchemaForm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormUrl(value: String): Self = StObject.set(x, "formUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormUrlUndefined: Self = StObject.set(x, "formUrl", js.undefined)
    
    @scala.inline
    def setResponseUrl(value: String): Self = StObject.set(x, "responseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseUrlUndefined: Self = StObject.set(x, "responseUrl", js.undefined)
    
    @scala.inline
    def setThumbnailUrl(value: String): Self = StObject.set(x, "thumbnailUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailUrlUndefined: Self = StObject.set(x, "thumbnailUrl", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
