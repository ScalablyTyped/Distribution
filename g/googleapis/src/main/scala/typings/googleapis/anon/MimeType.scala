package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MimeType extends StObject {
  
  var image: js.UndefOr[String] = js.undefined
  
  var mimeType: js.UndefOr[String] = js.undefined
}
object MimeType {
  
  @scala.inline
  def apply(): MimeType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MimeType]
  }
  
  @scala.inline
  implicit class MimeTypeMutableBuilder[Self <: MimeType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
  }
}
