package typings.gapiClientFusiontables.gapi.client.fusiontables

import typings.gapiClient.gapi.client.Request
import typings.gapiClientFusiontables.anon.Fields
import typings.gapiClientFusiontables.anon.Key
import typings.gapiClientFusiontables.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyleResource extends js.Object {
  /** Deletes a style. */
  def delete(request: Oauthtoken): Request[Unit] = js.native
  /** Gets a specific style. */
  def get(request: Oauthtoken): Request[StyleSetting] = js.native
  /** Adds a new style for the table. */
  def insert(request: Fields): Request[StyleSetting] = js.native
  /** Retrieves a list of styles. */
  def list(request: Key): Request[StyleSettingList] = js.native
  /** Updates an existing style. This method supports patch semantics. */
  def patch(request: Oauthtoken): Request[StyleSetting] = js.native
  /** Updates an existing style. */
  def update(request: Oauthtoken): Request[StyleSetting] = js.native
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
  @scala.inline
  implicit class StyleResourceOps[Self <: StyleResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDelete(value: Oauthtoken => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Oauthtoken => Request[StyleSetting]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Fields => Request[StyleSetting]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Key => Request[StyleSettingList]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: Oauthtoken => Request[StyleSetting]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Oauthtoken => Request[StyleSetting]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

