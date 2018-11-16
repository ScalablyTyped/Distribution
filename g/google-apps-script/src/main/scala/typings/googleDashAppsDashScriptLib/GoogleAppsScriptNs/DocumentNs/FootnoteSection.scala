package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FootnoteSection extends js.Object {
  def appendParagraph(paragraph: Paragraph): Paragraph = js.native
  def appendParagraph(text: java.lang.String): Paragraph = js.native
  def clear(): FootnoteSection = js.native
  def copy(): FootnoteSection = js.native
  def editAsText(): Text = js.native
  def findElement(elementType: ElementType): RangeElement = js.native
  def findElement(elementType: ElementType, from: RangeElement): RangeElement = js.native
  def findText(searchPattern: java.lang.String): RangeElement = js.native
  def findText(searchPattern: java.lang.String, from: RangeElement): RangeElement = js.native
  def getAttributes(): js.Object = js.native
  def getChild(childIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Element = js.native
  def getChildIndex(child: Element): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getFootnotes(): js.Array[Footnote] = js.native
  def getLinkUrl(): java.lang.String = js.native
  def getNextSibling(): Element = js.native
  def getNumChildren(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getParagraphs(): js.Array[Paragraph] = js.native
  def getParent(): ContainerElement = js.native
  def getPreviousSibling(): Element = js.native
  def getText(): java.lang.String = js.native
  def getTextAlignment(): TextAlignment = js.native
  def getType(): ElementType = js.native
  def insertParagraph(childIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, paragraph: Paragraph): Paragraph = js.native
  def insertParagraph(childIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, text: java.lang.String): Paragraph = js.native
  def isAtDocumentEnd(): scala.Boolean = js.native
  def removeChild(child: Element): FootnoteSection = js.native
  def removeFromParent(): FootnoteSection = js.native
  def replaceText(searchPattern: java.lang.String, replacement: java.lang.String): Element = js.native
  def setAttributes(attributes: js.Object): FootnoteSection = js.native
  def setLinkUrl(url: java.lang.String): FootnoteSection = js.native
  def setText(text: java.lang.String): FootnoteSection = js.native
  def setTextAlignment(textAlignment: TextAlignment): FootnoteSection = js.native
}

