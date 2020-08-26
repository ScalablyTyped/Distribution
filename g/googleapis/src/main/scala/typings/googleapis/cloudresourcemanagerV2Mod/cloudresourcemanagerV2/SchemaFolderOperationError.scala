package typings.googleapis.cloudresourcemanagerV2Mod.cloudresourcemanagerV2

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
  def apply(): SchemaFolderOperationError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFolderOperationError]
  }
  @scala.inline
  implicit class SchemaFolderOperationErrorOps[Self <: SchemaFolderOperationError] (val x: Self) extends AnyVal {
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
    def setErrorMessageId(value: String): Self = this.set("errorMessageId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessageId: Self = this.set("errorMessageId", js.undefined)
  }
  
}

