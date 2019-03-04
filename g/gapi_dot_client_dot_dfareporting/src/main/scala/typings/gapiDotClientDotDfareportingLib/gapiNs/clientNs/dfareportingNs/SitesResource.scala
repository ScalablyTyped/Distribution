package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SitesResource extends js.Object {
  /** Gets one site by ID. */
  def get(request: gapiDotClientDotDfareportingLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Site]
  /** Inserts a new site. */
  def insert(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Site]
  /** Retrieves a list of sites, possibly filtered. This method supports paging. */
  def list(
    request: gapiDotClientDotDfareportingLib.Anon_AcceptsInStreamVideoPlacementsAcceptsInterstitialPlacements
  ): gapiDotClientLib.gapiNs.clientNs.Request[SitesListResponse]
  /** Updates an existing site. This method supports patch semantics. */
  def patch(request: gapiDotClientDotDfareportingLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Site]
  /** Updates an existing site. */
  def update(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Site]
}

object SitesResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Site]
    ],
    insert: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Site]
    ],
    list: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AcceptsInStreamVideoPlacementsAcceptsInterstitialPlacements, 
      gapiDotClientLib.gapiNs.clientNs.Request[SitesListResponse]
    ],
    patch: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Site]
    ],
    update: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Site]
    ]
  ): SitesResource = {
    val __obj = js.Dynamic.literal(get = get, insert = insert, list = list, patch = patch, update = update)
  
    __obj.asInstanceOf[SitesResource]
  }
}

