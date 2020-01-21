package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

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
    if (changeLogs != null) __obj.updateDynamic("changeLogs")(changeLogs.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeLogsListResponse]
  }
}

