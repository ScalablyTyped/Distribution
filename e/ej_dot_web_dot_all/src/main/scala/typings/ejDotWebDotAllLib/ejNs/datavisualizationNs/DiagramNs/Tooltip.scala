package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tooltip extends js.Object {
  /** Aligns the tooltip around nodes/connectors
    */
  var alignment: js.UndefOr[TooltipAlignment] = js.undefined
  /** Sets the margin of the tooltip
    * @Default {{ left: 5, right: 5, top: 5, bottom: 5 }}
    */
  var margin: js.UndefOr[js.Any] = js.undefined
  /** Defines whether the tooltip should be shown at the mouse position or around node.
    * @Default {ej.datavisualization.Diagram.RelativeMode.Object}
    */
  var relativeMode: js.UndefOr[RelativeMode | java.lang.String] = js.undefined
  /** Sets the svg/html template to be bound with tooltip
    */
  var templateId: js.UndefOr[java.lang.String] = js.undefined
}

