package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultClickThroughEventTagProperties extends js.Object {
  var defaultClickThroughEventTagId: js.UndefOr[java.lang.String] = js.undefined
  var overrideInheritedEventTag: js.UndefOr[scala.Boolean] = js.undefined
}

object DefaultClickThroughEventTagProperties {
  @scala.inline
  def apply(
    defaultClickThroughEventTagId: java.lang.String = null,
    overrideInheritedEventTag: js.UndefOr[scala.Boolean] = js.undefined
  ): DefaultClickThroughEventTagProperties = {
    val __obj = js.Dynamic.literal()
    if (defaultClickThroughEventTagId != null) __obj.updateDynamic("defaultClickThroughEventTagId")(defaultClickThroughEventTagId)
    if (!js.isUndefined(overrideInheritedEventTag)) __obj.updateDynamic("overrideInheritedEventTag")(overrideInheritedEventTag)
    __obj.asInstanceOf[DefaultClickThroughEventTagProperties]
  }
}

