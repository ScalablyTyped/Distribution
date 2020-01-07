package typings.googleapis.buildSrcApisComputeBetaMod.compute_beta

import typings.googleapis.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains a list of VmEndpointNatMappings.
  */
@js.native
trait Schema$VmEndpointNatMappingsList extends js.Object {
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * [Output Only] Type of resource. Always compute#vmEndpointNatMappingsList
    * for lists of Nat mappings of VM endpoints.
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
    * [Output Only] A list of Nat mapping information of VM endpoints.
    */
  var result: js.UndefOr[js.Array[Schema$VmEndpointNatMappings]] = js.native
  /**
    * [Output Only] Server-defined URL for this resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * [Output Only] Informational warning message.
    */
  var warning: js.UndefOr[Anon_Code] = js.native
}

object Schema$VmEndpointNatMappingsList {
  @scala.inline
  def apply(
    id: String = null,
    kind: String = null,
    nextPageToken: String = null,
    result: js.Array[Schema$VmEndpointNatMappings] = null,
    selfLink: String = null,
    warning: Anon_Code = null
  ): Schema$VmEndpointNatMappingsList = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$VmEndpointNatMappingsList]
  }
}

