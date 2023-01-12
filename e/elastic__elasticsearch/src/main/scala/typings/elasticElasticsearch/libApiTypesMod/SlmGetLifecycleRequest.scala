package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlmGetLifecycleRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var policy_id: js.UndefOr[Names] = js.undefined
}
object SlmGetLifecycleRequest {
  
  inline def apply(): SlmGetLifecycleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlmGetLifecycleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlmGetLifecycleRequest] (val x: Self) extends AnyVal {
    
    inline def setPolicy_id(value: Names): Self = StObject.set(x, "policy_id", value.asInstanceOf[js.Any])
    
    inline def setPolicy_idUndefined: Self = StObject.set(x, "policy_id", js.undefined)
    
    inline def setPolicy_idVarargs(value: Name*): Self = StObject.set(x, "policy_id", js.Array(value*))
  }
}
