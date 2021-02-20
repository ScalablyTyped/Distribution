package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to modify the attachments of a student submission.
  */
@js.native
trait SchemaModifyAttachmentsRequest extends StObject {
  
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
  implicit class SchemaModifyAttachmentsRequestMutableBuilder[Self <: SchemaModifyAttachmentsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddAttachments(value: js.Array[SchemaAttachment]): Self = StObject.set(x, "addAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddAttachmentsUndefined: Self = StObject.set(x, "addAttachments", js.undefined)
    
    @scala.inline
    def setAddAttachmentsVarargs(value: SchemaAttachment*): Self = StObject.set(x, "addAttachments", js.Array(value :_*))
  }
}
