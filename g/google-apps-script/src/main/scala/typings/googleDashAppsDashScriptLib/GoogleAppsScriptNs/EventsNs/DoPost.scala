package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoPost extends AppsScriptHttpRequestEvent {
  var postData: AppsScriptHttpRequestEventPostData
}

object DoPost {
  @scala.inline
  def apply(
    contentLength: scala.Double,
    contextPath: java.lang.String,
    parameter: js.Object,
    parameters: js.Object,
    postData: AppsScriptHttpRequestEventPostData,
    queryString: java.lang.String
  ): DoPost = {
    val __obj = js.Dynamic.literal(contentLength = contentLength, contextPath = contextPath, parameter = parameter, parameters = parameters, postData = postData, queryString = queryString)
  
    __obj.asInstanceOf[DoPost]
  }
}

