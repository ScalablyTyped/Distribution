package typings.estreeWalker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WalkerOptions extends js.Object {
  var enter: js.UndefOr[WalkerListener] = js.undefined
  var leave: js.UndefOr[WalkerListener] = js.undefined
}

object WalkerOptions {
  @scala.inline
  def apply(enter: WalkerListener = null, leave: WalkerListener = null): WalkerOptions = {
    val __obj = js.Dynamic.literal()
    if (enter != null) __obj.updateDynamic("enter")(enter.asInstanceOf[js.Any])
    if (leave != null) __obj.updateDynamic("leave")(leave.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalkerOptions]
  }
}

