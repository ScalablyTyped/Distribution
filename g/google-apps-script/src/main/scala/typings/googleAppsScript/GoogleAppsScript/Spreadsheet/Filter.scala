package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access and modify existing filters. To create a new filter, use Range.createFilter().
  */
@js.native
trait Filter extends js.Object {
  
  def getColumnFilterCriteria(columnPosition: Integer): FilterCriteria | Null = js.native
  
  def getRange(): Range = js.native
  
  def remove(): Unit = js.native
  
  def removeColumnFilterCriteria(columnPosition: Integer): Filter = js.native
  
  def setColumnFilterCriteria(columnPosition: Integer): Filter = js.native
  def setColumnFilterCriteria(columnPosition: Integer, filterCriteria: FilterCriteria): Filter = js.native
  
  def sort(columnPosition: Integer, ascending: Boolean): Filter = js.native
}
