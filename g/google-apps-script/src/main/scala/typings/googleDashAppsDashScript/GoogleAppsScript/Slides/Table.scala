package typings.googleDashAppsDashScript.GoogleAppsScript.Slides

import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A PageElement representing a table.
  */
@js.native
trait Table extends js.Object {
  def alignOnPage(alignmentPosition: AlignmentPosition): Table = js.native
  def appendColumn(): TableColumn = js.native
  def appendRow(): TableRow = js.native
  def bringForward(): Table = js.native
  def bringToFront(): Table = js.native
  def duplicate(): PageElement = js.native
  def getCell(rowIndex: Integer, columnIndex: Integer): TableCell = js.native
  def getColumn(columnIndex: Integer): TableColumn = js.native
  def getConnectionSites(): js.Array[ConnectionSite] = js.native
  def getDescription(): String = js.native
  def getHeight(): Double = js.native
  def getInherentHeight(): Double = js.native
  def getInherentWidth(): Double = js.native
  def getLeft(): Double = js.native
  def getNumColumns(): Integer = js.native
  def getNumRows(): Integer = js.native
  def getObjectId(): String = js.native
  def getPageElementType(): PageElementType = js.native
  def getParentGroup(): Group = js.native
  def getParentPage(): Page = js.native
  def getRotation(): Double = js.native
  def getRow(rowIndex: Integer): TableRow = js.native
  def getTitle(): String = js.native
  def getTop(): Double = js.native
  def getTransform(): AffineTransform = js.native
  def getWidth(): Double = js.native
  def insertColumn(index: Integer): TableColumn = js.native
  def insertRow(index: Integer): TableRow = js.native
  def preconcatenateTransform(transform: AffineTransform): Table = js.native
  def remove(): Unit = js.native
  def scaleHeight(ratio: Double): Table = js.native
  def scaleWidth(ratio: Double): Table = js.native
  def select(): Unit = js.native
  def select(replace: Boolean): Unit = js.native
  def sendBackward(): Table = js.native
  def sendToBack(): Table = js.native
  def setDescription(description: String): Table = js.native
  def setHeight(height: Double): Table = js.native
  def setLeft(left: Double): Table = js.native
  def setRotation(angle: Double): Table = js.native
  def setTitle(title: String): Table = js.native
  def setTop(top: Double): Table = js.native
  def setTransform(transform: AffineTransform): Table = js.native
  def setWidth(width: Double): Table = js.native
}

