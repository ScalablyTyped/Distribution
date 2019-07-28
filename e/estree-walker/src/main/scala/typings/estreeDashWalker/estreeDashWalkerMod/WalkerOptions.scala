package typings.estreeDashWalker.estreeDashWalkerMod

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
    if (enter != null) __obj.updateDynamic("enter")(enter)
    if (leave != null) __obj.updateDynamic("leave")(leave)
    __obj.asInstanceOf[WalkerOptions]
  }
}

