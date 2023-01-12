package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherSearchInput extends StObject {
  
  var extract: js.UndefOr[js.Array[String]] = js.undefined
  
  var request: WatcherSearchInputRequestDefinition
  
  var timeout: js.UndefOr[Duration] = js.undefined
}
object WatcherSearchInput {
  
  inline def apply(request: WatcherSearchInputRequestDefinition): WatcherSearchInput = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherSearchInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatcherSearchInput] (val x: Self) extends AnyVal {
    
    inline def setExtract(value: js.Array[String]): Self = StObject.set(x, "extract", value.asInstanceOf[js.Any])
    
    inline def setExtractUndefined: Self = StObject.set(x, "extract", js.undefined)
    
    inline def setExtractVarargs(value: String*): Self = StObject.set(x, "extract", js.Array(value*))
    
    inline def setRequest(value: WatcherSearchInputRequestDefinition): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
