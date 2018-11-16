package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Audience
  extends ExcludedAudience
     with hasStats {
  def bidding(): AudienceBidding = js.native
  def isEnabled(): scala.Boolean = js.native
  def isPaused(): scala.Boolean = js.native
}

