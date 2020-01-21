package typings.googleapis.clouderrorreportingV1beta1Mod.clouderrorreportingV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Description of a group of similar error events.
  */
@js.native
trait SchemaErrorGroup extends js.Object {
  /**
    * Group IDs are unique for a given project. If the same kind of error
    * occurs in different service contexts, it will receive the same group ID.
    */
  var groupId: js.UndefOr[String] = js.native
  /**
    * The group resource name. Example:
    * &lt;code&gt;projects/my-project-123/groups/my-groupid&lt;/code&gt;
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Associated tracking issues.
    */
  var trackingIssues: js.UndefOr[js.Array[SchemaTrackingIssue]] = js.native
}

object SchemaErrorGroup {
  @scala.inline
  def apply(groupId: String = null, name: String = null, trackingIssues: js.Array[SchemaTrackingIssue] = null): SchemaErrorGroup = {
    val __obj = js.Dynamic.literal()
    if (groupId != null) __obj.updateDynamic("groupId")(groupId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (trackingIssues != null) __obj.updateDynamic("trackingIssues")(trackingIssues.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaErrorGroup]
  }
}

