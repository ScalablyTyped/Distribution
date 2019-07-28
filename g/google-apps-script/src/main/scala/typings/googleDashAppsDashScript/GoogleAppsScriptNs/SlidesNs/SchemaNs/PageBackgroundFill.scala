package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageBackgroundFill extends js.Object {
  var propertyState: js.UndefOr[String] = js.undefined
  var solidFill: js.UndefOr[typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs.SolidFill] = js.undefined
  var stretchedPictureFill: js.UndefOr[StretchedPictureFill] = js.undefined
}

object PageBackgroundFill {
  @scala.inline
  def apply(
    propertyState: String = null,
    solidFill: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs.SolidFill = null,
    stretchedPictureFill: StretchedPictureFill = null
  ): PageBackgroundFill = {
    val __obj = js.Dynamic.literal()
    if (propertyState != null) __obj.updateDynamic("propertyState")(propertyState)
    if (solidFill != null) __obj.updateDynamic("solidFill")(solidFill)
    if (stretchedPictureFill != null) __obj.updateDynamic("stretchedPictureFill")(stretchedPictureFill)
    __obj.asInstanceOf[PageBackgroundFill]
  }
}

