package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageElement extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var elementGroup: js.UndefOr[typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs.Group] = js.undefined
  var image: js.UndefOr[typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs.Image] = js.undefined
  var line: js.UndefOr[typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs.Line] = js.undefined
  var objectId: js.UndefOr[String] = js.undefined
  var shape: js.UndefOr[typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs.Shape] = js.undefined
  var sheetsChart: js.UndefOr[
    typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs.SheetsChart
  ] = js.undefined
  var size: js.UndefOr[Size] = js.undefined
  var table: js.UndefOr[typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs.Table] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var transform: js.UndefOr[
    typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs.AffineTransform
  ] = js.undefined
  var video: js.UndefOr[typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs.Video] = js.undefined
  var wordArt: js.UndefOr[typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs.WordArt] = js.undefined
}

object PageElement {
  @scala.inline
  def apply(
    description: String = null,
    elementGroup: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs.Group = null,
    image: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs.Image = null,
    line: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs.Line = null,
    objectId: String = null,
    shape: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs.Shape = null,
    sheetsChart: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs.SheetsChart = null,
    size: Size = null,
    table: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs.Table = null,
    title: String = null,
    transform: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs.AffineTransform = null,
    video: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs.Video = null,
    wordArt: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs.WordArt = null
  ): PageElement = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (elementGroup != null) __obj.updateDynamic("elementGroup")(elementGroup)
    if (image != null) __obj.updateDynamic("image")(image)
    if (line != null) __obj.updateDynamic("line")(line)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    if (shape != null) __obj.updateDynamic("shape")(shape)
    if (sheetsChart != null) __obj.updateDynamic("sheetsChart")(sheetsChart)
    if (size != null) __obj.updateDynamic("size")(size)
    if (table != null) __obj.updateDynamic("table")(table)
    if (title != null) __obj.updateDynamic("title")(title)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    if (video != null) __obj.updateDynamic("video")(video)
    if (wordArt != null) __obj.updateDynamic("wordArt")(wordArt)
    __obj.asInstanceOf[PageElement]
  }
}

