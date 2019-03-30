package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeAnalyticsUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmptyResponse extends js.Object {
  var errors: js.UndefOr[Errors] = js.undefined
}

object EmptyResponse {
  @scala.inline
  def apply(errors: Errors = null): EmptyResponse = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors)
    __obj.asInstanceOf[EmptyResponse]
  }
}

