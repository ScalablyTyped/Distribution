package typings
package gapiDotClientDotAdexchangebuyer2Lib.gapiNs.clientNs.adexchangebuyer2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreativesResource extends js.Object {
  var dealAssociations: DealAssociationsResource = js.native
  /** Creates a creative. */
  def create(request: gapiDotClientDotAdexchangebuyer2Lib.Anon_AccesstokenPrettyPrintBearertokenAccountId): gapiDotClientLib.gapiNs.clientNs.Request[Creative] = js.native
  /** Gets a creative. */
  def get(request: gapiDotClientDotAdexchangebuyer2Lib.Anon_AccesstokenPrettyPrintBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[Creative] = js.native
  /** Lists creatives. */
  def list(request: gapiDotClientDotAdexchangebuyer2Lib.Anon_AccesstokenPageSizePrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[ListCreativesResponse] = js.native
  /**
    * List all creatives associated with a specific reason for which bids were
    * filtered, with the number of bids filtered for each creative.
    */
  def list(request: gapiDotClientDotAdexchangebuyer2Lib.Anon_AccesstokenPageSizePrettyPrintBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[ListCreativeStatusBreakdownByCreativeResponse] = js.native
  /**
    * Stops watching a creative. Will stop push notifications being sent to the
    * topics when the creative changes status.
    */
  def stopWatching(request: gapiDotClientDotAdexchangebuyer2Lib.Anon_AccesstokenPrettyPrintBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[js.Object] = js.native
  /** Updates a creative. */
  def update(request: gapiDotClientDotAdexchangebuyer2Lib.Anon_AccesstokenPrettyPrintBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[Creative] = js.native
  /**
    * Watches a creative. Will result in push notifications being sent to the
    * topic when the creative changes status.
    */
  def watch(request: gapiDotClientDotAdexchangebuyer2Lib.Anon_AccesstokenPrettyPrintBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[js.Object] = js.native
}

