package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionTypesListResponse extends js.Object {
  var connectionTypes: js.UndefOr[js.Array[ConnectionType]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object ConnectionTypesListResponse {
  @scala.inline
  def apply(connectionTypes: js.Array[ConnectionType] = null, kind: String = null): ConnectionTypesListResponse = {
    val __obj = js.Dynamic.literal()
    if (connectionTypes != null) __obj.updateDynamic("connectionTypes")(connectionTypes.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionTypesListResponse]
  }
}

