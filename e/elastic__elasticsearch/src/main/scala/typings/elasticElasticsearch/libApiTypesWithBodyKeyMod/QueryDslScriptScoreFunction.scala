package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslScriptScoreFunction extends StObject {
  
  var script: Script
}
object QueryDslScriptScoreFunction {
  
  inline def apply(script: Script): QueryDslScriptScoreFunction = {
    val __obj = js.Dynamic.literal(script = script.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDslScriptScoreFunction]
  }
  
  extension [Self <: QueryDslScriptScoreFunction](x: Self) {
    
    inline def setScript(value: Script): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
  }
}
