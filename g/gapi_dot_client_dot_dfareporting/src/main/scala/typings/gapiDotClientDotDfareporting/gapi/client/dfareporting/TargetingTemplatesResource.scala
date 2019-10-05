package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotDfareporting.Anon_AdvertiserIdAltFieldsIds
import typings.gapiDotClientDotDfareporting.Anon_AltFields
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetingTemplatesResource extends js.Object {
  /** Gets one targeting template by ID. */
  def get(request: Anon_AltFields): Request[TargetingTemplate]
  /** Inserts a new targeting template. */
  def insert(request: Anon_AltFieldsKey): Request[TargetingTemplate]
  /** Retrieves a list of targeting templates, optionally filtered. This method supports paging. */
  def list(request: Anon_AdvertiserIdAltFieldsIds): Request[TargetingTemplatesListResponse]
  /** Updates an existing targeting template. This method supports patch semantics. */
  def patch(request: Anon_AltFields): Request[TargetingTemplate]
  /** Updates an existing targeting template. */
  def update(request: Anon_AltFieldsKey): Request[TargetingTemplate]
}

object TargetingTemplatesResource {
  @scala.inline
  def apply(
    get: Anon_AltFields => Request[TargetingTemplate],
    insert: Anon_AltFieldsKey => Request[TargetingTemplate],
    list: Anon_AdvertiserIdAltFieldsIds => Request[TargetingTemplatesListResponse],
    patch: Anon_AltFields => Request[TargetingTemplate],
    update: Anon_AltFieldsKey => Request[TargetingTemplate]
  ): TargetingTemplatesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[TargetingTemplatesResource]
  }
}

