package typings.forgeApis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRange extends js.Object {
  var range: js.UndefOr[Double] = js.undefined
}

object AnonRange {
  @scala.inline
  def apply(range: Int | Double = null): AnonRange = {
    val __obj = js.Dynamic.literal()
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRange]
  }
}

