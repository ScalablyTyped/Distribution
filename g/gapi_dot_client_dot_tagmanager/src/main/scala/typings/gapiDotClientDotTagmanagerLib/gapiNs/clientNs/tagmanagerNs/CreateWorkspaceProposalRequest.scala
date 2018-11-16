package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CreateWorkspaceProposalRequest extends js.Object {
  /** If present, an initial comment to associate with the workspace proposal. */
  var initialComment: js.UndefOr[WorkspaceProposalHistoryComment] = js.undefined
  /** List of users to review the workspace proposal. */
  var reviewers: js.UndefOr[js.Array[WorkspaceProposalUser]] = js.undefined
}

