package typings.googleapis.buildSrcApisClouderrorreportingV1beta1Mod.clouderrorreporting_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Description of a group of similar error events.
  */
@js.native
trait Schema$ErrorGroup extends js.Object {
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
  var trackingIssues: js.UndefOr[js.Array[Schema$TrackingIssue]] = js.native
}

object Schema$ErrorGroup {
  @scala.inline
  def apply(groupId: String = null, name: String = null, trackingIssues: js.Array[Schema$TrackingIssue] = null): Schema$ErrorGroup = {
    val __obj = js.Dynamic.literal()
    if (groupId != null) __obj.updateDynamic("groupId")(groupId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (trackingIssues != null) __obj.updateDynamic("trackingIssues")(trackingIssues.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ErrorGroup]
  }
}

