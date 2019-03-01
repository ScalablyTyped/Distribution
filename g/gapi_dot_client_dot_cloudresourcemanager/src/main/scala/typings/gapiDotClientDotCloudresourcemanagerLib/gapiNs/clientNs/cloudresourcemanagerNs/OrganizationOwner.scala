package typings
package gapiDotClientDotCloudresourcemanagerLib.gapiNs.clientNs.cloudresourcemanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrganizationOwner extends js.Object {
  /** The Google for Work customer id used in the Directory API. */
  var directoryCustomerId: js.UndefOr[java.lang.String] = js.undefined
}

object OrganizationOwner {
  @scala.inline
  def apply(directoryCustomerId: java.lang.String = null): OrganizationOwner = {
    val __obj = js.Dynamic.literal()
    if (directoryCustomerId != null) __obj.updateDynamic("directoryCustomerId")(directoryCustomerId)
    __obj.asInstanceOf[OrganizationOwner]
  }
}

