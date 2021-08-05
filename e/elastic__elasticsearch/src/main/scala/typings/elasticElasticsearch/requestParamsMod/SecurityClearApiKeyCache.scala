package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityClearApiKeyCache
  extends StObject
     with Generic {
  
  var ids: String | js.Array[String]
}
object SecurityClearApiKeyCache {
  
  inline def apply(ids: String | js.Array[String]): SecurityClearApiKeyCache = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityClearApiKeyCache]
  }
  
  extension [Self <: SecurityClearApiKeyCache](x: Self) {
    
    inline def setIds(value: String | js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
  }
}
