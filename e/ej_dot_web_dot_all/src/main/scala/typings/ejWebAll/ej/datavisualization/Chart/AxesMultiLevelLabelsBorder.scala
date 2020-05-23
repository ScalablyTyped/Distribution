package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxesMultiLevelLabelsBorder extends js.Object {
  /** Border color of the multi level labels.
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Border type of the multi level labels.
    * @Default {rectangle. See Type}
    */
  var `type`: js.UndefOr[MultiLevelLabelsBorderType | String] = js.undefined
  /** Border width of the multi level labels.
    * @Default {1}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object AxesMultiLevelLabelsBorder {
  @scala.inline
  def apply(
    color: String = null,
    `type`: MultiLevelLabelsBorderType | String = null,
    width: js.UndefOr[Double] = js.undefined
  ): AxesMultiLevelLabelsBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxesMultiLevelLabelsBorder]
  }
}

