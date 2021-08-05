package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.extensionTypes.ExtensionFileOrCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Code
  extends StObject
     with ExtensionFileOrCode {
  
  var code: String
}
object Code {
  
  inline def apply(code: String): Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
  
  extension [Self <: Code](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
  }
}
