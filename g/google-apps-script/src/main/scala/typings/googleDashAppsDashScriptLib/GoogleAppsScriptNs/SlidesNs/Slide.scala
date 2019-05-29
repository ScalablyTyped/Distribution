package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Slide extends js.Object {
  def duplicate(): Slide = js.native
  def getBackground(): PageBackground = js.native
  def getColorScheme(): ColorScheme = js.native
  def getGroups(): js.Array[Group] = js.native
  def getImages(): js.Array[Image] = js.native
  def getLayout(): Layout = js.native
  def getLines(): js.Array[Line] = js.native
  def getNotesPage(): NotesPage = js.native
  def getObjectId(): java.lang.String = js.native
  def getPageElementById(id: java.lang.String): PageElement = js.native
  def getPageElements(): js.Array[PageElement] = js.native
  def getPageType(): PageType = js.native
  def getPlaceholder(placeholderType: PlaceholderType): PageElement = js.native
  def getPlaceholder(
    placeholderType: PlaceholderType,
    placeholderIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): PageElement = js.native
  def getPlaceholders(): js.Array[PageElement] = js.native
  def getShapes(): js.Array[Shape] = js.native
  def getSheetsCharts(): js.Array[SheetsChart] = js.native
  def getSlideLinkingMode(): SlideLinkingMode = js.native
  def getSourcePresentationId(): java.lang.String = js.native
  def getSourceSlideObjectId(): java.lang.String = js.native
  def getTables(): js.Array[Table] = js.native
  def getVideos(): js.Array[Video] = js.native
  def getWordArts(): js.Array[WordArt] = js.native
  def group(pageElements: js.Array[PageElement]): Group = js.native
  def insertGroup(group: Group): Group = js.native
  def insertImage(blobSource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.BlobSource): Image = js.native
  def insertImage(
    blobSource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.BlobSource,
    left: scala.Double,
    top: scala.Double,
    width: scala.Double,
    height: scala.Double
  ): Image = js.native
  def insertImage(imageUrl: java.lang.String): Image = js.native
  def insertImage(
    imageUrl: java.lang.String,
    left: scala.Double,
    top: scala.Double,
    width: scala.Double,
    height: scala.Double
  ): Image = js.native
  def insertImage(image: Image): Image = js.native
  def insertLine(lineCategory: LineCategory, startConnectionSite: ConnectionSite, endConnectionSite: ConnectionSite): Line = js.native
  def insertLine(
    lineCategory: LineCategory,
    startLeft: scala.Double,
    startTop: scala.Double,
    endLeft: scala.Double,
    endTop: scala.Double
  ): Line = js.native
  def insertLine(line: Line): Line = js.native
  def insertPageElement(pageElement: PageElement): PageElement = js.native
  def insertShape(shapeType: ShapeType): Shape = js.native
  def insertShape(
    shapeType: ShapeType,
    left: scala.Double,
    top: scala.Double,
    width: scala.Double,
    height: scala.Double
  ): Shape = js.native
  def insertShape(shape: Shape): Shape = js.native
  def insertSheetsChart(sheetsChart: SheetsChart): SheetsChart = js.native
  def insertSheetsChart(sourceChart: googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.EmbeddedChart): SheetsChart = js.native
  def insertSheetsChart(
    sourceChart: googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.EmbeddedChart,
    left: scala.Double,
    top: scala.Double,
    width: scala.Double,
    height: scala.Double
  ): SheetsChart = js.native
  def insertSheetsChartAsImage(sourceChart: googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.EmbeddedChart): Image = js.native
  def insertSheetsChartAsImage(
    sourceChart: googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.EmbeddedChart,
    left: scala.Double,
    top: scala.Double,
    width: scala.Double,
    height: scala.Double
  ): Image = js.native
  def insertTable(
    numRows: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    numColumns: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): Table = js.native
  def insertTable(
    numRows: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    numColumns: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    left: scala.Double,
    top: scala.Double,
    width: scala.Double,
    height: scala.Double
  ): Table = js.native
  def insertTable(table: Table): Table = js.native
  def insertTextBox(text: java.lang.String): Shape = js.native
  def insertTextBox(
    text: java.lang.String,
    left: scala.Double,
    top: scala.Double,
    width: scala.Double,
    height: scala.Double
  ): Shape = js.native
  def insertVideo(videoUrl: java.lang.String): Video = js.native
  def insertVideo(
    videoUrl: java.lang.String,
    left: scala.Double,
    top: scala.Double,
    width: scala.Double,
    height: scala.Double
  ): Video = js.native
  def insertVideo(video: Video): Video = js.native
  def insertWordArt(wordArt: WordArt): WordArt = js.native
  def move(index: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Unit = js.native
  def refreshSlide(): scala.Unit = js.native
  def remove(): scala.Unit = js.native
  def replaceAllText(findText: java.lang.String, replaceText: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def replaceAllText(findText: java.lang.String, replaceText: java.lang.String, matchCase: scala.Boolean): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def selectAsCurrentPage(): scala.Unit = js.native
  def unlink(): scala.Unit = js.native
}

