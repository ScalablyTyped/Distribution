package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CampaignsResource extends js.Object {
  /** Gets one campaign by ID. */
  def get(request: gapiDotClientDotDfareportingLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Campaign]
  /** Inserts a new campaign. */
  def insert(request: gapiDotClientDotDfareportingLib.Anon_AltDefaultLandingPageName): gapiDotClientLib.gapiNs.clientNs.Request[Campaign]
  /** Retrieves a list of campaigns, possibly filtered. This method supports paging. */
  def list(request: gapiDotClientDotDfareportingLib.Anon_AdvertiserGroupIdsAdvertiserIds): gapiDotClientLib.gapiNs.clientNs.Request[CampaignsListResponse]
  /** Updates an existing campaign. This method supports patch semantics. */
  def patch(request: gapiDotClientDotDfareportingLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Campaign]
  /** Updates an existing campaign. */
  def update(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Campaign]
}

object CampaignsResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Campaign]
    ],
    insert: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltDefaultLandingPageName, 
      gapiDotClientLib.gapiNs.clientNs.Request[Campaign]
    ],
    list: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AdvertiserGroupIdsAdvertiserIds, 
      gapiDotClientLib.gapiNs.clientNs.Request[CampaignsListResponse]
    ],
    patch: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Campaign]
    ],
    update: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Campaign]
    ]
  ): CampaignsResource = {
    val __obj = js.Dynamic.literal(get = get, insert = insert, list = list, patch = patch, update = update)
  
    __obj.asInstanceOf[CampaignsResource]
  }
}

