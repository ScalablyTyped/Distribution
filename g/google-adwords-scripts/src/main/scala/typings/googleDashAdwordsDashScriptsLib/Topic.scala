package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Topic
  extends ExcludedTopic
     with hasStats {
  def bidding(): TopicBidding = js.native
  def isEnabled(): scala.Boolean = js.native
  def isPaused(): scala.Boolean = js.native
}

