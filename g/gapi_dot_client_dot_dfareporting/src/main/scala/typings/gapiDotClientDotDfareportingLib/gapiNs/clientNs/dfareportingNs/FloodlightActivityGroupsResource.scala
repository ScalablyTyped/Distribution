package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FloodlightActivityGroupsResource extends js.Object {
  /** Gets one floodlight activity group by ID. */
  def get(request: gapiDotClientDotDfareportingLib.Anon_ProfileIdPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[FloodlightActivityGroup]
  /** Inserts a new floodlight activity group. */
  def insert(request: gapiDotClientDotDfareportingLib.Anon_ProfileId): gapiDotClientLib.gapiNs.clientNs.Request[FloodlightActivityGroup]
  /** Retrieves a list of floodlight activity groups, possibly filtered. This method supports paging. */
  def list(
    request: gapiDotClientDotDfareportingLib.Anon_ProfileIdSortFieldMaxResultsPrettyPrintPageTokenQuotaUserSearchString
  ): gapiDotClientLib.gapiNs.clientNs.Request[FloodlightActivityGroupsListResponse]
  /** Updates an existing floodlight activity group. This method supports patch semantics. */
  def patch(request: gapiDotClientDotDfareportingLib.Anon_ProfileIdPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[FloodlightActivityGroup]
  /** Updates an existing floodlight activity group. */
  def update(request: gapiDotClientDotDfareportingLib.Anon_ProfileId): gapiDotClientLib.gapiNs.clientNs.Request[FloodlightActivityGroup]
}

