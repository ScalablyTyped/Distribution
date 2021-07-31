package typings.escpos.anon

import typings.escpos.escposStrings.InformationseparatorthreeLeftparenthesisk
import typings.escpos.escposStrings.`1P0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CMDP1 extends StObject {
  
  // Format= CMD_P1{LEN_2BYTE}CMD_P2{DATA}
  // DATA Max Length= 256*256 - 3 (65533)
  var CMD_P1: InformationseparatorthreeLeftparenthesisk
  
  var CMD_P2: `1P0`
}
object CMDP1 {
  
  @scala.inline
  def apply(): CMDP1 = {
    val __obj = js.Dynamic.literal(CMD_P1 = "\u001D(k", CMD_P2 = "1P0")
    __obj.asInstanceOf[CMDP1]
  }
  
  @scala.inline
  implicit class CMDP1MutableBuilder[Self <: CMDP1] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCMD_P1(value: InformationseparatorthreeLeftparenthesisk): Self = StObject.set(x, "CMD_P1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCMD_P2(value: `1P0`): Self = StObject.set(x, "CMD_P2", value.asInstanceOf[js.Any])
  }
}
