package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptField extends StObject {
  
  var ignore_failure: js.UndefOr[Boolean] = js.undefined
  
  var script: Script
}
object ScriptField {
  
  inline def apply(script: Script): ScriptField = {
    val __obj = js.Dynamic.literal(script = script.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptField]
  }
  
  extension [Self <: ScriptField](x: Self) {
    
    inline def setIgnore_failure(value: Boolean): Self = StObject.set(x, "ignore_failure", value.asInstanceOf[js.Any])
    
    inline def setIgnore_failureUndefined: Self = StObject.set(x, "ignore_failure", js.undefined)
    
    inline def setScript(value: Script): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
  }
}
