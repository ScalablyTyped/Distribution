package typings.easyXHeaders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFlag extends js.Object {
  var encoding: String
  var flag: js.UndefOr[String] = js.undefined
}

object AnonFlag {
  @scala.inline
  def apply(encoding: String, flag: String = null): AnonFlag = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    if (flag != null) __obj.updateDynamic("flag")(flag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFlag]
  }
}

