package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnrichDeletePolicyRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var name: Name
}
object EnrichDeletePolicyRequest {
  
  inline def apply(name: Name): EnrichDeletePolicyRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnrichDeletePolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnrichDeletePolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
