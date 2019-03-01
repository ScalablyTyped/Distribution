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

object LandingPagesResource {
  @scala.inline
  def apply(
    delete: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltCampaignIdFieldsId, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltCampaignIdFieldsId, 
      gapiDotClientLib.gapiNs.clientNs.Request[LandingPage]
    ],
    insert: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltCampaignId, 
      gapiDotClientLib.gapiNs.clientNs.Request[LandingPage]
    ],
    list: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltCampaignId, 
      gapiDotClientLib.gapiNs.clientNs.Request[LandingPagesListResponse]
    ],
    patch: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltCampaignIdFieldsId, 
      gapiDotClientLib.gapiNs.clientNs.Request[LandingPage]
    ],
    update: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltCampaignId, 
      gapiDotClientLib.gapiNs.clientNs.Request[LandingPage]
    ]
  ): LandingPagesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("insert")(insert)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("patch")(patch)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[LandingPagesResource]
  }
}

