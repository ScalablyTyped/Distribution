package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListGuardiansResponse extends js.Object {
  var guardians: js.UndefOr[js.Array[Guardian]] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object ListGuardiansResponse {
  @scala.inline
  def apply(guardians: js.Array[Guardian] = null, nextPageToken: java.lang.String = null): ListGuardiansResponse = {
    val __obj = js.Dynamic.literal()
    if (guardians != null) __obj.updateDynamic("guardians")(guardians)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListGuardiansResponse]
  }
}

