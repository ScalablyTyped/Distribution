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

