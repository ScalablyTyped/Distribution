package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiOutputInfo extends js.Object {
  /**
    * The id of the tag the user code will emit to this output by; this
    * should correspond to the tag of some SideInputInfo.
    */
  var tag: js.UndefOr[String] = js.native
}

object MultiOutputInfo {
  @scala.inline
  def apply(): MultiOutputInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiOutputInfo]
  }
  @scala.inline
  implicit class MultiOutputInfoOps[Self <: MultiOutputInfo] (val x: Self) extends AnyVal {
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
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
  
}

