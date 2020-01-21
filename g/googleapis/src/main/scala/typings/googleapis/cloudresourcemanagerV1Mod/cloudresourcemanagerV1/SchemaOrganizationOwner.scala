package typings.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The entity that owns an Organization. The lifetime of the Organization and
  * all of its descendants are bound to the `OrganizationOwner`. If the
  * `OrganizationOwner` is deleted, the Organization and all its descendants
  * will be deleted.
  */
@js.native
trait SchemaOrganizationOwner extends js.Object {
  /**
    * The G Suite customer id used in the Directory API.
    */
  var directoryCustomerId: js.UndefOr[String] = js.native
}

object SchemaOrganizationOwner {
  @scala.inline
  def apply(directoryCustomerId: String = null): SchemaOrganizationOwner = {
    val __obj = js.Dynamic.literal()
    if (directoryCustomerId != null) __obj.updateDynamic("directoryCustomerId")(directoryCustomerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOrganizationOwner]
  }
}

