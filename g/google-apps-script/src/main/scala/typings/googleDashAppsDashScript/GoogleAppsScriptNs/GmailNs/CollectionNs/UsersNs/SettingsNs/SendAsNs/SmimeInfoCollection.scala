package typings.googleDashAppsDashScript.GoogleAppsScriptNs.GmailNs.CollectionNs.UsersNs.SettingsNs.SendAsNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.GmailNs.SchemaNs.ListSmimeInfoResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.GmailNs.SchemaNs.SmimeInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmimeInfoCollection extends js.Object {
  // Gets the specified S/MIME config for the specified send-as alias.
  def get(userId: String, sendAsEmail: String, id: String): SmimeInfo
  // Insert (upload) the given S/MIME config for the specified send-as alias. Note that pkcs12 format is required for the key.
  def insert(resource: SmimeInfo, userId: String, sendAsEmail: String): SmimeInfo
  // Lists S/MIME configs for the specified send-as alias.
  def list(userId: String, sendAsEmail: String): ListSmimeInfoResponse
  // Deletes the specified S/MIME config for the specified send-as alias.
  def remove(userId: String, sendAsEmail: String, id: String): Unit
  // Sets the default S/MIME config for the specified send-as alias.
  def setDefault(userId: String, sendAsEmail: String, id: String): Unit
}

object SmimeInfoCollection {
  @scala.inline
  def apply(
    get: (String, String, String) => SmimeInfo,
    insert: (SmimeInfo, String, String) => SmimeInfo,
    list: (String, String) => ListSmimeInfoResponse,
    remove: (String, String, String) => Unit,
    setDefault: (String, String, String) => Unit
  ): SmimeInfoCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction3(get), insert = js.Any.fromFunction3(insert), list = js.Any.fromFunction2(list), remove = js.Any.fromFunction3(remove), setDefault = js.Any.fromFunction3(setDefault))
  
    __obj.asInstanceOf[SmimeInfoCollection]
  }
}

