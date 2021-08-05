package typings.ecmarkdown.nodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdToken extends StObject {
  
  var location: LocationRange
  
  var name: id
  
  var value: String
}
object IdToken {
  
  inline def apply(location: LocationRange, value: String): IdToken = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], name = "id", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdToken]
  }
  
  extension [Self <: IdToken](x: Self) {
    
    inline def setLocation(value: LocationRange): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setName(value: id): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
