package typings
package dplayerLib.dplayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DPlayerContextMenuItem extends js.Object {
  var click: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var link: js.UndefOr[java.lang.String] = js.undefined
  var text: java.lang.String
}

object DPlayerContextMenuItem {
  @scala.inline
  def apply(text: java.lang.String, click: js.Function0[scala.Unit] = null, link: java.lang.String = null): DPlayerContextMenuItem = {
    val __obj = js.Dynamic.literal(text = text)
    if (click != null) __obj.updateDynamic("click")(click)
    if (link != null) __obj.updateDynamic("link")(link)
    __obj.asInstanceOf[DPlayerContextMenuItem]
  }
}

