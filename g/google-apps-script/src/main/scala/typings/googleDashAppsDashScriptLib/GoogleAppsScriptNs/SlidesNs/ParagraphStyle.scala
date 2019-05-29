package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParagraphStyle extends js.Object {
  def getIndentEnd(): scala.Double
  def getIndentFirstLine(): scala.Double
  def getIndentStart(): scala.Double
  def getLineSpacing(): scala.Double
  def getParagraphAlignment(): ParagraphAlignment
  def getSpaceAbove(): scala.Double
  def getSpaceBelow(): scala.Double
  def getSpacingMode(): SpacingMode
  def getTextDirection(): TextDirection
  def setIndentEnd(indent: scala.Double): ParagraphStyle
  def setIndentFirstLine(indent: scala.Double): ParagraphStyle
  def setIndentStart(indent: scala.Double): ParagraphStyle
  def setLineSpacing(spacing: scala.Double): ParagraphStyle
  def setParagraphAlignment(alignment: ParagraphAlignment): ParagraphStyle
  def setSpaceAbove(space: scala.Double): ParagraphStyle
  def setSpaceBelow(space: scala.Double): ParagraphStyle
  def setSpacingMode(mode: SpacingMode): ParagraphStyle
  def setTextDirection(direction: TextDirection): ParagraphStyle
}

object ParagraphStyle {
  @scala.inline
  def apply(
    getIndentEnd: () => scala.Double,
    getIndentFirstLine: () => scala.Double,
    getIndentStart: () => scala.Double,
    getLineSpacing: () => scala.Double,
    getParagraphAlignment: () => ParagraphAlignment,
    getSpaceAbove: () => scala.Double,
    getSpaceBelow: () => scala.Double,
    getSpacingMode: () => SpacingMode,
    getTextDirection: () => TextDirection,
    setIndentEnd: scala.Double => ParagraphStyle,
    setIndentFirstLine: scala.Double => ParagraphStyle,
    setIndentStart: scala.Double => ParagraphStyle,
    setLineSpacing: scala.Double => ParagraphStyle,
    setParagraphAlignment: ParagraphAlignment => ParagraphStyle,
    setSpaceAbove: scala.Double => ParagraphStyle,
    setSpaceBelow: scala.Double => ParagraphStyle,
    setSpacingMode: SpacingMode => ParagraphStyle,
    setTextDirection: TextDirection => ParagraphStyle
  ): ParagraphStyle = {
    val __obj = js.Dynamic.literal(getIndentEnd = js.Any.fromFunction0(getIndentEnd), getIndentFirstLine = js.Any.fromFunction0(getIndentFirstLine), getIndentStart = js.Any.fromFunction0(getIndentStart), getLineSpacing = js.Any.fromFunction0(getLineSpacing), getParagraphAlignment = js.Any.fromFunction0(getParagraphAlignment), getSpaceAbove = js.Any.fromFunction0(getSpaceAbove), getSpaceBelow = js.Any.fromFunction0(getSpaceBelow), getSpacingMode = js.Any.fromFunction0(getSpacingMode), getTextDirection = js.Any.fromFunction0(getTextDirection), setIndentEnd = js.Any.fromFunction1(setIndentEnd), setIndentFirstLine = js.Any.fromFunction1(setIndentFirstLine), setIndentStart = js.Any.fromFunction1(setIndentStart), setLineSpacing = js.Any.fromFunction1(setLineSpacing), setParagraphAlignment = js.Any.fromFunction1(setParagraphAlignment), setSpaceAbove = js.Any.fromFunction1(setSpaceAbove), setSpaceBelow = js.Any.fromFunction1(setSpaceBelow), setSpacingMode = js.Any.fromFunction1(setSpacingMode), setTextDirection = js.Any.fromFunction1(setTextDirection))
  
    __obj.asInstanceOf[ParagraphStyle]
  }
}

