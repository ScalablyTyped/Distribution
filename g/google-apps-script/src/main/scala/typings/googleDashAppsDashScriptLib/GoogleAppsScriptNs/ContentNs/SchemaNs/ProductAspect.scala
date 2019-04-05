package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductAspect extends js.Object {
  var aspectName: js.UndefOr[java.lang.String] = js.undefined
  var destinationName: js.UndefOr[java.lang.String] = js.undefined
  var intention: js.UndefOr[java.lang.String] = js.undefined
}

object ProductAspect {
  @scala.inline
  def apply(
    aspectName: java.lang.String = null,
    destinationName: java.lang.String = null,
    intention: java.lang.String = null
  ): ProductAspect = {
    val __obj = js.Dynamic.literal()
    if (aspectName != null) __obj.updateDynamic("aspectName")(aspectName)
    if (destinationName != null) __obj.updateDynamic("destinationName")(destinationName)
    if (intention != null) __obj.updateDynamic("intention")(intention)
    __obj.asInstanceOf[ProductAspect]
  }
}

