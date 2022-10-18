package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityClearCachedRealmsRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var realms: Names
  
  var usernames: js.UndefOr[js.Array[String]] = js.undefined
}
object SecurityClearCachedRealmsRequest {
  
  inline def apply(realms: Names): SecurityClearCachedRealmsRequest = {
    val __obj = js.Dynamic.literal(realms = realms.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityClearCachedRealmsRequest]
  }
  
  extension [Self <: SecurityClearCachedRealmsRequest](x: Self) {
    
    inline def setRealms(value: Names): Self = StObject.set(x, "realms", value.asInstanceOf[js.Any])
    
    inline def setRealmsVarargs(value: Name*): Self = StObject.set(x, "realms", js.Array(value*))
    
    inline def setUsernames(value: js.Array[String]): Self = StObject.set(x, "usernames", value.asInstanceOf[js.Any])
    
    inline def setUsernamesUndefined: Self = StObject.set(x, "usernames", js.undefined)
    
    inline def setUsernamesVarargs(value: String*): Self = StObject.set(x, "usernames", js.Array(value*))
  }
}
