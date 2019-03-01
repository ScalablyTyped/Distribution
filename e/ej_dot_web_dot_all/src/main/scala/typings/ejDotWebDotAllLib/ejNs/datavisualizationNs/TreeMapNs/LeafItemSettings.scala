package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.TreeMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeafItemSettings extends js.Object {
  /** Specifies the border brush color of the leaf item.
    * @Default {white}
    */
  var borderBrush: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the border thickness of the leaf item.
    * @Default {1}
    */
  var borderThickness: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the space between the leaf items.
    * @Default {0}
    */
  var gap: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the label template of the leaf item.
    * @Default {null}
    */
  var itemTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the label path of the leaf item.
    * @Default {null}
    */
  var labelPath: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the position of the leaf labels.
    * @Default {center}
    */
  var labelPosition: js.UndefOr[Position | java.lang.String] = js.undefined
  /** Specifies the mode of label visibility
    * @Default {visible}
    */
  var labelVisibilityMode: js.UndefOr[VisibilityMode | java.lang.String] = js.undefined
  /** Shows or hides the label of the leaf item.
    * @Default {false}
    */
  var showLabels: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the overflow options for leaf labels.
    * @Default {none}
    */
  var textOverflow: js.UndefOr[TextOverflow | java.lang.String] = js.undefined
}

object LeafItemSettings {
  @scala.inline
  def apply(
    borderBrush: java.lang.String = null,
    borderThickness: scala.Int | scala.Double = null,
    gap: scala.Int | scala.Double = null,
    itemTemplate: java.lang.String = null,
    labelPath: java.lang.String = null,
    labelPosition: Position | java.lang.String = null,
    labelVisibilityMode: VisibilityMode | java.lang.String = null,
    showLabels: js.UndefOr[scala.Boolean] = js.undefined,
    textOverflow: TextOverflow | java.lang.String = null
  ): LeafItemSettings = {
    val __obj = js.Dynamic.literal()
    if (borderBrush != null) __obj.updateDynamic("borderBrush")(borderBrush)
    if (borderThickness != null) __obj.updateDynamic("borderThickness")(borderThickness.asInstanceOf[js.Any])
    if (gap != null) __obj.updateDynamic("gap")(gap.asInstanceOf[js.Any])
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(itemTemplate)
    if (labelPath != null) __obj.updateDynamic("labelPath")(labelPath)
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (labelVisibilityMode != null) __obj.updateDynamic("labelVisibilityMode")(labelVisibilityMode.asInstanceOf[js.Any])
    if (!js.isUndefined(showLabels)) __obj.updateDynamic("showLabels")(showLabels)
    if (textOverflow != null) __obj.updateDynamic("textOverflow")(textOverflow.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeafItemSettings]
  }
}

