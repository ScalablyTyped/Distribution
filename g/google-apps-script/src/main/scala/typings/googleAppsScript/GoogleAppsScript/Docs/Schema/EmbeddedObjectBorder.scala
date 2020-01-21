package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmbeddedObjectBorder extends js.Object {
  var color: js.UndefOr[OptionalColor] = js.undefined
  var dashStyle: js.UndefOr[String] = js.undefined
  var propertyState: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Dimension] = js.undefined
}

object EmbeddedObjectBorder {
  @scala.inline
  def apply(
    color: OptionalColor = null,
    dashStyle: String = null,
    propertyState: String = null,
    width: Dimension = null
  ): EmbeddedObjectBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (propertyState != null) __obj.updateDynamic("propertyState")(propertyState.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmbeddedObjectBorder]
  }
}

