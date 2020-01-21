package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonActiveAdvertiserIdAlt
import typings.gapiClientDfareporting.AnonAltFields
import typings.gapiClientDfareporting.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativesResource extends js.Object {
  /** Gets one creative by ID. */
  def get(request: AnonAltFields): Request_[Creative]
  /** Inserts a new creative. */
  def insert(request: AnonAltFieldsKey): Request_[Creative]
  /** Retrieves a list of creatives, possibly filtered. This method supports paging. */
  def list(request: AnonActiveAdvertiserIdAlt): Request_[CreativesListResponse]
  /** Updates an existing creative. This method supports patch semantics. */
  def patch(request: AnonAltFields): Request_[Creative]
  /** Updates an existing creative. */
  def update(request: AnonAltFieldsKey): Request_[Creative]
}

object CreativesResource {
  @scala.inline
  def apply(
    get: AnonAltFields => Request_[Creative],
    insert: AnonAltFieldsKey => Request_[Creative],
    list: AnonActiveAdvertiserIdAlt => Request_[CreativesListResponse],
    patch: AnonAltFields => Request_[Creative],
    update: AnonAltFieldsKey => Request_[Creative]
  ): CreativesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[CreativesResource]
  }
}

