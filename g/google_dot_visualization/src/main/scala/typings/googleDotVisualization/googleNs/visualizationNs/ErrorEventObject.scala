package typings.googleDotVisualization.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorEventObject extends js.Object {
  var detailedMessage: js.UndefOr[String] = js.undefined
  var id: String
  var message: String
  var options: js.UndefOr[js.Any] = js.undefined
}

object ErrorEventObject {
  @scala.inline
  def apply(id: String, message: String, detailedMessage: String = null, options: js.Any = null): ErrorEventObject = {
    val __obj = js.Dynamic.literal(id = id, message = message)
    if (detailedMessage != null) __obj.updateDynamic("detailedMessage")(detailedMessage)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[ErrorEventObject]
  }
}

