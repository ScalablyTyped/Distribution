package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to the list request, and contains a list of externalVpnGateways.
  */
@js.native
trait SchemaExternalVpnGatewayList extends js.Object {
  var etag: js.UndefOr[String] = js.native
  /**
    * [Output Only] Unique identifier for the resource; defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * A list of ExternalVpnGateway resources.
    */
  var items: js.UndefOr[js.Array[SchemaExternalVpnGateway]] = js.native
  /**
    * [Output Only] Type of resource. Always compute#externalVpnGatewayList for
    * lists of externalVpnGateways.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * [Output Only] This token allows you to get the next page of results for
    * list requests. If the number of results is larger than maxResults, use
    * the nextPageToken as a value for the query parameter pageToken in the
    * next list request. Subsequent list requests will have their own
    * nextPageToken to continue paging through the results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for this resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * [Output Only] Informational warning message.
    */
  var warning: js.UndefOr[AnonCode] = js.native
}

object SchemaExternalVpnGatewayList {
  @scala.inline
  def apply(
    etag: String = null,
    id: String = null,
    items: js.Array[SchemaExternalVpnGateway] = null,
    kind: String = null,
    nextPageToken: String = null,
    selfLink: String = null,
    warning: AnonCode = null
  ): SchemaExternalVpnGatewayList = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaExternalVpnGatewayList]
  }
}

