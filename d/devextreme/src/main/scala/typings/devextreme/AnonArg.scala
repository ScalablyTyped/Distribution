package typings.devextreme

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArg extends js.Object {
  var arg: js.UndefOr[Date | Double | String] = js.undefined
  var `val`: js.UndefOr[Date | Double | String] = js.undefined
}

object AnonArg {
  @scala.inline
  def apply(arg: Date | Double | String = null, `val`: Date | Double | String = null): AnonArg = {
    val __obj = js.Dynamic.literal()
    if (arg != null) __obj.updateDynamic("arg")(arg.asInstanceOf[js.Any])
    if (`val` != null) __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArg]
  }
}

