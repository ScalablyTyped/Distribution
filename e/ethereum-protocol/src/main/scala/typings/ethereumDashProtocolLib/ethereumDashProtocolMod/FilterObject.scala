package typings
package ethereumDashProtocolLib.ethereumDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterObject extends js.Object {
  var address: js.UndefOr[java.lang.String] = js.undefined
  var fromBlock: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var toBlock: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var topics: js.UndefOr[js.Array[LogTopic]] = js.undefined
}

object FilterObject {
  @scala.inline
  def apply(
    address: java.lang.String = null,
    fromBlock: scala.Double | java.lang.String = null,
    toBlock: scala.Double | java.lang.String = null,
    topics: js.Array[LogTopic] = null
  ): FilterObject = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (fromBlock != null) __obj.updateDynamic("fromBlock")(fromBlock.asInstanceOf[js.Any])
    if (toBlock != null) __obj.updateDynamic("toBlock")(toBlock.asInstanceOf[js.Any])
    if (topics != null) __obj.updateDynamic("topics")(topics)
    __obj.asInstanceOf[FilterObject]
  }
}

