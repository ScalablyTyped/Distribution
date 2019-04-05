package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConferenceSolution extends js.Object {
  var iconUri: js.UndefOr[java.lang.String] = js.undefined
  var key: js.UndefOr[ConferenceSolutionKey] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object ConferenceSolution {
  @scala.inline
  def apply(iconUri: java.lang.String = null, key: ConferenceSolutionKey = null, name: java.lang.String = null): ConferenceSolution = {
    val __obj = js.Dynamic.literal()
    if (iconUri != null) __obj.updateDynamic("iconUri")(iconUri)
    if (key != null) __obj.updateDynamic("key")(key)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ConferenceSolution]
  }
}

