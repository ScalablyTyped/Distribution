package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access and modify bandings, the color patterns applied to rows or columns of a range. Each
  * banding consists of a range and a set of colors for rows, columns, headers, and footers.
  */
@js.native
trait Banding extends StObject {
  
  def copyTo(range: Range): Banding = js.native
  
  def getFirstColumnColor(): String | Null = js.native
  
  def getFirstRowColor(): String | Null = js.native
  
  def getFooterColumnColor(): String | Null = js.native
  
  def getFooterRowColor(): String | Null = js.native
  
  def getHeaderColumnColor(): String | Null = js.native
  
  def getHeaderRowColor(): String | Null = js.native
  
  def getRange(): Range = js.native
  
  def getSecondColumnColor(): String | Null = js.native
  
  def getSecondRowColor(): String | Null = js.native
  
  def remove(): Unit = js.native
  
  def setFirstColumnColor(): Banding = js.native
  def setFirstColumnColor(color: String): Banding = js.native
  
  def setFirstRowColor(): Banding = js.native
  def setFirstRowColor(color: String): Banding = js.native
  
  def setFooterColumnColor(): Banding = js.native
  def setFooterColumnColor(color: String): Banding = js.native
  
  def setFooterRowColor(): Banding = js.native
  def setFooterRowColor(color: String): Banding = js.native
  
  def setHeaderColumnColor(): Banding = js.native
  def setHeaderColumnColor(color: String): Banding = js.native
  
  def setHeaderRowColor(): Banding = js.native
  def setHeaderRowColor(color: String): Banding = js.native
  
  def setRange(range: Range): Banding = js.native
  
  def setSecondColumnColor(): Banding = js.native
  def setSecondColumnColor(color: String): Banding = js.native
  
  def setSecondRowColor(): Banding = js.native
  def setSecondRowColor(color: String): Banding = js.native
}
