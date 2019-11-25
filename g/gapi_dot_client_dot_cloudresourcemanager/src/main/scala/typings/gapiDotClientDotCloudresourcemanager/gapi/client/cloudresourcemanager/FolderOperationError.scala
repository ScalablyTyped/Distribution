package typings.gapiDotClientDotCloudresourcemanager.gapi.client.cloudresourcemanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FolderOperationError extends js.Object {
  /** The type of operation error experienced. */
  var errorMessageId: js.UndefOr[String] = js.undefined
}

object FolderOperationError {
  @scala.inline
  def apply(errorMessageId: String = null): FolderOperationError = {
    val __obj = js.Dynamic.literal()
    if (errorMessageId != null) __obj.updateDynamic("errorMessageId")(errorMessageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FolderOperationError]
  }
}

