package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityClearCachedRealms
  extends StObject
     with Generic {
  
  var realms: String | js.Array[String]
  
  var usernames: js.UndefOr[String | js.Array[String]] = js.undefined
}
object SecurityClearCachedRealms {
  
  inline def apply(realms: String | js.Array[String]): SecurityClearCachedRealms = {
    val __obj = js.Dynamic.literal(realms = realms.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityClearCachedRealms]
  }
  
  extension [Self <: SecurityClearCachedRealms](x: Self) {
    
    inline def setRealms(value: String | js.Array[String]): Self = StObject.set(x, "realms", value.asInstanceOf[js.Any])
    
    inline def setRealmsVarargs(value: String*): Self = StObject.set(x, "realms", js.Array(value :_*))
    
    inline def setUsernames(value: String | js.Array[String]): Self = StObject.set(x, "usernames", value.asInstanceOf[js.Any])
    
    inline def setUsernamesUndefined: Self = StObject.set(x, "usernames", js.undefined)
    
    inline def setUsernamesVarargs(value: String*): Self = StObject.set(x, "usernames", js.Array(value :_*))
  }
}
