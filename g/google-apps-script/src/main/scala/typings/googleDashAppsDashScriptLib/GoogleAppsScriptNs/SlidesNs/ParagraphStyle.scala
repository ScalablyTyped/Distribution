package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParagraphStyle extends js.Object {
  def getIndentEnd(): stdLib.Number
  def getIndentFirstLine(): stdLib.Number
  def getIndentStart(): stdLib.Number
  def getLineSpacing(): stdLib.Number
  def getParagraphAlignment(): ParagraphAlignment
  def getSpaceAbove(): stdLib.Number
  def getSpaceBelow(): stdLib.Number
  def getSpacingMode(): SpacingMode
  def getTextDirection(): TextDirection
  def setIndentEnd(indent: stdLib.Number): ParagraphStyle
  def setIndentFirstLine(indent: stdLib.Number): ParagraphStyle
  def setIndentStart(indent: stdLib.Number): ParagraphStyle
  def setLineSpacing(spacing: stdLib.Number): ParagraphStyle
  def setParagraphAlignment(alignment: ParagraphAlignment): ParagraphStyle
  def setSpaceAbove(space: stdLib.Number): ParagraphStyle
  def setSpaceBelow(space: stdLib.Number): ParagraphStyle
  def setSpacingMode(mode: SpacingMode): ParagraphStyle
  def setTextDirection(direction: TextDirection): ParagraphStyle
}

object ParagraphStyle {
  @scala.inline
  def apply(
    getIndentEnd: js.Function0[stdLib.Number],
    getIndentFirstLine: js.Function0[stdLib.Number],
    getIndentStart: js.Function0[stdLib.Number],
    getLineSpacing: js.Function0[stdLib.Number],
    getParagraphAlignment: js.Function0[ParagraphAlignment],
    getSpaceAbove: js.Function0[stdLib.Number],
    getSpaceBelow: js.Function0[stdLib.Number],
    getSpacingMode: js.Function0[SpacingMode],
    getTextDirection: js.Function0[TextDirection],
    setIndentEnd: js.Function1[stdLib.Number, ParagraphStyle],
    setIndentFirstLine: js.Function1[stdLib.Number, ParagraphStyle],
    setIndentStart: js.Function1[stdLib.Number, ParagraphStyle],
    setLineSpacing: js.Function1[stdLib.Number, ParagraphStyle],
    setParagraphAlignment: js.Function1[ParagraphAlignment, ParagraphStyle],
    setSpaceAbove: js.Function1[stdLib.Number, ParagraphStyle],
    setSpaceBelow: js.Function1[stdLib.Number, ParagraphStyle],
    setSpacingMode: js.Function1[SpacingMode, ParagraphStyle],
    setTextDirection: js.Function1[TextDirection, ParagraphStyle]
  ): ParagraphStyle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getIndentEnd")(getIndentEnd)
    __obj.updateDynamic("getIndentFirstLine")(getIndentFirstLine)
    __obj.updateDynamic("getIndentStart")(getIndentStart)
    __obj.updateDynamic("getLineSpacing")(getLineSpacing)
    __obj.updateDynamic("getParagraphAlignment")(getParagraphAlignment)
    __obj.updateDynamic("getSpaceAbove")(getSpaceAbove)
    __obj.updateDynamic("getSpaceBelow")(getSpaceBelow)
    __obj.updateDynamic("getSpacingMode")(getSpacingMode)
    __obj.updateDynamic("getTextDirection")(getTextDirection)
    __obj.updateDynamic("setIndentEnd")(setIndentEnd)
    __obj.updateDynamic("setIndentFirstLine")(setIndentFirstLine)
    __obj.updateDynamic("setIndentStart")(setIndentStart)
    __obj.updateDynamic("setLineSpacing")(setLineSpacing)
    __obj.updateDynamic("setParagraphAlignment")(setParagraphAlignment)
    __obj.updateDynamic("setSpaceAbove")(setSpaceAbove)
    __obj.updateDynamic("setSpaceBelow")(setSpaceBelow)
    __obj.updateDynamic("setSpacingMode")(setSpacingMode)
    __obj.updateDynamic("setTextDirection")(setTextDirection)
    __obj.asInstanceOf[ParagraphStyle]
  }
}

