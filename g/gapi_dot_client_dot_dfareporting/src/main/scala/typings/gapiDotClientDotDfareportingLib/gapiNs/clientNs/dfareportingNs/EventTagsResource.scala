package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait EventTagsResource extends js.Object {
  /** Deletes an existing event tag. */
  def delete(request: gapiDotClientDotDfareportingLib.Anon_ProfileIdPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets one event tag by ID. */
  def get(request: gapiDotClientDotDfareportingLib.Anon_ProfileIdPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[EventTag]
  /** Inserts a new event tag. */
  def insert(request: gapiDotClientDotDfareportingLib.Anon_ProfileId): gapiDotClientLib.gapiNs.clientNs.Request[EventTag]
  /** Retrieves a list of event tags, possibly filtered. */
  def list(request: gapiDotClientDotDfareportingLib.Anon_DefinitionsOnly): gapiDotClientLib.gapiNs.clientNs.Request[EventTagsListResponse]
  /** Updates an existing event tag. This method supports patch semantics. */
  def patch(request: gapiDotClientDotDfareportingLib.Anon_ProfileIdPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[EventTag]
  /** Updates an existing event tag. */
  def update(request: gapiDotClientDotDfareportingLib.Anon_ProfileId): gapiDotClientLib.gapiNs.clientNs.Request[EventTag]
}

