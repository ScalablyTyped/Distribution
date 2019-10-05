package typings.googleDashAppsDashScript.GoogleAppsScript.Document

import typings.googleDashAppsDashScript.GoogleAppsScript.Base.BlobSource
import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItem extends js.Object {
  def addPositionedImage(image: BlobSource): PositionedImage = js.native
  def appendHorizontalRule(): HorizontalRule = js.native
  def appendInlineImage(image: BlobSource): InlineImage = js.native
  def appendInlineImage(image: InlineImage): InlineImage = js.native
  def appendPageBreak(): PageBreak = js.native
  def appendPageBreak(pageBreak: PageBreak): PageBreak = js.native
  def appendText(text: String): Text = js.native
  def appendText(text: Text): Text = js.native
  def clear(): ListItem = js.native
  def copy(): ListItem = js.native
  def editAsText(): Text = js.native
  def findElement(elementType: ElementType): RangeElement = js.native
  def findElement(elementType: ElementType, from: RangeElement): RangeElement = js.native
  def findText(searchPattern: String): RangeElement = js.native
  def findText(searchPattern: String, from: RangeElement): RangeElement = js.native
  def getAlignment(): HorizontalAlignment = js.native
  def getAttributes(): js.Any = js.native
  def getChild(childIndex: Integer): Element = js.native
  def getChildIndex(child: Element): Integer = js.native
  def getGlyphType(): GlyphType = js.native
  def getHeading(): ParagraphHeading = js.native
  def getIndentEnd(): Double = js.native
  def getIndentFirstLine(): Double = js.native
  def getIndentStart(): Double = js.native
  def getLineSpacing(): Double = js.native
  def getLinkUrl(): String = js.native
  def getListId(): String = js.native
  def getNestingLevel(): Integer = js.native
  def getNextSibling(): Element = js.native
  def getNumChildren(): Integer = js.native
  def getParent(): ContainerElement = js.native
  def getPositionedImage(id: String): PositionedImage = js.native
  def getPositionedImages(): js.Array[PositionedImage] = js.native
  def getPreviousSibling(): Element = js.native
  def getSpacingAfter(): Double = js.native
  def getSpacingBefore(): Double = js.native
  def getText(): String = js.native
  def getTextAlignment(): TextAlignment = js.native
  def getType(): ElementType = js.native
  def insertHorizontalRule(childIndex: Integer): HorizontalRule = js.native
  def insertInlineImage(childIndex: Integer, image: BlobSource): InlineImage = js.native
  def insertInlineImage(childIndex: Integer, image: InlineImage): InlineImage = js.native
  def insertPageBreak(childIndex: Integer): PageBreak = js.native
  def insertPageBreak(childIndex: Integer, pageBreak: PageBreak): PageBreak = js.native
  def insertText(childIndex: Integer, text: String): Text = js.native
  def insertText(childIndex: Integer, text: Text): Text = js.native
  def isAtDocumentEnd(): Boolean = js.native
  def isLeftToRight(): Boolean = js.native
  def merge(): ListItem = js.native
  def removeChild(child: Element): ListItem = js.native
  def removeFromParent(): ListItem = js.native
  def removePositionedImage(id: String): Boolean = js.native
  def replaceText(searchPattern: String, replacement: String): Element = js.native
  def setAlignment(alignment: HorizontalAlignment): ListItem = js.native
  def setAttributes(attributes: js.Any): ListItem = js.native
  def setGlyphType(glyphType: GlyphType): ListItem = js.native
  def setHeading(heading: ParagraphHeading): ListItem = js.native
  def setIndentEnd(indentEnd: Double): ListItem = js.native
  def setIndentFirstLine(indentFirstLine: Double): ListItem = js.native
  def setIndentStart(indentStart: Double): ListItem = js.native
  def setLeftToRight(leftToRight: Boolean): ListItem = js.native
  def setLineSpacing(multiplier: Double): ListItem = js.native
  def setLinkUrl(url: String): ListItem = js.native
  def setListId(listItem: ListItem): ListItem = js.native
  def setNestingLevel(nestingLevel: Integer): ListItem = js.native
  def setSpacingAfter(spacingAfter: Double): ListItem = js.native
  def setSpacingBefore(spacingBefore: Double): ListItem = js.native
  def setText(text: String): Unit = js.native
  def setTextAlignment(textAlignment: TextAlignment): ListItem = js.native
}

