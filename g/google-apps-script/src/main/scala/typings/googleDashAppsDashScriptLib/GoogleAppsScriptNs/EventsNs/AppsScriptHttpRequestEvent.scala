package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsScriptHttpRequestEvent extends js.Object {
  var contentLength: scala.Double
  var contextPath: java.lang.String
  var parameter: js.Object
  var parameters: js.Object
  var queryString: java.lang.String
}

object AppsScriptHttpRequestEvent {
  @scala.inline
  def apply(
    contentLength: scala.Double,
    contextPath: java.lang.String,
    parameter: js.Object,
    parameters: js.Object,
    queryString: java.lang.String
  ): AppsScriptHttpRequestEvent = {
    val __obj = js.Dynamic.literal(contentLength = contentLength, contextPath = contextPath, parameter = parameter, parameters = parameters, queryString = queryString)
  
    __obj.asInstanceOf[AppsScriptHttpRequestEvent]
  }
}

