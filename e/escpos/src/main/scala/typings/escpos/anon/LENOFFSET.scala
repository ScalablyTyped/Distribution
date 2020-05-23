package typings.escpos.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LENOFFSET extends js.Object {
  var LEN_OFFSET: typings.escpos.escposNumbers.`3`
  var LEVEL: OPTIONS
  var PIXEL_SIZE: CMD
  var PRINTBUF: CMDP2
  var SAVEBUF: CMDP1
  var VERSION: DEFAULT
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
}

