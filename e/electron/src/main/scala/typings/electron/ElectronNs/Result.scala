package typings.electron.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  /**
    * Position of the active match.
    */
  var activeMatchOrdinal: Double
  var finalUpdate: Boolean
  /**
    * Number of Matches.
    */
  var matches: Double
  var requestId: Double
  /**
    * Coordinates of first match region.
    */
  var selectionArea: SelectionArea
}

object Result {
  @scala.inline
  def apply(
    activeMatchOrdinal: Double,
    finalUpdate: Boolean,
    matches: Double,
    requestId: Double,
    selectionArea: SelectionArea
  ): Result = {
    val __obj = js.Dynamic.literal(activeMatchOrdinal = activeMatchOrdinal, finalUpdate = finalUpdate, matches = matches, requestId = requestId, selectionArea = selectionArea)
  
    __obj.asInstanceOf[Result]
  }
}

