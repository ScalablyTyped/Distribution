package typings.googleCloudTasks.mod

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
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], httpMethod = httpMethod.asInstanceOf[js.Any], relativeUri = relativeUri.asInstanceOf[js.Any])
    if (appEngineRouting != null) __obj.updateDynamic("appEngineRouting")(appEngineRouting.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppEngineHttpRequest]
  }
}

