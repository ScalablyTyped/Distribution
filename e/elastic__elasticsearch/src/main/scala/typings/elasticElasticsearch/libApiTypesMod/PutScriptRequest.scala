package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutScriptRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var context: js.UndefOr[Name] = js.undefined
  
  var id: Id
  
  var master_timeout: js.UndefOr[Duration] = js.undefined
  
  var script: StoredScript
  
  var timeout: js.UndefOr[Duration] = js.undefined
}
object PutScriptRequest {
  
  inline def apply(id: Id, script: StoredScript): PutScriptRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutScriptRequest]
  }
  
  extension [Self <: PutScriptRequest](x: Self) {
    
    inline def setContext(value: Name): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeout(value: Duration): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    inline def setScript(value: StoredScript): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
