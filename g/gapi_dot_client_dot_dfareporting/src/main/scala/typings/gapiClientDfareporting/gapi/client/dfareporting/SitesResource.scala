package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.AcceptsInterstitialPlacements
import typings.gapiClientDfareporting.anon.Fields
import typings.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SitesResource extends js.Object {
  /** Gets one site by ID. */
  def get(request: Fields): Request[Site]
  /** Inserts a new site. */
  def insert(request: Key): Request[Site]
  /** Retrieves a list of sites, possibly filtered. This method supports paging. */
  def list(request: AcceptsInterstitialPlacements): Request[SitesListResponse]
  /** Updates an existing site. This method supports patch semantics. */
  def patch(request: Fields): Request[Site]
  /** Updates an existing site. */
  def update(request: Key): Request[Site]
}

object SitesResource {
  @scala.inline
  def apply(
    get: Fields => Request[Site],
    insert: Key => Request[Site],
    list: AcceptsInterstitialPlacements => Request[SitesListResponse],
    patch: Fields => Request[Site],
    update: Key => Request[Site]
  ): SitesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[SitesResource]
  }
}

