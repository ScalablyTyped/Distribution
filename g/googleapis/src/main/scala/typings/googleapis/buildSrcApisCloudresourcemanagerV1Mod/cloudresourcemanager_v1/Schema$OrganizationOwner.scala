package typings.googleapis.buildSrcApisCloudresourcemanagerV1Mod.cloudresourcemanager_v1

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
trait Schema$OrganizationOwner extends js.Object {
  /**
    * The G Suite customer id used in the Directory API.
    */
  var directoryCustomerId: js.UndefOr[String] = js.native
}

object Schema$OrganizationOwner {
  @scala.inline
  def apply(directoryCustomerId: String = null): Schema$OrganizationOwner = {
    val __obj = js.Dynamic.literal()
    if (directoryCustomerId != null) __obj.updateDynamic("directoryCustomerId")(directoryCustomerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrganizationOwner]
  }
}

