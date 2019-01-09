package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderDocumentsResource extends js.Object {
  /** Gets one order document by ID. */
  def get(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsId): gapiDotClientLib.gapiNs.clientNs.Request[OrderDocument]
  /** Retrieves a list of order documents, possibly filtered. This method supports paging. */
  def list(request: gapiDotClientDotDfareportingLib.Anon_AltApproved): gapiDotClientLib.gapiNs.clientNs.Request[OrderDocumentsListResponse]
}

