package typings.googleAppsScript.GoogleAppsScript.Document

import typings.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An element representing a table row. A TableRow is always contained within a Table and may only contain TableCell elements. For more information on document
  * structure, see the guide to extending
  * Google Docs.
  */
@js.native
trait TableRow extends Element {
  
  def appendTableCell(): TableCell = js.native
  def appendTableCell(tableCell: TableCell): TableCell = js.native
  def appendTableCell(textContents: String): TableCell = js.native
  
  def clear(): TableRow = js.native
  
  def editAsText(): Text = js.native
  
  def findElement(elementType: ElementType): RangeElement = js.native
  def findElement(elementType: ElementType, from: RangeElement): RangeElement = js.native
  
  def findText(searchPattern: String): RangeElement = js.native
  def findText(searchPattern: String, from: RangeElement): RangeElement = js.native
  
  def getCell(cellIndex: Integer): TableCell = js.native
  
  def getChild(childIndex: Integer): Element = js.native
  
  def getChildIndex(child: Element): Integer = js.native
  
  def getLinkUrl(): String = js.native
  
  def getMinimumHeight(): Double = js.native
  
  def getNumCells(): Integer = js.native
  
  def getNumChildren(): Integer = js.native
  
  def getParentTable(): Table = js.native
  
  def getText(): String = js.native
  
  def getTextAlignment(): TextAlignment = js.native
  
  def insertTableCell(childIndex: Integer): TableCell = js.native
  def insertTableCell(childIndex: Integer, tableCell: TableCell): TableCell = js.native
  def insertTableCell(childIndex: Integer, textContents: String): TableCell = js.native
  
  def removeCell(cellIndex: Integer): TableCell = js.native
  
  def removeChild(child: Element): TableRow = js.native
  
  def replaceText(searchPattern: String, replacement: String): Element = js.native
  
  def setLinkUrl(url: String): TableRow = js.native
  
  def setMinimumHeight(minHeight: Double): TableRow = js.native
  
  def setTextAlignment(textAlignment: TextAlignment): TableRow = js.native
}
