package typings.googleDashAdwordsDashScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Topic
  extends ExcludedTopic
     with hasStats {
  def bidding(): TopicBidding = js.native
  def isEnabled(): Boolean = js.native
  def isPaused(): Boolean = js.native
}

