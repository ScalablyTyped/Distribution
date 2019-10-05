package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DimensionValueList extends js.Object {
  /** The eTag of this response for caching purposes. */
  var etag: js.UndefOr[String] = js.undefined
  /** The dimension values returned in this response. */
  var items: js.UndefOr[js.Array[DimensionValue]] = js.undefined
  /** The kind of list this is, in this case dfareporting#dimensionValueList. */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * Continuation token used to page through dimension values. To retrieve the next page of results, set the next request's "pageToken" to the value of this
    * field. The page token is only valid for a limited amount of time and should not be persisted.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object DimensionValueList {
  @scala.inline
  def apply(
    etag: String = null,
    items: js.Array[DimensionValue] = null,
    kind: String = null,
    nextPageToken: String = null
  ): DimensionValueList = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[DimensionValueList]
  }
}

