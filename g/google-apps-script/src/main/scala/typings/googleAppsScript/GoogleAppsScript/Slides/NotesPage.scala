package typings.googleAppsScript.GoogleAppsScript.Slides

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A notes page in a presentation.
  *
  * These pages contain the content for presentation handouts, including a a shape that contains
  * the slide's speaker notes. Each slide has one corresponding notes page. Only the text in the
  * speaker notes shape can be modified.
  */
@js.native
trait NotesPage extends js.Object {
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
  def getSpeakerNotesShape(): Shape = js.native
  def getTables(): js.Array[Table] = js.native
  def getVideos(): js.Array[Video] = js.native
  def getWordArts(): js.Array[WordArt] = js.native
  def replaceAllText(findText: String, replaceText: String): Integer = js.native
  def replaceAllText(findText: String, replaceText: String, matchCase: Boolean): Integer = js.native
}

