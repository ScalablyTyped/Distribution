package typings.escpos.anon

import typings.escpos.escposNumbers.`12`
import typings.escpos.escposNumbers.`24`
import typings.escpos.escposStrings.EscapeNumbersignNumbersignQPIX
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CMD extends StObject {
  
  var CMD: EscapeNumbersignNumbersignQPIX
  
  var DEFAULT: `12`
  
  var MAX: `24`
  
  var MIN: typings.escpos.escposNumbers.`1`
}
object CMD {
  
  @scala.inline
  def apply(): CMD = {
    val __obj = js.Dynamic.literal(CMD = "\u001B##QPIX", DEFAULT = 12, MAX = 24, MIN = 1)
    __obj.asInstanceOf[CMD]
  }
  
  @scala.inline
  implicit class CMDMutableBuilder[Self <: CMD] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCMD(value: EscapeNumbersignNumbersignQPIX): Self = StObject.set(x, "CMD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDEFAULT(value: `12`): Self = StObject.set(x, "DEFAULT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMAX(value: `24`): Self = StObject.set(x, "MAX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMIN(value: typings.escpos.escposNumbers.`1`): Self = StObject.set(x, "MIN", value.asInstanceOf[js.Any])
  }
}
