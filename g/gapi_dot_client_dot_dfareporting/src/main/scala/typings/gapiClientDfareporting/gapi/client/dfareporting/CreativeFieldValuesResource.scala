package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonAltCreativeFieldId
import typings.gapiClientDfareporting.AnonAltCreativeFieldIdFields
import typings.gapiClientDfareporting.AnonAltCreativeFieldIdFieldsIds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeFieldValuesResource extends js.Object {
  /** Deletes an existing creative field value. */
  def delete(request: AnonAltCreativeFieldId): Request_[Unit]
  /** Gets one creative field value by ID. */
  def get(request: AnonAltCreativeFieldId): Request_[CreativeFieldValue]
  /** Inserts a new creative field value. */
  def insert(request: AnonAltCreativeFieldIdFields): Request_[CreativeFieldValue]
  /** Retrieves a list of creative field values, possibly filtered. This method supports paging. */
  def list(request: AnonAltCreativeFieldIdFieldsIds): Request_[CreativeFieldValuesListResponse]
  /** Updates an existing creative field value. This method supports patch semantics. */
  def patch(request: AnonAltCreativeFieldId): Request_[CreativeFieldValue]
  /** Updates an existing creative field value. */
  def update(request: AnonAltCreativeFieldIdFields): Request_[CreativeFieldValue]
}

object CreativeFieldValuesResource {
  @scala.inline
  def apply(
    delete: AnonAltCreativeFieldId => Request_[Unit],
    get: AnonAltCreativeFieldId => Request_[CreativeFieldValue],
    insert: AnonAltCreativeFieldIdFields => Request_[CreativeFieldValue],
    list: AnonAltCreativeFieldIdFieldsIds => Request_[CreativeFieldValuesListResponse],
    patch: AnonAltCreativeFieldId => Request_[CreativeFieldValue],
    update: AnonAltCreativeFieldIdFields => Request_[CreativeFieldValue]
  ): CreativeFieldValuesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[CreativeFieldValuesResource]
  }
}

