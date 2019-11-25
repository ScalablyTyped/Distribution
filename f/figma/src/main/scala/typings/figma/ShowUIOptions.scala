package typings.figma

import typings.figma.figmaStrings.auto_
import typings.figma.figmaStrings.default
import typings.figma.figmaStrings.last
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShowUIOptions extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var position: js.UndefOr[default | last | auto_] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object ShowUIOptions {
  @scala.inline
  def apply(
    height: Int | Double = null,
    position: default | last | auto_ = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): ShowUIOptions = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowUIOptions]
  }
}

