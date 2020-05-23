package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectorsTargetDecorator extends js.Object {
  /** Sets the border color of the decorator
    * @Default {black}
    */
  var borderColor: js.UndefOr[String] = js.undefined
  /** This property allows you to customize targetDecorator appearance using user-defined CSS.
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Sets the color with which the decorator will be filled
    * @Default {black}
    */
  var fillColor: js.UndefOr[String] = js.undefined
  /** Defines the height of the target decorator
    * @Default {8}
    */
  var height: js.UndefOr[Double] = js.undefined
  /** Defines the custom shape of the target decorator
    */
  var pathData: js.UndefOr[String] = js.undefined
  /** Defines the shape of the target decorator.
    * @Default {ej.datavisualization.Diagram.DecoratorShapes.Arrow}
    */
  var shape: js.UndefOr[DecoratorShapes | String] = js.undefined
  /** Defines the width of the target decorator
    * @Default {8}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object ConnectorsTargetDecorator {
  @scala.inline
  def apply(
    borderColor: String = null,
    cssClass: String = null,
    fillColor: String = null,
    height: js.UndefOr[Double] = js.undefined,
    pathData: String = null,
    shape: DecoratorShapes | String = null,
    width: js.UndefOr[Double] = js.undefined
  ): ConnectorsTargetDecorator = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (pathData != null) __obj.updateDynamic("pathData")(pathData.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectorsTargetDecorator]
  }
}

