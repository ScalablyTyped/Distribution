package typings.firebaseAdmin.libAuthAuthConfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiFactorAuthServerConfig extends StObject {
  
  var enabledProviders: js.UndefOr[js.Array[AuthFactorServerType]] = js.undefined
  
  var state: js.UndefOr[MultiFactorConfigState] = js.undefined
}
object MultiFactorAuthServerConfig {
  
  inline def apply(): MultiFactorAuthServerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiFactorAuthServerConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MultiFactorAuthServerConfig] (val x: Self) extends AnyVal {
    
    inline def setEnabledProviders(value: js.Array[AuthFactorServerType]): Self = StObject.set(x, "enabledProviders", value.asInstanceOf[js.Any])
    
    inline def setEnabledProvidersUndefined: Self = StObject.set(x, "enabledProviders", js.undefined)
    
    inline def setEnabledProvidersVarargs(value: AuthFactorServerType*): Self = StObject.set(x, "enabledProviders", js.Array(value*))
    
    inline def setState(value: MultiFactorConfigState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
