package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CreativeFieldsResource extends js.Object {
  /** Deletes an existing creative field. */
  def delete(request: gapiDotClientDotDfareportingLib.Anon_ProfileIdPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets one creative field by ID. */
  def get(request: gapiDotClientDotDfareportingLib.Anon_ProfileIdPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[CreativeField]
  /** Inserts a new creative field. */
  def insert(request: gapiDotClientDotDfareportingLib.Anon_ProfileId): gapiDotClientLib.gapiNs.clientNs.Request[CreativeField]
  /** Retrieves a list of creative fields, possibly filtered. This method supports paging. */
  def list(request: gapiDotClientDotDfareportingLib.Anon_ProfileIdAdvertiserIdsSortField): gapiDotClientLib.gapiNs.clientNs.Request[CreativeFieldsListResponse]
  /** Updates an existing creative field. This method supports patch semantics. */
  def patch(request: gapiDotClientDotDfareportingLib.Anon_ProfileIdPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[CreativeField]
  /** Updates an existing creative field. */
  def update(request: gapiDotClientDotDfareportingLib.Anon_ProfileId): gapiDotClientLib.gapiNs.clientNs.Request[CreativeField]
}

