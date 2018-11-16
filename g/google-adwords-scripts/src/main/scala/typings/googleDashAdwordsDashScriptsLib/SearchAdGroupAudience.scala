package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchAdGroupAudience
  extends SearchAdGroupExcludedAudience
     with hasStats {
  def bidding(): SearchAudienceBidding = js.native
  def isEnabled(): scala.Boolean = js.native
  def isPaused(): scala.Boolean = js.native
}

