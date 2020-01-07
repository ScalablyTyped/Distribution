package typings.googleapis.buildSrcApisCloudresourcemanagerV1Mod.cloudresourcemanager_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request sent to the `SearchOrganizations` method.
  */
@js.native
trait Schema$SearchOrganizationsRequest extends js.Object {
  /**
    * An optional query string used to filter the Organizations to return in
    * the response. Filter rules are case-insensitive.   Organizations may be
    * filtered by `owner.directoryCustomerId` or by `domain`, where the domain
    * is a G Suite domain, for example:  |Filter|Description|
    * |------|-----------| |owner.directorycustomerid:123456789|Organizations
    * with `owner.directory_customer_id` equal to `123456789`.|
    * |domain:google.com|Organizations corresponding to the domain
    * `google.com`.|  This field is optional.
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * The maximum number of Organizations to return in the response. This field
    * is optional.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A pagination token returned from a previous call to `SearchOrganizations`
    * that indicates from where listing should continue. This field is
    * optional.
    */
  var pageToken: js.UndefOr[String] = js.native
}

object Schema$SearchOrganizationsRequest {
  @scala.inline
  def apply(filter: String = null, pageSize: Int | Double = null, pageToken: String = null): Schema$SearchOrganizationsRequest = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SearchOrganizationsRequest]
  }
}

