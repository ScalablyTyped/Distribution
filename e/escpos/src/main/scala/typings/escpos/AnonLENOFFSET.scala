package typings.escpos

import typings.escpos.escposNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLENOFFSET extends js.Object {
  var LEN_OFFSET: `3`
  var LEVEL: AnonOPTIONS
  var PIXEL_SIZE: AnonCMD
  var PRINTBUF: AnonCMDP2
  var SAVEBUF: AnonCMDP1
  var VERSION: AnonDEFAULT
}

object AnonLENOFFSET {
  @scala.inline
  def apply(
    LEN_OFFSET: `3`,
    LEVEL: AnonOPTIONS,
    PIXEL_SIZE: AnonCMD,
    PRINTBUF: AnonCMDP2,
    SAVEBUF: AnonCMDP1,
    VERSION: AnonDEFAULT
  ): AnonLENOFFSET = {
    val __obj = js.Dynamic.literal(LEN_OFFSET = LEN_OFFSET.asInstanceOf[js.Any], LEVEL = LEVEL.asInstanceOf[js.Any], PIXEL_SIZE = PIXEL_SIZE.asInstanceOf[js.Any], PRINTBUF = PRINTBUF.asInstanceOf[js.Any], SAVEBUF = SAVEBUF.asInstanceOf[js.Any], VERSION = VERSION.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLENOFFSET]
  }
}

