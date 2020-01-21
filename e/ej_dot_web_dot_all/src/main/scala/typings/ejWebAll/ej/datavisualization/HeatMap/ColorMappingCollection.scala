package typings.ejWebAll.ej.datavisualization.HeatMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorMappingCollection extends js.Object {
  /** Specifies the color of the heat map column data.
    * @Default {white}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Specifies the label properties of the heat map color.
    * @Default {null}
    */
  var label: js.UndefOr[ColorMappingCollectionLabel] = js.undefined
  /** Specifies the color values of the heat map column data.
    * @Default {0}
    */
  var value: js.UndefOr[Double] = js.undefined
}

object ColorMappingCollection {
  @scala.inline
  def apply(color: String = null, label: ColorMappingCollectionLabel = null, value: Int | Double = null): ColorMappingCollection = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorMappingCollection]
  }
}

