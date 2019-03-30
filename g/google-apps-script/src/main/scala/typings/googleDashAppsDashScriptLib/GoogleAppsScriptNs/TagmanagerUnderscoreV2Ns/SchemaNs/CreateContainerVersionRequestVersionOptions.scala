package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagmanagerUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateContainerVersionRequestVersionOptions extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var notes: js.UndefOr[java.lang.String] = js.undefined
}

object CreateContainerVersionRequestVersionOptions {
  @scala.inline
  def apply(name: java.lang.String = null, notes: java.lang.String = null): CreateContainerVersionRequestVersionOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (notes != null) __obj.updateDynamic("notes")(notes)
    __obj.asInstanceOf[CreateContainerVersionRequestVersionOptions]
  }
}

