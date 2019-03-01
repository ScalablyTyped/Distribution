package typings
package gapiDotClientDotCloudresourcemanagerLib.gapiNs.clientNs.cloudresourcemanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FolderOperationError extends js.Object {
  /** The type of operation error experienced. */
  var errorMessageId: js.UndefOr[java.lang.String] = js.undefined
}

object FolderOperationError {
  @scala.inline
  def apply(errorMessageId: java.lang.String = null): FolderOperationError = {
    val __obj = js.Dynamic.literal()
    if (errorMessageId != null) __obj.updateDynamic("errorMessageId")(errorMessageId)
    __obj.asInstanceOf[FolderOperationError]
  }
}

