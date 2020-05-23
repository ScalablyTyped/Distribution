package typings.figma.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VectorVertex extends js.Object {
  val cornerRadius: js.UndefOr[Double] = js.undefined
  val handleMirroring: js.UndefOr[HandleMirroring] = js.undefined
  val strokeCap: js.UndefOr[StrokeCap] = js.undefined
  val strokeJoin: js.UndefOr[StrokeJoin] = js.undefined
  val x: Double
  val y: Double
}

object VectorVertex {
  @scala.inline
  def apply(
    x: Double,
    y: Double,
    cornerRadius: js.UndefOr[Double] = js.undefined,
    handleMirroring: HandleMirroring = null,
    strokeCap: StrokeCap = null,
    strokeJoin: StrokeJoin = null
  ): VectorVertex = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (!js.isUndefined(cornerRadius)) __obj.updateDynamic("cornerRadius")(cornerRadius.get.asInstanceOf[js.Any])
    if (handleMirroring != null) __obj.updateDynamic("handleMirroring")(handleMirroring.asInstanceOf[js.Any])
    if (strokeCap != null) __obj.updateDynamic("strokeCap")(strokeCap.asInstanceOf[js.Any])
    if (strokeJoin != null) __obj.updateDynamic("strokeJoin")(strokeJoin.asInstanceOf[js.Any])
    __obj.asInstanceOf[VectorVertex]
  }
}

