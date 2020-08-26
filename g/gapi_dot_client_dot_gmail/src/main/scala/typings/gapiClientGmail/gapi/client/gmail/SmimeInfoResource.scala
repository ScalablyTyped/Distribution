package typings.gapiClientGmail.gapi.client.gmail

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGmail.anon.Oauthtoken
import typings.gapiClientGmail.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmimeInfoResource extends js.Object {
  /** Deletes the specified S/MIME config for the specified send-as alias. */
  def delete(request: Oauthtoken): Request[Unit] = js.native
  /** Gets the specified S/MIME config for the specified send-as alias. */
  def get(request: Oauthtoken): Request[SmimeInfo] = js.native
  /** Insert (upload) the given S/MIME config for the specified send-as alias. Note that pkcs12 format is required for the key. */
  def insert(request: PrettyPrint): Request[SmimeInfo] = js.native
  /** Lists S/MIME configs for the specified send-as alias. */
  def list(request: PrettyPrint): Request[ListSmimeInfoResponse] = js.native
  /** Sets the default S/MIME config for the specified send-as alias. */
  def setDefault(request: Oauthtoken): Request[Unit] = js.native
}

object SmimeInfoResource {
  @scala.inline
  def apply(
    delete: Oauthtoken => Request[Unit],
    get: Oauthtoken => Request[SmimeInfo],
    insert: PrettyPrint => Request[SmimeInfo],
    list: PrettyPrint => Request[ListSmimeInfoResponse],
    setDefault: Oauthtoken => Request[Unit]
  ): SmimeInfoResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), setDefault = js.Any.fromFunction1(setDefault))
    __obj.asInstanceOf[SmimeInfoResource]
  }
  @scala.inline
  implicit class SmimeInfoResourceOps[Self <: SmimeInfoResource] (val x: Self) extends AnyVal {
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
    def setGet(value: Oauthtoken => Request[SmimeInfo]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: PrettyPrint => Request[SmimeInfo]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: PrettyPrint => Request[ListSmimeInfoResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setSetDefault(value: Oauthtoken => Request[Unit]): Self = this.set("setDefault", js.Any.fromFunction1(value))
  }
  
}

