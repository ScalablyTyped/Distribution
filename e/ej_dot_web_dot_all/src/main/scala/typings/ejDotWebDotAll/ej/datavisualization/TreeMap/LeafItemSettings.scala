package typings.ejDotWebDotAll.ej.datavisualization.TreeMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeafItemSettings extends js.Object {
  /** Specifies the border brush color of the leaf item.
    * @Default {white}
    */
  var borderBrush: js.UndefOr[String] = js.undefined
  /** Specifies the border thickness of the leaf item.
    * @Default {1}
    */
  var borderThickness: js.UndefOr[Double] = js.undefined
  /** Specifies the space between the leaf items.
    * @Default {0}
    */
  var gap: js.UndefOr[Double] = js.undefined
  /** Specifies the label template of the leaf item.
    * @Default {null}
    */
  var itemTemplate: js.UndefOr[String] = js.undefined
  /** Specifies the label path of the leaf item.
    * @Default {null}
    */
  var labelPath: js.UndefOr[String] = js.undefined
  /** Specifies the position of the leaf labels.
    * @Default {center}
    */
  var labelPosition: js.UndefOr[Position | String] = js.undefined
  /** Specifies the mode of label visibility
    * @Default {visible}
    */
  var labelVisibilityMode: js.UndefOr[VisibilityMode | String] = js.undefined
  /** Shows or hides the label of the leaf item.
    * @Default {false}
    */
  var showLabels: js.UndefOr[Boolean] = js.undefined
  /** Specifies the overflow options for leaf labels.
    * @Default {none}
    */
  var textOverflow: js.UndefOr[TextOverflow | String] = js.undefined
}

object LeafItemSettings {
  @scala.inline
  def apply(
    borderBrush: String = null,
    borderThickness: Int | Double = null,
    gap: Int | Double = null,
    itemTemplate: String = null,
    labelPath: String = null,
    labelPosition: Position | String = null,
    labelVisibilityMode: VisibilityMode | String = null,
    showLabels: js.UndefOr[Boolean] = js.undefined,
    textOverflow: TextOverflow | String = null
  ): LeafItemSettings = {
    val __obj = js.Dynamic.literal()
    if (borderBrush != null) __obj.updateDynamic("borderBrush")(borderBrush.asInstanceOf[js.Any])
    if (borderThickness != null) __obj.updateDynamic("borderThickness")(borderThickness.asInstanceOf[js.Any])
    if (gap != null) __obj.updateDynamic("gap")(gap.asInstanceOf[js.Any])
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(itemTemplate.asInstanceOf[js.Any])
    if (labelPath != null) __obj.updateDynamic("labelPath")(labelPath.asInstanceOf[js.Any])
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (labelVisibilityMode != null) __obj.updateDynamic("labelVisibilityMode")(labelVisibilityMode.asInstanceOf[js.Any])
    if (!js.isUndefined(showLabels)) __obj.updateDynamic("showLabels")(showLabels.asInstanceOf[js.Any])
    if (textOverflow != null) __obj.updateDynamic("textOverflow")(textOverflow.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeafItemSettings]
  }
}

