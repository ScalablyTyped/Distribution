package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotDfareporting.Anon_ActiveAdvertiserId
import typings.gapiDotClientDotDfareporting.Anon_AltFields
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdsResource extends js.Object {
  /** Gets one ad by ID. */
  def get(request: Anon_AltFields): Request[Ad]
  /** Inserts a new ad. */
  def insert(request: Anon_AltFieldsKey): Request[Ad]
  /** Retrieves a list of ads, possibly filtered. This method supports paging. */
  def list(request: Anon_ActiveAdvertiserId): Request[AdsListResponse]
  /** Updates an existing ad. This method supports patch semantics. */
  def patch(request: Anon_AltFields): Request[Ad]
  /** Updates an existing ad. */
  def update(request: Anon_AltFieldsKey): Request[Ad]
}

object AdsResource {
  @scala.inline
  def apply(
    get: Anon_AltFields => Request[Ad],
    insert: Anon_AltFieldsKey => Request[Ad],
    list: Anon_ActiveAdvertiserId => Request[AdsListResponse],
    patch: Anon_AltFields => Request[Ad],
    update: Anon_AltFieldsKey => Request[Ad]
  ): AdsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[AdsResource]
  }
}

