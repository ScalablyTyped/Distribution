package typings
package gapiDotClientDotClouderrorreportingLib.gapiNs.clientNs.clouderrorreportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ErrorGroup extends js.Object {
  /**
               * Group IDs are unique for a given project. If the same kind of error
               * occurs in different service contexts, it will receive the same group ID.
               */
  var groupId: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The group resource name.
               * Example: <code>projects/my-project-123/groups/my-groupid</code>
               */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Associated tracking issues. */
  var trackingIssues: js.UndefOr[js.Array[TrackingIssue]] = js.undefined
}

