package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Change Log List Response
  */
@js.native
trait Schema$ChangeLogsListResponse extends js.Object {
  /**
    * Change log collection.
    */
  var changeLogs: js.UndefOr[js.Array[Schema$ChangeLog]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#changeLogsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ChangeLogsListResponse {
  @scala.inline
  def apply(changeLogs: js.Array[Schema$ChangeLog] = null, kind: String = null, nextPageToken: String = null): Schema$ChangeLogsListResponse = {
    val __obj = js.Dynamic.literal()
    if (changeLogs != null) __obj.updateDynamic("changeLogs")(changeLogs.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ChangeLogsListResponse]
  }
}

