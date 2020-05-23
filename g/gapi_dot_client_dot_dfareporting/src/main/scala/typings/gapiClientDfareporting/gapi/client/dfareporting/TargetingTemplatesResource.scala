package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.AdvertiserIdAlt
import typings.gapiClientDfareporting.anon.Fields
import typings.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetingTemplatesResource extends js.Object {
  /** Gets one targeting template by ID. */
  def get(request: Fields): Request[TargetingTemplate]
  /** Inserts a new targeting template. */
  def insert(request: Key): Request[TargetingTemplate]
  /** Retrieves a list of targeting templates, optionally filtered. This method supports paging. */
  def list(request: AdvertiserIdAlt): Request[TargetingTemplatesListResponse]
  /** Updates an existing targeting template. This method supports patch semantics. */
  def patch(request: Fields): Request[TargetingTemplate]
  /** Updates an existing targeting template. */
  def update(request: Key): Request[TargetingTemplate]
}

object TargetingTemplatesResource {
  @scala.inline
  def apply(
    get: Fields => Request[TargetingTemplate],
    insert: Key => Request[TargetingTemplate],
    list: AdvertiserIdAlt => Request[TargetingTemplatesListResponse],
    patch: Fields => Request[TargetingTemplate],
    update: Key => Request[TargetingTemplate]
  ): TargetingTemplatesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[TargetingTemplatesResource]
  }
}

