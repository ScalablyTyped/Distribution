package typings.evernote.anon

import typings.evernote.mod.Types.Timestamp
import typings.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LastEditorId extends js.Object {
  
  var lastEditorId: js.UndefOr[UserID] = js.native
  
  var saved: js.UndefOr[Timestamp] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var updateSequenceNum: js.UndefOr[Double] = js.native
  
  var updated: js.UndefOr[Timestamp] = js.native
}
object LastEditorId {
  
  @scala.inline
  def apply(): LastEditorId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LastEditorId]
  }
  
  @scala.inline
  implicit class LastEditorIdOps[Self <: LastEditorId] (val x: Self) extends AnyVal {
    
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
    def setLastEditorId(value: UserID): Self = this.set("lastEditorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastEditorId: Self = this.set("lastEditorId", js.undefined)
    
    @scala.inline
    def setSaved(value: Timestamp): Self = this.set("saved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaved: Self = this.set("saved", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setUpdateSequenceNum(value: Double): Self = this.set("updateSequenceNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateSequenceNum: Self = this.set("updateSequenceNum", js.undefined)
    
    @scala.inline
    def setUpdated(value: Timestamp): Self = this.set("updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
  }
}
