package typings.elasticElasticsearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Body extends StObject {
  
  var body: Null
  
  var headers: Null
  
  var statusCode: Null
  
  var warnings: Null
}
object Body {
  
  inline def apply(body: Null, headers: Null, statusCode: Null, warnings: Null): Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
  
  extension [Self <: Body](x: Self) {
    
    inline def setBody(value: Null): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Null): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: Null): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setWarnings(value: Null): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
  }
}
