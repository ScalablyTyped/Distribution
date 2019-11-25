package typings.electron.Electron

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
    val __obj = js.Dynamic.literal(activeMatchOrdinal = activeMatchOrdinal.asInstanceOf[js.Any], finalUpdate = finalUpdate.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], selectionArea = selectionArea.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Result]
  }
}

