package typings.googleDotVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataObjectColumn extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var p: js.UndefOr[js.Any] = js.undefined
  var pattern: js.UndefOr[String] = js.undefined
  var `type`: String
}

object DataObjectColumn {
  @scala.inline
  def apply(`type`: String, id: String = null, label: String = null, p: js.Any = null, pattern: String = null): DataObjectColumn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (id != null) __obj.updateDynamic("id")(id)
    if (label != null) __obj.updateDynamic("label")(label)
    if (p != null) __obj.updateDynamic("p")(p)
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    __obj.asInstanceOf[DataObjectColumn]
  }
}

