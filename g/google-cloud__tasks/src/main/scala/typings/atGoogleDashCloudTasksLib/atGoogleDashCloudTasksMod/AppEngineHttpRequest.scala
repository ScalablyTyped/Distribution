package typings
package atGoogleDashCloudTasksLib.atGoogleDashCloudTasksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppEngineHttpRequest extends js.Object {
  var appEngineRouting: AppEngineRouting
  var body: java.lang.String
  var headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var httpMethod: java.lang.String
  var relativeUri: java.lang.String
}

object AppEngineHttpRequest {
  @scala.inline
  def apply(
    appEngineRouting: AppEngineRouting,
    body: java.lang.String,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    httpMethod: java.lang.String,
    relativeUri: java.lang.String
  ): AppEngineHttpRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("appEngineRouting")(appEngineRouting)
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("httpMethod")(httpMethod)
    __obj.updateDynamic("relativeUri")(relativeUri)
    __obj.asInstanceOf[AppEngineHttpRequest]
  }
}

