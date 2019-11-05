package typings.googleDashAppsDashScript.GoogleAppsScript.Slides

import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A notes master in a presentation.
  *
  * Notes masters define the default text styles and page elements for all notes pages. Notes
  * masters are read-only.
  */
@js.native
trait NotesMaster extends js.Object {
  def getGroups(): js.Array[Group] = js.native
  def getImages(): js.Array[Image] = js.native
  def getLines(): js.Array[Line] = js.native
  def getObjectId(): String = js.native
  def getPageElementById(id: String): PageElement = js.native
  def getPageElements(): js.Array[PageElement] = js.native
  def getPlaceholder(placeholderType: PlaceholderType): PageElement = js.native
  def getPlaceholder(placeholderType: PlaceholderType, placeholderIndex: Integer): PageElement = js.native
  def getPlaceholders(): js.Array[PageElement] = js.native
  def getShapes(): js.Array[Shape] = js.native
  def getSheetsCharts(): js.Array[SheetsChart] = js.native
  def getTables(): js.Array[Table] = js.native
  def getVideos(): js.Array[Video] = js.native
  def getWordArts(): js.Array[WordArt] = js.native
}

