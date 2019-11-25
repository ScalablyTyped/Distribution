package typings.ejDotWebDotAll.ej.datavisualization.Diagram

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
  var lineColor: js.UndefOr[String] = js.undefined
  /** Sets the dash array that used to stroke the phase splitter
    * @Default {3,3}
    */
  var lineDashArray: js.UndefOr[String] = js.undefined
  /** Sets the lineWidth of the phase
    * @Default {1}
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  /** Sets the unique identifier of the phase
    */
  var name: js.UndefOr[String] = js.undefined
  /** Sets the length of the smaller region(phase) of a swimlane
    * @Default {100}
    */
  var offset: js.UndefOr[Double] = js.undefined
  /** Sets the orientation of the phase
    * @Default {horizontal}
    */
  var orientation: js.UndefOr[String] = js.undefined
  /** Sets the type of the object as phase
    * @Default {phase}
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object NodesPhase {
  @scala.inline
  def apply(
    label: js.Any = null,
    lineColor: String = null,
    lineDashArray: String = null,
    lineWidth: Int | Double = null,
    name: String = null,
    offset: Int | Double = null,
    orientation: String = null,
    `type`: String = null
  ): NodesPhase = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (lineDashArray != null) __obj.updateDynamic("lineDashArray")(lineDashArray.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesPhase]
  }
}

