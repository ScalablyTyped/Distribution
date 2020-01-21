package typings.gapiClientBigquery.gapi.client.bigquery

import typings.gapiClientBigquery.AnonCreationTime
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
  var tables: js.UndefOr[js.Array[AnonCreationTime]] = js.undefined
  /** The total number of tables in the dataset. */
  var totalItems: js.UndefOr[Double] = js.undefined
}

object TableList {
  @scala.inline
  def apply(
    etag: String = null,
    kind: String = null,
    nextPageToken: String = null,
    tables: js.Array[AnonCreationTime] = null,
    totalItems: Int | Double = null
  ): TableList = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (tables != null) __obj.updateDynamic("tables")(tables.asInstanceOf[js.Any])
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableList]
  }
}

