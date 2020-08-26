package typings.gapiClientClouduseraccounts.gapi.client.clouduseraccounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogConfigCounterOptions extends js.Object {
  /** The field value to attribute. */
  var field: js.UndefOr[String] = js.native
  /** The metric to update. */
  var metric: js.UndefOr[String] = js.native
}

object LogConfigCounterOptions {
  @scala.inline
  def apply(): LogConfigCounterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogConfigCounterOptions]
  }
  @scala.inline
  implicit class LogConfigCounterOptionsOps[Self <: LogConfigCounterOptions] (val x: Self) extends AnyVal {
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
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setMetric(value: String): Self = this.set("metric", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetric: Self = this.set("metric", js.undefined)
  }
  
}

