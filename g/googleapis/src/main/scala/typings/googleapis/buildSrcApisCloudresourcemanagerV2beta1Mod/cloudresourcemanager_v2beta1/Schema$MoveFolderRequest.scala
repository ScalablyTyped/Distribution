package typings.googleapis.buildSrcApisCloudresourcemanagerV2beta1Mod.cloudresourcemanager_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The MoveFolder request message.
  */
@js.native
trait Schema$MoveFolderRequest extends js.Object {
  /**
    * The resource name of the Folder or Organization to reparent the folder
    * under. Must be of the form `folders/{folder_id}` or
    * `organizations/{org_id}`.
    */
  var destinationParent: js.UndefOr[String] = js.native
}

object Schema$MoveFolderRequest {
  @scala.inline
  def apply(destinationParent: String = null): Schema$MoveFolderRequest = {
    val __obj = js.Dynamic.literal()
    if (destinationParent != null) __obj.updateDynamic("destinationParent")(destinationParent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MoveFolderRequest]
  }
}

