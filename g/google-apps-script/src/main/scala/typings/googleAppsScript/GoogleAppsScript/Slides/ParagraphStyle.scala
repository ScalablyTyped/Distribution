package typings.googleAppsScript.GoogleAppsScript.Slides

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
@js.native
trait ParagraphStyle extends js.Object {
  def getIndentEnd(): Double = js.native
  def getIndentFirstLine(): Double = js.native
  def getIndentStart(): Double = js.native
  def getLineSpacing(): Double = js.native
  def getParagraphAlignment(): ParagraphAlignment = js.native
  def getSpaceAbove(): Double = js.native
  def getSpaceBelow(): Double = js.native
  def getSpacingMode(): SpacingMode = js.native
  def getTextDirection(): TextDirection = js.native
  def setIndentEnd(indent: Double): ParagraphStyle = js.native
  def setIndentFirstLine(indent: Double): ParagraphStyle = js.native
  def setIndentStart(indent: Double): ParagraphStyle = js.native
  def setLineSpacing(spacing: Double): ParagraphStyle = js.native
  def setParagraphAlignment(alignment: ParagraphAlignment): ParagraphStyle = js.native
  def setSpaceAbove(space: Double): ParagraphStyle = js.native
  def setSpaceBelow(space: Double): ParagraphStyle = js.native
  def setSpacingMode(mode: SpacingMode): ParagraphStyle = js.native
  def setTextDirection(direction: TextDirection): ParagraphStyle = js.native
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
  @scala.inline
  implicit class ParagraphStyleOps[Self <: ParagraphStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetIndentEnd(value: () => Double): Self = this.set("getIndentEnd", js.Any.fromFunction0(value))
    @scala.inline
    def setGetIndentFirstLine(value: () => Double): Self = this.set("getIndentFirstLine", js.Any.fromFunction0(value))
    @scala.inline
    def setGetIndentStart(value: () => Double): Self = this.set("getIndentStart", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLineSpacing(value: () => Double): Self = this.set("getLineSpacing", js.Any.fromFunction0(value))
    @scala.inline
    def setGetParagraphAlignment(value: () => ParagraphAlignment): Self = this.set("getParagraphAlignment", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSpaceAbove(value: () => Double): Self = this.set("getSpaceAbove", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSpaceBelow(value: () => Double): Self = this.set("getSpaceBelow", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSpacingMode(value: () => SpacingMode): Self = this.set("getSpacingMode", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTextDirection(value: () => TextDirection): Self = this.set("getTextDirection", js.Any.fromFunction0(value))
    @scala.inline
    def setSetIndentEnd(value: Double => ParagraphStyle): Self = this.set("setIndentEnd", js.Any.fromFunction1(value))
    @scala.inline
    def setSetIndentFirstLine(value: Double => ParagraphStyle): Self = this.set("setIndentFirstLine", js.Any.fromFunction1(value))
    @scala.inline
    def setSetIndentStart(value: Double => ParagraphStyle): Self = this.set("setIndentStart", js.Any.fromFunction1(value))
    @scala.inline
    def setSetLineSpacing(value: Double => ParagraphStyle): Self = this.set("setLineSpacing", js.Any.fromFunction1(value))
    @scala.inline
    def setSetParagraphAlignment(value: ParagraphAlignment => ParagraphStyle): Self = this.set("setParagraphAlignment", js.Any.fromFunction1(value))
    @scala.inline
    def setSetSpaceAbove(value: Double => ParagraphStyle): Self = this.set("setSpaceAbove", js.Any.fromFunction1(value))
    @scala.inline
    def setSetSpaceBelow(value: Double => ParagraphStyle): Self = this.set("setSpaceBelow", js.Any.fromFunction1(value))
    @scala.inline
    def setSetSpacingMode(value: SpacingMode => ParagraphStyle): Self = this.set("setSpacingMode", js.Any.fromFunction1(value))
    @scala.inline
    def setSetTextDirection(value: TextDirection => ParagraphStyle): Self = this.set("setTextDirection", js.Any.fromFunction1(value))
  }
  
}

