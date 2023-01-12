package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecuritySamlAuthenticateRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var content: String
  
  var ids: Ids
  
  var realm: js.UndefOr[String] = js.undefined
}
object SecuritySamlAuthenticateRequest {
  
  inline def apply(content: String, ids: Ids): SecuritySamlAuthenticateRequest = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySamlAuthenticateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecuritySamlAuthenticateRequest] (val x: Self) extends AnyVal {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setIds(value: Ids): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsVarargs(value: Id*): Self = StObject.set(x, "ids", js.Array(value*))
    
    inline def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
    
    inline def setRealmUndefined: Self = StObject.set(x, "realm", js.undefined)
  }
}
