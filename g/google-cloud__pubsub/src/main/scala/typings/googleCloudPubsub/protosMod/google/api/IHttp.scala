package typings.googleCloudPubsub.protosMod.google.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Http. */
trait IHttp extends StObject {
  
  /** Http fullyDecodeReservedExpansion */
  var fullyDecodeReservedExpansion: js.UndefOr[Boolean | Null] = js.undefined
  
  /** Http rules */
  var rules: js.UndefOr[js.Array[IHttpRule] | Null] = js.undefined
}
object IHttp {
  
  inline def apply(): IHttp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHttp]
  }
  
  extension [Self <: IHttp](x: Self) {
    
    inline def setFullyDecodeReservedExpansion(value: Boolean): Self = StObject.set(x, "fullyDecodeReservedExpansion", value.asInstanceOf[js.Any])
    
    inline def setFullyDecodeReservedExpansionNull: Self = StObject.set(x, "fullyDecodeReservedExpansion", null)
    
    inline def setFullyDecodeReservedExpansionUndefined: Self = StObject.set(x, "fullyDecodeReservedExpansion", js.undefined)
    
    inline def setRules(value: js.Array[IHttpRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesNull: Self = StObject.set(x, "rules", null)
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: IHttpRule*): Self = StObject.set(x, "rules", js.Array(value*))
  }
}
