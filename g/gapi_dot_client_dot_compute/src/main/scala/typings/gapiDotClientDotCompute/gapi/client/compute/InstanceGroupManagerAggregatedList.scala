package typings.gapiDotClientDotCompute.gapi.client.compute

import typings.gapiDotClientDotCompute.Anon_Code
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceGroupManagerAggregatedList extends js.Object {
  /** [Output Only] Unique identifier for the resource; defined by the server. */
  var id: js.UndefOr[String] = js.undefined
  /** A list of InstanceGroupManagersScopedList resources. */
  var items: js.UndefOr[Record[String, InstanceGroupManagersScopedList]] = js.undefined
  /** [Output Only] The resource type, which is always compute#instanceGroupManagerAggregatedList for an aggregated list of managed instance groups. */
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

object InstanceGroupManagerAggregatedList {
  @scala.inline
  def apply(
    id: String = null,
    items: Record[String, InstanceGroupManagersScopedList] = null,
    kind: String = null,
    nextPageToken: String = null,
    selfLink: String = null,
    warning: Anon_Code = null
  ): InstanceGroupManagerAggregatedList = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (warning != null) __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[InstanceGroupManagerAggregatedList]
  }
}

