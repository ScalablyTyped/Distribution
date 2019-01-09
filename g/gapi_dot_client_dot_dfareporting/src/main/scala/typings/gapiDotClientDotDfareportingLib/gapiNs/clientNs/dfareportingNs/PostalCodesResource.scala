package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostalCodesResource extends js.Object {
  /** Gets one postal code by ID. */
  def get(request: gapiDotClientDotDfareportingLib.Anon_AltCode): gapiDotClientLib.gapiNs.clientNs.Request[PostalCode]
  /** Retrieves a list of postal codes. */
  def list(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[PostalCodesListResponse]
}

