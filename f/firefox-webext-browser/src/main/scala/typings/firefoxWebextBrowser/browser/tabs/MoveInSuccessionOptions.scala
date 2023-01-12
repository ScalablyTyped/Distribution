package typings.firefoxWebextBrowser.browser.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MoveInSuccessionOptions extends StObject {
  
  /** Whether to move the tabs before (false) or after (true) tabId in the succession. Defaults to false. */
  var append: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to link up the current predecessors or successor (depending on options.append) of tabId to the other side of the chain after it is prepended or appended. If true, one of the following happens: if options.append is false, the first tab in the array is set as the successor of any current predecessors of tabId; if options.append is true, the current successor of tabId is set as the successor of the last tab in the array. Defaults to false.
    */
  var insert: js.UndefOr[Boolean] = js.undefined
}
object MoveInSuccessionOptions {
  
  inline def apply(): MoveInSuccessionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MoveInSuccessionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MoveInSuccessionOptions] (val x: Self) extends AnyVal {
    
    inline def setAppend(value: Boolean): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
    
    inline def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
    
    inline def setInsert(value: Boolean): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
    
    inline def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
  }
}
