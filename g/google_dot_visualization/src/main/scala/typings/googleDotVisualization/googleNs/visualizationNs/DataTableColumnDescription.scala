package typings.googleDotVisualization.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataTableColumnDescription extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var p: js.UndefOr[js.Any] = js.undefined
  var pattern: js.UndefOr[String] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object DataTableColumnDescription {
  @scala.inline
  def apply(
    id: String = null,
    label: String = null,
    p: js.Any = null,
    pattern: String = null,
    role: String = null,
    `type`: String = null
  ): DataTableColumnDescription = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (label != null) __obj.updateDynamic("label")(label)
    if (p != null) __obj.updateDynamic("p")(p)
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    if (role != null) __obj.updateDynamic("role")(role)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DataTableColumnDescription]
  }
}

