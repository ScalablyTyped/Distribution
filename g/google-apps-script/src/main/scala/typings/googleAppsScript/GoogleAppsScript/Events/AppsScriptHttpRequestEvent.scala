package typings.googleAppsScript.GoogleAppsScript.Events

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppsScriptHttpRequestEvent extends StObject {
  
  var contentLength: Double = js.native
  
  var contextPath: String = js.native
  
  var parameter: js.Object = js.native
  
  var parameters: js.Object = js.native
  
  var queryString: String = js.native
}
object AppsScriptHttpRequestEvent {
  
  @scala.inline
  def apply(
    contentLength: Double,
    contextPath: String,
    parameter: js.Object,
    parameters: js.Object,
    queryString: String
  ): AppsScriptHttpRequestEvent = {
    val __obj = js.Dynamic.literal(contentLength = contentLength.asInstanceOf[js.Any], contextPath = contextPath.asInstanceOf[js.Any], parameter = parameter.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsScriptHttpRequestEvent]
  }
  
  @scala.inline
  implicit class AppsScriptHttpRequestEventMutableBuilder[Self <: AppsScriptHttpRequestEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentLength(value: Double): Self = StObject.set(x, "contentLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextPath(value: String): Self = StObject.set(x, "contextPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameter(value: js.Object): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: js.Object): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryString(value: String): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
  }
}
