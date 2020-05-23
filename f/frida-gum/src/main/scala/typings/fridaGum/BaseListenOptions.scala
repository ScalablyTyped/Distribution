package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseListenOptions extends js.Object {
  /**
    * Listen backlog. Defaults to 10.
    */
  var backlog: js.UndefOr[Double] = js.undefined
}

object BaseListenOptions {
  @scala.inline
  def apply(backlog: js.UndefOr[Double] = js.undefined): BaseListenOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(backlog)) __obj.updateDynamic("backlog")(backlog.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseListenOptions]
  }
}

