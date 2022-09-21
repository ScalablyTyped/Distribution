package typings.forgeApis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait With extends StObject {
  
  var _with: js.UndefOr[String] = js.undefined
  
  var ifModifiedSince: js.UndefOr[js.Date] = js.undefined
}
object With {
  
  inline def apply(): With = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[With]
  }
  
  extension [Self <: With](x: Self) {
    
    inline def setIfModifiedSince(value: js.Date): Self = StObject.set(x, "ifModifiedSince", value.asInstanceOf[js.Any])
    
    inline def setIfModifiedSinceUndefined: Self = StObject.set(x, "ifModifiedSince", js.undefined)
    
    inline def set_with(value: String): Self = StObject.set(x, "_with", value.asInstanceOf[js.Any])
    
    inline def set_withUndefined: Self = StObject.set(x, "_with", js.undefined)
  }
}
