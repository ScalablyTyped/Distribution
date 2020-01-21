package typings.gapiClientFusiontables.gapi.client.fusiontables

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientFusiontables.AnonAltFields
import typings.gapiClientFusiontables.AnonAltFieldsKey
import typings.gapiClientFusiontables.AnonAltFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleResource extends js.Object {
  /** Deletes a style. */
  def delete(request: AnonAltFieldsKeyOauthtoken): Request_[Unit]
  /** Gets a specific style. */
  def get(request: AnonAltFieldsKeyOauthtoken): Request_[StyleSetting]
  /** Adds a new style for the table. */
  def insert(request: AnonAltFields): Request_[StyleSetting]
  /** Retrieves a list of styles. */
  def list(request: AnonAltFieldsKey): Request_[StyleSettingList]
  /** Updates an existing style. This method supports patch semantics. */
  def patch(request: AnonAltFieldsKeyOauthtoken): Request_[StyleSetting]
  /** Updates an existing style. */
  def update(request: AnonAltFieldsKeyOauthtoken): Request_[StyleSetting]
}

object StyleResource {
  @scala.inline
  def apply(
    delete: AnonAltFieldsKeyOauthtoken => Request_[Unit],
    get: AnonAltFieldsKeyOauthtoken => Request_[StyleSetting],
    insert: AnonAltFields => Request_[StyleSetting],
    list: AnonAltFieldsKey => Request_[StyleSettingList],
    patch: AnonAltFieldsKeyOauthtoken => Request_[StyleSetting],
    update: AnonAltFieldsKeyOauthtoken => Request_[StyleSetting]
  ): StyleResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[StyleResource]
  }
}

