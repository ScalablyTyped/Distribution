package typings.expoConfigPlugins.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SKAdNetworkIdentifier extends StObject {
  
  var SKAdNetworkIdentifier: String
}
object SKAdNetworkIdentifier {
  
  inline def apply(SKAdNetworkIdentifier: String): SKAdNetworkIdentifier = {
    val __obj = js.Dynamic.literal(SKAdNetworkIdentifier = SKAdNetworkIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[SKAdNetworkIdentifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SKAdNetworkIdentifier] (val x: Self) extends AnyVal {
    
    inline def setSKAdNetworkIdentifier(value: String): Self = StObject.set(x, "SKAdNetworkIdentifier", value.asInstanceOf[js.Any])
  }
}
