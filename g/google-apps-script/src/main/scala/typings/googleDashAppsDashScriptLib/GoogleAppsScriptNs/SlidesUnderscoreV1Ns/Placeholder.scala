package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Placeholder extends js.Object {
  // The index of the placeholder. If the same placeholder types are present in
  // the same page, they would have different index values.
  var index: scala.Double
  // The object ID of this shape's parent placeholder.
  // If unset, the parent placeholder shape does not exist, so the shape does
  // not inherit properties from any other shape.
  var parent_object_id: java.lang.String
  // The type of a placeholder shape.
  //
  // Many of these placeholder types correspond to placeholder ids from the
  // ECMA-376 standard. More information on those shapes can be found in the
  // description of the "ST_PlaceholderType" type in section 19.7.10 of "Office
  // Open XML File Formats - Fundamentals and Markup Language Reference", part
  // 1 of [ECMA-376 4th
  // edition](http://www.ecma-international.org/publications/standards/Ecma-376.htm).
  // The type of the placeholder.
  var `type`: PlaceholderType
}

object Placeholder {
  @scala.inline
  def apply(index: scala.Double, parent_object_id: java.lang.String, `type`: PlaceholderType): Placeholder = {
    val __obj = js.Dynamic.literal(index = index, parent_object_id = parent_object_id)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Placeholder]
  }
}

