package typings.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Identifying information for a single ancestor of a project.
  */
@js.native
trait SchemaAncestor extends js.Object {
  /**
    * Resource id of the ancestor.
    */
  var resourceId: js.UndefOr[SchemaResourceId] = js.native
}

object SchemaAncestor {
  @scala.inline
  def apply(resourceId: SchemaResourceId = null): SchemaAncestor = {
    val __obj = js.Dynamic.literal()
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAncestor]
  }
}

