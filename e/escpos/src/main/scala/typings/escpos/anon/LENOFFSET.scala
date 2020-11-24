package typings.escpos.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LENOFFSET extends js.Object {
  
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
  implicit class LENOFFSETOps[Self <: LENOFFSET] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLEN_OFFSET(value: typings.escpos.escposNumbers.`3`): Self = this.set("LEN_OFFSET", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLEVEL(value: OPTIONS): Self = this.set("LEVEL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPIXEL_SIZE(value: CMD): Self = this.set("PIXEL_SIZE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPRINTBUF(value: CMDP2): Self = this.set("PRINTBUF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSAVEBUF(value: CMDP1): Self = this.set("SAVEBUF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVERSION(value: DEFAULT): Self = this.set("VERSION", value.asInstanceOf[js.Any])
  }
}
