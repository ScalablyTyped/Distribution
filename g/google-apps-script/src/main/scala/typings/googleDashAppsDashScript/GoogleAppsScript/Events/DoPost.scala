package typings.googleDashAppsDashScript.GoogleAppsScript.Events

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoPost extends AppsScriptHttpRequestEvent {
  var postData: AppsScriptHttpRequestEventPostData
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
}

