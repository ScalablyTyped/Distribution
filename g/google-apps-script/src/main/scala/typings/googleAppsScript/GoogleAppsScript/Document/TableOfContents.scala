package typings.googleAppsScript.GoogleAppsScript.Document

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An element containing a table of contents. A TableOfContents may contain ListItem, Paragraph, and Table elements, although the contents of a TableOfContents are usually generated automatically by Google Docs. For more information on
  * document structure, see the guide to
  * extending Google Docs.
  */
@js.native
trait TableOfContents extends Element {
  
  def clear(): TableOfContents = js.native
  
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
  
  def setLinkUrl(url: String): TableOfContents = js.native
  
  def setTextAlignment(textAlignment: TextAlignment): TableOfContents = js.native
}
