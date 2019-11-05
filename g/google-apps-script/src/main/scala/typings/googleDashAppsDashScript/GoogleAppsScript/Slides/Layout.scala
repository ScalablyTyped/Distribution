package typings.googleDashAppsDashScript.GoogleAppsScript.Slides

import typings.googleDashAppsDashScript.GoogleAppsScript.Base.BlobSource
import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.EmbeddedChart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A layout in a presentation.
  *
  * Each layout serves as a template for slides that inherit from it, determining how content on
  * those slides is arranged and styled.
  */
@js.native
trait Layout extends js.Object {
  def getBackground(): PageBackground = js.native
  def getColorScheme(): ColorScheme = js.native
  def getGroups(): js.Array[Group] = js.native
  def getImages(): js.Array[Image] = js.native
  def getLayoutName(): String = js.native
  def getLines(): js.Array[Line] = js.native
  def getMaster(): Master = js.native
  def getObjectId(): String = js.native
  def getPageElementById(id: String): PageElement = js.native
  def getPageElements(): js.Array[PageElement] = js.native
  def getPageType(): PageType = js.native
  def getPlaceholder(placeholderType: PlaceholderType): PageElement = js.native
  def getPlaceholder(placeholderType: PlaceholderType, placeholderIndex: Integer): PageElement = js.native
  def getPlaceholders(): js.Array[PageElement] = js.native
  def getShapes(): js.Array[Shape] = js.native
  def getSheetsCharts(): js.Array[SheetsChart] = js.native
  def getTables(): js.Array[Table] = js.native
  def getVideos(): js.Array[Video] = js.native
  def getWordArts(): js.Array[WordArt] = js.native
  def group(pageElements: js.Array[PageElement]): Group = js.native
  def insertGroup(group: Group): Group = js.native
  def insertImage(blobSource: BlobSource): Image = js.native
  def insertImage(blobSource: BlobSource, left: Double, top: Double, width: Double, height: Double): Image = js.native
  def insertImage(imageUrl: String): Image = js.native
  def insertImage(imageUrl: String, left: Double, top: Double, width: Double, height: Double): Image = js.native
  def insertImage(image: Image): Image = js.native
  def insertLine(lineCategory: LineCategory, startConnectionSite: ConnectionSite, endConnectionSite: ConnectionSite): Line = js.native
  def insertLine(lineCategory: LineCategory, startLeft: Double, startTop: Double, endLeft: Double, endTop: Double): Line = js.native
  def insertLine(line: Line): Line = js.native
  def insertPageElement(pageElement: PageElement): PageElement = js.native
  def insertShape(shapeType: ShapeType): Shape = js.native
  def insertShape(shapeType: ShapeType, left: Double, top: Double, width: Double, height: Double): Shape = js.native
  def insertShape(shape: Shape): Shape = js.native
  def insertSheetsChart(sheetsChart: SheetsChart): SheetsChart = js.native
  def insertSheetsChart(sourceChart: EmbeddedChart): SheetsChart = js.native
  def insertSheetsChart(sourceChart: EmbeddedChart, left: Double, top: Double, width: Double, height: Double): SheetsChart = js.native
  def insertSheetsChartAsImage(sourceChart: EmbeddedChart): Image = js.native
  def insertSheetsChartAsImage(sourceChart: EmbeddedChart, left: Double, top: Double, width: Double, height: Double): Image = js.native
  def insertTable(numRows: Integer, numColumns: Integer): Table = js.native
  def insertTable(numRows: Integer, numColumns: Integer, left: Double, top: Double, width: Double, height: Double): Table = js.native
  def insertTable(table: Table): Table = js.native
  def insertTextBox(text: String): Shape = js.native
  def insertTextBox(text: String, left: Double, top: Double, width: Double, height: Double): Shape = js.native
  def insertVideo(videoUrl: String): Video = js.native
  def insertVideo(videoUrl: String, left: Double, top: Double, width: Double, height: Double): Video = js.native
  def insertVideo(video: Video): Video = js.native
  def insertWordArt(wordArt: WordArt): WordArt = js.native
  def remove(): Unit = js.native
  def replaceAllText(findText: String, replaceText: String): Integer = js.native
  def replaceAllText(findText: String, replaceText: String, matchCase: Boolean): Integer = js.native
  def selectAsCurrentPage(): Unit = js.native
}

