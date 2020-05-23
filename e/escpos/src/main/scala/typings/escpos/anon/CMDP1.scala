package typings.escpos.anon

import typings.escpos.escposStrings.InformationseparatorthreeLeftparenthesisk
import typings.escpos.escposStrings.`1P0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CMDP1 extends js.Object {
  // Format= CMD_P1{LEN_2BYTE}CMD_P2{DATA}
  // DATA Max Length= 256*256 - 3 (65533)
  var CMD_P1: InformationseparatorthreeLeftparenthesisk
  var CMD_P2: `1P0`
}

object CMDP1 {
  @scala.inline
  def apply(CMD_P1: InformationseparatorthreeLeftparenthesisk, CMD_P2: `1P0`): CMDP1 = {
    val __obj = js.Dynamic.literal(CMD_P1 = CMD_P1.asInstanceOf[js.Any], CMD_P2 = CMD_P2.asInstanceOf[js.Any])
    __obj.asInstanceOf[CMDP1]
  }
}

