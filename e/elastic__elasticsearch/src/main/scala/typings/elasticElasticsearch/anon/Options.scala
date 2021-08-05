package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.transportMod.TransportRequestOptions
import typings.elasticElasticsearch.transportMod.TransportRequestParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var id: js.Any
  
  var options: TransportRequestOptions
  
  var params: TransportRequestParams
}
object Options {
  
  inline def apply(id: js.Any, options: TransportRequestOptions, params: TransportRequestParams): Options = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: TransportRequestOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setParams(value: TransportRequestParams): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
