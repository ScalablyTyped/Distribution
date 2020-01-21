package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonAdvertiserIdAltFieldsIds
import typings.gapiClientDfareporting.AnonAltFields
import typings.gapiClientDfareporting.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetingTemplatesResource extends js.Object {
  /** Gets one targeting template by ID. */
  def get(request: AnonAltFields): Request_[TargetingTemplate]
  /** Inserts a new targeting template. */
  def insert(request: AnonAltFieldsKey): Request_[TargetingTemplate]
  /** Retrieves a list of targeting templates, optionally filtered. This method supports paging. */
  def list(request: AnonAdvertiserIdAltFieldsIds): Request_[TargetingTemplatesListResponse]
  /** Updates an existing targeting template. This method supports patch semantics. */
  def patch(request: AnonAltFields): Request_[TargetingTemplate]
  /** Updates an existing targeting template. */
  def update(request: AnonAltFieldsKey): Request_[TargetingTemplate]
}

object TargetingTemplatesResource {
  @scala.inline
  def apply(
    get: AnonAltFields => Request_[TargetingTemplate],
    insert: AnonAltFieldsKey => Request_[TargetingTemplate],
    list: AnonAdvertiserIdAltFieldsIds => Request_[TargetingTemplatesListResponse],
    patch: AnonAltFields => Request_[TargetingTemplate],
    update: AnonAltFieldsKey => Request_[TargetingTemplate]
  ): TargetingTemplatesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[TargetingTemplatesResource]
  }
}

