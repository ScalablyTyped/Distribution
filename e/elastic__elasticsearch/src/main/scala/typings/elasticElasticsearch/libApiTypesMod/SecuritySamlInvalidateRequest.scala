package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecuritySamlInvalidateRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var acs: js.UndefOr[String] = js.undefined
  
  var query_string: String
  
  var realm: js.UndefOr[String] = js.undefined
}
object SecuritySamlInvalidateRequest {
  
  inline def apply(query_string: String): SecuritySamlInvalidateRequest = {
    val __obj = js.Dynamic.literal(query_string = query_string.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySamlInvalidateRequest]
  }
  
  extension [Self <: SecuritySamlInvalidateRequest](x: Self) {
    
    inline def setAcs(value: String): Self = StObject.set(x, "acs", value.asInstanceOf[js.Any])
    
    inline def setAcsUndefined: Self = StObject.set(x, "acs", js.undefined)
    
    inline def setQuery_string(value: String): Self = StObject.set(x, "query_string", value.asInstanceOf[js.Any])
    
    inline def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
    
    inline def setRealmUndefined: Self = StObject.set(x, "realm", js.undefined)
  }
}
