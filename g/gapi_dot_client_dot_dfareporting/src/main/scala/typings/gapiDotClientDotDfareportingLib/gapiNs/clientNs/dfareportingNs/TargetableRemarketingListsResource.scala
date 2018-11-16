package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TargetableRemarketingListsResource extends js.Object {
  /** Gets one remarketing list by ID. */
  def get(request: gapiDotClientDotDfareportingLib.Anon_ProfileIdPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[TargetableRemarketingList]
  /** Retrieves a list of targetable remarketing lists, possibly filtered. This method supports paging. */
  def list(request: gapiDotClientDotDfareportingLib.Anon_ProfileIdName): gapiDotClientLib.gapiNs.clientNs.Request[TargetableRemarketingListsListResponse]
}

