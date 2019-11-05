package typings.googleDashAppsDashScript.GoogleAppsScript.Document

import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A generic element that may contain other elements. All elements that may contain child elements,
  * such as Paragraph, inherit from ContainerElement.
  */
@js.native
trait ContainerElement extends js.Object {
  def asBody(): Body = js.native
  def asEquation(): Equation = js.native
  def asFooterSection(): FooterSection = js.native
  def asFootnoteSection(): FootnoteSection = js.native
  def asHeaderSection(): HeaderSection = js.native
  def asListItem(): ListItem = js.native
  def asParagraph(): Paragraph = js.native
  def asTable(): Table = js.native
  def asTableCell(): TableCell = js.native
  def asTableOfContents(): TableOfContents = js.native
  def asTableRow(): TableRow = js.native
  def clear(): ContainerElement = js.native
  def copy(): ContainerElement = js.native
  def editAsText(): Text = js.native
  def findElement(elementType: ElementType): RangeElement = js.native
  def findElement(elementType: ElementType, from: RangeElement): RangeElement = js.native
  def findText(searchPattern: String): RangeElement = js.native
  def findText(searchPattern: String, from: RangeElement): RangeElement = js.native
  def getAttributes(): js.Any = js.native
  def getChild(childIndex: Integer): Element = js.native
  def getChildIndex(child: Element): Integer = js.native
  def getLinkUrl(): String = js.native
  def getNextSibling(): Element = js.native
  def getNumChildren(): Integer = js.native
  def getParent(): ContainerElement = js.native
  def getPreviousSibling(): Element = js.native
  def getText(): String = js.native
  def getTextAlignment(): TextAlignment = js.native
  def getType(): ElementType = js.native
  def isAtDocumentEnd(): Boolean = js.native
  def merge(): ContainerElement = js.native
  def removeFromParent(): ContainerElement = js.native
  def replaceText(searchPattern: String, replacement: String): Element = js.native
  def setAttributes(attributes: js.Any): ContainerElement = js.native
  def setLinkUrl(url: String): ContainerElement = js.native
  def setTextAlignment(textAlignment: TextAlignment): ContainerElement = js.native
}

