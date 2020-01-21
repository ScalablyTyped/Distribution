package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Placement
  extends ExcludedPlacement
     with hasStats {
  def bidding(): PlacementBidding = js.native
  def isEnabled(): Boolean = js.native
  def isManaged(): Boolean = js.native
  def isPaused(): Boolean = js.native
}

