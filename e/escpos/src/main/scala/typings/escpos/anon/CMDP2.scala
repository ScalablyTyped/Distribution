package typings.escpos.anon

import typings.escpos.escposStrings.InformationseparatorthreeLeftparenthesisk
import typings.escpos.escposStrings.`1Q0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CMDP2 extends js.Object {
  // Format= CMD_P1{LEN_2BYTE}CMD_P2
  var CMD_P1: InformationseparatorthreeLeftparenthesisk
  var CMD_P2: `1Q0`
}

object CMDP2 {
  @scala.inline
  def apply(CMD_P1: InformationseparatorthreeLeftparenthesisk, CMD_P2: `1Q0`): CMDP2 = {
    val __obj = js.Dynamic.literal(CMD_P1 = CMD_P1.asInstanceOf[js.Any], CMD_P2 = CMD_P2.asInstanceOf[js.Any])
    __obj.asInstanceOf[CMDP2]
  }
}

