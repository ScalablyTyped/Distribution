package typings.ethereumDashProtocol.ethereumDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterObject extends js.Object {
  var address: js.UndefOr[String] = js.undefined
  var fromBlock: js.UndefOr[Double | String] = js.undefined
  var toBlock: js.UndefOr[Double | String] = js.undefined
  var topics: js.UndefOr[js.Array[LogTopic]] = js.undefined
}

object FilterObject {
  @scala.inline
  def apply(
    address: String = null,
    fromBlock: Double | String = null,
    toBlock: Double | String = null,
    topics: js.Array[LogTopic] = null
  ): FilterObject = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (fromBlock != null) __obj.updateDynamic("fromBlock")(fromBlock.asInstanceOf[js.Any])
    if (toBlock != null) __obj.updateDynamic("toBlock")(toBlock.asInstanceOf[js.Any])
    if (topics != null) __obj.updateDynamic("topics")(topics.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterObject]
  }
}

