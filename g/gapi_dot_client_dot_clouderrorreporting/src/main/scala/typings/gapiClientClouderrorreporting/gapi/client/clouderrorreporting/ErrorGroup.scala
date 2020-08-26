package typings.gapiClientClouderrorreporting.gapi.client.clouderrorreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorGroup extends js.Object {
  /**
    * Group IDs are unique for a given project. If the same kind of error
    * occurs in different service contexts, it will receive the same group ID.
    */
  var groupId: js.UndefOr[String] = js.native
  /**
    * The group resource name.
    * Example: <code>projects/my-project-123/groups/my-groupid</code>
    */
  var name: js.UndefOr[String] = js.native
  /** Associated tracking issues. */
  var trackingIssues: js.UndefOr[js.Array[TrackingIssue]] = js.native
}

object ErrorGroup {
  @scala.inline
  def apply(): ErrorGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorGroup]
  }
  @scala.inline
  implicit class ErrorGroupOps[Self <: ErrorGroup] (val x: Self) extends AnyVal {
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
    def setGroupId(value: String): Self = this.set("groupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupId: Self = this.set("groupId", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setTrackingIssuesVarargs(value: TrackingIssue*): Self = this.set("trackingIssues", js.Array(value :_*))
    @scala.inline
    def setTrackingIssues(value: js.Array[TrackingIssue]): Self = this.set("trackingIssues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackingIssues: Self = this.set("trackingIssues", js.undefined)
  }
  
}

