package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TitleOptions extends StObject {
  
  /**
    * The font family variant to display, can be `monospaced` or `monospacedDigit`.
    * `monospaced` is available in macOS 10.15+ and `monospacedDigit` is available in
    * macOS 10.11+.  When left blank, the title uses the default system font.
    */
  var fontType: js.UndefOr["monospaced" | "monospacedDigit"] = js.undefined
}
object TitleOptions {
  
  inline def apply(): TitleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TitleOptions]
  }
  
  extension [Self <: TitleOptions](x: Self) {
    
    inline def setFontType(value: "monospaced" | "monospacedDigit"): Self = StObject.set(x, "fontType", value.asInstanceOf[js.Any])
    
    inline def setFontTypeUndefined: Self = StObject.set(x, "fontType", js.undefined)
  }
}
