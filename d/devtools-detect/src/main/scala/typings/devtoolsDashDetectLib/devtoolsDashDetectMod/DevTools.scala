package typings
package devtoolsDashDetectLib.devtoolsDashDetectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevTools extends js.Object {
  /**
  		Whether DevTools is open.
  		*/
  val isOpen: scala.Boolean
  /**
  		Orientation of the DevTools if it's open.
  		*/
  val orientation: js.UndefOr[Orientation] = js.undefined
}

object DevTools {
  @scala.inline
  def apply(isOpen: scala.Boolean, orientation: Orientation = null): DevTools = {
    val __obj = js.Dynamic.literal(isOpen = isOpen)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    __obj.asInstanceOf[DevTools]
  }
}

