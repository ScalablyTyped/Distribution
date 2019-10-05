package typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shape extends js.Object {
  var placeholder: js.UndefOr[Placeholder] = js.undefined
  var shapeProperties: js.UndefOr[ShapeProperties] = js.undefined
  var shapeType: js.UndefOr[String] = js.undefined
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

