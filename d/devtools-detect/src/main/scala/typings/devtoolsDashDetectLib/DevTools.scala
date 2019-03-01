package typings
package devtoolsDashDetectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevTools extends js.Object {
  var open: scala.Boolean
  var orientation: devtoolsDashDetectLib.devtoolsDashDetectLibStrings.vertical | devtoolsDashDetectLib.devtoolsDashDetectLibStrings.horizontal
}

object DevTools {
  @scala.inline
  def apply(
    open: scala.Boolean,
    orientation: devtoolsDashDetectLib.devtoolsDashDetectLibStrings.vertical | devtoolsDashDetectLib.devtoolsDashDetectLibStrings.horizontal
  ): DevTools = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("open")(open)
    __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevTools]
  }
}

