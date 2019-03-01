package typings
package gapiDotClientDotCloudresourcemanagerLib.gapiNs.clientNs.cloudresourcemanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FolderOperation extends js.Object {
  /**
    * The resource name of the folder or organization we are either creating
    * the folder under or moving the folder to.
    */
  var destinationParent: js.UndefOr[java.lang.String] = js.undefined
  /** The display name of the folder. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** The type of this operation. */
  var operationType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The resource name of the folder's parent.
    * Only applicable when the operation_type is MOVE.
    */
  var sourceParent: js.UndefOr[java.lang.String] = js.undefined
}

object FolderOperation {
  @scala.inline
  def apply(
    destinationParent: java.lang.String = null,
    displayName: java.lang.String = null,
    operationType: java.lang.String = null,
    sourceParent: java.lang.String = null
  ): FolderOperation = {
    val __obj = js.Dynamic.literal()
    if (destinationParent != null) __obj.updateDynamic("destinationParent")(destinationParent)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (operationType != null) __obj.updateDynamic("operationType")(operationType)
    if (sourceParent != null) __obj.updateDynamic("sourceParent")(sourceParent)
    __obj.asInstanceOf[FolderOperation]
  }
}

