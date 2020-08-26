package typings.gapiClientServicecontrol.gapi.client.servicecontrol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllocateInfo extends js.Object {
  /**
    * A list of label keys that were unused by the server in processing the
    * request. Thus, for similar requests repeated in a certain future time
    * window, the caller can choose to ignore these labels in the requests
    * to achieve better client-side cache hits and quota aggregation.
    */
  var unusedArguments: js.UndefOr[js.Array[String]] = js.native
}

object AllocateInfo {
  @scala.inline
  def apply(): AllocateInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllocateInfo]
  }
  @scala.inline
  implicit class AllocateInfoOps[Self <: AllocateInfo] (val x: Self) extends AnyVal {
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
    def setUnusedArgumentsVarargs(value: String*): Self = this.set("unusedArguments", js.Array(value :_*))
    @scala.inline
    def setUnusedArguments(value: js.Array[String]): Self = this.set("unusedArguments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnusedArguments: Self = this.set("unusedArguments", js.undefined)
  }
  
}

