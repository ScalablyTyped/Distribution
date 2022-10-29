package typings.googleAppsScript.GoogleAppsScript.Events

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoPost
  extends StObject
     with AppsScriptHttpRequestEvent {
  
  var postData: AppsScriptHttpRequestEventPostData
}
object DoPost {
  
  inline def apply(
    contentLength: Double,
    contextPath: String,
    parameter: StringDictionary[String],
    parameters: StringDictionary[js.Array[String]],
    pathInfo: String,
    postData: AppsScriptHttpRequestEventPostData,
    queryString: String
  ): DoPost = {
    val __obj = js.Dynamic.literal(contentLength = contentLength.asInstanceOf[js.Any], contextPath = contextPath.asInstanceOf[js.Any], parameter = parameter.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], pathInfo = pathInfo.asInstanceOf[js.Any], postData = postData.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoPost]
  }
  
  extension [Self <: DoPost](x: Self) {
    
    inline def setPostData(value: AppsScriptHttpRequestEventPostData): Self = StObject.set(x, "postData", value.asInstanceOf[js.Any])
  }
}
