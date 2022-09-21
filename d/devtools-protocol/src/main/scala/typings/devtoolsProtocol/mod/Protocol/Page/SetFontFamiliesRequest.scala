package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetFontFamiliesRequest extends StObject {
  
  /**
    * Specifies font families to set. If a font family is not specified, it won't be changed.
    */
  var fontFamilies: FontFamilies
  
  /**
    * Specifies font families to set for individual scripts.
    */
  var forScripts: js.UndefOr[js.Array[ScriptFontFamilies]] = js.undefined
}
object SetFontFamiliesRequest {
  
  inline def apply(fontFamilies: FontFamilies): SetFontFamiliesRequest = {
    val __obj = js.Dynamic.literal(fontFamilies = fontFamilies.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetFontFamiliesRequest]
  }
  
  extension [Self <: SetFontFamiliesRequest](x: Self) {
    
    inline def setFontFamilies(value: FontFamilies): Self = StObject.set(x, "fontFamilies", value.asInstanceOf[js.Any])
    
    inline def setForScripts(value: js.Array[ScriptFontFamilies]): Self = StObject.set(x, "forScripts", value.asInstanceOf[js.Any])
    
    inline def setForScriptsUndefined: Self = StObject.set(x, "forScripts", js.undefined)
    
    inline def setForScriptsVarargs(value: ScriptFontFamilies*): Self = StObject.set(x, "forScripts", js.Array(value*))
  }
}
