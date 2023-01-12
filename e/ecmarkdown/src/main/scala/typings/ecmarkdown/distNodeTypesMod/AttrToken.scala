package typings.ecmarkdown.distNodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.attr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrToken extends StObject {
  
  var key: String
  
  var location: LocationRange
  
  var name: attr
  
  var value: String
}
object AttrToken {
  
  inline def apply(key: String, location: LocationRange, value: String): AttrToken = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "attr", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttrToken] (val x: Self) extends AnyVal {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: LocationRange): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setName(value: attr): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
