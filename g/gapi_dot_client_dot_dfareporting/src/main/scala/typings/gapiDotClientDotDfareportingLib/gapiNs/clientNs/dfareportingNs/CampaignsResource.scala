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

