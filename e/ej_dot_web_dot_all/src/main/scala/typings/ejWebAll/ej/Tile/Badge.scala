package typings.ejWebAll.ej.Tile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Badge extends js.Object {
  /** Specifies whether to enable badge or not.
    * @Default {false}
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** Specifies maximum value for tile badge.
    * @Default {100}
    */
  var maxValue: js.UndefOr[Double] = js.undefined
  /** Specifies minimum value for tile badge.
    * @Default {1}
    */
  var minValue: js.UndefOr[Double] = js.undefined
  /** Sets position for tile badge.
    * @Default {â€œbottomrightâ€}
    */
  var position: js.UndefOr[BadgePosition | String] = js.undefined
  /** Specifies text instead of number for tile badge.
    * @Default {null}
    */
  var text: js.UndefOr[String] = js.undefined
  /** Sets value for tile badge.
    * @Default {1}
    */
  var value: js.UndefOr[Double] = js.undefined
}

object Badge {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    maxValue: js.UndefOr[Double] = js.undefined,
    minValue: js.UndefOr[Double] = js.undefined,
    position: BadgePosition | String = null,
    text: String = null,
    value: js.UndefOr[Double] = js.undefined
  ): Badge = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxValue)) __obj.updateDynamic("maxValue")(maxValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minValue)) __obj.updateDynamic("minValue")(minValue.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Badge]
  }
}

