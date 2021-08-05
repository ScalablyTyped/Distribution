package typings.domClipboardApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Navigator extends StObject {
  
  val clipboard: Clipboard
}
object Navigator {
  
  inline def apply(clipboard: Clipboard): Navigator = {
    val __obj = js.Dynamic.literal(clipboard = clipboard.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
  
  extension [Self <: Navigator](x: Self) {
    
    inline def setClipboard(value: Clipboard): Self = StObject.set(x, "clipboard", value.asInstanceOf[js.Any])
  }
}
