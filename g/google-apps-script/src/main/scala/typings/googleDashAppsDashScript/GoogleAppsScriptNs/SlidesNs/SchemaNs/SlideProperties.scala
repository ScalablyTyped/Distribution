package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlideProperties extends js.Object {
  var layoutObjectId: js.UndefOr[String] = js.undefined
  var masterObjectId: js.UndefOr[String] = js.undefined
  var notesPage: js.UndefOr[typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs.Page] = js.undefined
}

object SlideProperties {
  @scala.inline
  def apply(
    layoutObjectId: String = null,
    masterObjectId: String = null,
    notesPage: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs.Page = null
  ): SlideProperties = {
    val __obj = js.Dynamic.literal()
    if (layoutObjectId != null) __obj.updateDynamic("layoutObjectId")(layoutObjectId)
    if (masterObjectId != null) __obj.updateDynamic("masterObjectId")(masterObjectId)
    if (notesPage != null) __obj.updateDynamic("notesPage")(notesPage)
    __obj.asInstanceOf[SlideProperties]
  }
}

