package typings.eventEmitterEs6.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var emitDelay: js.UndefOr[Double] = js.native
  var strictMode: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setEmitDelay(value: Double): Self = this.set("emitDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmitDelay: Self = this.set("emitDelay", js.undefined)
    @scala.inline
    def setStrictMode(value: Boolean): Self = this.set("strictMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrictMode: Self = this.set("strictMode", js.undefined)
  }
  
}

