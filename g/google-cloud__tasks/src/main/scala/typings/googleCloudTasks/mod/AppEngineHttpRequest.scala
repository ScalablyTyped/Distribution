package typings.googleCloudTasks.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppEngineHttpRequest extends StObject {
  
  var appEngineRouting: js.UndefOr[AppEngineRouting] = js.undefined
  
  var body: String
  
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var httpMethod: String
  
  var relativeUri: String
}
object AppEngineHttpRequest {
  
  inline def apply(body: String, httpMethod: String, relativeUri: String): AppEngineHttpRequest = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], httpMethod = httpMethod.asInstanceOf[js.Any], relativeUri = relativeUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppEngineHttpRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppEngineHttpRequest] (val x: Self) extends AnyVal {
    
    inline def setAppEngineRouting(value: AppEngineRouting): Self = StObject.set(x, "appEngineRouting", value.asInstanceOf[js.Any])
    
    inline def setAppEngineRoutingUndefined: Self = StObject.set(x, "appEngineRouting", js.undefined)
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHttpMethod(value: String): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
    
    inline def setRelativeUri(value: String): Self = StObject.set(x, "relativeUri", value.asInstanceOf[js.Any])
  }
}
