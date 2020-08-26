package typings.gapiClientIam.gapi.client.iam

import typings.gapiClient.gapi.client.Request
import typings.gapiClientIam.anon.Bearertoken
import typings.gapiClientIam.anon.KeyTypes
import typings.gapiClientIam.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeysResource extends js.Object {
  /**
    * Creates a ServiceAccountKey
    * and returns it.
    */
  def create(request: Bearertoken): Request[ServiceAccountKey] = js.native
  /** Deletes a ServiceAccountKey. */
  def delete(request: Bearertoken): Request[js.Object] = js.native
  /**
    * Gets the ServiceAccountKey
    * by key id.
    */
  def get(request: Name): Request[ServiceAccountKey] = js.native
  /** Lists ServiceAccountKeys. */
  def list(request: KeyTypes): Request[ListServiceAccountKeysResponse] = js.native
}

object KeysResource {
  @scala.inline
  def apply(
    create: Bearertoken => Request[ServiceAccountKey],
    delete: Bearertoken => Request[js.Object],
    get: Name => Request[ServiceAccountKey],
    list: KeyTypes => Request[ListServiceAccountKeysResponse]
  ): KeysResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[KeysResource]
  }
  @scala.inline
  implicit class KeysResourceOps[Self <: KeysResource] (val x: Self) extends AnyVal {
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
    def setCreate(value: Bearertoken => Request[ServiceAccountKey]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: Bearertoken => Request[js.Object]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Name => Request[ServiceAccountKey]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: KeyTypes => Request[ListServiceAccountKeysResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

