package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectorsSegment extends js.Object {
  /** Sets the direction of orthogonal segment
    */
  var direction: js.UndefOr[String] = js.undefined
  /** Describes the length of orthogonal segment
    * @Default {undefined}
    */
  var length: js.UndefOr[Double] = js.undefined
  /** Describes the end point of bezier/straight segment
    * @Default {Diagram.Point()}
    */
  var point: js.UndefOr[ConnectorsSourcePoint] = js.undefined
  /** Defines the first control point of the bezier segment
    * @Default {null}
    */
  var point1: js.UndefOr[ConnectorsSourcePoint] = js.undefined
  /** Defines the second control point of bezier segment
    * @Default {null}
    */
  var point2: js.UndefOr[ConnectorsSourcePoint] = js.undefined
  /** Sets the type of the segment.
    * @Default {ej.datavisualization.Diagram.Segments.Straight}
    */
  var `type`: js.UndefOr[Segments | String] = js.undefined
  /** Describes the length and angle between the first control point and the start point of bezier segment
    * @Default {null}
    */
  var vector1: js.UndefOr[js.Any] = js.undefined
  /** Describes the length and angle between the second control point and end point of bezier segment
    * @Default {null}
    */
  var vector2: js.UndefOr[js.Any] = js.undefined
}

object ConnectorsSegment {
  @scala.inline
  def apply(
    direction: String = null,
    length: Int | Double = null,
    point: ConnectorsSourcePoint = null,
    point1: ConnectorsSourcePoint = null,
    point2: ConnectorsSourcePoint = null,
    `type`: Segments | String = null,
    vector1: js.Any = null,
    vector2: js.Any = null
  ): ConnectorsSegment = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (point != null) __obj.updateDynamic("point")(point)
    if (point1 != null) __obj.updateDynamic("point1")(point1)
    if (point2 != null) __obj.updateDynamic("point2")(point2)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (vector1 != null) __obj.updateDynamic("vector1")(vector1)
    if (vector2 != null) __obj.updateDynamic("vector2")(vector2)
    __obj.asInstanceOf[ConnectorsSegment]
  }
}

