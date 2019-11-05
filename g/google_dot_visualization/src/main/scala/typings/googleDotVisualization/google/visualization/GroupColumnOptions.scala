package typings.googleDotVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupColumnOptions extends js.Object {
  var column: Double
  var id: js.UndefOr[js.Any] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var `type`: String
  def aggregation(values: js.Array[_]): js.Any
}

object GroupColumnOptions {
  @scala.inline
  def apply(
    aggregation: js.Array[_] => js.Any,
    column: Double,
    `type`: String,
    id: js.Any = null,
    label: String = null
  ): GroupColumnOptions = {
    val __obj = js.Dynamic.literal(aggregation = js.Any.fromFunction1(aggregation), column = column)
    __obj.updateDynamic("type")(`type`)
    if (id != null) __obj.updateDynamic("id")(id)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[GroupColumnOptions]
  }
}

