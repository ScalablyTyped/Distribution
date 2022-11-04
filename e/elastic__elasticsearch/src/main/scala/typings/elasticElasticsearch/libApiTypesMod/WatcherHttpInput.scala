package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherHttpInput extends StObject {
  
  var extract: js.UndefOr[js.Array[String]] = js.undefined
  
  var request: js.UndefOr[WatcherHttpInputRequestDefinition] = js.undefined
  
  var response_content_type: js.UndefOr[WatcherResponseContentType] = js.undefined
}
object WatcherHttpInput {
  
  inline def apply(): WatcherHttpInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatcherHttpInput]
  }
  
  extension [Self <: WatcherHttpInput](x: Self) {
    
    inline def setExtract(value: js.Array[String]): Self = StObject.set(x, "extract", value.asInstanceOf[js.Any])
    
    inline def setExtractUndefined: Self = StObject.set(x, "extract", js.undefined)
    
    inline def setExtractVarargs(value: String*): Self = StObject.set(x, "extract", js.Array(value*))
    
    inline def setRequest(value: WatcherHttpInputRequestDefinition): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setResponse_content_type(value: WatcherResponseContentType): Self = StObject.set(x, "response_content_type", value.asInstanceOf[js.Any])
    
    inline def setResponse_content_typeUndefined: Self = StObject.set(x, "response_content_type", js.undefined)
  }
}
