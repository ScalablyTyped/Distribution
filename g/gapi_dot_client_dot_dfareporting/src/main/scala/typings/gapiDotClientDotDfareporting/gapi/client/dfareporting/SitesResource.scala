package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotDfareporting.Anon_AcceptsInStreamVideoPlacementsAcceptsInterstitialPlacements
import typings.gapiDotClientDotDfareporting.Anon_AltFields
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SitesResource extends js.Object {
  /** Gets one site by ID. */
  def get(request: Anon_AltFields): Request[Site]
  /** Inserts a new site. */
  def insert(request: Anon_AltFieldsKey): Request[Site]
  /** Retrieves a list of sites, possibly filtered. This method supports paging. */
  def list(request: Anon_AcceptsInStreamVideoPlacementsAcceptsInterstitialPlacements): Request[SitesListResponse]
  /** Updates an existing site. This method supports patch semantics. */
  def patch(request: Anon_AltFields): Request[Site]
  /** Updates an existing site. */
  def update(request: Anon_AltFieldsKey): Request[Site]
}

object SitesResource {
  @scala.inline
  def apply(
    get: Anon_AltFields => Request[Site],
    insert: Anon_AltFieldsKey => Request[Site],
    list: Anon_AcceptsInStreamVideoPlacementsAcceptsInterstitialPlacements => Request[SitesListResponse],
    patch: Anon_AltFields => Request[Site],
    update: Anon_AltFieldsKey => Request[Site]
  ): SitesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[SitesResource]
  }
}

