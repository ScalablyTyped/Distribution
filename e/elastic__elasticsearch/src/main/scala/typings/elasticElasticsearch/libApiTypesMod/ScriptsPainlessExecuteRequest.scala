package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptsPainlessExecuteRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var context: js.UndefOr[String] = js.undefined
  
  var context_setup: js.UndefOr[ScriptsPainlessExecutePainlessContextSetup] = js.undefined
  
  var script: js.UndefOr[InlineScript | String] = js.undefined
}
object ScriptsPainlessExecuteRequest {
  
  inline def apply(): ScriptsPainlessExecuteRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScriptsPainlessExecuteRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScriptsPainlessExecuteRequest] (val x: Self) extends AnyVal {
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setContext_setup(value: ScriptsPainlessExecutePainlessContextSetup): Self = StObject.set(x, "context_setup", value.asInstanceOf[js.Any])
    
    inline def setContext_setupUndefined: Self = StObject.set(x, "context_setup", js.undefined)
    
    inline def setScript(value: InlineScript | String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
  }
}
