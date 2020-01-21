package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectedItemsUserHandle extends js.Object {
  /** Defines the background color of the user handle
    * @Default {#2382c3}
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /** Sets the border color of the user handle
    * @Default {transparent}
    */
  var borderColor: js.UndefOr[String] = js.undefined
  /** Defines whether the user handle should be added, when more than one element is selected
    * @Default {false}
    */
  var enableMultiSelection: js.UndefOr[Boolean] = js.undefined
  /** Sets the horizontal alignment of the user handle
    * @Default {ej.datavisualization.Diagram.HorizontalAlignment.Center}
    */
  var horizontalAlignment: js.UndefOr[HorizontalAlignment | String] = js.undefined
  /** To set the margin of the user handle
    * @Default {ej.datavisualization.Diagram.Margin()}
    */
  var margin: js.UndefOr[js.Any] = js.undefined
  /** Defines the name of the user handle
    */
  var name: js.UndefOr[String] = js.undefined
  /** Sets the fraction/ratio(relative to node) that defines the position of the user handle
    * @Default {ej.datavisualization.Diagram.point(0.5, 1)}
    */
  var offset: js.UndefOr[js.Any] = js.undefined
  /** Sets the stroke color of the user handle
    * @Default {transparent}
    */
  var pathColor: js.UndefOr[String] = js.undefined
  /** Defines the custom shape of the user handle
    */
  var pathData: js.UndefOr[String] = js.undefined
  /** Defines the position of the user handle
    * @Default {ej.datavisualization.Diagram.UserHandlePositions.BottomCenter}
    */
  var position: js.UndefOr[UserHandlePositions | String] = js.undefined
  /** Defines the size of the user handle
    * @Default {8}
    */
  var size: js.UndefOr[Double] = js.undefined
  /** Defines the interactive behaviors of the user handle
    */
  var tool: js.UndefOr[js.Any] = js.undefined
  /** Sets the vertical alignment of the user handle
    * @Default {ej.datavisualization.Diagram.VerticalAlignment.Center}
    */
  var verticalAlignment: js.UndefOr[VerticalAlignment | String] = js.undefined
  /** Defines the visibility of the user handle
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object SelectedItemsUserHandle {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    borderColor: String = null,
    enableMultiSelection: js.UndefOr[Boolean] = js.undefined,
    horizontalAlignment: HorizontalAlignment | String = null,
    margin: js.Any = null,
    name: String = null,
    offset: js.Any = null,
    pathColor: String = null,
    pathData: String = null,
    position: UserHandlePositions | String = null,
    size: Int | Double = null,
    tool: js.Any = null,
    verticalAlignment: VerticalAlignment | String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): SelectedItemsUserHandle = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(enableMultiSelection)) __obj.updateDynamic("enableMultiSelection")(enableMultiSelection.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (pathColor != null) __obj.updateDynamic("pathColor")(pathColor.asInstanceOf[js.Any])
    if (pathData != null) __obj.updateDynamic("pathData")(pathData.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (tool != null) __obj.updateDynamic("tool")(tool.asInstanceOf[js.Any])
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectedItemsUserHandle]
  }
}

