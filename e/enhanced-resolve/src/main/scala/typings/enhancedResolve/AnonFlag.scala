package typings.enhancedResolve

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFlag extends js.Object {
  var flag: js.UndefOr[String] = js.undefined
}

object AnonFlag {
  @scala.inline
  def apply(flag: String = null): AnonFlag = {
    val __obj = js.Dynamic.literal()
    if (flag != null) __obj.updateDynamic("flag")(flag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFlag]
  }
}

