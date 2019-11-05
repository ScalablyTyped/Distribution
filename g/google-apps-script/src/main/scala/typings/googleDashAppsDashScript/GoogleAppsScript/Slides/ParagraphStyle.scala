package typings.googleDashAppsDashScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The styles of text that apply to entire paragraphs.
  *
  * Read methods in this class return null if the corresponding TextRange spans
  * multiple paragraphs, and those paragraphs have different values for the read method being called.
  * To avoid this, query for paragraph styles using the TextRange returned by the Paragraph.getRange() method.
  */
trait ParagraphStyle extends js.Object {
  def getIndentEnd(): Double
  def getIndentFirstLine(): Double
  def getIndentStart(): Double
  def getLineSpacing(): Double
  def getParagraphAlignment(): ParagraphAlignment
  def getSpaceAbove(): Double
  def getSpaceBelow(): Double
  def getSpacingMode(): SpacingMode
  def getTextDirection(): TextDirection
  def setIndentEnd(indent: Double): ParagraphStyle
  def setIndentFirstLine(indent: Double): ParagraphStyle
  def setIndentStart(indent: Double): ParagraphStyle
  def setLineSpacing(spacing: Double): ParagraphStyle
  def setParagraphAlignment(alignment: ParagraphAlignment): ParagraphStyle
  def setSpaceAbove(space: Double): ParagraphStyle
  def setSpaceBelow(space: Double): ParagraphStyle
  def setSpacingMode(mode: SpacingMode): ParagraphStyle
  def setTextDirection(direction: TextDirection): ParagraphStyle
}

object ParagraphStyle {
  @scala.inline
  def apply(
    getIndentEnd: () => Double,
    getIndentFirstLine: () => Double,
    getIndentStart: () => Double,
    getLineSpacing: () => Double,
    getParagraphAlignment: () => ParagraphAlignment,
    getSpaceAbove: () => Double,
    getSpaceBelow: () => Double,
    getSpacingMode: () => SpacingMode,
    getTextDirection: () => TextDirection,
    setIndentEnd: Double => ParagraphStyle,
    setIndentFirstLine: Double => ParagraphStyle,
    setIndentStart: Double => ParagraphStyle,
    setLineSpacing: Double => ParagraphStyle,
    setParagraphAlignment: ParagraphAlignment => ParagraphStyle,
    setSpaceAbove: Double => ParagraphStyle,
    setSpaceBelow: Double => ParagraphStyle,
    setSpacingMode: SpacingMode => ParagraphStyle,
    setTextDirection: TextDirection => ParagraphStyle
  ): ParagraphStyle = {
    val __obj = js.Dynamic.literal(getIndentEnd = js.Any.fromFunction0(getIndentEnd), getIndentFirstLine = js.Any.fromFunction0(getIndentFirstLine), getIndentStart = js.Any.fromFunction0(getIndentStart), getLineSpacing = js.Any.fromFunction0(getLineSpacing), getParagraphAlignment = js.Any.fromFunction0(getParagraphAlignment), getSpaceAbove = js.Any.fromFunction0(getSpaceAbove), getSpaceBelow = js.Any.fromFunction0(getSpaceBelow), getSpacingMode = js.Any.fromFunction0(getSpacingMode), getTextDirection = js.Any.fromFunction0(getTextDirection), setIndentEnd = js.Any.fromFunction1(setIndentEnd), setIndentFirstLine = js.Any.fromFunction1(setIndentFirstLine), setIndentStart = js.Any.fromFunction1(setIndentStart), setLineSpacing = js.Any.fromFunction1(setLineSpacing), setParagraphAlignment = js.Any.fromFunction1(setParagraphAlignment), setSpaceAbove = js.Any.fromFunction1(setSpaceAbove), setSpaceBelow = js.Any.fromFunction1(setSpaceBelow), setSpacingMode = js.Any.fromFunction1(setSpacingMode), setTextDirection = js.Any.fromFunction1(setTextDirection))
  
    __obj.asInstanceOf[ParagraphStyle]
  }
}

