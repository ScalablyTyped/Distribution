package typings.gapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrganizationOwner extends js.Object {
  /** The Google for Work customer id used in the Directory API. */
  var directoryCustomerId: js.UndefOr[String] = js.undefined
}

object OrganizationOwner {
  @scala.inline
  def apply(directoryCustomerId: String = null): OrganizationOwner = {
    val __obj = js.Dynamic.literal()
    if (directoryCustomerId != null) __obj.updateDynamic("directoryCustomerId")(directoryCustomerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationOwner]
  }
}

