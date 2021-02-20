package typings.escpos.anon

import typings.escpos.escposStrings.InformationseparatorthreewAcknowledge
import typings.escpos.escposStrings.InformationseparatorthreewEndoftext
import typings.escpos.escposStrings.InformationseparatorthreewEndoftransmission
import typings.escpos.escposStrings.InformationseparatorthreewEnquiry
import typings.escpos.escposStrings.InformationseparatorthreewStartoftext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `3` extends StObject {
  
  var `1`: InformationseparatorthreewStartoftext = js.native
  
  var `2`: InformationseparatorthreewEndoftext = js.native
  
  var `3`: InformationseparatorthreewEndoftransmission = js.native
  
  var `4`: InformationseparatorthreewEnquiry = js.native
  
  var `5`: InformationseparatorthreewAcknowledge = js.native
}
object `3` {
  
  @scala.inline
  def apply(
    `1`: InformationseparatorthreewStartoftext,
    `2`: InformationseparatorthreewEndoftext,
    `3`: InformationseparatorthreewEndoftransmission,
    `4`: InformationseparatorthreewEnquiry,
    `5`: InformationseparatorthreewAcknowledge
  ): `3` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    __obj.updateDynamic("3")(`3`.asInstanceOf[js.Any])
    __obj.updateDynamic("4")(`4`.asInstanceOf[js.Any])
    __obj.updateDynamic("5")(`5`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`3`]
  }
  
  @scala.inline
  implicit class `3MutableBuilder`[Self <: `3`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set1(value: InformationseparatorthreewStartoftext): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set2(value: InformationseparatorthreewEndoftext): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set3(value: InformationseparatorthreewEndoftransmission): Self = StObject.set(x, "3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set4(value: InformationseparatorthreewEnquiry): Self = StObject.set(x, "4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set5(value: InformationseparatorthreewAcknowledge): Self = StObject.set(x, "5", value.asInstanceOf[js.Any])
  }
}
