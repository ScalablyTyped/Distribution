package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdexchangebuyer2.AnonCreativeId
import typings.gapiClientAdexchangebuyer2.AnonCreativeStatusId
import typings.gapiClientAdexchangebuyer2.AnonDuplicateIdMode
import typings.gapiClientAdexchangebuyer2.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreativesResource extends js.Object {
  var dealAssociations: DealAssociationsResource = js.native
  /** Creates a creative. */
  def create(request: AnonDuplicateIdMode): Request_[Creative] = js.native
  /** Gets a creative. */
  def get(request: AnonCreativeId): Request_[Creative] = js.native
  /**
    * List all creatives associated with a specific reason for which bids were
    * filtered, with the number of bids filtered for each creative.
    */
  def list(request: AnonCreativeStatusId): Request_[ListCreativeStatusBreakdownByCreativeResponse] = js.native
  /** Lists creatives. */
  def list(request: AnonOauthtoken): Request_[ListCreativesResponse] = js.native
  /**
    * Stops watching a creative. Will stop push notifications being sent to the
    * topics when the creative changes status.
    */
  def stopWatching(request: AnonCreativeId): Request_[js.Object] = js.native
  /** Updates a creative. */
  def update(request: AnonCreativeId): Request_[Creative] = js.native
  /**
    * Watches a creative. Will result in push notifications being sent to the
    * topic when the creative changes status.
    */
  def watch(request: AnonCreativeId): Request_[js.Object] = js.native
}

