package typings.evernote.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Note extends StObject {
  
  var note: js.UndefOr[typings.evernote.mod.Types.Note] = js.undefined
  
  var updated: js.UndefOr[Boolean] = js.undefined
}
object Note {
  
  @scala.inline
  def apply(): Note = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Note]
  }
  
  @scala.inline
  implicit class NoteMutableBuilder[Self <: Note] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNote(value: typings.evernote.mod.Types.Note): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    @scala.inline
    def setUpdated(value: Boolean): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
  }
}
