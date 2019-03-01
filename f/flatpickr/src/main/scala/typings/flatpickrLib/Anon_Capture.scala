package typings
package flatpickrLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Capture extends js.Object {
  var capture: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Capture {
  @scala.inline
  def apply(capture: js.UndefOr[scala.Boolean] = js.undefined): Anon_Capture = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(capture)) __obj.updateDynamic("capture")(capture)
    __obj.asInstanceOf[Anon_Capture]
  }
}

