package typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet

import typings.googleDashAppsDashScript.GoogleAppsScript.Base.BlobSource
import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverGridImage extends js.Object {
  def assignScript(functionName: String): OverGridImage = js.native
  def getAltTextDescription(): String = js.native
  def getAltTextTitle(): String = js.native
  def getAnchorCell(): Range = js.native
  def getAnchorCellXOffset(): Integer = js.native
  def getAnchorCellYOffset(): Integer = js.native
  def getHeight(): Integer = js.native
  def getInherentHeight(): Integer = js.native
  def getInherentWidth(): Integer = js.native
  def getScript(): String = js.native
  def getSheet(): Sheet = js.native
  def getUrl(): String | Null = js.native
  def getWidth(): Integer = js.native
  def remove(): Unit = js.native
  def replace(blob: BlobSource): OverGridImage = js.native
  def replace(url: String): OverGridImage = js.native
  def resetSize(): OverGridImage = js.native
  def setAltTextDescription(description: String): OverGridImage = js.native
  def setAltTextTitle(title: String): OverGridImage = js.native
  def setAnchorCell(cell: Range): OverGridImage = js.native
  def setAnchorCellXOffset(offset: Integer): OverGridImage = js.native
  def setAnchorCellYOffset(offset: Integer): OverGridImage = js.native
  def setHeight(height: Integer): OverGridImage = js.native
  def setWidth(width: Integer): OverGridImage = js.native
}

