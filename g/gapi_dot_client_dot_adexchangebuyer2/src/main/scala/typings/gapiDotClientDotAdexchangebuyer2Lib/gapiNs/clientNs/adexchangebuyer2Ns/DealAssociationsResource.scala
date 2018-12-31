package typings
package gapiDotClientDotAdexchangebuyer2Lib.gapiNs.clientNs.adexchangebuyer2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DealAssociationsResource extends js.Object {
  /** Associate an existing deal with a creative. */
  def add(request: gapiDotClientDotAdexchangebuyer2Lib.Anon_AccesstokenPrettyPrintBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** List all creative-deal associations. */
  def list(request: gapiDotClientDotAdexchangebuyer2Lib.Anon_AccesstokenPageSizePrettyPrintBearertokenQuery): gapiDotClientLib.gapiNs.clientNs.Request[ListDealAssociationsResponse]
  /** Remove the association between a deal and a creative. */
  def remove(request: gapiDotClientDotAdexchangebuyer2Lib.Anon_AccesstokenPrettyPrintBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
}

