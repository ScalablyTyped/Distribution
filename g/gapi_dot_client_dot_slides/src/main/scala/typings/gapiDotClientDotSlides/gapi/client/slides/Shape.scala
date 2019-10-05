package typings.gapiDotClientDotSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shape extends js.Object {
  /**
    * Placeholders are shapes that are inherit from corresponding placeholders on
    * layouts and masters.
    *
    * If set, the shape is a placeholder shape and any inherited properties
    * can be resolved by looking at the parent placeholder identified by the
    * Placeholder.parent_object_id field.
    */
  var placeholder: js.UndefOr[Placeholder] = js.undefined
  /** The properties of the shape. */
  var shapeProperties: js.UndefOr[ShapeProperties] = js.undefined
  /** The type of the shape. */
  var shapeType: js.UndefOr[String] = js.undefined
  /** The text content of the shape. */
  var text: js.UndefOr[TextContent] = js.undefined
}

object Shape {
  @scala.inline
  def apply(
    placeholder: Placeholder = null,
    shapeProperties: ShapeProperties = null,
    shapeType: String = null,
    text: TextContent = null
  ): Shape = {
    val __obj = js.Dynamic.literal()
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (shapeProperties != null) __obj.updateDynamic("shapeProperties")(shapeProperties)
    if (shapeType != null) __obj.updateDynamic("shapeType")(shapeType)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Shape]
  }
}

