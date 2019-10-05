package typings.gapiDotClientDotCompute.gapi.client.compute

import typings.gapiDotClientDotCompute.Anon_Code
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackendServiceAggregatedList extends js.Object {
  /** [Output Only] Unique identifier for the resource; defined by the server. */
  var id: js.UndefOr[String] = js.undefined
  /** A list of BackendServicesScopedList resources. */
  var items: js.UndefOr[Record[String, BackendServicesScopedList]] = js.undefined
  /** Type of resource. */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * [Output Only] This token allows you to get the next page of results for list requests. If the number of results is larger than maxResults, use the
    * nextPageToken as a value for the query parameter pageToken in the next list request. Subsequent list requests will have their own nextPageToken to
    * continue paging through the results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** [Output Only] Server-defined URL for this resource. */
  var selfLink: js.UndefOr[String] = js.undefined
  /** [Output Only] Informational warning message. */
  var warning: js.UndefOr[Anon_Code] = js.undefined
}

object BackendServiceAggregatedList {
  @scala.inline
  def apply(
    id: String = null,
    items: Record[String, BackendServicesScopedList] = null,
    kind: String = null,
    nextPageToken: String = null,
    selfLink: String = null,
    warning: Anon_Code = null
  ): BackendServiceAggregatedList = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (warning != null) __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[BackendServiceAggregatedList]
  }
}

