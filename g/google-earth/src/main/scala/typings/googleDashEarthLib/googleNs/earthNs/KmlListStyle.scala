package typings
package googleDashEarthLib.googleNs.earthNs

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
  def getMaxSnippetLines(): scala.Double = js.native
  /**
       * Maximum number of lines of text for the Snippet.
       */
  def setMaxSnippetLines(maxSnippetLines: scala.Double): scala.Unit = js.native
}

