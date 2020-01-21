package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNames extends js.Object {
  var names: js.UndefOr[js.Array[String]] = js.native
}

object AnonNames {
  @scala.inline
  def apply(names: js.Array[String] = null): AnonNames = {
    val __obj = js.Dynamic.literal()
    if (names != null) __obj.updateDynamic("names")(names.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNames]
  }
}

