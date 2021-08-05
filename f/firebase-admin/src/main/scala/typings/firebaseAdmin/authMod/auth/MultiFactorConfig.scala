package typings.firebaseAdmin.authMod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface representing a multi-factor configuration.
  * This can be used to define whether multi-factor authentication is enabled
  * or disabled and the list of second factor challenges that are supported.
  */
trait MultiFactorConfig extends StObject {
  
  /**
    * The list of identifiers for enabled second factors.
    * Currently only ‘phone’ is supported.
    */
  var factorIds: js.UndefOr[js.Array[AuthFactorType]] = js.undefined
  
  /**
    * The multi-factor config state.
    */
  var state: MultiFactorConfigState
}
object MultiFactorConfig {
  
  inline def apply(state: MultiFactorConfigState): MultiFactorConfig = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiFactorConfig]
  }
  
  extension [Self <: MultiFactorConfig](x: Self) {
    
    inline def setFactorIds(value: js.Array[AuthFactorType]): Self = StObject.set(x, "factorIds", value.asInstanceOf[js.Any])
    
    inline def setFactorIdsUndefined: Self = StObject.set(x, "factorIds", js.undefined)
    
    inline def setFactorIdsVarargs(value: AuthFactorType*): Self = StObject.set(x, "factorIds", js.Array(value :_*))
    
    inline def setState(value: MultiFactorConfigState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
