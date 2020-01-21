package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonArgs extends js.Object {
  var args: js.UndefOr[js.Array[AnonTypeValue]] = js.native
  var format: js.UndefOr[String] = js.native
}

object AnonArgs {
  @scala.inline
  def apply(args: js.Array[AnonTypeValue] = null, format: String = null): AnonArgs = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArgs]
  }
}

