package typings.easyXHeaders.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlagString extends js.Object {
  var flag: js.UndefOr[String] = js.undefined
}

object FlagString {
  @scala.inline
  def apply(flag: String = null): FlagString = {
    val __obj = js.Dynamic.literal()
    if (flag != null) __obj.updateDynamic("flag")(flag.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlagString]
  }
}

