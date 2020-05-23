package typings.gapiClientGmail.gapi.client.gmail

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGmail.anon.Oauthtoken
import typings.gapiClientGmail.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmimeInfoResource extends js.Object {
  /** Deletes the specified S/MIME config for the specified send-as alias. */
  def delete(request: Oauthtoken): Request[Unit]
  /** Gets the specified S/MIME config for the specified send-as alias. */
  def get(request: Oauthtoken): Request[SmimeInfo]
  /** Insert (upload) the given S/MIME config for the specified send-as alias. Note that pkcs12 format is required for the key. */
  def insert(request: PrettyPrint): Request[SmimeInfo]
  /** Lists S/MIME configs for the specified send-as alias. */
  def list(request: PrettyPrint): Request[ListSmimeInfoResponse]
  /** Sets the default S/MIME config for the specified send-as alias. */
  def setDefault(request: Oauthtoken): Request[Unit]
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
}

