package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotesMaster extends js.Object {
  def getGroups(): js.Array[Group] = js.native
  def getImages(): js.Array[Image] = js.native
  def getLines(): js.Array[Line] = js.native
  def getObjectId(): java.lang.String = js.native
  def getPageElementById(id: java.lang.String): PageElement = js.native
  def getPageElements(): js.Array[PageElement] = js.native
  def getPlaceholder(placeholderType: PlaceholderType): PageElement = js.native
  def getPlaceholder(
    placeholderType: PlaceholderType,
    placeholderIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): PageElement = js.native
  def getPlaceholders(): js.Array[PageElement] = js.native
  def getShapes(): js.Array[Shape] = js.native
  def getSheetsCharts(): js.Array[SheetsChart] = js.native
  def getTables(): js.Array[Table] = js.native
  def getVideos(): js.Array[Video] = js.native
  def getWordArts(): js.Array[WordArt] = js.native
}

