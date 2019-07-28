package typings.ejDotWebDotAll.ejNs.datavisualizationNs.CircularGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesIndicator extends js.Object {
  /** Specify indicator height of circular gauge
    * @Default {15}
    */
  var height: js.UndefOr[Double] = js.undefined
  /** Specify imageUrl of circular gauge
    * @Default {null}
    */
  var imageUrl: js.UndefOr[String] = js.undefined
  /** Specify position of circular gauge
    * @Default {Object}
    */
  var position: js.UndefOr[ScalesIndicatorsPosition] = js.undefined
  /** Specify the various states of circular gauge
    * @Default {Array}
    */
  var stateRanges: js.UndefOr[js.Array[ScalesIndicatorsStateRange]] = js.undefined
  /** Specify indicator style of circular gauge. See
    * @Default {Circle}
    */
  var `type`: js.UndefOr[IndicatorTypes | String] = js.undefined
  /** Specify indicator width of circular gauge
    * @Default {15}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object ScalesIndicator {
  @scala.inline
  def apply(
    height: Int | Double = null,
    imageUrl: String = null,
    position: ScalesIndicatorsPosition = null,
    stateRanges: js.Array[ScalesIndicatorsStateRange] = null,
    `type`: IndicatorTypes | String = null,
    width: Int | Double = null
  ): ScalesIndicator = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl)
    if (position != null) __obj.updateDynamic("position")(position)
    if (stateRanges != null) __obj.updateDynamic("stateRanges")(stateRanges)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalesIndicator]
  }
}

