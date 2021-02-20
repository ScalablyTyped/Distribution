package typings.escpos.anon

import typings.escpos.escposStrings.InformationseparatorthreeECNull
import typings.escpos.escposStrings.InformationseparatorthreeECStartofheading
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OFF extends StObject {
  
  // Barcode mode on
  var OFF: InformationseparatorthreeECNull = js.native
  
  var ON: InformationseparatorthreeECStartofheading = js.native
}
object OFF {
  
  @scala.inline
  def apply(OFF: InformationseparatorthreeECNull, ON: InformationseparatorthreeECStartofheading): OFF = {
    val __obj = js.Dynamic.literal(OFF = OFF.asInstanceOf[js.Any], ON = ON.asInstanceOf[js.Any])
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
