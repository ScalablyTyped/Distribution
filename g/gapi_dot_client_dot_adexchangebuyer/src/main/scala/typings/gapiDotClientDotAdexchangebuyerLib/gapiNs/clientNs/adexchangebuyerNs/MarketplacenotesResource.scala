package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarketplacenotesResource extends js.Object {
  /** Add notes to the proposal */
  def insert(request: gapiDotClientDotAdexchangebuyerLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[AddOrderNotesResponse]
  /** Get all the notes associated with a proposal */
  def list(request: gapiDotClientDotAdexchangebuyerLib.Anon_AltFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[GetOrderNotesResponse]
}

