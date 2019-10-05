package typings.ejDotWebDotAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrimaryXAxisMultiLevelLabelsBorder extends js.Object {
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

object PrimaryXAxisMultiLevelLabelsBorder {
  @scala.inline
  def apply(
    color: String = null,
    `type`: MultiLevelLabelsBorderType | String = null,
    width: Int | Double = null
  ): PrimaryXAxisMultiLevelLabelsBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryXAxisMultiLevelLabelsBorder]
  }
}

