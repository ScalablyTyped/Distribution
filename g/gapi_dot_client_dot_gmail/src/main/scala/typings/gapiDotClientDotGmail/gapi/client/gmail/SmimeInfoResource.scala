package typings.gapiDotClientDotGmail.gapi.client.gmail

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotGmail.Anon_AltFieldsIdKey
import typings.gapiDotClientDotGmail.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmimeInfoResource extends js.Object {
  /** Deletes the specified S/MIME config for the specified send-as alias. */
  def delete(request: Anon_AltFieldsIdKey): Request[Unit]
  /** Gets the specified S/MIME config for the specified send-as alias. */
  def get(request: Anon_AltFieldsIdKey): Request[SmimeInfo]
  /** Insert (upload) the given S/MIME config for the specified send-as alias. Note that pkcs12 format is required for the key. */
  def insert(request: Anon_AltFieldsKey): Request[SmimeInfo]
  /** Lists S/MIME configs for the specified send-as alias. */
  def list(request: Anon_AltFieldsKey): Request[ListSmimeInfoResponse]
  /** Sets the default S/MIME config for the specified send-as alias. */
  def setDefault(request: Anon_AltFieldsIdKey): Request[Unit]
}

object SmimeInfoResource {
  @scala.inline
  def apply(
    delete: Anon_AltFieldsIdKey => Request[Unit],
    get: Anon_AltFieldsIdKey => Request[SmimeInfo],
    insert: Anon_AltFieldsKey => Request[SmimeInfo],
    list: Anon_AltFieldsKey => Request[ListSmimeInfoResponse],
    setDefault: Anon_AltFieldsIdKey => Request[Unit]
  ): SmimeInfoResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), setDefault = js.Any.fromFunction1(setDefault))
  
    __obj.asInstanceOf[SmimeInfoResource]
  }
}

