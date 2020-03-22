package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dpi extends js.Object {
  /**
    * The horizontal dpi.
    */
  var horizontal: js.UndefOr[Double] = js.undefined
  /**
    * The vertical dpi.
    */
  var vertical: js.UndefOr[Double] = js.undefined
}

object Dpi {
  @scala.inline
  def apply(horizontal: Int | Double = null, vertical: Int | Double = null): Dpi = {
    val __obj = js.Dynamic.literal()
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (vertical != null) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dpi]
  }
}

