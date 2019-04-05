package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableRowProperties extends js.Object {
  var minRowHeight: js.UndefOr[Dimension] = js.undefined
}

object TableRowProperties {
  @scala.inline
  def apply(minRowHeight: Dimension = null): TableRowProperties = {
    val __obj = js.Dynamic.literal()
    if (minRowHeight != null) __obj.updateDynamic("minRowHeight")(minRowHeight)
    __obj.asInstanceOf[TableRowProperties]
  }
}

