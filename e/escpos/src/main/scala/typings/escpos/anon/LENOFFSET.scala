package typings.escpos.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LENOFFSET extends StObject {
  
  var LEN_OFFSET: typings.escpos.escposInts.`3`
  
  var LEVEL: OPTIONS
  
  var PIXEL_SIZE: CMD
  
  var PRINTBUF: CMDP2
  
  var SAVEBUF: CMDP1
  
  var VERSION: DEFAULT
}
object LENOFFSET {
  
  inline def apply(LEVEL: OPTIONS, PIXEL_SIZE: CMD, PRINTBUF: CMDP2, SAVEBUF: CMDP1, VERSION: DEFAULT): LENOFFSET = {
    val __obj = js.Dynamic.literal(LEN_OFFSET = 3, LEVEL = LEVEL.asInstanceOf[js.Any], PIXEL_SIZE = PIXEL_SIZE.asInstanceOf[js.Any], PRINTBUF = PRINTBUF.asInstanceOf[js.Any], SAVEBUF = SAVEBUF.asInstanceOf[js.Any], VERSION = VERSION.asInstanceOf[js.Any])
    __obj.asInstanceOf[LENOFFSET]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LENOFFSET] (val x: Self) extends AnyVal {
    
    inline def setLEN_OFFSET(value: typings.escpos.escposInts.`3`): Self = StObject.set(x, "LEN_OFFSET", value.asInstanceOf[js.Any])
    
    inline def setLEVEL(value: OPTIONS): Self = StObject.set(x, "LEVEL", value.asInstanceOf[js.Any])
    
    inline def setPIXEL_SIZE(value: CMD): Self = StObject.set(x, "PIXEL_SIZE", value.asInstanceOf[js.Any])
    
    inline def setPRINTBUF(value: CMDP2): Self = StObject.set(x, "PRINTBUF", value.asInstanceOf[js.Any])
    
    inline def setSAVEBUF(value: CMDP1): Self = StObject.set(x, "SAVEBUF", value.asInstanceOf[js.Any])
    
    inline def setVERSION(value: DEFAULT): Self = StObject.set(x, "VERSION", value.asInstanceOf[js.Any])
  }
}
