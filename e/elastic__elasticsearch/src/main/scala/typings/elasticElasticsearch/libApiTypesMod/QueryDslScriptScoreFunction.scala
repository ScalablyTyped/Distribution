package typings.elasticElasticsearch.libApiTypesMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryDslScriptScoreFunction] (val x: Self) extends AnyVal {
    
    inline def setScript(value: Script): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
  }
}
