package typings.frappeGantt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Task extends js.Object {
  var custom_class: js.UndefOr[String] = js.undefined
  var dependencies: String
  var end: String
  var id: String
  var name: String
  var progress: Double
  var start: String
}

object Task {
  @scala.inline
  def apply(
    dependencies: String,
    end: String,
    id: String,
    name: String,
    progress: Double,
    start: String,
    custom_class: String = null
  ): Task = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    if (custom_class != null) __obj.updateDynamic("custom_class")(custom_class.asInstanceOf[js.Any])
    __obj.asInstanceOf[Task]
  }
}

