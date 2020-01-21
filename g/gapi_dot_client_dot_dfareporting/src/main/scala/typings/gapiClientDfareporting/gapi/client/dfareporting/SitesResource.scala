package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonAcceptsInStreamVideoPlacementsAcceptsInterstitialPlacements
import typings.gapiClientDfareporting.AnonAltFields
import typings.gapiClientDfareporting.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SitesResource extends js.Object {
  /** Gets one site by ID. */
  def get(request: AnonAltFields): Request_[Site]
  /** Inserts a new site. */
  def insert(request: AnonAltFieldsKey): Request_[Site]
  /** Retrieves a list of sites, possibly filtered. This method supports paging. */
  def list(request: AnonAcceptsInStreamVideoPlacementsAcceptsInterstitialPlacements): Request_[SitesListResponse]
  /** Updates an existing site. This method supports patch semantics. */
  def patch(request: AnonAltFields): Request_[Site]
  /** Updates an existing site. */
  def update(request: AnonAltFieldsKey): Request_[Site]
}

object SitesResource {
  @scala.inline
  def apply(
    get: AnonAltFields => Request_[Site],
    insert: AnonAltFieldsKey => Request_[Site],
    list: AnonAcceptsInStreamVideoPlacementsAcceptsInterstitialPlacements => Request_[SitesListResponse],
    patch: AnonAltFields => Request_[Site],
    update: AnonAltFieldsKey => Request_[Site]
  ): SitesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[SitesResource]
  }
}

