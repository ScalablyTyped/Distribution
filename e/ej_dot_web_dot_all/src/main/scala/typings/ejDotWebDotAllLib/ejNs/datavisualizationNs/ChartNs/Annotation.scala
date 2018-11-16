package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Annotation extends js.Object {
  /** Angle to rotate the annotation in degrees.
               * @Default {'0'}
               */
  var angle: js.UndefOr[scala.Double] = js.undefined
  /** Text content or id of a HTML element to be displayed as annotation.
               */
  var content: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies how annotations have to be placed in Chart.
               * @Default {none. See CoordinateUnit}
               */
  var coordinateUnit: js.UndefOr[CoordinateUnit | java.lang.String] = js.undefined
  /** Specifies the horizontal alignment of the annotation.
               * @Default {middle. See HorizontalAlignment}
               */
  var horizontalAlignment: js.UndefOr[HorizontalAlignment | java.lang.String] = js.undefined
  /** Options to customize the margin of annotation.
               */
  var margin: js.UndefOr[AnnotationsMargin] = js.undefined
  /** Controls the opacity of the annotation.
               * @Default {1}
               */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Specifies whether annotation has to be placed with respect to chart or series.
               * @Default {chart. See Region}
               */
  var region: js.UndefOr[Region | java.lang.String] = js.undefined
  /** Specifies the vertical alignment of the annotation.
               * @Default {middle. See VerticalAlignment}
               */
  var verticalAlignment: js.UndefOr[VerticalAlignment | java.lang.String] = js.undefined
  /** Controls the visibility of the annotation.
               * @Default {false}
               */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /** Represents the horizontal offset when coordinateUnit is pixels.when coordinateUnit is points, it represents the x-coordinate of axis bounded with xAxisName property or primary X
               * axis when xAxisName is not provided.This property is not applicable when coordinateUnit is none.
               * @Default {0}
               */
  var x: js.UndefOr[scala.Double] = js.undefined
  /** Name of the horizontal axis to be used for positioning the annotation. This property is applicable only when coordinateUnit is points.
               */
  var xAxisName: js.UndefOr[java.lang.String] = js.undefined
  /** Represents the vertical offset when coordinateUnit is pixels.When coordinateUnit is points, it represents the y-coordinate of axis bounded with yAxisName property or primary Y
               * axis when yAxisName is not provided.This property is not applicable when coordinateUnit is none.
               * @Default {0}
               */
  var y: js.UndefOr[scala.Double] = js.undefined
  /** Name of the vertical axis to be used for positioning the annotation.This property is applicable only when coordinateUnit is points.
               */
  var yAxisName: js.UndefOr[java.lang.String] = js.undefined
}

