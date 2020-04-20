package typings.gapiClientFusiontables.gapi.client.fusiontables

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientFusiontables.AnonFields
import typings.gapiClientFusiontables.AnonKey
import typings.gapiClientFusiontables.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleResource extends js.Object {
  /** Deletes a style. */
  def delete(request: AnonOauthtoken): Request_[Unit]
  /** Gets a specific style. */
  def get(request: AnonOauthtoken): Request_[StyleSetting]
  /** Adds a new style for the table. */
  def insert(request: AnonFields): Request_[StyleSetting]
  /** Retrieves a list of styles. */
  def list(request: AnonKey): Request_[StyleSettingList]
  /** Updates an existing style. This method supports patch semantics. */
  def patch(request: AnonOauthtoken): Request_[StyleSetting]
  /** Updates an existing style. */
  def update(request: AnonOauthtoken): Request_[StyleSetting]
}

object StyleResource {
  @scala.inline
  def apply(
    delete: AnonOauthtoken => Request_[Unit],
    get: AnonOauthtoken => Request_[StyleSetting],
    insert: AnonFields => Request_[StyleSetting],
    list: AnonKey => Request_[StyleSettingList],
    patch: AnonOauthtoken => Request_[StyleSetting],
    update: AnonOauthtoken => Request_[StyleSetting]
  ): StyleResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[StyleResource]
  }
}

