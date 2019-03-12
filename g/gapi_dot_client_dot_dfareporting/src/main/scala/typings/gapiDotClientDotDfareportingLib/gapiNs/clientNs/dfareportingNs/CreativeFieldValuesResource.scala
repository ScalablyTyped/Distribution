package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeFieldValuesResource extends js.Object {
  /** Deletes an existing creative field value. */
  def delete(request: gapiDotClientDotDfareportingLib.Anon_AltCreativeFieldId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets one creative field value by ID. */
  def get(request: gapiDotClientDotDfareportingLib.Anon_AltCreativeFieldId): gapiDotClientLib.gapiNs.clientNs.Request[CreativeFieldValue]
  /** Inserts a new creative field value. */
  def insert(request: gapiDotClientDotDfareportingLib.Anon_AltCreativeFieldIdFields): gapiDotClientLib.gapiNs.clientNs.Request[CreativeFieldValue]
  /** Retrieves a list of creative field values, possibly filtered. This method supports paging. */
  def list(request: gapiDotClientDotDfareportingLib.Anon_AltCreativeFieldIdFieldsIds): gapiDotClientLib.gapiNs.clientNs.Request[CreativeFieldValuesListResponse]
  /** Updates an existing creative field value. This method supports patch semantics. */
  def patch(request: gapiDotClientDotDfareportingLib.Anon_AltCreativeFieldId): gapiDotClientLib.gapiNs.clientNs.Request[CreativeFieldValue]
  /** Updates an existing creative field value. */
  def update(request: gapiDotClientDotDfareportingLib.Anon_AltCreativeFieldIdFields): gapiDotClientLib.gapiNs.clientNs.Request[CreativeFieldValue]
}

object CreativeFieldValuesResource {
  @scala.inline
  def apply(
    delete: gapiDotClientDotDfareportingLib.Anon_AltCreativeFieldId => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    get: gapiDotClientDotDfareportingLib.Anon_AltCreativeFieldId => gapiDotClientLib.gapiNs.clientNs.Request[CreativeFieldValue],
    insert: gapiDotClientDotDfareportingLib.Anon_AltCreativeFieldIdFields => gapiDotClientLib.gapiNs.clientNs.Request[CreativeFieldValue],
    list: gapiDotClientDotDfareportingLib.Anon_AltCreativeFieldIdFieldsIds => gapiDotClientLib.gapiNs.clientNs.Request[CreativeFieldValuesListResponse],
    patch: gapiDotClientDotDfareportingLib.Anon_AltCreativeFieldId => gapiDotClientLib.gapiNs.clientNs.Request[CreativeFieldValue],
    update: gapiDotClientDotDfareportingLib.Anon_AltCreativeFieldIdFields => gapiDotClientLib.gapiNs.clientNs.Request[CreativeFieldValue]
  ): CreativeFieldValuesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[CreativeFieldValuesResource]
  }
}

