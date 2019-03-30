package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UniversalAdId extends js.Object {
  var registry: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object UniversalAdId {
  @scala.inline
  def apply(registry: java.lang.String = null, value: java.lang.String = null): UniversalAdId = {
    val __obj = js.Dynamic.literal()
    if (registry != null) __obj.updateDynamic("registry")(registry)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[UniversalAdId]
  }
}

