package typings.googleAppsScript.GoogleAppsScript.Events

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DoPost extends AppsScriptHttpRequestEvent {
  
  var postData: AppsScriptHttpRequestEventPostData = js.native
}
object DoPost {
  
  @scala.inline
  def apply(
    contentLength: Double,
    contextPath: String,
    parameter: js.Object,
    parameters: js.Object,
    postData: AppsScriptHttpRequestEventPostData,
    queryString: String
  ): DoPost = {
    val __obj = js.Dynamic.literal(contentLength = contentLength.asInstanceOf[js.Any], contextPath = contextPath.asInstanceOf[js.Any], parameter = parameter.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], postData = postData.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoPost]
  }
  
  @scala.inline
  implicit class DoPostMutableBuilder[Self <: DoPost] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPostData(value: AppsScriptHttpRequestEventPostData): Self = StObject.set(x, "postData", value.asInstanceOf[js.Any])
  }
}
