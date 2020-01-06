package typings.figma.figmaMod._Global_

import typings.figma.figmaStrings.SOLID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SolidPaint extends Paint {
  val blendMode: js.UndefOr[BlendMode] = js.undefined
  val color: RGB
  val opacity: js.UndefOr[Double] = js.undefined
  val `type`: SOLID
  val visible: js.UndefOr[Boolean] = js.undefined
}

object SolidPaint {
  @scala.inline
  def apply(
    color: RGB,
    `type`: SOLID,
    blendMode: BlendMode = null,
    opacity: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): SolidPaint = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (blendMode != null) __obj.updateDynamic("blendMode")(blendMode.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[SolidPaint]
  }
}

