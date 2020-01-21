package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdexchangebuyer2.AnonAccesstokenAccountIdAltBearertokenCallbackCreativeId
import typings.gapiClientAdexchangebuyer2.AnonAccesstokenAccountIdAltBearertokenCallbackCreativeStatusId
import typings.gapiClientAdexchangebuyer2.AnonAccesstokenAccountIdAltBearertokenCallbackDuplicateIdMode
import typings.gapiClientAdexchangebuyer2.AnonAccesstokenAccountIdAltBearertokenCallbackFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreativesResource extends js.Object {
  var dealAssociations: DealAssociationsResource = js.native
  /** Creates a creative. */
  def create(request: AnonAccesstokenAccountIdAltBearertokenCallbackDuplicateIdMode): Request_[Creative] = js.native
  /** Gets a creative. */
  def get(request: AnonAccesstokenAccountIdAltBearertokenCallbackCreativeId): Request_[Creative] = js.native
  /**
    * List all creatives associated with a specific reason for which bids were
    * filtered, with the number of bids filtered for each creative.
    */
  def list(request: AnonAccesstokenAccountIdAltBearertokenCallbackCreativeStatusId): Request_[ListCreativeStatusBreakdownByCreativeResponse] = js.native
  /** Lists creatives. */
  def list(request: AnonAccesstokenAccountIdAltBearertokenCallbackFieldsKey): Request_[ListCreativesResponse] = js.native
  /**
    * Stops watching a creative. Will stop push notifications being sent to the
    * topics when the creative changes status.
    */
  def stopWatching(request: AnonAccesstokenAccountIdAltBearertokenCallbackCreativeId): Request_[js.Object] = js.native
  /** Updates a creative. */
  def update(request: AnonAccesstokenAccountIdAltBearertokenCallbackCreativeId): Request_[Creative] = js.native
  /**
    * Watches a creative. Will result in push notifications being sent to the
    * topic when the creative changes status.
    */
  def watch(request: AnonAccesstokenAccountIdAltBearertokenCallbackCreativeId): Request_[js.Object] = js.native
}

