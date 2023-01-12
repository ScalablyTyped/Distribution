package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnrichExecutePolicyRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var name: Name
  
  var wait_for_completion: js.UndefOr[Boolean] = js.undefined
}
object EnrichExecutePolicyRequest {
  
  inline def apply(name: Name): EnrichExecutePolicyRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnrichExecutePolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnrichExecutePolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setWait_for_completion(value: Boolean): Self = StObject.set(x, "wait_for_completion", value.asInstanceOf[js.Any])
    
    inline def setWait_for_completionUndefined: Self = StObject.set(x, "wait_for_completion", js.undefined)
  }
}
