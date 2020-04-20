package typings.gapiClientGmail.gapi.client.gmail

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientGmail.AnonOauthtoken
import typings.gapiClientGmail.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmimeInfoResource extends js.Object {
  /** Deletes the specified S/MIME config for the specified send-as alias. */
  def delete(request: AnonOauthtoken): Request_[Unit]
  /** Gets the specified S/MIME config for the specified send-as alias. */
  def get(request: AnonOauthtoken): Request_[SmimeInfo]
  /** Insert (upload) the given S/MIME config for the specified send-as alias. Note that pkcs12 format is required for the key. */
  def insert(request: AnonPrettyPrint): Request_[SmimeInfo]
  /** Lists S/MIME configs for the specified send-as alias. */
  def list(request: AnonPrettyPrint): Request_[ListSmimeInfoResponse]
  /** Sets the default S/MIME config for the specified send-as alias. */
  def setDefault(request: AnonOauthtoken): Request_[Unit]
}

object SmimeInfoResource {
  @scala.inline
  def apply(
    delete: AnonOauthtoken => Request_[Unit],
    get: AnonOauthtoken => Request_[SmimeInfo],
    insert: AnonPrettyPrint => Request_[SmimeInfo],
    list: AnonPrettyPrint => Request_[ListSmimeInfoResponse],
    setDefault: AnonOauthtoken => Request_[Unit]
  ): SmimeInfoResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), setDefault = js.Any.fromFunction1(setDefault))
    __obj.asInstanceOf[SmimeInfoResource]
  }
}

