package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndUtcSec extends js.Object {
  var endUtcSec: js.UndefOr[String] = js.native
  var startUtcSec: js.UndefOr[String] = js.native
}

object EndUtcSec {
  @scala.inline
  def apply(): EndUtcSec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndUtcSec]
  }
  @scala.inline
  implicit class EndUtcSecOps[Self <: EndUtcSec] (val x: Self) extends AnyVal {
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
    def setEndUtcSec(value: String): Self = this.set("endUtcSec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndUtcSec: Self = this.set("endUtcSec", js.undefined)
    @scala.inline
    def setStartUtcSec(value: String): Self = this.set("startUtcSec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartUtcSec: Self = this.set("startUtcSec", js.undefined)
  }
  
}

