package typings.ecmarkup.anon

import typings.ecmarkup.ecmarkupStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contents extends StObject {
  
  var contents: String
  
  var location: Start
  
  var name: text
}
object Contents {
  
  inline def apply(contents: String, location: Start): Contents = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "text")
    __obj.asInstanceOf[Contents]
  }
  
  extension [Self <: Contents](x: Self) {
    
    inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: Start): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setName(value: text): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
