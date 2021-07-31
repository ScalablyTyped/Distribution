package typings.evernote.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NoSetFullAccess extends StObject {
  
  var noSetFullAccess: js.UndefOr[Boolean] = js.undefined
  
  var noSetModifyNote: js.UndefOr[Boolean] = js.undefined
  
  var noSetReadNote: js.UndefOr[Boolean] = js.undefined
}
object NoSetFullAccess {
  
  @scala.inline
  def apply(): NoSetFullAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoSetFullAccess]
  }
  
  @scala.inline
  implicit class NoSetFullAccessMutableBuilder[Self <: NoSetFullAccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNoSetFullAccess(value: Boolean): Self = StObject.set(x, "noSetFullAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSetFullAccessUndefined: Self = StObject.set(x, "noSetFullAccess", js.undefined)
    
    @scala.inline
    def setNoSetModifyNote(value: Boolean): Self = StObject.set(x, "noSetModifyNote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSetModifyNoteUndefined: Self = StObject.set(x, "noSetModifyNote", js.undefined)
    
    @scala.inline
    def setNoSetReadNote(value: Boolean): Self = StObject.set(x, "noSetReadNote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSetReadNoteUndefined: Self = StObject.set(x, "noSetReadNote", js.undefined)
  }
}
