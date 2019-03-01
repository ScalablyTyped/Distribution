package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloodlightActivitiesResource extends js.Object {
  /** Deletes an existing floodlight activity. */
  def delete(request: gapiDotClientDotDfareportingLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Generates a tag for a floodlight activity. */
  def generatetag(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsFloodlightActivityId): gapiDotClientLib.gapiNs.clientNs.Request[FloodlightActivitiesGenerateTagResponse]
  /** Gets one floodlight activity by ID. */
  def get(request: gapiDotClientDotDfareportingLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[FloodlightActivity]
  /** Inserts a new floodlight activity. */
  def insert(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[FloodlightActivity]
  /** Retrieves a list of floodlight activities, possibly filtered. This method supports paging. */
  def list(request: gapiDotClientDotDfareportingLib.Anon_AdvertiserIdAltFields): gapiDotClientLib.gapiNs.clientNs.Request[FloodlightActivitiesListResponse]
  /** Updates an existing floodlight activity. This method supports patch semantics. */
  def patch(request: gapiDotClientDotDfareportingLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[FloodlightActivity]
  /** Updates an existing floodlight activity. */
  def update(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[FloodlightActivity]
}

object FloodlightActivitiesResource {
  @scala.inline
  def apply(
    delete: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    generatetag: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFieldsFloodlightActivityId, 
      gapiDotClientLib.gapiNs.clientNs.Request[FloodlightActivitiesGenerateTagResponse]
    ],
    get: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[FloodlightActivity]
    ],
    insert: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[FloodlightActivity]
    ],
    list: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AdvertiserIdAltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[FloodlightActivitiesListResponse]
    ],
    patch: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[FloodlightActivity]
    ],
    update: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[FloodlightActivity]
    ]
  ): FloodlightActivitiesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("generatetag")(generatetag)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("insert")(insert)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("patch")(patch)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[FloodlightActivitiesResource]
  }
}

