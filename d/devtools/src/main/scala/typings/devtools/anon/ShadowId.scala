package typings.devtools.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShadowId extends StObject {
  
  var shadowId: String
  
  var `using`: String
  
  var value: String
}
object ShadowId {
  
  inline def apply(shadowId: String, `using`: String, value: String): ShadowId = {
    val __obj = js.Dynamic.literal(shadowId = shadowId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("using")(`using`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowId]
  }
  
  extension [Self <: ShadowId](x: Self) {
    
    inline def setShadowId(value: String): Self = StObject.set(x, "shadowId", value.asInstanceOf[js.Any])
    
    inline def setUsing(value: String): Self = StObject.set(x, "using", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
