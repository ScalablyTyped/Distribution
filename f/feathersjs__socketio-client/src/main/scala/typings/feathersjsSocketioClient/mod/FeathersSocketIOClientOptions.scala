package typings.feathersjsSocketioClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeathersSocketIOClientOptions extends js.Object {
  var timeout: js.UndefOr[Double] = js.native
}

object FeathersSocketIOClientOptions {
  @scala.inline
  def apply(): FeathersSocketIOClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeathersSocketIOClientOptions]
  }
  @scala.inline
  implicit class FeathersSocketIOClientOptionsOps[Self <: FeathersSocketIOClientOptions] (val x: Self) extends AnyVal {
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
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

