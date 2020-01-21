package typings.gapiClientDiscovery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonX16 extends js.Object {
  /** The URL of the 16x16 icon. */
  var x16: js.UndefOr[String] = js.undefined
  /** The URL of the 32x32 icon. */
  var x32: js.UndefOr[String] = js.undefined
}

object AnonX16 {
  @scala.inline
  def apply(x16: String = null, x32: String = null): AnonX16 = {
    val __obj = js.Dynamic.literal()
    if (x16 != null) __obj.updateDynamic("x16")(x16.asInstanceOf[js.Any])
    if (x32 != null) __obj.updateDynamic("x32")(x32.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonX16]
  }
}

