package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineProperties extends js.Object {
  // The dash style of the line.
  var dash_style: DashStyle
  // The style of the arrow at the end of the line.
  var end_arrow: LinePropertiesArrowStyle
  // The fill of the line. The default line fill matches the defaults for new
  // lines created in the Slides editor.
  var line_fill: LinePropertiesLineFill
  // The hyperlink destination of the line. If unset, there is no link.
  var link: Link
  // The style of the arrow at the beginning of the line.
  var start_arrow: LinePropertiesArrowStyle
  // The thickness of the line.
  var weight: Dimension
}

object LineProperties {
  @scala.inline
  def apply(
    dash_style: DashStyle,
    end_arrow: LinePropertiesArrowStyle,
    line_fill: LinePropertiesLineFill,
    link: Link,
    start_arrow: LinePropertiesArrowStyle,
    weight: Dimension
  ): LineProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dash_style")(dash_style)
    __obj.updateDynamic("end_arrow")(end_arrow)
    __obj.updateDynamic("line_fill")(line_fill)
    __obj.updateDynamic("link")(link)
    __obj.updateDynamic("start_arrow")(start_arrow)
    __obj.updateDynamic("weight")(weight)
    __obj.asInstanceOf[LineProperties]
  }
}

