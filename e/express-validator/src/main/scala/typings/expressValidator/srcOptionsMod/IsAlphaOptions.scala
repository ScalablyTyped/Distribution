package typings.expressValidator.srcOptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsAlphaOptions extends StObject {
  
  var ignore: js.UndefOr[String | js.Array[String] | js.RegExp] = js.undefined
}
object IsAlphaOptions {
  
  inline def apply(): IsAlphaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsAlphaOptions]
  }
  
  extension [Self <: IsAlphaOptions](x: Self) {
    
    inline def setIgnore(value: String | js.Array[String] | js.RegExp): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
    
    inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
    
    inline def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value*))
  }
}
