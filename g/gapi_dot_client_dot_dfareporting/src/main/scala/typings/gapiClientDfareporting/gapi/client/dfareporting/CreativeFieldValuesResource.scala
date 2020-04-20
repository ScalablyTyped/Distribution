package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonCreativeFieldId
import typings.gapiClientDfareporting.AnonProfileId
import typings.gapiClientDfareporting.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeFieldValuesResource extends js.Object {
  /** Deletes an existing creative field value. */
  def delete(request: AnonCreativeFieldId): Request_[Unit]
  /** Gets one creative field value by ID. */
  def get(request: AnonCreativeFieldId): Request_[CreativeFieldValue]
  /** Inserts a new creative field value. */
  def insert(request: AnonProfileId): Request_[CreativeFieldValue]
  /** Retrieves a list of creative field values, possibly filtered. This method supports paging. */
  def list(request: AnonQuotaUser): Request_[CreativeFieldValuesListResponse]
  /** Updates an existing creative field value. This method supports patch semantics. */
  def patch(request: AnonCreativeFieldId): Request_[CreativeFieldValue]
  /** Updates an existing creative field value. */
  def update(request: AnonProfileId): Request_[CreativeFieldValue]
}

object CreativeFieldValuesResource {
  @scala.inline
  def apply(
    delete: AnonCreativeFieldId => Request_[Unit],
    get: AnonCreativeFieldId => Request_[CreativeFieldValue],
    insert: AnonProfileId => Request_[CreativeFieldValue],
    list: AnonQuotaUser => Request_[CreativeFieldValuesListResponse],
    patch: AnonCreativeFieldId => Request_[CreativeFieldValue],
    update: AnonProfileId => Request_[CreativeFieldValue]
  ): CreativeFieldValuesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[CreativeFieldValuesResource]
  }
}

