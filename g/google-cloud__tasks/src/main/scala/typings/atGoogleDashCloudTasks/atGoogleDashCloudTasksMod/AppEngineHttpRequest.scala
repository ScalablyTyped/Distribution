package typings.atGoogleDashCloudTasks.atGoogleDashCloudTasksMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppEngineHttpRequest extends js.Object {
  var appEngineRouting: js.UndefOr[AppEngineRouting] = js.undefined
  var body: String
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var httpMethod: String
  var relativeUri: String
}

object AppEngineHttpRequest {
  @scala.inline
  def apply(
    body: String,
    httpMethod: String,
    relativeUri: String,
    appEngineRouting: AppEngineRouting = null,
    headers: StringDictionary[String] = null
  ): AppEngineHttpRequest = {
    val __obj = js.Dynamic.literal(body = body, httpMethod = httpMethod, relativeUri = relativeUri)
    if (appEngineRouting != null) __obj.updateDynamic("appEngineRouting")(appEngineRouting)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    __obj.asInstanceOf[AppEngineHttpRequest]
  }
}

