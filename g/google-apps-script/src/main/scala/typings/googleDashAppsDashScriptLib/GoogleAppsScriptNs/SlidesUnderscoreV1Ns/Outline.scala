package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Outline extends js.Object {
  // The dash style of the outline.
  var dash_style: DashStyle
  // The fill of the outline.
  var outline_fill: OutlineOutlineFill
  // The outline property state.
  //
  // Updating the outline on a page element will implicitly update this field
  // to `RENDERED`, unless another value is specified in the same request. To
  // have no outline on a page element, set this field to `NOT_RENDERED`. In
  // this case, any other outline fields set in the same request will be
  // ignored.
  var property_state: PropertyState
  // Solid color fill.
  var solid_fill: SolidFill
  // The thickness of the outline.
  var weight: Dimension
}

object Outline {
  @scala.inline
  def apply(
    dash_style: DashStyle,
    outline_fill: OutlineOutlineFill,
    property_state: PropertyState,
    solid_fill: SolidFill,
    weight: Dimension
  ): Outline = {
    val __obj = js.Dynamic.literal(dash_style = dash_style, outline_fill = outline_fill, property_state = property_state, solid_fill = solid_fill, weight = weight)
  
    __obj.asInstanceOf[Outline]
  }
}

