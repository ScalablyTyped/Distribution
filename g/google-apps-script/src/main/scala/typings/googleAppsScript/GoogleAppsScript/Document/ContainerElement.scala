package typings.googleAppsScript.GoogleAppsScript.Document

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A generic element that may contain other elements. All elements that may contain child elements,
  * such as Paragraph, inherit from ContainerElement.
  */
@js.native
trait ContainerElement extends Element {
  def clear(): ContainerElement = js.native
  def editAsText(): Text = js.native
  def findElement(elementType: ElementType): RangeElement = js.native
  def findElement(elementType: ElementType, from: RangeElement): RangeElement = js.native
  def findText(searchPattern: String): RangeElement = js.native
  def findText(searchPattern: String, from: RangeElement): RangeElement = js.native
  def getChild(childIndex: Integer): Element = js.native
  def getChildIndex(child: Element): Integer = js.native
  def getLinkUrl(): String = js.native
  def getNumChildren(): Integer = js.native
  def getText(): String = js.native
  def getTextAlignment(): TextAlignment = js.native
  def replaceText(searchPattern: String, replacement: String): Element = js.native
  def setLinkUrl(url: String): ContainerElement = js.native
  def setTextAlignment(textAlignment: TextAlignment): ContainerElement = js.native
}

