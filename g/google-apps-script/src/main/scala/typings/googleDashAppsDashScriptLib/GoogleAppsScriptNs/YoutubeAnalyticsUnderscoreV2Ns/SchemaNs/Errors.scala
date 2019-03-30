package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeAnalyticsUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Errors extends js.Object {
  var code: js.UndefOr[java.lang.String] = js.undefined
  var error: js.UndefOr[js.Array[ErrorProto]] = js.undefined
  var requestId: js.UndefOr[java.lang.String] = js.undefined
}

object Errors {
  @scala.inline
  def apply(
    code: java.lang.String = null,
    error: js.Array[ErrorProto] = null,
    requestId: java.lang.String = null
  ): Errors = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code)
    if (error != null) __obj.updateDynamic("error")(error)
    if (requestId != null) __obj.updateDynamic("requestId")(requestId)
    __obj.asInstanceOf[Errors]
  }
}

