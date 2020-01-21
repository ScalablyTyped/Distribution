package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShapeProperties extends js.Object {
  var contentAlignment: js.UndefOr[String] = js.undefined
  var link: js.UndefOr[Link] = js.undefined
  var outline: js.UndefOr[Outline] = js.undefined
  var shadow: js.UndefOr[Shadow] = js.undefined
  var shapeBackgroundFill: js.UndefOr[ShapeBackgroundFill] = js.undefined
}

object ShapeProperties {
  @scala.inline
  def apply(
    contentAlignment: String = null,
    link: Link = null,
    outline: Outline = null,
    shadow: Shadow = null,
    shapeBackgroundFill: ShapeBackgroundFill = null
  ): ShapeProperties = {
    val __obj = js.Dynamic.literal()
    if (contentAlignment != null) __obj.updateDynamic("contentAlignment")(contentAlignment.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (outline != null) __obj.updateDynamic("outline")(outline.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (shapeBackgroundFill != null) __obj.updateDynamic("shapeBackgroundFill")(shapeBackgroundFill.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeProperties]
  }
}

