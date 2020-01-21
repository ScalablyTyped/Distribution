package typings.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata describing a long running folder operation
  */
@js.native
trait SchemaFolderOperation extends js.Object {
  /**
    * The resource name of the folder or organization we are either creating
    * the folder under or moving the folder to.
    */
  var destinationParent: js.UndefOr[String] = js.native
  /**
    * The display name of the folder.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The type of this operation.
    */
  var operationType: js.UndefOr[String] = js.native
  /**
    * The resource name of the folder&#39;s parent. Only applicable when the
    * operation_type is MOVE.
    */
  var sourceParent: js.UndefOr[String] = js.native
}

object SchemaFolderOperation {
  @scala.inline
  def apply(
    destinationParent: String = null,
    displayName: String = null,
    operationType: String = null,
    sourceParent: String = null
  ): SchemaFolderOperation = {
    val __obj = js.Dynamic.literal()
    if (destinationParent != null) __obj.updateDynamic("destinationParent")(destinationParent.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (operationType != null) __obj.updateDynamic("operationType")(operationType.asInstanceOf[js.Any])
    if (sourceParent != null) __obj.updateDynamic("sourceParent")(sourceParent.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFolderOperation]
  }
}

