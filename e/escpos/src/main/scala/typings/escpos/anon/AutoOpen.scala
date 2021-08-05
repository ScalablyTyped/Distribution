package typings.escpos.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoOpen extends StObject {
  
  var autoOpen: Boolean
  
  var baudRate: Double
}
object AutoOpen {
  
  inline def apply(autoOpen: Boolean, baudRate: Double): AutoOpen = {
    val __obj = js.Dynamic.literal(autoOpen = autoOpen.asInstanceOf[js.Any], baudRate = baudRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoOpen]
  }
  
  extension [Self <: AutoOpen](x: Self) {
    
    inline def setAutoOpen(value: Boolean): Self = StObject.set(x, "autoOpen", value.asInstanceOf[js.Any])
    
    inline def setBaudRate(value: Double): Self = StObject.set(x, "baudRate", value.asInstanceOf[js.Any])
  }
}
