package typings.evernote.anon

import typings.evernote.mod.NoteStore.ManageNotebookSharesError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var errors: js.UndefOr[js.Array[ManageNotebookSharesError]] = js.undefined
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setErrors(value: js.Array[ManageNotebookSharesError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: ManageNotebookSharesError*): Self = StObject.set(x, "errors", js.Array(value*))
  }
}
