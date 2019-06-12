package typings
package atGoogleDashCloudTasksLib.atGoogleDashCloudTasksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppEngineHttpRequest extends js.Object {
  var appEngineRouting: js.UndefOr[AppEngineRouting] = js.undefined
  var body: java.lang.String
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var httpMethod: java.lang.String
  var relativeUri: java.lang.String
}

object AppEngineHttpRequest {
  @scala.inline
  def apply(
    body: java.lang.String,
    httpMethod: java.lang.String,
    relativeUri: java.lang.String,
    appEngineRouting: AppEngineRouting = null,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): AppEngineHttpRequest = {
    val __obj = js.Dynamic.literal(body = body, httpMethod = httpMethod, relativeUri = relativeUri)
    if (appEngineRouting != null) __obj.updateDynamic("appEngineRouting")(appEngineRouting)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    __obj.asInstanceOf[AppEngineHttpRequest]
  }
}

