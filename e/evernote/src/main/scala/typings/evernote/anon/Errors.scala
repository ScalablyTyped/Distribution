package typings.evernote.anon

import typings.evernote.mod.NoteStore.ManageNoteSharesError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Errors extends StObject {
  
  var errors: js.UndefOr[js.Array[ManageNoteSharesError]] = js.undefined
}
object Errors {
  
  inline def apply(): Errors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Errors]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Errors] (val x: Self) extends AnyVal {
    
    inline def setErrors(value: js.Array[ManageNoteSharesError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: ManageNoteSharesError*): Self = StObject.set(x, "errors", js.Array(value*))
  }
}
