package typings.gapiDotClientDotSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstancesListResponse extends js.Object {
  /** List of database instance resources. */
  var items: js.UndefOr[js.Array[DatabaseInstance]] = js.undefined
  /** This is always sql#instancesList. */
  var kind: js.UndefOr[String] = js.undefined
  /** The continuation token, used to page through large result sets. Provide this value in a subsequent request to return the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object InstancesListResponse {
  @scala.inline
  def apply(items: js.Array[DatabaseInstance] = null, kind: String = null, nextPageToken: String = null): InstancesListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[InstancesListResponse]
  }
}

