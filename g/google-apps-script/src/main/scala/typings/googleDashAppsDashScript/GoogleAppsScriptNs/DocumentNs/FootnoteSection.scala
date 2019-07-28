package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DocumentNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FootnoteSection extends js.Object {
  def appendParagraph(paragraph: Paragraph): Paragraph = js.native
  def appendParagraph(text: String): Paragraph = js.native
  def clear(): FootnoteSection = js.native
  def copy(): FootnoteSection = js.native
  def editAsText(): Text = js.native
  def findElement(elementType: ElementType): RangeElement = js.native
  def findElement(elementType: ElementType, from: RangeElement): RangeElement = js.native
  def findText(searchPattern: String): RangeElement = js.native
  def findText(searchPattern: String, from: RangeElement): RangeElement = js.native
  def getAttributes(): js.Object = js.native
  def getChild(childIndex: Integer): Element = js.native
  def getChildIndex(child: Element): Integer = js.native
  def getFootnotes(): js.Array[Footnote] = js.native
  def getLinkUrl(): String = js.native
  def getNextSibling(): Element = js.native
  def getNumChildren(): Integer = js.native
  def getParagraphs(): js.Array[Paragraph] = js.native
  def getParent(): ContainerElement = js.native
  def getPreviousSibling(): Element = js.native
  def getText(): String = js.native
  def getTextAlignment(): TextAlignment = js.native
  def getType(): ElementType = js.native
  def insertParagraph(childIndex: Integer, paragraph: Paragraph): Paragraph = js.native
  def insertParagraph(childIndex: Integer, text: String): Paragraph = js.native
  def isAtDocumentEnd(): Boolean = js.native
  def removeChild(child: Element): FootnoteSection = js.native
  def removeFromParent(): FootnoteSection = js.native
  def replaceText(searchPattern: String, replacement: String): Element = js.native
  def setAttributes(attributes: js.Object): FootnoteSection = js.native
  def setLinkUrl(url: String): FootnoteSection = js.native
  def setText(text: String): FootnoteSection = js.native
  def setTextAlignment(textAlignment: TextAlignment): FootnoteSection = js.native
}

