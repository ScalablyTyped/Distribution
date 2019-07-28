package typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Annotation extends js.Object {
  /** Angle to rotate the annotation in degrees.
    * @Default {'0'}
    */
  var angle: js.UndefOr[Double] = js.undefined
  /** Text content or id of a HTML element to be displayed as annotation.
    */
  var content: js.UndefOr[String] = js.undefined
  /** Specifies how annotations have to be placed in Chart.
    * @Default {none. See CoordinateUnit}
    */
  var coordinateUnit: js.UndefOr[CoordinateUnit | String] = js.undefined
  /** Specifies the horizontal alignment of the annotation.
    * @Default {middle. See HorizontalAlignment}
    */
  var horizontalAlignment: js.UndefOr[HorizontalAlignment | String] = js.undefined
  /** Options to customize the margin of annotation.
    */
  var margin: js.UndefOr[AnnotationsMargin] = js.undefined
  /** Controls the opacity of the annotation.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Specifies whether annotation has to be placed with respect to chart or series.
    * @Default {chart. See Region}
    */
  var region: js.UndefOr[Region | String] = js.undefined
  /** Specifies the vertical alignment of the annotation.
    * @Default {middle. See VerticalAlignment}
    */
  var verticalAlignment: js.UndefOr[VerticalAlignment | String] = js.undefined
  /** Controls the visibility of the annotation.
    * @Default {false}
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** Represents the horizontal offset when coordinateUnit is pixels.when coordinateUnit is points, it represents the x-coordinate of axis bounded with xAxisName property or primary X
    * axis when xAxisName is not provided.This property is not applicable when coordinateUnit is none.
    * @Default {0}
    */
  var x: js.UndefOr[Double] = js.undefined
  /** Name of the horizontal axis to be used for positioning the annotation. This property is applicable only when coordinateUnit is points.
    */
  var xAxisName: js.UndefOr[String] = js.undefined
  /** Represents the vertical offset when coordinateUnit is pixels.When coordinateUnit is points, it represents the y-coordinate of axis bounded with yAxisName property or primary Y
    * axis when yAxisName is not provided.This property is not applicable when coordinateUnit is none.
    * @Default {0}
    */
  var y: js.UndefOr[Double] = js.undefined
  /** Name of the vertical axis to be used for positioning the annotation.This property is applicable only when coordinateUnit is points.
    */
  var yAxisName: js.UndefOr[String] = js.undefined
}

object Annotation {
  @scala.inline
  def apply(
    angle: Int | Double = null,
    content: String = null,
    coordinateUnit: CoordinateUnit | String = null,
    horizontalAlignment: HorizontalAlignment | String = null,
    margin: AnnotationsMargin = null,
    opacity: Int | Double = null,
    region: Region | String = null,
    verticalAlignment: VerticalAlignment | String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    x: Int | Double = null,
    xAxisName: String = null,
    y: Int | Double = null,
    yAxisName: String = null
  ): Annotation = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content)
    if (coordinateUnit != null) __obj.updateDynamic("coordinateUnit")(coordinateUnit.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (xAxisName != null) __obj.updateDynamic("xAxisName")(xAxisName)
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (yAxisName != null) __obj.updateDynamic("yAxisName")(yAxisName)
    __obj.asInstanceOf[Annotation]
  }
}

