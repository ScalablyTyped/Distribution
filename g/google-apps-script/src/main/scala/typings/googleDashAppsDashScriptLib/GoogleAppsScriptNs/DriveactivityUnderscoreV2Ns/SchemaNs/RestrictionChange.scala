package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveactivityUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestrictionChange extends js.Object {
  var feature: js.UndefOr[java.lang.String] = js.undefined
  var newRestriction: js.UndefOr[java.lang.String] = js.undefined
}

object RestrictionChange {
  @scala.inline
  def apply(feature: java.lang.String = null, newRestriction: java.lang.String = null): RestrictionChange = {
    val __obj = js.Dynamic.literal()
    if (feature != null) __obj.updateDynamic("feature")(feature)
    if (newRestriction != null) __obj.updateDynamic("newRestriction")(newRestriction)
    __obj.asInstanceOf[RestrictionChange]
  }
}

