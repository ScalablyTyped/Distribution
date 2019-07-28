package typings.googleDashAdwordsDashScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchAdGroupAudience
  extends SearchAdGroupExcludedAudience
     with hasStats {
  def bidding(): SearchAudienceBidding = js.native
  def isEnabled(): Boolean = js.native
  def isPaused(): Boolean = js.native
}

