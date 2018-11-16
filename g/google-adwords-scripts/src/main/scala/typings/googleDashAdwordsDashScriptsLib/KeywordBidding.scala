package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeywordBidding
  extends AdWordsBidding
     with canSetBiddingStrategy {
  def clearStrategy(): scala.Unit = js.native
  def getCpc(): scala.Double = js.native
  def getCpm(): scala.Double = js.native
  def setCpc(cpc: scala.Double): scala.Unit = js.native
  def setCpm(cpm: scala.Double): scala.Unit = js.native
}

