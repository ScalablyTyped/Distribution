package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Audience
  extends ExcludedAudience
     with hasStats {
  def bidding(): AudienceBidding = js.native
  def isEnabled(): Boolean = js.native
  def isPaused(): Boolean = js.native
}

