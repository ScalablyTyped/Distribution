package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotDfareporting.Anon_ActiveAdvertiserIdAlt
import typings.gapiDotClientDotDfareporting.Anon_AltFields
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativesResource extends js.Object {
  /** Gets one creative by ID. */
  def get(request: Anon_AltFields): Request[Creative]
  /** Inserts a new creative. */
  def insert(request: Anon_AltFieldsKey): Request[Creative]
  /** Retrieves a list of creatives, possibly filtered. This method supports paging. */
  def list(request: Anon_ActiveAdvertiserIdAlt): Request[CreativesListResponse]
  /** Updates an existing creative. This method supports patch semantics. */
  def patch(request: Anon_AltFields): Request[Creative]
  /** Updates an existing creative. */
  def update(request: Anon_AltFieldsKey): Request[Creative]
}

object CreativesResource {
  @scala.inline
  def apply(
    get: Anon_AltFields => Request[Creative],
    insert: Anon_AltFieldsKey => Request[Creative],
    list: Anon_ActiveAdvertiserIdAlt => Request[CreativesListResponse],
    patch: Anon_AltFields => Request[Creative],
    update: Anon_AltFieldsKey => Request[Creative]
  ): CreativesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[CreativesResource]
  }
}

