package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Paragraph extends js.Object {
  def addPositionedImage(image: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.BlobSource): PositionedImage = js.native
  def appendHorizontalRule(): HorizontalRule = js.native
  def appendInlineImage(image: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.BlobSource): InlineImage = js.native
  def appendInlineImage(image: InlineImage): InlineImage = js.native
  def appendPageBreak(): PageBreak = js.native
  def appendPageBreak(pageBreak: PageBreak): PageBreak = js.native
  def appendText(text: Text): Text = js.native
  def appendText(text: java.lang.String): Text = js.native
  def clear(): Paragraph = js.native
  def copy(): Paragraph = js.native
  def editAsText(): Text = js.native
  def findElement(elementType: ElementType): RangeElement = js.native
  def findElement(elementType: ElementType, from: RangeElement): RangeElement = js.native
  def findText(searchPattern: java.lang.String): RangeElement = js.native
  def findText(searchPattern: java.lang.String, from: RangeElement): RangeElement = js.native
  def getAlignment(): HorizontalAlignment = js.native
  def getAttributes(): js.Object = js.native
  def getChild(childIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Element = js.native
  def getChildIndex(child: Element): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getHeading(): ParagraphHeading = js.native
  def getIndentEnd(): stdLib.Number = js.native
  def getIndentFirstLine(): stdLib.Number = js.native
  def getIndentStart(): stdLib.Number = js.native
  def getLineSpacing(): stdLib.Number = js.native
  def getLinkUrl(): java.lang.String = js.native
  def getNextSibling(): Element = js.native
  def getNumChildren(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getParent(): ContainerElement = js.native
  def getPositionedImage(id: java.lang.String): PositionedImage = js.native
  def getPositionedImages(): js.Array[PositionedImage] = js.native
  def getPreviousSibling(): Element = js.native
  def getSpacingAfter(): stdLib.Number = js.native
  def getSpacingBefore(): stdLib.Number = js.native
  def getText(): java.lang.String = js.native
  def getTextAlignment(): TextAlignment = js.native
  def getType(): ElementType = js.native
  def insertHorizontalRule(childIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): HorizontalRule = js.native
  def insertInlineImage(
    childIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    image: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.BlobSource
  ): InlineImage = js.native
  def insertInlineImage(childIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, image: InlineImage): InlineImage = js.native
  def insertPageBreak(childIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): PageBreak = js.native
  def insertPageBreak(childIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, pageBreak: PageBreak): PageBreak = js.native
  def insertText(childIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, text: Text): Text = js.native
  def insertText(childIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, text: java.lang.String): Text = js.native
  def isAtDocumentEnd(): scala.Boolean = js.native
  def isLeftToRight(): scala.Boolean = js.native
  def merge(): Paragraph = js.native
  def removeChild(child: Element): Paragraph = js.native
  def removeFromParent(): Paragraph = js.native
  def removePositionedImage(id: java.lang.String): scala.Boolean = js.native
  def replaceText(searchPattern: java.lang.String, replacement: java.lang.String): Element = js.native
  def setAlignment(alignment: HorizontalAlignment): Paragraph = js.native
  def setAttributes(attributes: js.Object): Paragraph = js.native
  def setHeading(heading: ParagraphHeading): Paragraph = js.native
  def setIndentEnd(indentEnd: stdLib.Number): Paragraph = js.native
  def setIndentFirstLine(indentFirstLine: stdLib.Number): Paragraph = js.native
  def setIndentStart(indentStart: stdLib.Number): Paragraph = js.native
  def setLeftToRight(leftToRight: scala.Boolean): Paragraph = js.native
  def setLineSpacing(multiplier: stdLib.Number): Paragraph = js.native
  def setLinkUrl(url: java.lang.String): Paragraph = js.native
  def setSpacingAfter(spacingAfter: stdLib.Number): Paragraph = js.native
  def setSpacingBefore(spacingBefore: stdLib.Number): Paragraph = js.native
  def setText(text: java.lang.String): scala.Unit = js.native
  def setTextAlignment(textAlignment: TextAlignment): Paragraph = js.native
}

