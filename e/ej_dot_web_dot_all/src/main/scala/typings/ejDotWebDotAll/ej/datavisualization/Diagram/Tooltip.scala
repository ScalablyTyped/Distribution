package typings.ejDotWebDotAll.ej.datavisualization.Diagram

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
  var relativeMode: js.UndefOr[RelativeMode | String] = js.undefined
  /** Sets the svg/html template to be bound with tooltip
    */
  var templateId: js.UndefOr[String] = js.undefined
}

object Tooltip {
  @scala.inline
  def apply(
    alignment: TooltipAlignment = null,
    margin: js.Any = null,
    relativeMode: RelativeMode | String = null,
    templateId: String = null
  ): Tooltip = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (relativeMode != null) __obj.updateDynamic("relativeMode")(relativeMode.asInstanceOf[js.Any])
    if (templateId != null) __obj.updateDynamic("templateId")(templateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tooltip]
  }
}

