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

