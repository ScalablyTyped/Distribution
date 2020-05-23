package typings.ejWebAll.ej.datavisualization.DigitalGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemsCharacterSettings extends js.Object {
  /** Specifies the CharacterCount value for the DigitalGauge.
    * @Default {4}
    */
  var count: js.UndefOr[Double] = js.undefined
  /** Specifies the opacity value for the DigitalGauge.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Specifies the value for spacing between the characters
    * @Default {2}
    */
  var spacing: js.UndefOr[Double] = js.undefined
  /** Specifies the character type for the text to be displayed.
    * @Default {ej.datavisualization.DigitalGauge.CharacterType.EightCrossEightDotMatrix}
    */
  var `type`: js.UndefOr[CharacterType | String] = js.undefined
}

object ItemsCharacterSettings {
  @scala.inline
  def apply(
    count: js.UndefOr[Double] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
    spacing: js.UndefOr[Double] = js.undefined,
    `type`: CharacterType | String = null
  ): ItemsCharacterSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spacing)) __obj.updateDynamic("spacing")(spacing.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsCharacterSettings]
  }
}

