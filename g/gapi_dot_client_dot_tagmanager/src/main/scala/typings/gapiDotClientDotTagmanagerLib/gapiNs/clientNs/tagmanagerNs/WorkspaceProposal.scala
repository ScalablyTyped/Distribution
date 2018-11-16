package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait WorkspaceProposal extends js.Object {
  /** List of authors for the workspace proposal. */
  var authors: js.UndefOr[js.Array[WorkspaceProposalUser]] = js.undefined
  /** The fingerprint of the GTM workspace proposal as computed at storage time. This value is recomputed whenever the proposal is modified. */
  var fingerprint: js.UndefOr[java.lang.String] = js.undefined
  /** Records the history of comments and status changes. */
  var history: js.UndefOr[js.Array[WorkspaceProposalHistory]] = js.undefined
  /** GTM workspace proposal's relative path. */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /** Lists of reviewers for the workspace proposal. */
  var reviewers: js.UndefOr[js.Array[WorkspaceProposalUser]] = js.undefined
  /** The status of the workspace proposal as it goes through review. */
  var status: js.UndefOr[java.lang.String] = js.undefined
}

