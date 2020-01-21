package typings.googleAppsScript.GoogleAppsScript.YouTubeAnalytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorProto extends js.Object {
  var argument: js.UndefOr[js.Array[String]] = js.undefined
  var code: js.UndefOr[String] = js.undefined
  var debugInfo: js.UndefOr[String] = js.undefined
  var domain: js.UndefOr[String] = js.undefined
  var externalErrorMessage: js.UndefOr[String] = js.undefined
  var location: js.UndefOr[String] = js.undefined
  var locationType: js.UndefOr[String] = js.undefined
}

object ErrorProto {
  @scala.inline
  def apply(
    argument: js.Array[String] = null,
    code: String = null,
    debugInfo: String = null,
    domain: String = null,
    externalErrorMessage: String = null,
    location: String = null,
    locationType: String = null
  ): ErrorProto = {
    val __obj = js.Dynamic.literal()
    if (argument != null) __obj.updateDynamic("argument")(argument.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (debugInfo != null) __obj.updateDynamic("debugInfo")(debugInfo.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (externalErrorMessage != null) __obj.updateDynamic("externalErrorMessage")(externalErrorMessage.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (locationType != null) __obj.updateDynamic("locationType")(locationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorProto]
  }
}

