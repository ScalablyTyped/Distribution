package typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectorsSourceDecorator extends js.Object {
  /** Sets the border color of the source decorator
    * @Default {black}
    */
  var borderColor: js.UndefOr[String] = js.undefined
  /** Sets the border width of the decorator
    * @Default {1}
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  /** This property allows you to customize sourceDecorator appearance using user-defined CSS.
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Sets the fill color of the source decorator
    * @Default {black}
    */
  var fillColor: js.UndefOr[String] = js.undefined
  /** Sets the height of the source decorator
    * @Default {8}
    */
  var height: js.UndefOr[Double] = js.undefined
  /** Defines the custom shape of the source decorator
    */
  var pathData: js.UndefOr[String] = js.undefined
  /** Defines the shape of the source decorator.
    * @Default {ej.datavisualization.Diagram.DecoratorShapes.Arrow}
    */
  var shape: js.UndefOr[DecoratorShapes | String] = js.undefined
  /** Defines the width of the source decorator
    * @Default {8}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object ConnectorsSourceDecorator {
  @scala.inline
  def apply(
    borderColor: String = null,
    borderWidth: Int | Double = null,
    cssClass: String = null,
    fillColor: String = null,
    height: Int | Double = null,
    pathData: String = null,
    shape: DecoratorShapes | String = null,
    width: Int | Double = null
  ): ConnectorsSourceDecorator = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (pathData != null) __obj.updateDynamic("pathData")(pathData)
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectorsSourceDecorator]
  }
}

