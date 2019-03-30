package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextElement extends js.Object {
  var autoText: js.UndefOr[AutoText] = js.undefined
  var endIndex: js.UndefOr[scala.Double] = js.undefined
  var paragraphMarker: js.UndefOr[ParagraphMarker] = js.undefined
  var startIndex: js.UndefOr[scala.Double] = js.undefined
  var textRun: js.UndefOr[TextRun] = js.undefined
}

object TextElement {
  @scala.inline
  def apply(
    autoText: AutoText = null,
    endIndex: scala.Int | scala.Double = null,
    paragraphMarker: ParagraphMarker = null,
    startIndex: scala.Int | scala.Double = null,
    textRun: TextRun = null
  ): TextElement = {
    val __obj = js.Dynamic.literal()
    if (autoText != null) __obj.updateDynamic("autoText")(autoText)
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex.asInstanceOf[js.Any])
    if (paragraphMarker != null) __obj.updateDynamic("paragraphMarker")(paragraphMarker)
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (textRun != null) __obj.updateDynamic("textRun")(textRun)
    __obj.asInstanceOf[TextElement]
  }
}

