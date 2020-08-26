package typings.googleapis.cloudresourcemanagerV2beta1Mod.cloudresourcemanagerV2beta1

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
  def apply(): SchemaFolderOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFolderOperation]
  }
  @scala.inline
  implicit class SchemaFolderOperationOps[Self <: SchemaFolderOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDestinationParent(value: String): Self = this.set("destinationParent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationParent: Self = this.set("destinationParent", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setOperationType(value: String): Self = this.set("operationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationType: Self = this.set("operationType", js.undefined)
    @scala.inline
    def setSourceParent(value: String): Self = this.set("sourceParent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceParent: Self = this.set("sourceParent", js.undefined)
  }
  
}

