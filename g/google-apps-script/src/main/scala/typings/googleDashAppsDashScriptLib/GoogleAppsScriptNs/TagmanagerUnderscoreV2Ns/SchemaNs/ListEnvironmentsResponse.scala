package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagmanagerUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListEnvironmentsResponse extends js.Object {
  var environment: js.UndefOr[js.Array[Environment]] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object ListEnvironmentsResponse {
  @scala.inline
  def apply(environment: js.Array[Environment] = null, nextPageToken: java.lang.String = null): ListEnvironmentsResponse = {
    val __obj = js.Dynamic.literal()
    if (environment != null) __obj.updateDynamic("environment")(environment)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListEnvironmentsResponse]
  }
}

