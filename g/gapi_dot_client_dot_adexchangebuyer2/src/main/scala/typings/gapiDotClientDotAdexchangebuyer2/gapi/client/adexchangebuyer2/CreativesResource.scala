package typings.gapiDotClientDotAdexchangebuyer2.gapi.client.adexchangebuyer2

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAdexchangebuyer2.Anon_AccesstokenAccountIdAltBearertokenCallbackCreativeId
import typings.gapiDotClientDotAdexchangebuyer2.Anon_AccesstokenAccountIdAltBearertokenCallbackCreativeStatusId
import typings.gapiDotClientDotAdexchangebuyer2.Anon_AccesstokenAccountIdAltBearertokenCallbackDuplicateIdMode
import typings.gapiDotClientDotAdexchangebuyer2.Anon_AccesstokenAccountIdAltBearertokenCallbackFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreativesResource extends js.Object {
  var dealAssociations: DealAssociationsResource = js.native
  /** Creates a creative. */
  def create(request: Anon_AccesstokenAccountIdAltBearertokenCallbackDuplicateIdMode): Request[Creative] = js.native
  /** Gets a creative. */
  def get(request: Anon_AccesstokenAccountIdAltBearertokenCallbackCreativeId): Request[Creative] = js.native
  /**
    * List all creatives associated with a specific reason for which bids were
    * filtered, with the number of bids filtered for each creative.
    */
  def list(request: Anon_AccesstokenAccountIdAltBearertokenCallbackCreativeStatusId): Request[ListCreativeStatusBreakdownByCreativeResponse] = js.native
  /** Lists creatives. */
  def list(request: Anon_AccesstokenAccountIdAltBearertokenCallbackFieldsKey): Request[ListCreativesResponse] = js.native
  /**
    * Stops watching a creative. Will stop push notifications being sent to the
    * topics when the creative changes status.
    */
  def stopWatching(request: Anon_AccesstokenAccountIdAltBearertokenCallbackCreativeId): Request[js.Object] = js.native
  /** Updates a creative. */
  def update(request: Anon_AccesstokenAccountIdAltBearertokenCallbackCreativeId): Request[Creative] = js.native
  /**
    * Watches a creative. Will result in push notifications being sent to the
    * topic when the creative changes status.
    */
  def watch(request: Anon_AccesstokenAccountIdAltBearertokenCallbackCreativeId): Request[js.Object] = js.native
}

