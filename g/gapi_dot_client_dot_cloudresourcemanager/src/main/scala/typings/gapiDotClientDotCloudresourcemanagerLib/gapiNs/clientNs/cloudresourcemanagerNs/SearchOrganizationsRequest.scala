package typings
package gapiDotClientDotCloudresourcemanagerLib.gapiNs.clientNs.cloudresourcemanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchOrganizationsRequest extends js.Object {
  /**
    * An optional query string used to filter the Organizations to return in
    * the response. Filter rules are case-insensitive.
    *
    *
    * Organizations may be filtered by `owner.directoryCustomerId` or by
    * `domain`, where the domain is a Google for Work domain, for example:
    *
    * |Filter|Description|
    * |------|-----------|
    * |owner.directorycustomerid:123456789|Organizations with
    * `owner.directory_customer_id` equal to `123456789`.|
    * |domain:google.com|Organizations corresponding to the domain `google.com`.|
    *
    * This field is optional.
    */
  var filter: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The maximum number of Organizations to return in the response.
    * This field is optional.
    */
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * A pagination token returned from a previous call to `SearchOrganizations`
    * that indicates from where listing should continue.
    * This field is optional.
    */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
}

object SearchOrganizationsRequest {
  @scala.inline
  def apply(
    filter: java.lang.String = null,
    pageSize: scala.Int | scala.Double = null,
    pageToken: java.lang.String = null
  ): SearchOrganizationsRequest = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    __obj.asInstanceOf[SearchOrganizationsRequest]
  }
}

