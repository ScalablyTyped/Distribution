package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageElement extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var elementGroup: js.UndefOr[Group] = js.undefined
  var image: js.UndefOr[Image] = js.undefined
  var line: js.UndefOr[Line] = js.undefined
  var objectId: js.UndefOr[java.lang.String] = js.undefined
  var shape: js.UndefOr[Shape] = js.undefined
  var sheetsChart: js.UndefOr[SheetsChart] = js.undefined
  var size: js.UndefOr[Size] = js.undefined
  var table: js.UndefOr[Table] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var transform: js.UndefOr[AffineTransform] = js.undefined
  var video: js.UndefOr[Video] = js.undefined
  var wordArt: js.UndefOr[WordArt] = js.undefined
}

object PageElement {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    elementGroup: Group = null,
    image: Image = null,
    line: Line = null,
    objectId: java.lang.String = null,
    shape: Shape = null,
    sheetsChart: SheetsChart = null,
    size: Size = null,
    table: Table = null,
    title: java.lang.String = null,
    transform: AffineTransform = null,
    video: Video = null,
    wordArt: WordArt = null
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

