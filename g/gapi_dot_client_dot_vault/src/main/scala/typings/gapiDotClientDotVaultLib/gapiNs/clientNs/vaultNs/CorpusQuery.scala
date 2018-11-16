package typings
package gapiDotClientDotVaultLib.gapiNs.clientNs.vaultNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CorpusQuery extends js.Object {
  /** Details pertaining to Drive holds. If set, corpus must be Drive. */
  var driveQuery: js.UndefOr[HeldDriveQuery] = js.undefined
  /** Details pertaining to Groups holds. If set, corpus must be Groups. */
  var groupsQuery: js.UndefOr[HeldGroupsQuery] = js.undefined
  /** Details pertaining to mail holds. If set, corpus must be mail. */
  var mailQuery: js.UndefOr[HeldMailQuery] = js.undefined
}

