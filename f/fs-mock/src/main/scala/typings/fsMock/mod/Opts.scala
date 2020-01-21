package typings.fsMock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Opts extends js.Object {
  var drives: js.UndefOr[js.Array[String]] = js.undefined
  var root: js.UndefOr[String] = js.undefined
  var windows: js.UndefOr[Boolean] = js.undefined
}

object Opts {
  @scala.inline
  def apply(drives: js.Array[String] = null, root: String = null, windows: js.UndefOr[Boolean] = js.undefined): Opts = {
    val __obj = js.Dynamic.literal()
    if (drives != null) __obj.updateDynamic("drives")(drives.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(windows)) __obj.updateDynamic("windows")(windows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Opts]
  }
}

