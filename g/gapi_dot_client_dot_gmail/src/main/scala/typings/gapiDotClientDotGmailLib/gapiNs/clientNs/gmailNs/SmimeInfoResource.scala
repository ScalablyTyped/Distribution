package typings
package gapiDotClientDotGmailLib.gapiNs.clientNs.gmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmimeInfoResource extends js.Object {
  /** Deletes the specified S/MIME config for the specified send-as alias. */
  def delete(request: gapiDotClientDotGmailLib.Anon_AltFieldsIdKey): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets the specified S/MIME config for the specified send-as alias. */
  def get(request: gapiDotClientDotGmailLib.Anon_AltFieldsIdKey): gapiDotClientLib.gapiNs.clientNs.Request[SmimeInfo]
  /** Insert (upload) the given S/MIME config for the specified send-as alias. Note that pkcs12 format is required for the key. */
  def insert(request: gapiDotClientDotGmailLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[SmimeInfo]
  /** Lists S/MIME configs for the specified send-as alias. */
  def list(request: gapiDotClientDotGmailLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[ListSmimeInfoResponse]
  /** Sets the default S/MIME config for the specified send-as alias. */
  def setDefault(request: gapiDotClientDotGmailLib.Anon_AltFieldsIdKey): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
}

