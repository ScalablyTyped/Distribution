package typings.gapiClientServicecontrol.gapi.client.servicecontrol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConsumerInfo extends js.Object {
  /**
    * The Google cloud project number, e.g. 1234567890. A value of 0 indicates
    * no project number is found.
    */
  var projectNumber: js.UndefOr[String] = js.native
}

object ConsumerInfo {
  @scala.inline
  def apply(): ConsumerInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsumerInfo]
  }
  @scala.inline
  implicit class ConsumerInfoOps[Self <: ConsumerInfo] (val x: Self) extends AnyVal {
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
    def setProjectNumber(value: String): Self = this.set("projectNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectNumber: Self = this.set("projectNumber", js.undefined)
  }
  
}

