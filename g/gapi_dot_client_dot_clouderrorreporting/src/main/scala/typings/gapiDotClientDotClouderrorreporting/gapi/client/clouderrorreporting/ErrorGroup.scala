package typings.gapiDotClientDotClouderrorreporting.gapi.client.clouderrorreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorGroup extends js.Object {
  /**
    * Group IDs are unique for a given project. If the same kind of error
    * occurs in different service contexts, it will receive the same group ID.
    */
  var groupId: js.UndefOr[String] = js.undefined
  /**
    * The group resource name.
    * Example: <code>projects/my-project-123/groups/my-groupid</code>
    */
  var name: js.UndefOr[String] = js.undefined
  /** Associated tracking issues. */
  var trackingIssues: js.UndefOr[js.Array[TrackingIssue]] = js.undefined
}

object ErrorGroup {
  @scala.inline
  def apply(groupId: String = null, name: String = null, trackingIssues: js.Array[TrackingIssue] = null): ErrorGroup = {
    val __obj = js.Dynamic.literal()
    if (groupId != null) __obj.updateDynamic("groupId")(groupId)
    if (name != null) __obj.updateDynamic("name")(name)
    if (trackingIssues != null) __obj.updateDynamic("trackingIssues")(trackingIssues)
    __obj.asInstanceOf[ErrorGroup]
  }
}

