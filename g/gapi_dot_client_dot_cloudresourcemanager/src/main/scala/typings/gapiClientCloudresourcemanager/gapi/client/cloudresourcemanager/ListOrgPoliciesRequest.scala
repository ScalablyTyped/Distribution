package typings.gapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListOrgPoliciesRequest extends js.Object {
  /**
    * Size of the pages to be returned. This is currently unsupported and will
    * be ignored. The server may at any point start using this field to limit
    * page size.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  /**
    * Page token used to retrieve the next page. This is currently unsupported
    * and will be ignored. The server may at any point start using this field.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}

object ListOrgPoliciesRequest {
  @scala.inline
  def apply(pageSize: Int | Double = null, pageToken: String = null): ListOrgPoliciesRequest = {
    val __obj = js.Dynamic.literal()
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOrgPoliciesRequest]
  }
}

