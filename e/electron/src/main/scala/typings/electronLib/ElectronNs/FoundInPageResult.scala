package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoundInPageResult extends js.Object {
  /**
    * Position of the active match.
    */
  var activeMatchOrdinal: scala.Double
  var finalUpdate: scala.Boolean
  /**
    * Number of Matches.
    */
  var matches: scala.Double
  var requestId: scala.Double
  /**
    * Coordinates of first match region.
    */
  var selectionArea: SelectionArea
}

object FoundInPageResult {
  @scala.inline
  def apply(
    activeMatchOrdinal: scala.Double,
    finalUpdate: scala.Boolean,
    matches: scala.Double,
    requestId: scala.Double,
    selectionArea: SelectionArea
  ): FoundInPageResult = {
    val __obj = js.Dynamic.literal(activeMatchOrdinal = activeMatchOrdinal, finalUpdate = finalUpdate, matches = matches, requestId = requestId, selectionArea = selectionArea)
  
    __obj.asInstanceOf[FoundInPageResult]
  }
}

