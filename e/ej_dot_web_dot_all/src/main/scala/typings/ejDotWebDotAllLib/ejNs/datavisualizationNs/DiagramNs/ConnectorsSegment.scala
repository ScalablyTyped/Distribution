package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ConnectorsSegment extends js.Object {
  /** Sets the direction of orthogonal segment
               */
  var direction: js.UndefOr[java.lang.String] = js.undefined
  /** Describes the length of orthogonal segment
               * @Default {undefined}
               */
  var length: js.UndefOr[scala.Double] = js.undefined
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
  var `type`: js.UndefOr[Segments | java.lang.String] = js.undefined
  /** Describes the length and angle between the first control point and the start point of bezier segment
               * @Default {null}
               */
  var vector1: js.UndefOr[js.Any] = js.undefined
  /** Describes the length and angle between the second control point and end point of bezier segment
               * @Default {null}
               */
  var vector2: js.UndefOr[js.Any] = js.undefined
}

