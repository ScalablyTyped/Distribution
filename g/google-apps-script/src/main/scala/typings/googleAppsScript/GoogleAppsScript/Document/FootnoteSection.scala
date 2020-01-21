package typings.googleAppsScript.GoogleAppsScript.Document

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An element representing a footnote section. A FootnoteSection contains the text that
  * corresponds to a Footnote. The FootnoteSection may contain ListItem or
  * Paragraph elements. For more information on document structure, see the guide to extending Google Docs.
  */
@js.native
trait FootnoteSection extends Element {
  def appendParagraph(paragraph: Paragraph): Paragraph = js.native
  def appendParagraph(text: String): Paragraph = js.native
  def clear(): FootnoteSection = js.native
  def editAsText(): Text = js.native
  def findElement(elementType: ElementType): RangeElement = js.native
  def findElement(elementType: ElementType, from: RangeElement): RangeElement = js.native
  def findText(searchPattern: String): RangeElement = js.native
  def findText(searchPattern: String, from: RangeElement): RangeElement = js.native
  def getChild(childIndex: Integer): Element = js.native
  def getChildIndex(child: Element): Integer = js.native
  /** @deprecated DO NOT USE */ def getFootnotes(): js.Array[Footnote] = js.native
  /** @deprecated DO NOT USE */ def getLinkUrl(): String = js.native
  def getNumChildren(): Integer = js.native
  def getParagraphs(): js.Array[Paragraph] = js.native
  def getText(): String = js.native
  def getTextAlignment(): TextAlignment = js.native
  def insertParagraph(childIndex: Integer, paragraph: Paragraph): Paragraph = js.native
  def insertParagraph(childIndex: Integer, text: String): Paragraph = js.native
  def removeChild(child: Element): FootnoteSection = js.native
  def replaceText(searchPattern: String, replacement: String): Element = js.native
  /** @deprecated DO NOT USE */ def setLinkUrl(url: String): FootnoteSection = js.native
  def setText(text: String): FootnoteSection = js.native
  def setTextAlignment(textAlignment: TextAlignment): FootnoteSection = js.native
}

