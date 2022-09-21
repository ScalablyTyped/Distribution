package typings.googleAppsScript.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconUri extends StObject {
  
  var iconUri: String
  
  var key: Type
  
  var name: String
}
object IconUri {
  
  inline def apply(iconUri: String, key: Type, name: String): IconUri = {
    val __obj = js.Dynamic.literal(iconUri = iconUri.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconUri]
  }
  
  extension [Self <: IconUri](x: Self) {
    
    inline def setIconUri(value: String): Self = StObject.set(x, "iconUri", value.asInstanceOf[js.Any])
    
    inline def setKey(value: Type): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
