package typings.esbuildWasm.libBrowserMod

import typings.esbuildWasm.esbuildWasmStrings.error
import typings.esbuildWasm.esbuildWasmStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormatMessagesOptions extends StObject {
  
  var color: js.UndefOr[Boolean] = js.undefined
  
  var kind: error | warning
  
  var terminalWidth: js.UndefOr[Double] = js.undefined
}
object FormatMessagesOptions {
  
  inline def apply(kind: error | warning): FormatMessagesOptions = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatMessagesOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormatMessagesOptions] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setKind(value: error | warning): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setTerminalWidth(value: Double): Self = StObject.set(x, "terminalWidth", value.asInstanceOf[js.Any])
    
    inline def setTerminalWidthUndefined: Self = StObject.set(x, "terminalWidth", js.undefined)
  }
}
