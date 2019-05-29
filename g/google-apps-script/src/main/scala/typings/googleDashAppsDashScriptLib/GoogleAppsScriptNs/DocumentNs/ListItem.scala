package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItem extends js.Object {
  def addPositionedImage(image: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.BlobSource): PositionedImage = js.native
  def appendHorizontalRule(): HorizontalRule = js.native
  def appendInlineImage(image: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.BlobSource): InlineImage = js.native
  def appendInlineImage(image: InlineImage): InlineImage = js.native
  def appendPageBreak(): PageBreak = js.native
  def appendPageBreak(pageBreak: PageBreak): PageBreak = js.native
  def appendText(text: Text): Text = js.native
  def appendText(text: java.lang.String): Text = js.native
  def clear(): ListItem = js.native
  def copy(): ListItem = js.native
  def editAsText(): Text = js.native
  def findElement(elementType: ElementType): RangeElement = js.native
  def findElement(elementType: ElementType, from: RangeElement): RangeElement = js.native
  def findText(searchPattern: java.lang.String): RangeElement = js.native
  def findText(searchPattern: java.lang.String, from: RangeElement): RangeElement = js.native
  def getAlignment(): HorizontalAlignment = js.native
  def getAttributes(): js.Object = js.native
  def getChild(childIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Element = js.native
  def getChildIndex(child: Element): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getGlyphType(): GlyphType = js.native
  def getHeading(): ParagraphHeading = js.native
  def getIndentEnd(): scala.Double = js.native
  def getIndentFirstLine(): scala.Double = js.native
  def getIndentStart(): scala.Double = js.native
  def getLineSpacing(): scala.Double = js.native
  def getLinkUrl(): java.lang.String = js.native
  def getListId(): java.lang.String = js.native
  def getNestingLevel(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getNextSibling(): Element = js.native
  def getNumChildren(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getParent(): ContainerElement = js.native
  def getPositionedImage(id: java.lang.String): PositionedImage = js.native
  def getPositionedImages(): js.Array[PositionedImage] = js.native
  def getPreviousSibling(): Element = js.native
  def getSpacingAfter(): scala.Double = js.native
  def getSpacingBefore(): scala.Double = js.native
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
  def merge(): ListItem = js.native
  def removeChild(child: Element): ListItem = js.native
  def removeFromParent(): ListItem = js.native
  def removePositionedImage(id: java.lang.String): scala.Boolean = js.native
  def replaceText(searchPattern: java.lang.String, replacement: java.lang.String): Element = js.native
  def setAlignment(alignment: HorizontalAlignment): ListItem = js.native
  def setAttributes(attributes: js.Object): ListItem = js.native
  def setGlyphType(glyphType: GlyphType): ListItem = js.native
  def setHeading(heading: ParagraphHeading): ListItem = js.native
  def setIndentEnd(indentEnd: scala.Double): ListItem = js.native
  def setIndentFirstLine(indentFirstLine: scala.Double): ListItem = js.native
  def setIndentStart(indentStart: scala.Double): ListItem = js.native
  def setLeftToRight(leftToRight: scala.Boolean): ListItem = js.native
  def setLineSpacing(multiplier: scala.Double): ListItem = js.native
  def setLinkUrl(url: java.lang.String): ListItem = js.native
  def setListId(listItem: ListItem): ListItem = js.native
  def setNestingLevel(nestingLevel: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): ListItem = js.native
  def setSpacingAfter(spacingAfter: scala.Double): ListItem = js.native
  def setSpacingBefore(spacingBefore: scala.Double): ListItem = js.native
  def setText(text: java.lang.String): scala.Unit = js.native
  def setTextAlignment(textAlignment: TextAlignment): ListItem = js.native
}

