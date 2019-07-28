package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DocsNs.SchemaNs

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
    if (color != null) __obj.updateDynamic("color")(color)
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[ParagraphBorder]
  }
}

