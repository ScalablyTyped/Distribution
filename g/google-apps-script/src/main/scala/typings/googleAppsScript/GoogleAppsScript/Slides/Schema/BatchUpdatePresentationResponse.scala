package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchUpdatePresentationResponse extends js.Object {
  
  var presentationId: js.UndefOr[String] = js.native
  
  var replies: js.UndefOr[js.Array[Response]] = js.native
  
  var writeControl: js.UndefOr[WriteControl] = js.native
}
object BatchUpdatePresentationResponse {
  
  @scala.inline
  def apply(): BatchUpdatePresentationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdatePresentationResponse]
  }
  
  @scala.inline
  implicit class BatchUpdatePresentationResponseOps[Self <: BatchUpdatePresentationResponse] (val x: Self) extends AnyVal {
    
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
    def setPresentationId(value: String): Self = this.set("presentationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePresentationId: Self = this.set("presentationId", js.undefined)
    
    @scala.inline
    def setRepliesVarargs(value: Response*): Self = this.set("replies", js.Array(value :_*))
    
    @scala.inline
    def setReplies(value: js.Array[Response]): Self = this.set("replies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplies: Self = this.set("replies", js.undefined)
    
    @scala.inline
    def setWriteControl(value: WriteControl): Self = this.set("writeControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriteControl: Self = this.set("writeControl", js.undefined)
  }
}
