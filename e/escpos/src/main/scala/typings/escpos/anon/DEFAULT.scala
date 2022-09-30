package typings.escpos.anon

import typings.escpos.escposInts.`16`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DEFAULT extends StObject {
  
  var CMD: String
  
  var DEFAULT: typings.escpos.escposInts.`3`
  
  var MAX: `16`
  
  var MIN: typings.escpos.escposInts.`1`
}
object DEFAULT {
  
  inline def apply(): DEFAULT = {
    val __obj = js.Dynamic.literal(CMD = "\u001D(k\u0003\u00001C", DEFAULT = 3, MAX = 16, MIN = 1)
    __obj.asInstanceOf[DEFAULT]
  }
  
  extension [Self <: DEFAULT](x: Self) {
    
    inline def setCMD(value: String): Self = StObject.set(x, "CMD", value.asInstanceOf[js.Any])
    
    inline def setDEFAULT(value: typings.escpos.escposInts.`3`): Self = StObject.set(x, "DEFAULT", value.asInstanceOf[js.Any])
    
    inline def setMAX(value: `16`): Self = StObject.set(x, "MAX", value.asInstanceOf[js.Any])
    
    inline def setMIN(value: typings.escpos.escposInts.`1`): Self = StObject.set(x, "MIN", value.asInstanceOf[js.Any])
  }
}
