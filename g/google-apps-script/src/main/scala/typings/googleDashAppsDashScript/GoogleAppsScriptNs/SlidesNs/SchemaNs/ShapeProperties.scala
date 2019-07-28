package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShapeProperties extends js.Object {
  var contentAlignment: js.UndefOr[String] = js.undefined
  var link: js.UndefOr[typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs.Link] = js.undefined
  var outline: js.UndefOr[Outline] = js.undefined
  var shadow: js.UndefOr[Shadow] = js.undefined
  var shapeBackgroundFill: js.UndefOr[ShapeBackgroundFill] = js.undefined
}

object ShapeProperties {
  @scala.inline
  def apply(
    contentAlignment: String = null,
    link: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs.Link = null,
    outline: Outline = null,
    shadow: Shadow = null,
    shapeBackgroundFill: ShapeBackgroundFill = null
  ): ShapeProperties = {
    val __obj = js.Dynamic.literal()
    if (contentAlignment != null) __obj.updateDynamic("contentAlignment")(contentAlignment)
    if (link != null) __obj.updateDynamic("link")(link)
    if (outline != null) __obj.updateDynamic("outline")(outline)
    if (shadow != null) __obj.updateDynamic("shadow")(shadow)
    if (shapeBackgroundFill != null) __obj.updateDynamic("shapeBackgroundFill")(shapeBackgroundFill)
    __obj.asInstanceOf[ShapeProperties]
  }
}

