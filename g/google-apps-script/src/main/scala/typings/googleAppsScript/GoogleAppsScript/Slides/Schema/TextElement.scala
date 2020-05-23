package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextElement extends js.Object {
  var autoText: js.UndefOr[AutoText] = js.undefined
  var endIndex: js.UndefOr[Double] = js.undefined
  var paragraphMarker: js.UndefOr[ParagraphMarker] = js.undefined
  var startIndex: js.UndefOr[Double] = js.undefined
  var textRun: js.UndefOr[TextRun] = js.undefined
}

object TextElement {
  @scala.inline
  def apply(
    autoText: AutoText = null,
    endIndex: js.UndefOr[Double] = js.undefined,
    paragraphMarker: ParagraphMarker = null,
    startIndex: js.UndefOr[Double] = js.undefined,
    textRun: TextRun = null
  ): TextElement = {
    val __obj = js.Dynamic.literal()
    if (autoText != null) __obj.updateDynamic("autoText")(autoText.asInstanceOf[js.Any])
    if (!js.isUndefined(endIndex)) __obj.updateDynamic("endIndex")(endIndex.get.asInstanceOf[js.Any])
    if (paragraphMarker != null) __obj.updateDynamic("paragraphMarker")(paragraphMarker.asInstanceOf[js.Any])
    if (!js.isUndefined(startIndex)) __obj.updateDynamic("startIndex")(startIndex.get.asInstanceOf[js.Any])
    if (textRun != null) __obj.updateDynamic("textRun")(textRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextElement]
  }
}

