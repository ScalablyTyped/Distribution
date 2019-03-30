package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Outline extends js.Object {
  var dashStyle: js.UndefOr[java.lang.String] = js.undefined
  var outlineFill: js.UndefOr[OutlineFill] = js.undefined
  var propertyState: js.UndefOr[java.lang.String] = js.undefined
  var weight: js.UndefOr[Dimension] = js.undefined
}

object Outline {
  @scala.inline
  def apply(
    dashStyle: java.lang.String = null,
    outlineFill: OutlineFill = null,
    propertyState: java.lang.String = null,
    weight: Dimension = null
  ): Outline = {
    val __obj = js.Dynamic.literal()
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle)
    if (outlineFill != null) __obj.updateDynamic("outlineFill")(outlineFill)
    if (propertyState != null) __obj.updateDynamic("propertyState")(propertyState)
    if (weight != null) __obj.updateDynamic("weight")(weight)
    __obj.asInstanceOf[Outline]
  }
}

