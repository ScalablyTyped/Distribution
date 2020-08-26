package typings.elasticApmNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransactionOptions extends js.Object {
  var childOf: js.UndefOr[Transaction | Span | String] = js.native
  var startTime: js.UndefOr[Double] = js.native
}

object TransactionOptions {
  @scala.inline
  def apply(): TransactionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransactionOptions]
  }
  @scala.inline
  implicit class TransactionOptionsOps[Self <: TransactionOptions] (val x: Self) extends AnyVal {
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
    def setChildOf(value: Transaction | Span | String): Self = this.set("childOf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildOf: Self = this.set("childOf", js.undefined)
    @scala.inline
    def setStartTime(value: Double): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
  }
  
}

