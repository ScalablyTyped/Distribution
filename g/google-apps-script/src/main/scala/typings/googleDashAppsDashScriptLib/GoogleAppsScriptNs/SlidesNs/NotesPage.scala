package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotesPage extends js.Object {
  def getGroups(): js.Array[Group] = js.native
  def getImages(): js.Array[Image] = js.native
  def getLines(): js.Array[Line] = js.native
  def getObjectId(): java.lang.String = js.native
  def getPageElements(): js.Array[PageElement] = js.native
  def getPlaceholder(placeholderType: PlaceholderType): PageElement = js.native
  def getPlaceholder(
    placeholderType: PlaceholderType,
    placeholderIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): PageElement = js.native
  def getPlaceholders(): js.Array[PageElement] = js.native
  def getShapes(): js.Array[Shape] = js.native
  def getSheetsCharts(): js.Array[SheetsChart] = js.native
  def getSpeakerNotesShape(): Shape = js.native
  def getTables(): js.Array[Table] = js.native
  def getVideos(): js.Array[Video] = js.native
  def getWordArts(): js.Array[WordArt] = js.native
  def replaceAllText(findText: java.lang.String, replaceText: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def replaceAllText(findText: java.lang.String, replaceText: java.lang.String, matchCase: scala.Boolean): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
}

