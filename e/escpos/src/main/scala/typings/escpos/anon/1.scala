package typings.escpos.anon

import typings.escpos.escposStrings.Acknowledge
import typings.escpos.escposStrings.Bell
import typings.escpos.escposStrings.Endoftext
import typings.escpos.escposStrings.Endoftransmission
import typings.escpos.escposStrings.Enquiry
import typings.escpos.escposStrings.Null
import typings.escpos.escposStrings.Startofheading
import typings.escpos.escposStrings.Startoftext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var `1`: Null
  
  var `2`: Startofheading
  
  var `3`: Startoftext
  
  var `4`: Endoftext
  
  var `5`: Endoftransmission
  
  var `6`: Enquiry
  
  var `7`: Acknowledge
  
  var `8`: Bell
}
object `1` {
  
  inline def apply(): `1` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("1")("\u0000")
    __obj.updateDynamic("2")("\u0001")
    __obj.updateDynamic("3")("\u0002")
    __obj.updateDynamic("4")("\u0003")
    __obj.updateDynamic("5")("\u0004")
    __obj.updateDynamic("6")("\u0005")
    __obj.updateDynamic("7")("\u0006")
    __obj.updateDynamic("8")("\u0007")
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def set1(value: Null): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
    
    inline def set2(value: Startofheading): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
    
    inline def set3(value: Startoftext): Self = StObject.set(x, "3", value.asInstanceOf[js.Any])
    
    inline def set4(value: Endoftext): Self = StObject.set(x, "4", value.asInstanceOf[js.Any])
    
    inline def set5(value: Endoftransmission): Self = StObject.set(x, "5", value.asInstanceOf[js.Any])
    
    inline def set6(value: Enquiry): Self = StObject.set(x, "6", value.asInstanceOf[js.Any])
    
    inline def set7(value: Acknowledge): Self = StObject.set(x, "7", value.asInstanceOf[js.Any])
    
    inline def set8(value: Bell): Self = StObject.set(x, "8", value.asInstanceOf[js.Any])
  }
}
