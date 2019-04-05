package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.CollectionNs.UsersNs.SettingsNs.SendAsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmimeInfoCollection extends js.Object {
  // Gets the specified S/MIME config for the specified send-as alias.
  def get(userId: java.lang.String, sendAsEmail: java.lang.String, id: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.SmimeInfo
  // Insert (upload) the given S/MIME config for the specified send-as alias. Note that pkcs12 format is required for the key.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.SmimeInfo,
    userId: java.lang.String,
    sendAsEmail: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.SmimeInfo
  // Lists S/MIME configs for the specified send-as alias.
  def list(userId: java.lang.String, sendAsEmail: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.ListSmimeInfoResponse
  // Deletes the specified S/MIME config for the specified send-as alias.
  def remove(userId: java.lang.String, sendAsEmail: java.lang.String, id: java.lang.String): scala.Unit
  // Sets the default S/MIME config for the specified send-as alias.
  def setDefault(userId: java.lang.String, sendAsEmail: java.lang.String, id: java.lang.String): scala.Unit
}

object SmimeInfoCollection {
  @scala.inline
  def apply(
    get: (java.lang.String, java.lang.String, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.SmimeInfo,
    insert: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.SmimeInfo, java.lang.String, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.SmimeInfo,
    list: (java.lang.String, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.ListSmimeInfoResponse,
    remove: (java.lang.String, java.lang.String, java.lang.String) => scala.Unit,
    setDefault: (java.lang.String, java.lang.String, java.lang.String) => scala.Unit
  ): SmimeInfoCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction3(get), insert = js.Any.fromFunction3(insert), list = js.Any.fromFunction2(list), remove = js.Any.fromFunction3(remove), setDefault = js.Any.fromFunction3(setDefault))
  
    __obj.asInstanceOf[SmimeInfoCollection]
  }
}

