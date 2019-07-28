package typings.googleDashAdwordsDashScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeywordBidding
  extends AdWordsBidding
     with canSetBiddingStrategy {
  def clearStrategy(): Unit = js.native
  def getCpc(): Double = js.native
  def getCpm(): Double = js.native
  def setCpc(cpc: Double): Unit = js.native
  def setCpm(cpm: Double): Unit = js.native
}

