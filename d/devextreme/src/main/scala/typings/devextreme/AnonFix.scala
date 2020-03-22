package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFix extends js.Object {
  var fix: js.UndefOr[String] = js.undefined
  var leftPosition: js.UndefOr[String] = js.undefined
  var rightPosition: js.UndefOr[String] = js.undefined
  var unfix: js.UndefOr[String] = js.undefined
}

object AnonFix {
  @scala.inline
  def apply(
    fix: String = null,
    leftPosition: String = null,
    rightPosition: String = null,
    unfix: String = null
  ): AnonFix = {
    val __obj = js.Dynamic.literal()
    if (fix != null) __obj.updateDynamic("fix")(fix.asInstanceOf[js.Any])
    if (leftPosition != null) __obj.updateDynamic("leftPosition")(leftPosition.asInstanceOf[js.Any])
    if (rightPosition != null) __obj.updateDynamic("rightPosition")(rightPosition.asInstanceOf[js.Any])
    if (unfix != null) __obj.updateDynamic("unfix")(unfix.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFix]
  }
}

