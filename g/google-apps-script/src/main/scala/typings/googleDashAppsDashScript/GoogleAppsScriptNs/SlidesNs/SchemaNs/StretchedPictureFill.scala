package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StretchedPictureFill extends js.Object {
  var contentUrl: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[Size] = js.undefined
}

object StretchedPictureFill {
  @scala.inline
  def apply(contentUrl: String = null, size: Size = null): StretchedPictureFill = {
    val __obj = js.Dynamic.literal()
    if (contentUrl != null) __obj.updateDynamic("contentUrl")(contentUrl)
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[StretchedPictureFill]
  }
}

