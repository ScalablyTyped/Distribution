package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonAdvertiserIdAlt
import typings.gapiClientDfareporting.AnonFields
import typings.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetingTemplatesResource extends js.Object {
  /** Gets one targeting template by ID. */
  def get(request: AnonFields): Request_[TargetingTemplate]
  /** Inserts a new targeting template. */
  def insert(request: AnonKey): Request_[TargetingTemplate]
  /** Retrieves a list of targeting templates, optionally filtered. This method supports paging. */
  def list(request: AnonAdvertiserIdAlt): Request_[TargetingTemplatesListResponse]
  /** Updates an existing targeting template. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[TargetingTemplate]
  /** Updates an existing targeting template. */
  def update(request: AnonKey): Request_[TargetingTemplate]
}

object TargetingTemplatesResource {
  @scala.inline
  def apply(
    get: AnonFields => Request_[TargetingTemplate],
    insert: AnonKey => Request_[TargetingTemplate],
    list: AnonAdvertiserIdAlt => Request_[TargetingTemplatesListResponse],
    patch: AnonFields => Request_[TargetingTemplate],
    update: AnonKey => Request_[TargetingTemplate]
  ): TargetingTemplatesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[TargetingTemplatesResource]
  }
}

