package typings.googleDashAppsDashScript.GoogleAppsScript.Events

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsScriptHttpRequestEvent extends js.Object {
  var contentLength: Double
  var contextPath: String
  var parameter: js.Object
  var parameters: js.Object
  var queryString: String
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
    val __obj = js.Dynamic.literal(contentLength = contentLength, contextPath = contextPath, parameter = parameter, parameters = parameters, queryString = queryString)
  
    __obj.asInstanceOf[AppsScriptHttpRequestEvent]
  }
}

