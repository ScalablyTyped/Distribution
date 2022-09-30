package typings.escpos.anon

import typings.escpos.escposStrings.`1Q0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CMDP2 extends StObject {
  
  // Format= CMD_P1{LEN_2BYTE}CMD_P2
  var CMD_P1: String
  
  var CMD_P2: `1Q0`
}
object CMDP2 {
  
  inline def apply(): CMDP2 = {
    val __obj = js.Dynamic.literal(CMD_P1 = "\u001D(k", CMD_P2 = "1Q0")
    __obj.asInstanceOf[CMDP2]
  }
  
  extension [Self <: CMDP2](x: Self) {
    
    inline def setCMD_P1(value: String): Self = StObject.set(x, "CMD_P1", value.asInstanceOf[js.Any])
    
    inline def setCMD_P2(value: `1Q0`): Self = StObject.set(x, "CMD_P2", value.asInstanceOf[js.Any])
  }
}
