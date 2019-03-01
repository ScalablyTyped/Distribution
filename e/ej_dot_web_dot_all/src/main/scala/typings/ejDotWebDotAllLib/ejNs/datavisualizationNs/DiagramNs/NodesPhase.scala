package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodesPhase extends js.Object {
  /** Defines the header of the smaller regions
    * @Default {null}
    */
  var label: js.UndefOr[js.Any] = js.undefined
  /** Defines the line color of the splitter that splits adjacent phases.
    * @Default {#606060}
    */
  var lineColor: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the dash array that used to stroke the phase splitter
    * @Default {3,3}
    */
  var lineDashArray: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the lineWidth of the phase
    * @Default {1}
    */
  var lineWidth: js.UndefOr[scala.Double] = js.undefined
  /** Sets the unique identifier of the phase
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the length of the smaller region(phase) of a swimlane
    * @Default {100}
    */
  var offset: js.UndefOr[scala.Double] = js.undefined
  /** Sets the orientation of the phase
    * @Default {horizontal}
    */
  var orientation: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the type of the object as phase
    * @Default {phase}
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object NodesPhase {
  @scala.inline
  def apply(
    label: js.Any = null,
    lineColor: java.lang.String = null,
    lineDashArray: java.lang.String = null,
    lineWidth: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    offset: scala.Int | scala.Double = null,
    orientation: java.lang.String = null,
    `type`: java.lang.String = null
  ): NodesPhase = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label)
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor)
    if (lineDashArray != null) __obj.updateDynamic("lineDashArray")(lineDashArray)
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NodesPhase]
  }
}

