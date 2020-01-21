package typings.gapiClientGmail.gapi.client.gmail

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientGmail.AnonAltFieldsIdKey
import typings.gapiClientGmail.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmimeInfoResource extends js.Object {
  /** Deletes the specified S/MIME config for the specified send-as alias. */
  def delete(request: AnonAltFieldsIdKey): Request_[Unit]
  /** Gets the specified S/MIME config for the specified send-as alias. */
  def get(request: AnonAltFieldsIdKey): Request_[SmimeInfo]
  /** Insert (upload) the given S/MIME config for the specified send-as alias. Note that pkcs12 format is required for the key. */
  def insert(request: AnonAltFieldsKey): Request_[SmimeInfo]
  /** Lists S/MIME configs for the specified send-as alias. */
  def list(request: AnonAltFieldsKey): Request_[ListSmimeInfoResponse]
  /** Sets the default S/MIME config for the specified send-as alias. */
  def setDefault(request: AnonAltFieldsIdKey): Request_[Unit]
}

object SmimeInfoResource {
  @scala.inline
  def apply(
    delete: AnonAltFieldsIdKey => Request_[Unit],
    get: AnonAltFieldsIdKey => Request_[SmimeInfo],
    insert: AnonAltFieldsKey => Request_[SmimeInfo],
    list: AnonAltFieldsKey => Request_[ListSmimeInfoResponse],
    setDefault: AnonAltFieldsIdKey => Request_[Unit]
  ): SmimeInfoResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), setDefault = js.Any.fromFunction1(setDefault))
  
    __obj.asInstanceOf[SmimeInfoResource]
  }
}

