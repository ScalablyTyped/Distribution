package typings.escpos.anon

import typings.escpos.escposStrings.Datalinkescape
import typings.escpos.escposStrings.Graveaccent
import typings.escpos.escposStrings.Null
import typings.escpos.escposStrings.P
import typings.escpos.escposStrings.Space
import typings.escpos.escposStrings.`0`
import typings.escpos.escposStrings.`@`
import typings.escpos.escposStrings.p_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  var `1`: Null
  
  var `2`: Datalinkescape
  
  var `3`: Space
  
  var `4`: `0`
  
  var `5`: `@`
  
  var `6`: P
  
  var `7`: Graveaccent
  
  var `8`: p_
}
object `2` {
  
  inline def apply(): `2` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("1")("\u0000")
    __obj.updateDynamic("2")("\u0010")
    __obj.updateDynamic("3")(" ")
    __obj.updateDynamic("4")("0")
    __obj.updateDynamic("5")("@")
    __obj.updateDynamic("6")("P")
    __obj.updateDynamic("7")("`")
    __obj.updateDynamic("8")("p")
    __obj.asInstanceOf[`2`]
  }
  
  extension [Self <: `2`](x: Self) {
    
    inline def set1(value: Null): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
    
    inline def set2(value: Datalinkescape): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
    
    inline def set3(value: Space): Self = StObject.set(x, "3", value.asInstanceOf[js.Any])
    
    inline def set4(value: `0`): Self = StObject.set(x, "4", value.asInstanceOf[js.Any])
    
    inline def set5(value: `@`): Self = StObject.set(x, "5", value.asInstanceOf[js.Any])
    
    inline def set6(value: P): Self = StObject.set(x, "6", value.asInstanceOf[js.Any])
    
    inline def set7(value: Graveaccent): Self = StObject.set(x, "7", value.asInstanceOf[js.Any])
    
    inline def set8(value: p_): Self = StObject.set(x, "8", value.asInstanceOf[js.Any])
  }
}
