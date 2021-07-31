package typings.gapiPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverPhoto extends StObject {
  
  var metadata: FieldMetadata
  
  var url: String
}
object CoverPhoto {
  
  @scala.inline
  def apply(metadata: FieldMetadata, url: String): CoverPhoto = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverPhoto]
  }
  
  @scala.inline
  implicit class CoverPhotoMutableBuilder[Self <: CoverPhoto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
