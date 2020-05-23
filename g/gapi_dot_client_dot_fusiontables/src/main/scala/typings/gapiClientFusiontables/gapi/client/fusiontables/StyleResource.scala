package typings.gapiClientFusiontables.gapi.client.fusiontables

import typings.gapiClient.gapi.client.Request
import typings.gapiClientFusiontables.anon.Fields
import typings.gapiClientFusiontables.anon.Key
import typings.gapiClientFusiontables.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleResource extends js.Object {
  /** Deletes a style. */
  def delete(request: Oauthtoken): Request[Unit]
  /** Gets a specific style. */
  def get(request: Oauthtoken): Request[StyleSetting]
  /** Adds a new style for the table. */
  def insert(request: Fields): Request[StyleSetting]
  /** Retrieves a list of styles. */
  def list(request: Key): Request[StyleSettingList]
  /** Updates an existing style. This method supports patch semantics. */
  def patch(request: Oauthtoken): Request[StyleSetting]
  /** Updates an existing style. */
  def update(request: Oauthtoken): Request[StyleSetting]
}

object StyleResource {
  @scala.inline
  def apply(
    delete: Oauthtoken => Request[Unit],
    get: Oauthtoken => Request[StyleSetting],
    insert: Fields => Request[StyleSetting],
    list: Key => Request[StyleSettingList],
    patch: Oauthtoken => Request[StyleSetting],
    update: Oauthtoken => Request[StyleSetting]
  ): StyleResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[StyleResource]
  }
}

