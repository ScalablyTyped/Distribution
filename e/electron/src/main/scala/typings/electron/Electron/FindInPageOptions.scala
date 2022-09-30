package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindInPageOptions extends StObject {
  
  /**
    * Whether to begin a new text finding session with this request. Should be `true`
    * for initial requests, and `false` for follow-up requests. Defaults to `false`.
    */
  var findNext: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to search forward or backward, defaults to `true`.
    */
  var forward: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether search should be case-sensitive, defaults to `false`.
    */
  var matchCase: js.UndefOr[Boolean] = js.undefined
}
object FindInPageOptions {
  
  inline def apply(): FindInPageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindInPageOptions]
  }
  
  extension [Self <: FindInPageOptions](x: Self) {
    
    inline def setFindNext(value: Boolean): Self = StObject.set(x, "findNext", value.asInstanceOf[js.Any])
    
    inline def setFindNextUndefined: Self = StObject.set(x, "findNext", js.undefined)
    
    inline def setForward(value: Boolean): Self = StObject.set(x, "forward", value.asInstanceOf[js.Any])
    
    inline def setForwardUndefined: Self = StObject.set(x, "forward", js.undefined)
    
    inline def setMatchCase(value: Boolean): Self = StObject.set(x, "matchCase", value.asInstanceOf[js.Any])
    
    inline def setMatchCaseUndefined: Self = StObject.set(x, "matchCase", js.undefined)
  }
}
