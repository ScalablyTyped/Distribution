package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlmGetLifecycle
  extends StObject
     with Generic {
  
  var policy_id: js.UndefOr[String | js.Array[String]] = js.undefined
}
object SlmGetLifecycle {
  
  inline def apply(): SlmGetLifecycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlmGetLifecycle]
  }
  
  extension [Self <: SlmGetLifecycle](x: Self) {
    
    inline def setPolicy_id(value: String | js.Array[String]): Self = StObject.set(x, "policy_id", value.asInstanceOf[js.Any])
    
    inline def setPolicy_idUndefined: Self = StObject.set(x, "policy_id", js.undefined)
    
    inline def setPolicy_idVarargs(value: String*): Self = StObject.set(x, "policy_id", js.Array(value :_*))
  }
}
