package typings.devextreme.anon

import typings.devextreme.devextremeStrings.auto
import typings.devextreme.devextremeStrings.horizontal
import typings.devextreme.devextremeStrings.layered
import typings.devextreme.devextremeStrings.off
import typings.devextreme.devextremeStrings.tree
import typings.devextreme.devextremeStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Orientation extends js.Object {
  var orientation: js.UndefOr[auto | vertical | horizontal] = js.undefined
  var `type`: js.UndefOr[off | tree | layered] = js.undefined
}

object Orientation {
  @scala.inline
  def apply(orientation: auto | vertical | horizontal = null, `type`: off | tree | layered = null): Orientation = {
    val __obj = js.Dynamic.literal()
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Orientation]
  }
}

