package typings.devextreme.anon

import typings.devextreme.devextremeStrings.horizontal
import typings.devextreme.devextremeStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0` extends js.Object {
  var orientation: js.UndefOr[horizontal | vertical] = js.undefined
}

object `0` {
  @scala.inline
  def apply(orientation: horizontal | vertical = null): `0` = {
    val __obj = js.Dynamic.literal()
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
}

