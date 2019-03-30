package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PositionedObjectPositioning extends js.Object {
  var layout: js.UndefOr[java.lang.String] = js.undefined
  var leftOffset: js.UndefOr[Dimension] = js.undefined
  var topOffset: js.UndefOr[Dimension] = js.undefined
}

object PositionedObjectPositioning {
  @scala.inline
  def apply(layout: java.lang.String = null, leftOffset: Dimension = null, topOffset: Dimension = null): PositionedObjectPositioning = {
    val __obj = js.Dynamic.literal()
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (leftOffset != null) __obj.updateDynamic("leftOffset")(leftOffset)
    if (topOffset != null) __obj.updateDynamic("topOffset")(topOffset)
    __obj.asInstanceOf[PositionedObjectPositioning]
  }
}

