package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportList extends js.Object {
  /** The eTag of this response for caching purposes. */
  var etag: js.UndefOr[String] = js.undefined
  /** The reports returned in this response. */
  var items: js.UndefOr[js.Array[Report]] = js.undefined
  /** The kind of list this is, in this case dfareporting#reportList. */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * Continuation token used to page through reports. To retrieve the next page of results, set the next request's "pageToken" to the value of this field.
    * The page token is only valid for a limited amount of time and should not be persisted.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ReportList {
  @scala.inline
  def apply(
    etag: String = null,
    items: js.Array[Report] = null,
    kind: String = null,
    nextPageToken: String = null
  ): ReportList = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ReportList]
  }
}

