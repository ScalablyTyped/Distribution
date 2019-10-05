package typings.gapiDotClientDotFusiontables.gapi.client.fusiontables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnList extends js.Object {
  /** List of all requested columns. */
  var items: js.UndefOr[js.Array[Column]] = js.undefined
  /** The kind of item this is. For a column list, this is always fusiontables#columnList. */
  var kind: js.UndefOr[String] = js.undefined
  /** Token used to access the next page of this result. No token is displayed if there are no more pages left. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** Total number of columns for the table. */
  var totalItems: js.UndefOr[Double] = js.undefined
}

object ColumnList {
  @scala.inline
  def apply(
    items: js.Array[Column] = null,
    kind: String = null,
    nextPageToken: String = null,
    totalItems: Int | Double = null
  ): ColumnList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnList]
  }
}

