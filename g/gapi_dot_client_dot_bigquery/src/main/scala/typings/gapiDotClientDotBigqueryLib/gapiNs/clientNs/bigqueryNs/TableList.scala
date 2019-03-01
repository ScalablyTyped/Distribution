package typings
package gapiDotClientDotBigqueryLib.gapiNs.clientNs.bigqueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableList extends js.Object {
  /** A hash of this page of results. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** The type of list. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** A token to request the next page of results. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Tables in the requested dataset. */
  var tables: js.UndefOr[js.Array[gapiDotClientDotBigqueryLib.Anon_CreationTime]] = js.undefined
  /** The total number of tables in the dataset. */
  var totalItems: js.UndefOr[scala.Double] = js.undefined
}

object TableList {
  @scala.inline
  def apply(
    etag: java.lang.String = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null,
    tables: js.Array[gapiDotClientDotBigqueryLib.Anon_CreationTime] = null,
    totalItems: scala.Int | scala.Double = null
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

