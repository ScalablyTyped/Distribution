package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesRecoveryRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var active_only: js.UndefOr[Boolean] = js.undefined
  
  var detailed: js.UndefOr[Boolean] = js.undefined
  
  var index: js.UndefOr[Indices] = js.undefined
}
object IndicesRecoveryRequest {
  
  inline def apply(): IndicesRecoveryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesRecoveryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesRecoveryRequest] (val x: Self) extends AnyVal {
    
    inline def setActive_only(value: Boolean): Self = StObject.set(x, "active_only", value.asInstanceOf[js.Any])
    
    inline def setActive_onlyUndefined: Self = StObject.set(x, "active_only", js.undefined)
    
    inline def setDetailed(value: Boolean): Self = StObject.set(x, "detailed", value.asInstanceOf[js.Any])
    
    inline def setDetailedUndefined: Self = StObject.set(x, "detailed", js.undefined)
    
    inline def setIndex(value: Indices): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setIndexVarargs(value: IndexName*): Self = StObject.set(x, "index", js.Array(value*))
  }
}
