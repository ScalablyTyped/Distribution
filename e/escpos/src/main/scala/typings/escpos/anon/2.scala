package typings.escpos.anon

import typings.escpos.escposStrings.Datalinkescape
import typings.escpos.escposStrings.Graveaccent
import typings.escpos.escposStrings.Null
import typings.escpos.escposStrings.P
import typings.escpos.escposStrings.Space
import typings.escpos.escposStrings.`0`
import typings.escpos.escposStrings.`@`
import typings.escpos.escposStrings.p_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `2` extends js.Object {
  var `1`: Null = js.native
  var `2`: Datalinkescape = js.native
  var `3`: Space = js.native
  var `4`: `0` = js.native
  var `5`: `@` = js.native
  var `6`: P = js.native
  var `7`: Graveaccent = js.native
  var `8`: p_ = js.native
}

object `2` {
  @scala.inline
  def apply(`1`: Null, `2`: Datalinkescape, `3`: Space, `4`: `0`, `5`: `@`, `6`: P, `7`: Graveaccent, `8`: p_): `2` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    __obj.updateDynamic("3")(`3`.asInstanceOf[js.Any])
    __obj.updateDynamic("4")(`4`.asInstanceOf[js.Any])
    __obj.updateDynamic("5")(`5`.asInstanceOf[js.Any])
    __obj.updateDynamic("6")(`6`.asInstanceOf[js.Any])
    __obj.updateDynamic("7")(`7`.asInstanceOf[js.Any])
    __obj.updateDynamic("8")(`8`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
  @scala.inline
  implicit class `2Ops`[Self <: `2`] (val x: Self) extends AnyVal {
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
    def set1(value: Null): Self = this.set("1", value.asInstanceOf[js.Any])
    @scala.inline
    def set2(value: Datalinkescape): Self = this.set("2", value.asInstanceOf[js.Any])
    @scala.inline
    def set3(value: Space): Self = this.set("3", value.asInstanceOf[js.Any])
    @scala.inline
    def set4(value: `0`): Self = this.set("4", value.asInstanceOf[js.Any])
    @scala.inline
    def set5(value: `@`): Self = this.set("5", value.asInstanceOf[js.Any])
    @scala.inline
    def set6(value: P): Self = this.set("6", value.asInstanceOf[js.Any])
    @scala.inline
    def set7(value: Graveaccent): Self = this.set("7", value.asInstanceOf[js.Any])
    @scala.inline
    def set8(value: p_): Self = this.set("8", value.asInstanceOf[js.Any])
  }
  
}

