package typings.googleapis.cloudresourcemanagerV1beta1Mod.cloudresourcemanagerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response from the GetAncestry method.
  */
@js.native
trait SchemaGetAncestryResponse extends js.Object {
  /**
    * Ancestors are ordered from bottom to top of the resource hierarchy. The
    * first ancestor is the project itself, followed by the project&#39;s
    * parent, etc.
    */
  var ancestor: js.UndefOr[js.Array[SchemaAncestor]] = js.native
}

object SchemaGetAncestryResponse {
  @scala.inline
  def apply(ancestor: js.Array[SchemaAncestor] = null): SchemaGetAncestryResponse = {
    val __obj = js.Dynamic.literal()
    if (ancestor != null) __obj.updateDynamic("ancestor")(ancestor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGetAncestryResponse]
  }
}

