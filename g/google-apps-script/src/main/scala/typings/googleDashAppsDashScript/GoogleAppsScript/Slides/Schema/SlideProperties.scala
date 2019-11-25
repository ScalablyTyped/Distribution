package typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlideProperties extends js.Object {
  var layoutObjectId: js.UndefOr[String] = js.undefined
  var masterObjectId: js.UndefOr[String] = js.undefined
  var notesPage: js.UndefOr[typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.Page] = js.undefined
}

object SlideProperties {
  @scala.inline
  def apply(
    layoutObjectId: String = null,
    masterObjectId: String = null,
    notesPage: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.Page = null
  ): SlideProperties = {
    val __obj = js.Dynamic.literal()
    if (layoutObjectId != null) __obj.updateDynamic("layoutObjectId")(layoutObjectId.asInstanceOf[js.Any])
    if (masterObjectId != null) __obj.updateDynamic("masterObjectId")(masterObjectId.asInstanceOf[js.Any])
    if (notesPage != null) __obj.updateDynamic("notesPage")(notesPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideProperties]
  }
}

