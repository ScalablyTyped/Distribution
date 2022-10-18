package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslScriptQuery
  extends StObject
     with QueryDslQueryBase {
  
  var script: Script
}
object QueryDslScriptQuery {
  
  inline def apply(script: Script): QueryDslScriptQuery = {
    val __obj = js.Dynamic.literal(script = script.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDslScriptQuery]
  }
  
  extension [Self <: QueryDslScriptQuery](x: Self) {
    
    inline def setScript(value: Script): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
  }
}
