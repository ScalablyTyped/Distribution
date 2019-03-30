package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MasterProperties extends js.Object {
  var displayName: js.UndefOr[java.lang.String] = js.undefined
}

object MasterProperties {
  @scala.inline
  def apply(displayName: java.lang.String = null): MasterProperties = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    __obj.asInstanceOf[MasterProperties]
  }
}

