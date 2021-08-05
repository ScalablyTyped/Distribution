package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetStyleSheetTextResponse extends StObject {
  
  /**
    * URL of source map associated with script (if any).
    */
  var sourceMapURL: js.UndefOr[String] = js.undefined
}
object SetStyleSheetTextResponse {
  
  inline def apply(): SetStyleSheetTextResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetStyleSheetTextResponse]
  }
  
  extension [Self <: SetStyleSheetTextResponse](x: Self) {
    
    inline def setSourceMapURL(value: String): Self = StObject.set(x, "sourceMapURL", value.asInstanceOf[js.Any])
    
    inline def setSourceMapURLUndefined: Self = StObject.set(x, "sourceMapURL", js.undefined)
  }
}
