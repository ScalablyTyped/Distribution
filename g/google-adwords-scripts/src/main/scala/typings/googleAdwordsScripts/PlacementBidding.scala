package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlacementBidding
  extends DisplayBidding
     with canSetBiddingStrategy {
  def clearStrategy(): Unit = js.native
}

