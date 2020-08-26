package typings.escpos.anon

import typings.escpos.escposNumbers.`48`
import typings.escpos.escposNumbers.`49`
import typings.escpos.escposNumbers.`50`
import typings.escpos.escposNumbers.`51`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait H extends js.Object {
  var H: `51` = js.native
  var L: `48` = js.native
  var M: `49` = js.native
  var Q: `50` = js.native
}

object H {
  @scala.inline
  def apply(H: `51`, L: `48`, M: `49`, Q: `50`): H = {
    val __obj = js.Dynamic.literal(H = H.asInstanceOf[js.Any], L = L.asInstanceOf[js.Any], M = M.asInstanceOf[js.Any], Q = Q.asInstanceOf[js.Any])
    __obj.asInstanceOf[H]
  }
  @scala.inline
  implicit class HOps[Self <: H] (val x: Self) extends AnyVal {
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
    def setH(value: `51`): Self = this.set("H", value.asInstanceOf[js.Any])
    @scala.inline
    def setL(value: `48`): Self = this.set("L", value.asInstanceOf[js.Any])
    @scala.inline
    def setM(value: `49`): Self = this.set("M", value.asInstanceOf[js.Any])
    @scala.inline
    def setQ(value: `50`): Self = this.set("Q", value.asInstanceOf[js.Any])
  }
  
}

