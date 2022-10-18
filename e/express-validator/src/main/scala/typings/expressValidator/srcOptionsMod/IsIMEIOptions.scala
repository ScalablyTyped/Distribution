package typings.expressValidator.srcOptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsIMEIOptions extends StObject {
  
  var allow_hyphens: js.UndefOr[Boolean] = js.undefined
}
object IsIMEIOptions {
  
  inline def apply(): IsIMEIOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsIMEIOptions]
  }
  
  extension [Self <: IsIMEIOptions](x: Self) {
    
    inline def setAllow_hyphens(value: Boolean): Self = StObject.set(x, "allow_hyphens", value.asInstanceOf[js.Any])
    
    inline def setAllow_hyphensUndefined: Self = StObject.set(x, "allow_hyphens", js.undefined)
  }
}
