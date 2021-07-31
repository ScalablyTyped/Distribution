package typings.escpos.anon

import typings.escpos.escposStrings.InformationseparatorthreeECNull
import typings.escpos.escposStrings.InformationseparatorthreeECStartofheading
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OFF extends StObject {
  
  // Barcode mode on
  var OFF: InformationseparatorthreeECNull
  
  var ON: InformationseparatorthreeECStartofheading
}
object OFF {
  
  @scala.inline
  def apply(): OFF = {
    val __obj = js.Dynamic.literal(OFF = "\u001DEC\u0000", ON = "\u001DEC\u0001")
    __obj.asInstanceOf[OFF]
  }
  
  @scala.inline
  implicit class OFFMutableBuilder[Self <: OFF] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOFF(value: InformationseparatorthreeECNull): Self = StObject.set(x, "OFF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setON(value: InformationseparatorthreeECStartofheading): Self = StObject.set(x, "ON", value.asInstanceOf[js.Any])
  }
}
