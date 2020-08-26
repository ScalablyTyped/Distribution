package typings.gapiClientServicecontrol.gapi.client.servicecontrol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckInfo extends js.Object {
  /** Consumer info of this check. */
  var consumerInfo: js.UndefOr[ConsumerInfo] = js.native
  /**
    * A list of fields and label keys that are ignored by the server.
    * The client doesn't need to send them for following requests to improve
    * performance and allow better aggregation.
    */
  var unusedArguments: js.UndefOr[js.Array[String]] = js.native
}

object CheckInfo {
  @scala.inline
  def apply(): CheckInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckInfo]
  }
  @scala.inline
  implicit class CheckInfoOps[Self <: CheckInfo] (val x: Self) extends AnyVal {
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
    def setConsumerInfo(value: ConsumerInfo): Self = this.set("consumerInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsumerInfo: Self = this.set("consumerInfo", js.undefined)
    @scala.inline
    def setUnusedArgumentsVarargs(value: String*): Self = this.set("unusedArguments", js.Array(value :_*))
    @scala.inline
    def setUnusedArguments(value: js.Array[String]): Self = this.set("unusedArguments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnusedArguments: Self = this.set("unusedArguments", js.undefined)
  }
  
}

