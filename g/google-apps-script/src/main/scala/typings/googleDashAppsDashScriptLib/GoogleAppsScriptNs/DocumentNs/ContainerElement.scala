package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def findText(searchPattern: java.lang.String): RangeElement = js.native
  def findText(searchPattern: java.lang.String, from: RangeElement): RangeElement = js.native
  def getAttributes(): js.Any = js.native
  def getChild(childIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Element = js.native
  def getChildIndex(child: Element): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getLinkUrl(): java.lang.String = js.native
  def getNextSibling(): Element = js.native
  def getNumChildren(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getParent(): ContainerElement = js.native
  def getPreviousSibling(): Element = js.native
  def getText(): java.lang.String = js.native
  def getTextAlignment(): TextAlignment = js.native
  def getType(): ElementType = js.native
  def isAtDocumentEnd(): scala.Boolean = js.native
  def merge(): ContainerElement = js.native
  def removeFromParent(): ContainerElement = js.native
  def replaceText(searchPattern: java.lang.String, replacement: java.lang.String): Element = js.native
  def setAttributes(attributes: js.Any): ContainerElement = js.native
  def setLinkUrl(url: java.lang.String): ContainerElement = js.native
  def setTextAlignment(textAlignment: TextAlignment): ContainerElement = js.native
}

