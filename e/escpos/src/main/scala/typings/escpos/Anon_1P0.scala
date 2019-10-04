package typings.escpos

import typings.escpos.escposStrings.`1P0`
import typings.escpos.escposStrings.`BACKSLASHu001D(k`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_1P0 extends js.Object {
  // Format= CMD_P1{LEN_2BYTE}CMD_P2{DATA}
  // DATA Max Length= 256*256 - 3 (65533)
  var CMD_P1: `BACKSLASHu001D(k`
  var CMD_P2: `1P0`
}

object Anon_1P0 {
  @scala.inline
  def apply(CMD_P1: `BACKSLASHu001D(k`, CMD_P2: `1P0`): Anon_1P0 = {
    val __obj = js.Dynamic.literal(CMD_P1 = CMD_P1, CMD_P2 = CMD_P2)
  
    __obj.asInstanceOf[Anon_1P0]
  }
}

