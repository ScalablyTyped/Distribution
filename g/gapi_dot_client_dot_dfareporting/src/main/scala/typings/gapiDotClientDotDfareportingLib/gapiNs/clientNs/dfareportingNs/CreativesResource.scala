package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CreativesResource extends js.Object {
  /** Gets one creative by ID. */
  def get(request: gapiDotClientDotDfareportingLib.Anon_ProfileIdPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Creative]
  /** Inserts a new creative. */
  def insert(request: gapiDotClientDotDfareportingLib.Anon_ProfileId): gapiDotClientLib.gapiNs.clientNs.Request[Creative]
  /** Retrieves a list of creatives, possibly filtered. This method supports paging. */
  def list(request: gapiDotClientDotDfareportingLib.Anon_SizeIds): gapiDotClientLib.gapiNs.clientNs.Request[CreativesListResponse]
  /** Updates an existing creative. This method supports patch semantics. */
  def patch(request: gapiDotClientDotDfareportingLib.Anon_ProfileIdPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Creative]
  /** Updates an existing creative. */
  def update(request: gapiDotClientDotDfareportingLib.Anon_ProfileId): gapiDotClientLib.gapiNs.clientNs.Request[Creative]
}

