package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LandingPagesResource extends js.Object {
  /** Deletes an existing campaign landing page. */
  def delete(request: gapiDotClientDotDfareportingLib.Anon_AltCampaignIdFieldsId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets one campaign landing page by ID. */
  def get(request: gapiDotClientDotDfareportingLib.Anon_AltCampaignIdFieldsId): gapiDotClientLib.gapiNs.clientNs.Request[LandingPage]
  /** Inserts a new landing page for the specified campaign. */
  def insert(request: gapiDotClientDotDfareportingLib.Anon_AltCampaignId): gapiDotClientLib.gapiNs.clientNs.Request[LandingPage]
  /** Retrieves the list of landing pages for the specified campaign. */
  def list(request: gapiDotClientDotDfareportingLib.Anon_AltCampaignId): gapiDotClientLib.gapiNs.clientNs.Request[LandingPagesListResponse]
  /** Updates an existing campaign landing page. This method supports patch semantics. */
  def patch(request: gapiDotClientDotDfareportingLib.Anon_AltCampaignIdFieldsId): gapiDotClientLib.gapiNs.clientNs.Request[LandingPage]
  /** Updates an existing campaign landing page. */
  def update(request: gapiDotClientDotDfareportingLib.Anon_AltCampaignId): gapiDotClientLib.gapiNs.clientNs.Request[LandingPage]
}

