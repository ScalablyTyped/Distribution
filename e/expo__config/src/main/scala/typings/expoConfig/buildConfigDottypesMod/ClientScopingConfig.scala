package typings.expoConfig.buildConfigDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientScopingConfig extends StObject {
  
  var scopeKey: js.UndefOr[String] = js.undefined
}
object ClientScopingConfig {
  
  inline def apply(): ClientScopingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientScopingConfig]
  }
  
  extension [Self <: ClientScopingConfig](x: Self) {
    
    inline def setScopeKey(value: String): Self = StObject.set(x, "scopeKey", value.asInstanceOf[js.Any])
    
    inline def setScopeKeyUndefined: Self = StObject.set(x, "scopeKey", js.undefined)
  }
}
