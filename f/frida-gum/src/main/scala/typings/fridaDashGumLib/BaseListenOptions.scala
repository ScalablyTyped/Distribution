package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseListenOptions extends js.Object {
  /**
    * Listen backlog. Defaults to 10.
    */
  var backlog: js.UndefOr[scala.Double] = js.undefined
}

object BaseListenOptions {
  @scala.inline
  def apply(backlog: scala.Int | scala.Double = null): BaseListenOptions = {
    val __obj = js.Dynamic.literal()
    if (backlog != null) __obj.updateDynamic("backlog")(backlog.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseListenOptions]
  }
}

