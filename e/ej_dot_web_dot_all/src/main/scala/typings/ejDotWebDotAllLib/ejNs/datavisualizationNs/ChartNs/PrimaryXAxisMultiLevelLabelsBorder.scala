package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrimaryXAxisMultiLevelLabelsBorder extends js.Object {
  /** Border color of the multi level labels.
    * @Default {null}
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Border type of the multi level labels.
    * @Default {rectangle. See Type}
    */
  var `type`: js.UndefOr[MultiLevelLabelsBorderType | java.lang.String] = js.undefined
  /** Border width of the multi level labels.
    * @Default {1}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object PrimaryXAxisMultiLevelLabelsBorder {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    `type`: MultiLevelLabelsBorderType | java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): PrimaryXAxisMultiLevelLabelsBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryXAxisMultiLevelLabelsBorder]
  }
}

