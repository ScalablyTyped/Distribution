package typings
package gapiDotClientDotFusiontablesLib.gapiNs.clientNs.fusiontablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleResource extends js.Object {
  /** Deletes a style. */
  def delete(request: gapiDotClientDotFusiontablesLib.Anon_AltFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets a specific style. */
  def get(request: gapiDotClientDotFusiontablesLib.Anon_AltFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[StyleSetting]
  /** Adds a new style for the table. */
  def insert(request: gapiDotClientDotFusiontablesLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[StyleSetting]
  /** Retrieves a list of styles. */
  def list(request: gapiDotClientDotFusiontablesLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[StyleSettingList]
  /** Updates an existing style. This method supports patch semantics. */
  def patch(request: gapiDotClientDotFusiontablesLib.Anon_AltFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[StyleSetting]
  /** Updates an existing style. */
  def update(request: gapiDotClientDotFusiontablesLib.Anon_AltFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[StyleSetting]
}

object StyleResource {
  @scala.inline
  def apply(
    delete: gapiDotClientDotFusiontablesLib.Anon_AltFieldsKeyOauthtoken => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    get: gapiDotClientDotFusiontablesLib.Anon_AltFieldsKeyOauthtoken => gapiDotClientLib.gapiNs.clientNs.Request[StyleSetting],
    insert: gapiDotClientDotFusiontablesLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[StyleSetting],
    list: gapiDotClientDotFusiontablesLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[StyleSettingList],
    patch: gapiDotClientDotFusiontablesLib.Anon_AltFieldsKeyOauthtoken => gapiDotClientLib.gapiNs.clientNs.Request[StyleSetting],
    update: gapiDotClientDotFusiontablesLib.Anon_AltFieldsKeyOauthtoken => gapiDotClientLib.gapiNs.clientNs.Request[StyleSetting]
  ): StyleResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[StyleResource]
  }
}

