package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonAcceptsInterstitialPlacements
import typings.gapiClientDfareporting.AnonFields
import typings.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SitesResource extends js.Object {
  /** Gets one site by ID. */
  def get(request: AnonFields): Request_[Site]
  /** Inserts a new site. */
  def insert(request: AnonKey): Request_[Site]
  /** Retrieves a list of sites, possibly filtered. This method supports paging. */
  def list(request: AnonAcceptsInterstitialPlacements): Request_[SitesListResponse]
  /** Updates an existing site. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[Site]
  /** Updates an existing site. */
  def update(request: AnonKey): Request_[Site]
}

object SitesResource {
  @scala.inline
  def apply(
    get: AnonFields => Request_[Site],
    insert: AnonKey => Request_[Site],
    list: AnonAcceptsInterstitialPlacements => Request_[SitesListResponse],
    patch: AnonFields => Request_[Site],
    update: AnonKey => Request_[Site]
  ): SitesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[SitesResource]
  }
}

