package typings
package googleDotVisualizationLib.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorEventObject extends js.Object {
  var detailedMessage: js.UndefOr[java.lang.String] = js.undefined
  var id: java.lang.String
  var message: java.lang.String
  var options: js.UndefOr[js.Any] = js.undefined
}

object ErrorEventObject {
  @scala.inline
  def apply(
    id: java.lang.String,
    message: java.lang.String,
    detailedMessage: java.lang.String = null,
    options: js.Any = null
  ): ErrorEventObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("message")(message)
    if (detailedMessage != null) __obj.updateDynamic("detailedMessage")(detailedMessage)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[ErrorEventObject]
  }
}

