package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeAnalyticsUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorProto extends js.Object {
  var argument: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var code: js.UndefOr[java.lang.String] = js.undefined
  var debugInfo: js.UndefOr[java.lang.String] = js.undefined
  var domain: js.UndefOr[java.lang.String] = js.undefined
  var externalErrorMessage: js.UndefOr[java.lang.String] = js.undefined
  var location: js.UndefOr[java.lang.String] = js.undefined
  var locationType: js.UndefOr[java.lang.String] = js.undefined
}

object ErrorProto {
  @scala.inline
  def apply(
    argument: js.Array[java.lang.String] = null,
    code: java.lang.String = null,
    debugInfo: java.lang.String = null,
    domain: java.lang.String = null,
    externalErrorMessage: java.lang.String = null,
    location: java.lang.String = null,
    locationType: java.lang.String = null
  ): ErrorProto = {
    val __obj = js.Dynamic.literal()
    if (argument != null) __obj.updateDynamic("argument")(argument)
    if (code != null) __obj.updateDynamic("code")(code)
    if (debugInfo != null) __obj.updateDynamic("debugInfo")(debugInfo)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (externalErrorMessage != null) __obj.updateDynamic("externalErrorMessage")(externalErrorMessage)
    if (location != null) __obj.updateDynamic("location")(location)
    if (locationType != null) __obj.updateDynamic("locationType")(locationType)
    __obj.asInstanceOf[ErrorProto]
  }
}

