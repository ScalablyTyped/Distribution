package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The shape background fill.
trait ShapePropertiesShapeBackgroundFill extends js.Object {
  // The kind of background fill.
  var kind: googleDashAppsDashScriptLib.Anon_SolidfillSolidFill
  // The background fill property state.
  //
  // Updating the fill on a shape will implicitly update this field to
  // `RENDERED`, unless another value is specified in the same request. To
  // have no fill on a shape, set this field to `NOT_RENDERED`. In this case,
  // any other fill fields set in the same request will be ignored.
  var property_state: PropertyState
}

object ShapePropertiesShapeBackgroundFill {
  @scala.inline
  def apply(kind: googleDashAppsDashScriptLib.Anon_SolidfillSolidFill, property_state: PropertyState): ShapePropertiesShapeBackgroundFill = {
    val __obj = js.Dynamic.literal(kind = kind, property_state = property_state)
  
    __obj.asInstanceOf[ShapePropertiesShapeBackgroundFill]
  }
}

