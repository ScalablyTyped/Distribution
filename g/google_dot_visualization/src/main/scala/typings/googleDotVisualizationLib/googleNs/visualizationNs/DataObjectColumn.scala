package typings
package googleDotVisualizationLib.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataObjectColumn extends js.Object {
  var id: js.UndefOr[java.lang.String] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var p: js.UndefOr[js.Any] = js.undefined
  var pattern: js.UndefOr[java.lang.String] = js.undefined
  var `type`: java.lang.String
}

object DataObjectColumn {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    id: java.lang.String = null,
    label: java.lang.String = null,
    p: js.Any = null,
    pattern: java.lang.String = null
  ): DataObjectColumn = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (id != null) __obj.updateDynamic("id")(id)
    if (label != null) __obj.updateDynamic("label")(label)
    if (p != null) __obj.updateDynamic("p")(p)
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    __obj.asInstanceOf[DataObjectColumn]
  }
}

