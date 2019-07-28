package typings.gapiDotClientDotBigquery.gapiNs.clientNs.bigqueryNs

import typings.gapiDotClientDotBigquery.Anon_CreationTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableList extends js.Object {
  /** A hash of this page of results. */
  var etag: js.UndefOr[String] = js.undefined
  /** The type of list. */
  var kind: js.UndefOr[String] = js.undefined
  /** A token to request the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** Tables in the requested dataset. */
  var tables: js.UndefOr[js.Array[Anon_CreationTime]] = js.undefined
  /** The total number of tables in the dataset. */
  var totalItems: js.UndefOr[Double] = js.undefined
}

object TableList {
  @scala.inline
  def apply(
    etag: String = null,
    kind: String = null,
    nextPageToken: String = null,
    tables: js.Array[Anon_CreationTime] = null,
    totalItems: Int | Double = null
  ): TableList = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (tables != null) __obj.updateDynamic("tables")(tables)
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableList]
  }
}

