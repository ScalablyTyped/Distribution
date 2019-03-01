package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetingTemplatesResource extends js.Object {
  /** Gets one targeting template by ID. */
  def get(request: gapiDotClientDotDfareportingLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[TargetingTemplate]
  /** Inserts a new targeting template. */
  def insert(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[TargetingTemplate]
  /** Retrieves a list of targeting templates, optionally filtered. This method supports paging. */
  def list(request: gapiDotClientDotDfareportingLib.Anon_AdvertiserIdAltFieldsIds): gapiDotClientLib.gapiNs.clientNs.Request[TargetingTemplatesListResponse]
  /** Updates an existing targeting template. This method supports patch semantics. */
  def patch(request: gapiDotClientDotDfareportingLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[TargetingTemplate]
  /** Updates an existing targeting template. */
  def update(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[TargetingTemplate]
}

object TargetingTemplatesResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[TargetingTemplate]
    ],
    insert: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[TargetingTemplate]
    ],
    list: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AdvertiserIdAltFieldsIds, 
      gapiDotClientLib.gapiNs.clientNs.Request[TargetingTemplatesListResponse]
    ],
    patch: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[TargetingTemplate]
    ],
    update: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[TargetingTemplate]
    ]
  ): TargetingTemplatesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("insert")(insert)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("patch")(patch)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[TargetingTemplatesResource]
  }
}

