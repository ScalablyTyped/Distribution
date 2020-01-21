package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParagraphBorder extends js.Object {
  var color: js.UndefOr[OptionalColor] = js.undefined
  var dashStyle: js.UndefOr[String] = js.undefined
  var padding: js.UndefOr[Dimension] = js.undefined
  var width: js.UndefOr[Dimension] = js.undefined
}

object ParagraphBorder {
  @scala.inline
  def apply(
    color: OptionalColor = null,
    dashStyle: String = null,
    padding: Dimension = null,
    width: Dimension = null
  ): ParagraphBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParagraphBorder]
  }
}

