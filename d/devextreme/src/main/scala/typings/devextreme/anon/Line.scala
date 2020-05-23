package typings.devextreme.anon

import typings.devextreme.devextremeStrings.straight
import typings.devextreme.devextremeStrings.waved
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Line extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var line: js.UndefOr[straight | waved] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object Line {
  @scala.inline
  def apply(color: String = null, line: straight | waved = null, width: js.UndefOr[Double] = js.undefined): Line = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Line]
  }
}

