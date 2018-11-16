package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CreativeGroupsResource extends js.Object {
  /** Gets one creative group by ID. */
  def get(request: gapiDotClientDotDfareportingLib.Anon_ProfileIdPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[CreativeGroup]
  /** Inserts a new creative group. */
  def insert(request: gapiDotClientDotDfareportingLib.Anon_ProfileId): gapiDotClientLib.gapiNs.clientNs.Request[CreativeGroup]
  /** Retrieves a list of creative groups, possibly filtered. This method supports paging. */
  def list(request: gapiDotClientDotDfareportingLib.Anon_ProfileIdAdvertiserIds): gapiDotClientLib.gapiNs.clientNs.Request[CreativeGroupsListResponse]
  /** Updates an existing creative group. This method supports patch semantics. */
  def patch(request: gapiDotClientDotDfareportingLib.Anon_ProfileIdPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[CreativeGroup]
  /** Updates an existing creative group. */
  def update(request: gapiDotClientDotDfareportingLib.Anon_ProfileId): gapiDotClientLib.gapiNs.clientNs.Request[CreativeGroup]
}

