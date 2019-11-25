package typings.googleDotVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupKeyOptions extends js.Object {
  var column: Double
  var id: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var modifier: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.undefined
  var `type`: String
}

object GroupKeyOptions {
  @scala.inline
  def apply(
    column: Double,
    `type`: String,
    id: String = null,
    label: String = null,
    modifier: /* value */ js.Any => _ = null
  ): GroupKeyOptions = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (modifier != null) __obj.updateDynamic("modifier")(js.Any.fromFunction1(modifier))
    __obj.asInstanceOf[GroupKeyOptions]
  }
}

