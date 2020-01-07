package typings.googleapis.buildSrcApisCloudresourcemanagerV1Mod.cloudresourcemanager_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response from the GetAncestry method.
  */
@js.native
trait Schema$GetAncestryResponse extends js.Object {
  /**
    * Ancestors are ordered from bottom to top of the resource hierarchy. The
    * first ancestor is the project itself, followed by the project&#39;s
    * parent, etc..
    */
  var ancestor: js.UndefOr[js.Array[Schema$Ancestor]] = js.native
}

object Schema$GetAncestryResponse {
  @scala.inline
  def apply(ancestor: js.Array[Schema$Ancestor] = null): Schema$GetAncestryResponse = {
    val __obj = js.Dynamic.literal()
    if (ancestor != null) __obj.updateDynamic("ancestor")(ancestor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GetAncestryResponse]
  }
}

