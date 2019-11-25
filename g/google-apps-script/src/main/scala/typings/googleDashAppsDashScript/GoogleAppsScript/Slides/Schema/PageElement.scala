package typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageElement extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var elementGroup: js.UndefOr[typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.Group] = js.undefined
  var image: js.UndefOr[typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.Image] = js.undefined
  var line: js.UndefOr[typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.Line] = js.undefined
  var objectId: js.UndefOr[String] = js.undefined
  var shape: js.UndefOr[typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.Shape] = js.undefined
  var sheetsChart: js.UndefOr[typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.SheetsChart] = js.undefined
  var size: js.UndefOr[Size] = js.undefined
  var table: js.UndefOr[typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.Table] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var transform: js.UndefOr[typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.AffineTransform] = js.undefined
  var video: js.UndefOr[typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.Video] = js.undefined
  var wordArt: js.UndefOr[typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.WordArt] = js.undefined
}

object PageElement {
  @scala.inline
  def apply(
    description: String = null,
    elementGroup: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.Group = null,
    image: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.Image = null,
    line: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.Line = null,
    objectId: String = null,
    shape: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.Shape = null,
    sheetsChart: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.SheetsChart = null,
    size: Size = null,
    table: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.Table = null,
    title: String = null,
    transform: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.AffineTransform = null,
    video: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.Video = null,
    wordArt: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.WordArt = null
  ): PageElement = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (elementGroup != null) __obj.updateDynamic("elementGroup")(elementGroup.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (sheetsChart != null) __obj.updateDynamic("sheetsChart")(sheetsChart.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (video != null) __obj.updateDynamic("video")(video.asInstanceOf[js.Any])
    if (wordArt != null) __obj.updateDynamic("wordArt")(wordArt.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageElement]
  }
}

