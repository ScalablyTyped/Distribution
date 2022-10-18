package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptsPainlessExecutePainlessContextSetup extends StObject {
  
  var document: Any
  
  var index: IndexName
  
  var query: QueryDslQueryContainer
}
object ScriptsPainlessExecutePainlessContextSetup {
  
  inline def apply(document: Any, index: IndexName, query: QueryDslQueryContainer): ScriptsPainlessExecutePainlessContextSetup = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptsPainlessExecutePainlessContextSetup]
  }
  
  extension [Self <: ScriptsPainlessExecutePainlessContextSetup](x: Self) {
    
    inline def setDocument(value: Any): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: QueryDslQueryContainer): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
