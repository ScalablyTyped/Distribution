package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UpdateWorkspaceProposalRequest extends js.Object {
  /** When provided, this fingerprint must match the fingerprint of the proposal in storage. */
  var fingerprint: js.UndefOr[java.lang.String] = js.undefined
  /** If present, a new comment is added to the workspace proposal history. */
  var newComment: js.UndefOr[WorkspaceProposalHistoryComment] = js.undefined
  /** If present, the list of reviewers of the workspace proposal is updated. */
  var reviewers: js.UndefOr[js.Array[WorkspaceProposalUser]] = js.undefined
  /** If present, the status of the workspace proposal is updated. */
  var status: js.UndefOr[java.lang.String] = js.undefined
}

