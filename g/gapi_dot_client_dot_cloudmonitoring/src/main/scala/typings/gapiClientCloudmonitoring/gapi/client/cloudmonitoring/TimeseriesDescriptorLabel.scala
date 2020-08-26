package typings.gapiClientCloudmonitoring.gapi.client.cloudmonitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeseriesDescriptorLabel extends js.Object {
  /** The label's name. */
  var key: js.UndefOr[String] = js.native
  /** The label's value. */
  var value: js.UndefOr[String] = js.native
}

object TimeseriesDescriptorLabel {
  @scala.inline
  def apply(): TimeseriesDescriptorLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeseriesDescriptorLabel]
  }
  @scala.inline
  implicit class TimeseriesDescriptorLabelOps[Self <: TimeseriesDescriptorLabel] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

