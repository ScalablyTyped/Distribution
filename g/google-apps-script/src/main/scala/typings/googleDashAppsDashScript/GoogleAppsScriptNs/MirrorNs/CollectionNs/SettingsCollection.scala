package typings.googleDashAppsDashScript.GoogleAppsScriptNs.MirrorNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.MirrorNs.SchemaNs.Setting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingsCollection extends js.Object {
  // Gets a single setting by ID.
  def get(id: String): Setting
}

object SettingsCollection {
  @scala.inline
  def apply(get: String => Setting): SettingsCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[SettingsCollection]
  }
}

