package typings.expoConfigPlugins.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpoUsername extends StObject {
  
  var expoUsername: String | Null
}
object ExpoUsername {
  
  inline def apply(): ExpoUsername = {
    val __obj = js.Dynamic.literal(expoUsername = null)
    __obj.asInstanceOf[ExpoUsername]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExpoUsername] (val x: Self) extends AnyVal {
    
    inline def setExpoUsername(value: String): Self = StObject.set(x, "expoUsername", value.asInstanceOf[js.Any])
    
    inline def setExpoUsernameNull: Self = StObject.set(x, "expoUsername", null)
  }
}
