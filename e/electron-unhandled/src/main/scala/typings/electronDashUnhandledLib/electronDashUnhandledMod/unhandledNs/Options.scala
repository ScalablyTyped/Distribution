package typings
package electronDashUnhandledLib.electronDashUnhandledMod.unhandledNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var logger: js.UndefOr[js.Function1[/* err */ stdLib.Error, scala.Unit]] = js.undefined
  var showDialog: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    logger: /* err */ stdLib.Error => scala.Unit = null,
    showDialog: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (logger != null) __obj.updateDynamic("logger")(js.Any.fromFunction1(logger))
    if (!js.isUndefined(showDialog)) __obj.updateDynamic("showDialog")(showDialog)
    __obj.asInstanceOf[Options]
  }
}

