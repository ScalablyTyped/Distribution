package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedAssistantDebugContext extends StObject {
  
  /**
    * The query that triggered the resulting suggestion.
    */
  var query: js.UndefOr[String | Null] = js.undefined
}
object SchemaAppsDynamiteSharedAssistantDebugContext {
  
  inline def apply(): SchemaAppsDynamiteSharedAssistantDebugContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedAssistantDebugContext]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedAssistantDebugContext](x: Self) {
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryNull: Self = StObject.set(x, "query", null)
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
