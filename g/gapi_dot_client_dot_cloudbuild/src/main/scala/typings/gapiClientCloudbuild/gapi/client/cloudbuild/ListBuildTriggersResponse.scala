package typings.gapiClientCloudbuild.gapi.client.cloudbuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBuildTriggersResponse extends js.Object {
  /** BuildTriggers for the project, sorted by create_time descending. */
  var triggers: js.UndefOr[js.Array[BuildTrigger]] = js.native
}

object ListBuildTriggersResponse {
  @scala.inline
  def apply(): ListBuildTriggersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBuildTriggersResponse]
  }
  @scala.inline
  implicit class ListBuildTriggersResponseOps[Self <: ListBuildTriggersResponse] (val x: Self) extends AnyVal {
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
    def setTriggersVarargs(value: BuildTrigger*): Self = this.set("triggers", js.Array(value :_*))
    @scala.inline
    def setTriggers(value: js.Array[BuildTrigger]): Self = this.set("triggers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriggers: Self = this.set("triggers", js.undefined)
  }
  
}

