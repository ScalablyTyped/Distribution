package typings.gapiClientServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListServiceRolloutsResponse extends js.Object {
  /** The token of the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
  /** The list of rollout resources. */
  var rollouts: js.UndefOr[js.Array[Rollout]] = js.native
}

object ListServiceRolloutsResponse {
  @scala.inline
  def apply(): ListServiceRolloutsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListServiceRolloutsResponse]
  }
  @scala.inline
  implicit class ListServiceRolloutsResponseOps[Self <: ListServiceRolloutsResponse] (val x: Self) extends AnyVal {
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setRolloutsVarargs(value: Rollout*): Self = this.set("rollouts", js.Array(value :_*))
    @scala.inline
    def setRollouts(value: js.Array[Rollout]): Self = this.set("rollouts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRollouts: Self = this.set("rollouts", js.undefined)
  }
  
}

