package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetScriptRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var id: Id
  
  var master_timeout: js.UndefOr[Duration] = js.undefined
}
object GetScriptRequest {
  
  inline def apply(id: Id): GetScriptRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScriptRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetScriptRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeout(value: Duration): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
  }
}
