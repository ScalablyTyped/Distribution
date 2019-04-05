package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShapeBackgroundFill extends js.Object {
  var propertyState: js.UndefOr[java.lang.String] = js.undefined
  var solidFill: js.UndefOr[SolidFill] = js.undefined
}

object ShapeBackgroundFill {
  @scala.inline
  def apply(propertyState: java.lang.String = null, solidFill: SolidFill = null): ShapeBackgroundFill = {
    val __obj = js.Dynamic.literal()
    if (propertyState != null) __obj.updateDynamic("propertyState")(propertyState)
    if (solidFill != null) __obj.updateDynamic("solidFill")(solidFill)
    __obj.asInstanceOf[ShapeBackgroundFill]
  }
}

