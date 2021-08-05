package typings.elasticlunr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenInfo extends StObject {
  
  var ref: Double | String
  
  var tf: Double
}
object TokenInfo {
  
  inline def apply(ref: Double | String, tf: Double): TokenInfo = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any], tf = tf.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenInfo]
  }
  
  extension [Self <: TokenInfo](x: Self) {
    
    inline def setRef(value: Double | String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setTf(value: Double): Self = StObject.set(x, "tf", value.asInstanceOf[js.Any])
  }
}
