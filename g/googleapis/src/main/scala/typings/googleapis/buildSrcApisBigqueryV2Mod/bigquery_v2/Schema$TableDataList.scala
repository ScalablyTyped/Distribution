package typings.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$TableDataList extends js.Object {
  /**
    * A hash of this page of results.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The resource type of the response.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A token used for paging results. Providing this token instead of the
    * startIndex parameter can help you retrieve stable results when an
    * underlying table is changing.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Rows of results.
    */
  var rows: js.UndefOr[js.Array[Schema$TableRow]] = js.native
  /**
    * The total number of rows in the complete table.
    */
  var totalRows: js.UndefOr[String] = js.native
}

object Schema$TableDataList {
  @scala.inline
  def apply(
    etag: String = null,
    kind: String = null,
    pageToken: String = null,
    rows: js.Array[Schema$TableRow] = null,
    totalRows: String = null
  ): Schema$TableDataList = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (totalRows != null) __obj.updateDynamic("totalRows")(totalRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TableDataList]
  }
}

