package typings.gapiDotClientDotCloudresourcemanager.gapi.client.cloudresourcemanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ancestor extends js.Object {
  /** Resource id of the ancestor. */
  var resourceId: js.UndefOr[ResourceId] = js.undefined
}

object Ancestor {
  @scala.inline
  def apply(resourceId: ResourceId = null): Ancestor = {
    val __obj = js.Dynamic.literal()
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ancestor]
  }
}

