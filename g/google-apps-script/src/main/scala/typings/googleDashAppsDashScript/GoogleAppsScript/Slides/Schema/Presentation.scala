package typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Presentation extends js.Object {
  var layouts: js.UndefOr[js.Array[typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.Page]] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var masters: js.UndefOr[js.Array[typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.Page]] = js.undefined
  var notesMaster: js.UndefOr[typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.Page] = js.undefined
  var pageSize: js.UndefOr[Size] = js.undefined
  var presentationId: js.UndefOr[String] = js.undefined
  var revisionId: js.UndefOr[String] = js.undefined
  var slides: js.UndefOr[js.Array[typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.Page]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object Presentation {
  @scala.inline
  def apply(
    layouts: js.Array[typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.Page] = null,
    locale: String = null,
    masters: js.Array[typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.Page] = null,
    notesMaster: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.Page = null,
    pageSize: Size = null,
    presentationId: String = null,
    revisionId: String = null,
    slides: js.Array[typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.Page] = null,
    title: String = null
  ): Presentation = {
    val __obj = js.Dynamic.literal()
    if (layouts != null) __obj.updateDynamic("layouts")(layouts.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (masters != null) __obj.updateDynamic("masters")(masters.asInstanceOf[js.Any])
    if (notesMaster != null) __obj.updateDynamic("notesMaster")(notesMaster.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (presentationId != null) __obj.updateDynamic("presentationId")(presentationId.asInstanceOf[js.Any])
    if (revisionId != null) __obj.updateDynamic("revisionId")(revisionId.asInstanceOf[js.Any])
    if (slides != null) __obj.updateDynamic("slides")(slides.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Presentation]
  }
}

