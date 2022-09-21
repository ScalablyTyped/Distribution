package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptFontFamilies extends StObject {
  
  /**
    * Generic font families collection for the script.
    */
  var fontFamilies: FontFamilies
  
  /**
    * Name of the script which these font families are defined for.
    */
  var script: String
}
object ScriptFontFamilies {
  
  inline def apply(fontFamilies: FontFamilies, script: String): ScriptFontFamilies = {
    val __obj = js.Dynamic.literal(fontFamilies = fontFamilies.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptFontFamilies]
  }
  
  extension [Self <: ScriptFontFamilies](x: Self) {
    
    inline def setFontFamilies(value: FontFamilies): Self = StObject.set(x, "fontFamilies", value.asInstanceOf[js.Any])
    
    inline def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
  }
}
