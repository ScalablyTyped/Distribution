package typings.googleAppsScript.GoogleAppsScript.Events

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsScriptHttpRequestEvent extends StObject {
  
  var contentLength: Double
  
  var contextPath: String
  
  var parameter: StringDictionary[String]
  
  var parameters: StringDictionary[js.Array[String]]
  
  var queryString: String
}
object AppsScriptHttpRequestEvent {
  
  inline def apply(
    contentLength: Double,
    contextPath: String,
    parameter: StringDictionary[String],
    parameters: StringDictionary[js.Array[String]],
    queryString: String
  ): AppsScriptHttpRequestEvent = {
    val __obj = js.Dynamic.literal(contentLength = contentLength.asInstanceOf[js.Any], contextPath = contextPath.asInstanceOf[js.Any], parameter = parameter.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsScriptHttpRequestEvent]
  }
  
  extension [Self <: AppsScriptHttpRequestEvent](x: Self) {
    
    inline def setContentLength(value: Double): Self = StObject.set(x, "contentLength", value.asInstanceOf[js.Any])
    
    inline def setContextPath(value: String): Self = StObject.set(x, "contextPath", value.asInstanceOf[js.Any])
    
    inline def setParameter(value: StringDictionary[String]): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setQueryString(value: String): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
  }
}
