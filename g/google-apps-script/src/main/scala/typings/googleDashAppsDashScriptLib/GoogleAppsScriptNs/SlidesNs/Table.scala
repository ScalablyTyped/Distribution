package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Table extends js.Object {
  def alignOnPage(alignmentPosition: AlignmentPosition): Table = js.native
  def appendColumn(): TableColumn = js.native
  def appendRow(): TableRow = js.native
  def bringForward(): Table = js.native
  def bringToFront(): Table = js.native
  def duplicate(): PageElement = js.native
  def getCell(
    rowIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): TableCell = js.native
  def getColumn(columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): TableColumn = js.native
  def getConnectionSites(): js.Array[ConnectionSite] = js.native
  def getDescription(): java.lang.String = js.native
  def getHeight(): stdLib.Number = js.native
  def getInherentHeight(): stdLib.Number = js.native
  def getInherentWidth(): stdLib.Number = js.native
  def getLeft(): stdLib.Number = js.native
  def getNumColumns(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getNumRows(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getObjectId(): java.lang.String = js.native
  def getPageElementType(): PageElementType = js.native
  def getParentGroup(): Group = js.native
  def getParentPage(): Page = js.native
  def getRotation(): stdLib.Number = js.native
  def getRow(rowIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): TableRow = js.native
  def getTitle(): java.lang.String = js.native
  def getTop(): stdLib.Number = js.native
  def getTransform(): AffineTransform = js.native
  def getWidth(): stdLib.Number = js.native
  def insertColumn(index: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): TableColumn = js.native
  def insertRow(index: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): TableRow = js.native
  def preconcatenateTransform(transform: AffineTransform): Table = js.native
  def remove(): scala.Unit = js.native
  def scaleHeight(ratio: stdLib.Number): Table = js.native
  def scaleWidth(ratio: stdLib.Number): Table = js.native
  def select(): scala.Unit = js.native
  def select(replace: scala.Boolean): scala.Unit = js.native
  def sendBackward(): Table = js.native
  def sendToBack(): Table = js.native
  def setDescription(description: java.lang.String): Table = js.native
  def setHeight(height: stdLib.Number): Table = js.native
  def setLeft(left: stdLib.Number): Table = js.native
  def setRotation(angle: stdLib.Number): Table = js.native
  def setTitle(title: java.lang.String): Table = js.native
  def setTop(top: stdLib.Number): Table = js.native
  def setTransform(transform: AffineTransform): Table = js.native
  def setWidth(width: stdLib.Number): Table = js.native
}

