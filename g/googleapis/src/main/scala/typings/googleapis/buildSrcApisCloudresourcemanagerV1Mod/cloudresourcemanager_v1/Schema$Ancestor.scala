package typings.googleapis.buildSrcApisCloudresourcemanagerV1Mod.cloudresourcemanager_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Identifying information for a single ancestor of a project.
  */
@js.native
trait Schema$Ancestor extends js.Object {
  /**
    * Resource id of the ancestor.
    */
  var resourceId: js.UndefOr[Schema$ResourceId] = js.native
}

object Schema$Ancestor {
  @scala.inline
  def apply(resourceId: Schema$ResourceId = null): Schema$Ancestor = {
    val __obj = js.Dynamic.literal()
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Ancestor]
  }
}

