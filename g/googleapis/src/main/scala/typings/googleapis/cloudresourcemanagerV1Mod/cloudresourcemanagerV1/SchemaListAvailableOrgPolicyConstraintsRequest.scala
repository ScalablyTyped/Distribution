package typings.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request sent to the [ListAvailableOrgPolicyConstraints]
  * google.cloud.OrgPolicy.v1.ListAvailableOrgPolicyConstraints] method.
  */
@js.native
trait SchemaListAvailableOrgPolicyConstraintsRequest extends js.Object {
  /**
    * Size of the pages to be returned. This is currently unsupported and will
    * be ignored. The server may at any point start using this field to limit
    * page size.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Page token used to retrieve the next page. This is currently unsupported
    * and will be ignored. The server may at any point start using this field.
    */
  var pageToken: js.UndefOr[String] = js.native
}

object SchemaListAvailableOrgPolicyConstraintsRequest {
  @scala.inline
  def apply(pageSize: Int | Double = null, pageToken: String = null): SchemaListAvailableOrgPolicyConstraintsRequest = {
    val __obj = js.Dynamic.literal()
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListAvailableOrgPolicyConstraintsRequest]
  }
}

