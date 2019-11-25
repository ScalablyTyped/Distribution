package typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextElement extends js.Object {
  var autoText: js.UndefOr[typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.AutoText] = js.undefined
  var endIndex: js.UndefOr[Double] = js.undefined
  var paragraphMarker: js.UndefOr[ParagraphMarker] = js.undefined
  var startIndex: js.UndefOr[Double] = js.undefined
  var textRun: js.UndefOr[TextRun] = js.undefined
}

object TextElement {
  @scala.inline
  def apply(
    autoText: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.AutoText = null,
    endIndex: Int | Double = null,
    paragraphMarker: ParagraphMarker = null,
    startIndex: Int | Double = null,
    textRun: TextRun = null
  ): TextElement = {
    val __obj = js.Dynamic.literal()
    if (autoText != null) __obj.updateDynamic("autoText")(autoText.asInstanceOf[js.Any])
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex.asInstanceOf[js.Any])
    if (paragraphMarker != null) __obj.updateDynamic("paragraphMarker")(paragraphMarker.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (textRun != null) __obj.updateDynamic("textRun")(textRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextElement]
  }
}

