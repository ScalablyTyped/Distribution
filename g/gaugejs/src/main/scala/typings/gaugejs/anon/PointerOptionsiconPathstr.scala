package typings.gaugejs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined gaugejs.gaugejs.PointerOptions & {  iconPath ? :string,   iconScale ? :number,   iconAngle ? :number} */
trait PointerOptionsiconPathstr extends js.Object {
  var color: String
  var iconAngle: js.UndefOr[Double] = js.undefined
  var iconPath: js.UndefOr[String] = js.undefined
  var iconScale: js.UndefOr[Double] = js.undefined
  var length: Double
  var strokeWidth: Double
}

object PointerOptionsiconPathstr {
  @scala.inline
  def apply(
    color: String,
    length: Double,
    strokeWidth: Double,
    iconAngle: js.UndefOr[Double] = js.undefined,
    iconPath: String = null,
    iconScale: js.UndefOr[Double] = js.undefined
  ): PointerOptionsiconPathstr = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(iconAngle)) __obj.updateDynamic("iconAngle")(iconAngle.get.asInstanceOf[js.Any])
    if (iconPath != null) __obj.updateDynamic("iconPath")(iconPath.asInstanceOf[js.Any])
    if (!js.isUndefined(iconScale)) __obj.updateDynamic("iconScale")(iconScale.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerOptionsiconPathstr]
  }
}

