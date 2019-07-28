package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureRename extends js.Object {
  var newName: js.UndefOr[String] = js.undefined
}

object FeatureRename {
  @scala.inline
  def apply(newName: String = null): FeatureRename = {
    val __obj = js.Dynamic.literal()
    if (newName != null) __obj.updateDynamic("newName")(newName)
    __obj.asInstanceOf[FeatureRename]
  }
}

