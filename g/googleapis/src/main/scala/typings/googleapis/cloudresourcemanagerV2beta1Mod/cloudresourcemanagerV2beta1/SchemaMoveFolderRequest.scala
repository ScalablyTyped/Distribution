package typings.googleapis.cloudresourcemanagerV2beta1Mod.cloudresourcemanagerV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The MoveFolder request message.
  */
@js.native
trait SchemaMoveFolderRequest extends js.Object {
  
  /**
    * The resource name of the Folder or Organization to reparent the folder
    * under. Must be of the form `folders/{folder_id}` or
    * `organizations/{org_id}`.
    */
  var destinationParent: js.UndefOr[String] = js.native
}
object SchemaMoveFolderRequest {
  
  @scala.inline
  def apply(): SchemaMoveFolderRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMoveFolderRequest]
  }
  
  @scala.inline
  implicit class SchemaMoveFolderRequestOps[Self <: SchemaMoveFolderRequest] (val x: Self) extends AnyVal {
    
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
  }
}
