package typings.dplayer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DPlayerContextMenuItem extends js.Object {
  var click: js.UndefOr[js.Function0[Unit]] = js.undefined
  var link: js.UndefOr[String] = js.undefined
  var text: String
}

object DPlayerContextMenuItem {
  @scala.inline
  def apply(text: String, click: () => Unit = null, link: String = null): DPlayerContextMenuItem = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction0(click))
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    __obj.asInstanceOf[DPlayerContextMenuItem]
  }
}

