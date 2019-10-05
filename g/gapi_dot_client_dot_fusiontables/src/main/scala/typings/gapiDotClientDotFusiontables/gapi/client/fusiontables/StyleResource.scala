package typings.gapiDotClientDotFusiontables.gapi.client.fusiontables

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotFusiontables.Anon_AltFields
import typings.gapiDotClientDotFusiontables.Anon_AltFieldsKey
import typings.gapiDotClientDotFusiontables.Anon_AltFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleResource extends js.Object {
  /** Deletes a style. */
  def delete(request: Anon_AltFieldsKeyOauthtoken): Request[Unit]
  /** Gets a specific style. */
  def get(request: Anon_AltFieldsKeyOauthtoken): Request[StyleSetting]
  /** Adds a new style for the table. */
  def insert(request: Anon_AltFields): Request[StyleSetting]
  /** Retrieves a list of styles. */
  def list(request: Anon_AltFieldsKey): Request[StyleSettingList]
  /** Updates an existing style. This method supports patch semantics. */
  def patch(request: Anon_AltFieldsKeyOauthtoken): Request[StyleSetting]
  /** Updates an existing style. */
  def update(request: Anon_AltFieldsKeyOauthtoken): Request[StyleSetting]
}

object StyleResource {
  @scala.inline
  def apply(
    delete: Anon_AltFieldsKeyOauthtoken => Request[Unit],
    get: Anon_AltFieldsKeyOauthtoken => Request[StyleSetting],
    insert: Anon_AltFields => Request[StyleSetting],
    list: Anon_AltFieldsKey => Request[StyleSettingList],
    patch: Anon_AltFieldsKeyOauthtoken => Request[StyleSetting],
    update: Anon_AltFieldsKeyOauthtoken => Request[StyleSetting]
  ): StyleResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[StyleResource]
  }
}

