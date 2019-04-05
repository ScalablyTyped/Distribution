package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingsCollection extends js.Object {
  // Gets a single setting by ID.
  def get(id: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.Setting
}

object SettingsCollection {
  @scala.inline
  def apply(get: java.lang.String => googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.Setting): SettingsCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[SettingsCollection]
  }
}

