package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherHttpInputResponseResult extends StObject {
  
  var body: String
  
  var headers: HttpHeaders
  
  var status: integer
}
object WatcherHttpInputResponseResult {
  
  inline def apply(body: String, headers: HttpHeaders, status: integer): WatcherHttpInputResponseResult = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherHttpInputResponseResult]
  }
  
  extension [Self <: WatcherHttpInputResponseResult](x: Self) {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: HttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: integer): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
