package typings.escpos.anon

import typings.escpos.escposStrings.InformationseparatorthreeLeftparenthesisk
import typings.escpos.escposStrings.`1Q0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CMDP2 extends js.Object {
  // Format= CMD_P1{LEN_2BYTE}CMD_P2
  var CMD_P1: InformationseparatorthreeLeftparenthesisk = js.native
  var CMD_P2: `1Q0` = js.native
}

object CMDP2 {
  @scala.inline
  def apply(CMD_P1: InformationseparatorthreeLeftparenthesisk, CMD_P2: `1Q0`): CMDP2 = {
    val __obj = js.Dynamic.literal(CMD_P1 = CMD_P1.asInstanceOf[js.Any], CMD_P2 = CMD_P2.asInstanceOf[js.Any])
    __obj.asInstanceOf[CMDP2]
  }
  @scala.inline
  implicit class CMDP2Ops[Self <: CMDP2] (val x: Self) extends AnyVal {
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
    def setCMD_P1(value: InformationseparatorthreeLeftparenthesisk): Self = this.set("CMD_P1", value.asInstanceOf[js.Any])
    @scala.inline
    def setCMD_P2(value: `1Q0`): Self = this.set("CMD_P2", value.asInstanceOf[js.Any])
  }
  
}

