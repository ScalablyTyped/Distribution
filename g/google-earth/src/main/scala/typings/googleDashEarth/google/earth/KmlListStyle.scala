package typings.googleDashEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlListStyle")
@js.native
class KmlListStyle () extends KmlObject {
  /**
    * Background color for the Snippet.
    */
  def getBgColor(): KmlColor = js.native
  /**
    * Specifies how a feature should be displayed in a list view.
    */
  def getListItemType(): KmlListItemTypeEnum = js.native
  /**
    * Maximum number of lines of text for the Snippet.
    */
  def getMaxSnippetLines(): Double = js.native
  /**
    * Maximum number of lines of text for the Snippet.
    */
  def setMaxSnippetLines(maxSnippetLines: Double): Unit = js.native
}

