package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndUtcSec extends StObject {
  
  var endUtcSec: js.UndefOr[String] = js.undefined
  
  var startUtcSec: js.UndefOr[String] = js.undefined
}
object EndUtcSec {
  
  inline def apply(): EndUtcSec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndUtcSec]
  }
  
  extension [Self <: EndUtcSec](x: Self) {
    
    inline def setEndUtcSec(value: String): Self = StObject.set(x, "endUtcSec", value.asInstanceOf[js.Any])
    
    inline def setEndUtcSecUndefined: Self = StObject.set(x, "endUtcSec", js.undefined)
    
    inline def setStartUtcSec(value: String): Self = StObject.set(x, "startUtcSec", value.asInstanceOf[js.Any])
    
    inline def setStartUtcSecUndefined: Self = StObject.set(x, "startUtcSec", js.undefined)
  }
}
