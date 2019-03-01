package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// A PageElement kind representing a
// generic shape that does not have a more specific classification.
trait Shape extends js.Object {
  // Placeholders are shapes that are inherit from corresponding placeholders on
  // layouts and masters.
  //
  // If set, the shape is a placeholder shape and any inherited properties
  // can be resolved by looking at the parent placeholder identified by the
  // parent_object_id field.
  var placeholder: Placeholder
  // The properties of the shape.
  var shape_properties: ShapeProperties
  // The shape types.
  //
  // Many of these shapes correspond to predefined shapes from the ECMA-376
  // standard. More information on those shapes can be found in the description
  // of the "ST_ShapeType" simple type in section 20.1.10.55 of "Office Open XML
  // File Formats - Fundamentals and Markup Language Reference", part 1 of
  // [ECMA-376 4th
  // edition](http://www.ecma-international.org/publications/standards/Ecma-376.htm).
  // The type of the shape.
  var shape_type: ShapeType
  // The text content of the shape.
  var text: TextContent
}

object Shape {
  @scala.inline
  def apply(
    placeholder: Placeholder,
    shape_properties: ShapeProperties,
    shape_type: ShapeType,
    text: TextContent
  ): Shape = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("placeholder")(placeholder)
    __obj.updateDynamic("shape_properties")(shape_properties)
    __obj.updateDynamic("shape_type")(shape_type)
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Shape]
  }
}

