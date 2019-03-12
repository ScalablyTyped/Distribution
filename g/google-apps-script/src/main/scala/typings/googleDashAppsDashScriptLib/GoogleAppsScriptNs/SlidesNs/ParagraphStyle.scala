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
    getIndentEnd: () => stdLib.Number,
    getIndentFirstLine: () => stdLib.Number,
    getIndentStart: () => stdLib.Number,
    getLineSpacing: () => stdLib.Number,
    getParagraphAlignment: () => ParagraphAlignment,
    getSpaceAbove: () => stdLib.Number,
    getSpaceBelow: () => stdLib.Number,
    getSpacingMode: () => SpacingMode,
    getTextDirection: () => TextDirection,
    setIndentEnd: stdLib.Number => ParagraphStyle,
    setIndentFirstLine: stdLib.Number => ParagraphStyle,
    setIndentStart: stdLib.Number => ParagraphStyle,
    setLineSpacing: stdLib.Number => ParagraphStyle,
    setParagraphAlignment: ParagraphAlignment => ParagraphStyle,
    setSpaceAbove: stdLib.Number => ParagraphStyle,
    setSpaceBelow: stdLib.Number => ParagraphStyle,
    setSpacingMode: SpacingMode => ParagraphStyle,
    setTextDirection: TextDirection => ParagraphStyle
  ): ParagraphStyle = {
    val __obj = js.Dynamic.literal(getIndentEnd = js.Any.fromFunction0(getIndentEnd), getIndentFirstLine = js.Any.fromFunction0(getIndentFirstLine), getIndentStart = js.Any.fromFunction0(getIndentStart), getLineSpacing = js.Any.fromFunction0(getLineSpacing), getParagraphAlignment = js.Any.fromFunction0(getParagraphAlignment), getSpaceAbove = js.Any.fromFunction0(getSpaceAbove), getSpaceBelow = js.Any.fromFunction0(getSpaceBelow), getSpacingMode = js.Any.fromFunction0(getSpacingMode), getTextDirection = js.Any.fromFunction0(getTextDirection), setIndentEnd = js.Any.fromFunction1(setIndentEnd), setIndentFirstLine = js.Any.fromFunction1(setIndentFirstLine), setIndentStart = js.Any.fromFunction1(setIndentStart), setLineSpacing = js.Any.fromFunction1(setLineSpacing), setParagraphAlignment = js.Any.fromFunction1(setParagraphAlignment), setSpaceAbove = js.Any.fromFunction1(setSpaceAbove), setSpaceBelow = js.Any.fromFunction1(setSpaceBelow), setSpacingMode = js.Any.fromFunction1(setSpacingMode), setTextDirection = js.Any.fromFunction1(setTextDirection))
  
    __obj.asInstanceOf[ParagraphStyle]
  }
}

