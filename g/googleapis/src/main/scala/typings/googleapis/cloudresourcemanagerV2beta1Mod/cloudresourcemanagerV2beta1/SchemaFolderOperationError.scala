package typings.googleapis.cloudresourcemanagerV2beta1Mod.cloudresourcemanagerV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A classification of the Folder Operation error.
  */
@js.native
trait SchemaFolderOperationError extends js.Object {
  /**
    * The type of operation error experienced.
    */
  var errorMessageId: js.UndefOr[String] = js.native
}

object SchemaFolderOperationError {
  @scala.inline
  def apply(errorMessageId: String = null): SchemaFolderOperationError = {
    val __obj = js.Dynamic.literal()
    if (errorMessageId != null) __obj.updateDynamic("errorMessageId")(errorMessageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFolderOperationError]
  }
}

