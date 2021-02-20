package typings.evernote.anon

import typings.evernote.mod.Types.Timestamp
import typings.evernote.mod.Types.UserID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LastEditorId extends StObject {
  
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
  implicit class LastEditorIdMutableBuilder[Self <: LastEditorId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastEditorId(value: UserID): Self = StObject.set(x, "lastEditorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastEditorIdUndefined: Self = StObject.set(x, "lastEditorId", js.undefined)
    
    @scala.inline
    def setSaved(value: Timestamp): Self = StObject.set(x, "saved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSavedUndefined: Self = StObject.set(x, "saved", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUpdateSequenceNum(value: Double): Self = StObject.set(x, "updateSequenceNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateSequenceNumUndefined: Self = StObject.set(x, "updateSequenceNum", js.undefined)
    
    @scala.inline
    def setUpdated(value: Timestamp): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
  }
}
