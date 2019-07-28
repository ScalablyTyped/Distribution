package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotDfareporting.Anon_AltCreativeFieldId
import typings.gapiDotClientDotDfareporting.Anon_AltCreativeFieldIdFields
import typings.gapiDotClientDotDfareporting.Anon_AltCreativeFieldIdFieldsIds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeFieldValuesResource extends js.Object {
  /** Deletes an existing creative field value. */
  def delete(request: Anon_AltCreativeFieldId): Request[Unit]
  /** Gets one creative field value by ID. */
  def get(request: Anon_AltCreativeFieldId): Request[CreativeFieldValue]
  /** Inserts a new creative field value. */
  def insert(request: Anon_AltCreativeFieldIdFields): Request[CreativeFieldValue]
  /** Retrieves a list of creative field values, possibly filtered. This method supports paging. */
  def list(request: Anon_AltCreativeFieldIdFieldsIds): Request[CreativeFieldValuesListResponse]
  /** Updates an existing creative field value. This method supports patch semantics. */
  def patch(request: Anon_AltCreativeFieldId): Request[CreativeFieldValue]
  /** Updates an existing creative field value. */
  def update(request: Anon_AltCreativeFieldIdFields): Request[CreativeFieldValue]
}

object CreativeFieldValuesResource {
  @scala.inline
  def apply(
    delete: Anon_AltCreativeFieldId => Request[Unit],
    get: Anon_AltCreativeFieldId => Request[CreativeFieldValue],
    insert: Anon_AltCreativeFieldIdFields => Request[CreativeFieldValue],
    list: Anon_AltCreativeFieldIdFieldsIds => Request[CreativeFieldValuesListResponse],
    patch: Anon_AltCreativeFieldId => Request[CreativeFieldValue],
    update: Anon_AltCreativeFieldIdFields => Request[CreativeFieldValue]
  ): CreativeFieldValuesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[CreativeFieldValuesResource]
  }
}

