package typings.electron.Electron

import typings.electron.electronStrings.exists
import typings.electron.electronStrings.existsAndRunning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MoveToApplicationsFolderOptions extends StObject {
  
  /**
    * A handler for potential conflict in move failure.
    */
  var conflictHandler: js.UndefOr[js.Function1[/* conflictType */ exists | existsAndRunning, Boolean]] = js.undefined
}
object MoveToApplicationsFolderOptions {
  
  inline def apply(): MoveToApplicationsFolderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MoveToApplicationsFolderOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MoveToApplicationsFolderOptions] (val x: Self) extends AnyVal {
    
    inline def setConflictHandler(value: /* conflictType */ exists | existsAndRunning => Boolean): Self = StObject.set(x, "conflictHandler", js.Any.fromFunction1(value))
    
    inline def setConflictHandlerUndefined: Self = StObject.set(x, "conflictHandler", js.undefined)
  }
}
