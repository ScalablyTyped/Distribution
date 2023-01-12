package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.InlineScript
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ScriptsPainlessExecutePainlessContextSetup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Context extends StObject {
  
  var context: js.UndefOr[String] = js.undefined
  
  var context_setup: js.UndefOr[ScriptsPainlessExecutePainlessContextSetup] = js.undefined
  
  var script: js.UndefOr[InlineScript | String] = js.undefined
}
object Context {
  
  inline def apply(): Context = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Context]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setContext_setup(value: ScriptsPainlessExecutePainlessContextSetup): Self = StObject.set(x, "context_setup", value.asInstanceOf[js.Any])
    
    inline def setContext_setupUndefined: Self = StObject.set(x, "context_setup", js.undefined)
    
    inline def setScript(value: InlineScript | String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
  }
}
