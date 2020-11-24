package typings.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to modify the attachments of a student submission.
  */
@js.native
trait SchemaModifyAttachmentsRequest extends js.Object {
  
  /**
    * Attachments to add. A student submission may not have more than 20
    * attachments.  Form attachments are not supported.
    */
  var addAttachments: js.UndefOr[js.Array[SchemaAttachment]] = js.native
}
object SchemaModifyAttachmentsRequest {
  
  @scala.inline
  def apply(): SchemaModifyAttachmentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaModifyAttachmentsRequest]
  }
  
  @scala.inline
  implicit class SchemaModifyAttachmentsRequestOps[Self <: SchemaModifyAttachmentsRequest] (val x: Self) extends AnyVal {
    
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
    def setAddAttachmentsVarargs(value: SchemaAttachment*): Self = this.set("addAttachments", js.Array(value :_*))
    
    @scala.inline
    def setAddAttachments(value: js.Array[SchemaAttachment]): Self = this.set("addAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddAttachments: Self = this.set("addAttachments", js.undefined)
  }
}
