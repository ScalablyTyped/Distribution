package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeLogsListResponse extends js.Object {
  var changeLogs: js.UndefOr[js.Array[ChangeLog]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ChangeLogsListResponse {
  @scala.inline
  def apply(changeLogs: js.Array[ChangeLog] = null, kind: String = null, nextPageToken: String = null): ChangeLogsListResponse = {
    val __obj = js.Dynamic.literal()
    if (changeLogs != null) __obj.updateDynamic("changeLogs")(changeLogs)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ChangeLogsListResponse]
  }
}

