package typings.escpos.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LENOFFSET extends StObject {
  
  var LEN_OFFSET: typings.escpos.escposNumbers.`3` = js.native
  
  var LEVEL: OPTIONS = js.native
  
  var PIXEL_SIZE: CMD = js.native
  
  var PRINTBUF: CMDP2 = js.native
  
  var SAVEBUF: CMDP1 = js.native
  
  var VERSION: DEFAULT = js.native
}
object LENOFFSET {
  
  @scala.inline
  def apply(
    LEN_OFFSET: typings.escpos.escposNumbers.`3`,
    LEVEL: OPTIONS,
    PIXEL_SIZE: CMD,
    PRINTBUF: CMDP2,
    SAVEBUF: CMDP1,
    VERSION: DEFAULT
  ): LENOFFSET = {
    val __obj = js.Dynamic.literal(LEN_OFFSET = LEN_OFFSET.asInstanceOf[js.Any], LEVEL = LEVEL.asInstanceOf[js.Any], PIXEL_SIZE = PIXEL_SIZE.asInstanceOf[js.Any], PRINTBUF = PRINTBUF.asInstanceOf[js.Any], SAVEBUF = SAVEBUF.asInstanceOf[js.Any], VERSION = VERSION.asInstanceOf[js.Any])
    __obj.asInstanceOf[LENOFFSET]
  }
  
  @scala.inline
  implicit class LENOFFSETMutableBuilder[Self <: LENOFFSET] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLEN_OFFSET(value: typings.escpos.escposNumbers.`3`): Self = StObject.set(x, "LEN_OFFSET", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLEVEL(value: OPTIONS): Self = StObject.set(x, "LEVEL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPIXEL_SIZE(value: CMD): Self = StObject.set(x, "PIXEL_SIZE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPRINTBUF(value: CMDP2): Self = StObject.set(x, "PRINTBUF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSAVEBUF(value: CMDP1): Self = StObject.set(x, "SAVEBUF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVERSION(value: DEFAULT): Self = StObject.set(x, "VERSION", value.asInstanceOf[js.Any])
  }
}
