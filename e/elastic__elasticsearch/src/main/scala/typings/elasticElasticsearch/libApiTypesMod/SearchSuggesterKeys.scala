package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchSuggesterKeys extends StObject {
  
  var text: js.UndefOr[String] = js.undefined
}
object SearchSuggesterKeys {
  
  inline def apply(): SearchSuggesterKeys = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchSuggesterKeys]
  }
  
  extension [Self <: SearchSuggesterKeys](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
