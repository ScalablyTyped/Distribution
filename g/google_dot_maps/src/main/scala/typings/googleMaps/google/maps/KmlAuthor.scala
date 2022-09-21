package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains details of the author of a KML document or feature.
  */
trait KmlAuthor extends StObject {
  
  /**
    * The author&#39;s e-mail address, or an empty string if not specified.
    */
  var email: String
  
  /**
    * The author&#39;s name, or an empty string if not specified.
    */
  var name: String
  
  /**
    * The author&#39;s home page, or an empty string if not specified.
    */
  var uri: String
}
object KmlAuthor {
  
  inline def apply(email: String, name: String, uri: String): KmlAuthor = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[KmlAuthor]
  }
  
  extension [Self <: KmlAuthor](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
