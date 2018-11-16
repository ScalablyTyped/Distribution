package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Placement
  extends ExcludedPlacement
     with hasStats {
  def bidding(): PlacementBidding = js.native
  def isEnabled(): scala.Boolean = js.native
  def isManaged(): scala.Boolean = js.native
  def isPaused(): scala.Boolean = js.native
}

