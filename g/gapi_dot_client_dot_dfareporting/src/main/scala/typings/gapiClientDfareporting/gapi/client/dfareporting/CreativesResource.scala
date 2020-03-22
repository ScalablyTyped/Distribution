package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonArchived
import typings.gapiClientDfareporting.AnonFields
import typings.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativesResource extends js.Object {
  /** Gets one creative by ID. */
  def get(request: AnonFields): Request_[Creative]
  /** Inserts a new creative. */
  def insert(request: AnonKey): Request_[Creative]
  /** Retrieves a list of creatives, possibly filtered. This method supports paging. */
  def list(request: AnonArchived): Request_[CreativesListResponse]
  /** Updates an existing creative. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[Creative]
  /** Updates an existing creative. */
  def update(request: AnonKey): Request_[Creative]
}

object CreativesResource {
  @scala.inline
  def apply(
    get: AnonFields => Request_[Creative],
    insert: AnonKey => Request_[Creative],
    list: AnonArchived => Request_[CreativesListResponse],
    patch: AnonFields => Request_[Creative],
    update: AnonKey => Request_[Creative]
  ): CreativesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[CreativesResource]
  }
}

