package typings.escpos.anon

import typings.escpos.escposStrings.InformationseparatorthreewAcknowledge
import typings.escpos.escposStrings.InformationseparatorthreewEndoftext
import typings.escpos.escposStrings.InformationseparatorthreewEndoftransmission
import typings.escpos.escposStrings.InformationseparatorthreewEnquiry
import typings.escpos.escposStrings.InformationseparatorthreewStartoftext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3` extends StObject {
  
  var `1`: InformationseparatorthreewStartoftext
  
  var `2`: InformationseparatorthreewEndoftext
  
  var `3`: InformationseparatorthreewEndoftransmission
  
  var `4`: InformationseparatorthreewEnquiry
  
  var `5`: InformationseparatorthreewAcknowledge
}
object `3` {
  
  inline def apply(): `3` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("1")("\u001Dw\u0002")
    __obj.updateDynamic("2")("\u001Dw\u0003")
    __obj.updateDynamic("3")("\u001Dw\u0004")
    __obj.updateDynamic("4")("\u001Dw\u0005")
    __obj.updateDynamic("5")("\u001Dw\u0006")
    __obj.asInstanceOf[`3`]
  }
  
  extension [Self <: `3`](x: Self) {
    
    inline def set1(value: InformationseparatorthreewStartoftext): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
    
    inline def set2(value: InformationseparatorthreewEndoftext): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
    
    inline def set3(value: InformationseparatorthreewEndoftransmission): Self = StObject.set(x, "3", value.asInstanceOf[js.Any])
    
    inline def set4(value: InformationseparatorthreewEnquiry): Self = StObject.set(x, "4", value.asInstanceOf[js.Any])
    
    inline def set5(value: InformationseparatorthreewAcknowledge): Self = StObject.set(x, "5", value.asInstanceOf[js.Any])
  }
}
