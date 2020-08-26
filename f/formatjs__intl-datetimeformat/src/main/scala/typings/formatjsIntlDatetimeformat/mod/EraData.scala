package typings.formatjsIntlDatetimeformat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EraData extends js.Object {
  var AD: String = js.native
  var BC: String = js.native
}

object EraData {
  @scala.inline
  def apply(AD: String, BC: String): EraData = {
    val __obj = js.Dynamic.literal(AD = AD.asInstanceOf[js.Any], BC = BC.asInstanceOf[js.Any])
    __obj.asInstanceOf[EraData]
  }
  @scala.inline
  implicit class EraDataOps[Self <: EraData] (val x: Self) extends AnyVal {
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
    def setAD(value: String): Self = this.set("AD", value.asInstanceOf[js.Any])
    @scala.inline
    def setBC(value: String): Self = this.set("BC", value.asInstanceOf[js.Any])
  }
  
}

