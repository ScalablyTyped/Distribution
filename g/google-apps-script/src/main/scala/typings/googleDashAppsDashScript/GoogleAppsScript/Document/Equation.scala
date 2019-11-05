package typings.googleDashAppsDashScript.GoogleAppsScript.Document

import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An element representing a mathematical expression. An Equation may contain EquationFunction, EquationSymbol, and Text elements. For more information on
  * document structure, see the guide to
  * extending Google Docs.
  */
@js.native
trait Equation extends js.Object {
  def clear(): Equation = js.native
  def copy(): Equation = js.native
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
  def merge(): Equation = js.native
  def removeFromParent(): Equation = js.native
  def replaceText(searchPattern: String, replacement: String): Element = js.native
  def setAttributes(attributes: js.Any): Equation = js.native
  def setLinkUrl(url: String): Equation = js.native
  def setTextAlignment(textAlignment: TextAlignment): Equation = js.native
}

