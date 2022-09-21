package typings.fullcalendarCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForPrint extends StObject {
  
  var forPrint: Boolean
}
object ForPrint {
  
  inline def apply(forPrint: Boolean): ForPrint = {
    val __obj = js.Dynamic.literal(forPrint = forPrint.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForPrint]
  }
  
  extension [Self <: ForPrint](x: Self) {
    
    inline def setForPrint(value: Boolean): Self = StObject.set(x, "forPrint", value.asInstanceOf[js.Any])
  }
}
