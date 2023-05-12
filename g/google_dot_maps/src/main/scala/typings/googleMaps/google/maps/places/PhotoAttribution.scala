package typings.googleMaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhotoAttribution extends StObject {
  
  /**
    * Attribution text to be displayed for this Photo result.
    */
  var author: String
  
  var authorURI: String | Null
}
object PhotoAttribution {
  
  inline def apply(author: String): PhotoAttribution = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], authorURI = null)
    __obj.asInstanceOf[PhotoAttribution]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PhotoAttribution] (val x: Self) extends AnyVal {
    
    inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorURI(value: String): Self = StObject.set(x, "authorURI", value.asInstanceOf[js.Any])
    
    inline def setAuthorURINull: Self = StObject.set(x, "authorURI", null)
  }
}
