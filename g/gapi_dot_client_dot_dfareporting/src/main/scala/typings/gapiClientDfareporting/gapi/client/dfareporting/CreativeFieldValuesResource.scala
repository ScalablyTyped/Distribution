package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.CreativeFieldId
import typings.gapiClientDfareporting.anon.ProfileId
import typings.gapiClientDfareporting.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeFieldValuesResource extends js.Object {
  /** Deletes an existing creative field value. */
  def delete(request: CreativeFieldId): Request[Unit]
  /** Gets one creative field value by ID. */
  def get(request: CreativeFieldId): Request[CreativeFieldValue]
  /** Inserts a new creative field value. */
  def insert(request: ProfileId): Request[CreativeFieldValue]
  /** Retrieves a list of creative field values, possibly filtered. This method supports paging. */
  def list(request: QuotaUser): Request[CreativeFieldValuesListResponse]
  /** Updates an existing creative field value. This method supports patch semantics. */
  def patch(request: CreativeFieldId): Request[CreativeFieldValue]
  /** Updates an existing creative field value. */
  def update(request: ProfileId): Request[CreativeFieldValue]
}

object CreativeFieldValuesResource {
  @scala.inline
  def apply(
    delete: CreativeFieldId => Request[Unit],
    get: CreativeFieldId => Request[CreativeFieldValue],
    insert: ProfileId => Request[CreativeFieldValue],
    list: QuotaUser => Request[CreativeFieldValuesListResponse],
    patch: CreativeFieldId => Request[CreativeFieldValue],
    update: ProfileId => Request[CreativeFieldValue]
  ): CreativeFieldValuesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[CreativeFieldValuesResource]
  }
}

