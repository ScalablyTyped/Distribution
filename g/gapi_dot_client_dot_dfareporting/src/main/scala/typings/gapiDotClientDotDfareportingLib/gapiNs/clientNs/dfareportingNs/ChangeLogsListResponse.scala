package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeLogsListResponse extends js.Object {
  /** Change log collection. */
  var changeLogs: js.UndefOr[js.Array[ChangeLog]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#changeLogsListResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object ChangeLogsListResponse {
  @scala.inline
  def apply(
    changeLogs: js.Array[ChangeLog] = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null
  ): ChangeLogsListResponse = {
    val __obj = js.Dynamic.literal()
    if (changeLogs != null) __obj.updateDynamic("changeLogs")(changeLogs)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ChangeLogsListResponse]
  }
}

