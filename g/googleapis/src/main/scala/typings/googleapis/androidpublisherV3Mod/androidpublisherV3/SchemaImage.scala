package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaImage extends StObject {
  
  /**
    * A unique id representing this image.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * A sha1 hash of the image that was uploaded.
    */
  var sha1: js.UndefOr[String] = js.undefined
  
  /**
    * A URL that will serve a preview of the image.
    */
  var url: js.UndefOr[String] = js.undefined
}
object SchemaImage {
  
  @scala.inline
  def apply(): SchemaImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImage]
  }
  
  @scala.inline
  implicit class SchemaImageMutableBuilder[Self <: SchemaImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setSha1(value: String): Self = StObject.set(x, "sha1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha1Undefined: Self = StObject.set(x, "sha1", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
