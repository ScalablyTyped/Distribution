package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionTypesListResponse extends js.Object {
  var connectionTypes: js.UndefOr[js.Array[ConnectionType]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object ConnectionTypesListResponse {
  @scala.inline
  def apply(connectionTypes: js.Array[ConnectionType] = null, kind: java.lang.String = null): ConnectionTypesListResponse = {
    val __obj = js.Dynamic.literal()
    if (connectionTypes != null) __obj.updateDynamic("connectionTypes")(connectionTypes)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[ConnectionTypesListResponse]
  }
}

