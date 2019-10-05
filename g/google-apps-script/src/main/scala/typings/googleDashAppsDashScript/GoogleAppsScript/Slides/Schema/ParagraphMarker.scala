package typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParagraphMarker extends js.Object {
  var bullet: js.UndefOr[Bullet] = js.undefined
  var style: js.UndefOr[typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.ParagraphStyle] = js.undefined
}

object ParagraphMarker {
  @scala.inline
  def apply(
    bullet: Bullet = null,
    style: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.ParagraphStyle = null
  ): ParagraphMarker = {
    val __obj = js.Dynamic.literal()
    if (bullet != null) __obj.updateDynamic("bullet")(bullet)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ParagraphMarker]
  }
}

