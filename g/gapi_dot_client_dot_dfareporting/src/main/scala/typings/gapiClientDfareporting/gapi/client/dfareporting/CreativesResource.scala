package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.Archived
import typings.gapiClientDfareporting.anon.Fields
import typings.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativesResource extends js.Object {
  /** Gets one creative by ID. */
  def get(request: Fields): Request[Creative]
  /** Inserts a new creative. */
  def insert(request: Key): Request[Creative]
  /** Retrieves a list of creatives, possibly filtered. This method supports paging. */
  def list(request: Archived): Request[CreativesListResponse]
  /** Updates an existing creative. This method supports patch semantics. */
  def patch(request: Fields): Request[Creative]
  /** Updates an existing creative. */
  def update(request: Key): Request[Creative]
}

object CreativesResource {
  @scala.inline
  def apply(
    get: Fields => Request[Creative],
    insert: Key => Request[Creative],
    list: Archived => Request[CreativesListResponse],
    patch: Fields => Request[Creative],
    update: Key => Request[Creative]
  ): CreativesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[CreativesResource]
  }
}

