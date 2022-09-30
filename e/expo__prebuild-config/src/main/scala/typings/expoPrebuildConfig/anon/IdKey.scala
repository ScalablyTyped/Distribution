package typings.expoPrebuildConfig.anon

import typings.expoPrebuildConfig.expoPrebuildConfigStrings.safeArea
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdKey extends StObject {
  
  var id: String
  
  var key: String | safeArea
}
object IdKey {
  
  inline def apply(id: String, key: String | safeArea): IdKey = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdKey]
  }
  
  extension [Self <: IdKey](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String | safeArea): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
