package typings.devtoolsDetect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevTools extends js.Object {
  /**
  		Whether DevTools is open.
  		*/
  val isOpen: Boolean
  /**
  		Orientation of the DevTools if it's open.
  		*/
  val orientation: js.UndefOr[Orientation] = js.undefined
}

object DevTools {
  @scala.inline
  def apply(isOpen: Boolean, orientation: Orientation = null): DevTools = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevTools]
  }
}

