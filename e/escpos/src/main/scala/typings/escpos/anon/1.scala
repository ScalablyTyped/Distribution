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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1` extends StObject {
  
  var `1`: Null = js.native
  
  var `2`: Startofheading = js.native
  
  var `3`: Startoftext = js.native
  
  var `4`: Endoftext = js.native
  
  var `5`: Endoftransmission = js.native
  
  var `6`: Enquiry = js.native
  
  var `7`: Acknowledge = js.native
  
  var `8`: Bell = js.native
}
object `1` {
  
  @scala.inline
  def apply(
    `1`: Null,
    `2`: Startofheading,
    `3`: Startoftext,
    `4`: Endoftext,
    `5`: Endoftransmission,
    `6`: Enquiry,
    `7`: Acknowledge,
    `8`: Bell
  ): `1` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    __obj.updateDynamic("3")(`3`.asInstanceOf[js.Any])
    __obj.updateDynamic("4")(`4`.asInstanceOf[js.Any])
    __obj.updateDynamic("5")(`5`.asInstanceOf[js.Any])
    __obj.updateDynamic("6")(`6`.asInstanceOf[js.Any])
    __obj.updateDynamic("7")(`7`.asInstanceOf[js.Any])
    __obj.updateDynamic("8")(`8`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit class `1MutableBuilder`[Self <: `1`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set1(value: Null): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set2(value: Startofheading): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set3(value: Startoftext): Self = StObject.set(x, "3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set4(value: Endoftext): Self = StObject.set(x, "4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set5(value: Endoftransmission): Self = StObject.set(x, "5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set6(value: Enquiry): Self = StObject.set(x, "6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set7(value: Acknowledge): Self = StObject.set(x, "7", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set8(value: Bell): Self = StObject.set(x, "8", value.asInstanceOf[js.Any])
  }
}
