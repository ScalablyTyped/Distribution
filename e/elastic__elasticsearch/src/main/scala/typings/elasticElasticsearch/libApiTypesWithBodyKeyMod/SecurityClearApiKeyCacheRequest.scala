package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityClearApiKeyCacheRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var ids: Ids
}
object SecurityClearApiKeyCacheRequest {
  
  inline def apply(ids: Ids): SecurityClearApiKeyCacheRequest = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityClearApiKeyCacheRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityClearApiKeyCacheRequest] (val x: Self) extends AnyVal {
    
    inline def setIds(value: Ids): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsVarargs(value: Id*): Self = StObject.set(x, "ids", js.Array(value*))
  }
}
