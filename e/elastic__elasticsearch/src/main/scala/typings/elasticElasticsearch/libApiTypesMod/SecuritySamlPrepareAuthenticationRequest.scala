package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecuritySamlPrepareAuthenticationRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var acs: js.UndefOr[String] = js.undefined
  
  var realm: js.UndefOr[String] = js.undefined
  
  var relay_state: js.UndefOr[String] = js.undefined
}
object SecuritySamlPrepareAuthenticationRequest {
  
  inline def apply(): SecuritySamlPrepareAuthenticationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecuritySamlPrepareAuthenticationRequest]
  }
  
  extension [Self <: SecuritySamlPrepareAuthenticationRequest](x: Self) {
    
    inline def setAcs(value: String): Self = StObject.set(x, "acs", value.asInstanceOf[js.Any])
    
    inline def setAcsUndefined: Self = StObject.set(x, "acs", js.undefined)
    
    inline def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
    
    inline def setRealmUndefined: Self = StObject.set(x, "realm", js.undefined)
    
    inline def setRelay_state(value: String): Self = StObject.set(x, "relay_state", value.asInstanceOf[js.Any])
    
    inline def setRelay_stateUndefined: Self = StObject.set(x, "relay_state", js.undefined)
  }
}
