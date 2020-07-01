package typings.giustoInkRouter.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandLineRouterProps extends js.Object {
  var args: js.UndefOr[js.Array[String]] = js.undefined
  var initialEntries: js.UndefOr[js.Array[String]] = js.undefined
  var initialIndex: js.UndefOr[Double] = js.undefined
  var options: js.UndefOr[Record[String, _]] = js.undefined
}

object CommandLineRouterProps {
  @scala.inline
  def apply(
    args: js.Array[String] = null,
    initialEntries: js.Array[String] = null,
    initialIndex: js.UndefOr[Double] = js.undefined,
    options: Record[String, _] = null
  ): CommandLineRouterProps = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (initialEntries != null) __obj.updateDynamic("initialEntries")(initialEntries.asInstanceOf[js.Any])
    if (!js.isUndefined(initialIndex)) __obj.updateDynamic("initialIndex")(initialIndex.get.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandLineRouterProps]
  }
}

