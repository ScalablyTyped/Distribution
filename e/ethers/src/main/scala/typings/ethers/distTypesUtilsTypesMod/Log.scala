package typings.ethers.distTypesUtilsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Log extends js.Object {
  var address: String
  var blockHash: js.UndefOr[String] = js.undefined
  var blockNumber: js.UndefOr[Double] = js.undefined
  var data: String
  var logIndex: js.UndefOr[Double] = js.undefined
  var removed: js.UndefOr[Boolean] = js.undefined
  var topics: js.Array[String]
  var transactionHash: js.UndefOr[String] = js.undefined
  var transactionIndex: js.UndefOr[Double] = js.undefined
  var transactionLogIndex: js.UndefOr[Double] = js.undefined
}

object Log {
  @scala.inline
  def apply(
    address: String,
    data: String,
    topics: js.Array[String],
    blockHash: String = null,
    blockNumber: Int | Double = null,
    logIndex: Int | Double = null,
    removed: js.UndefOr[Boolean] = js.undefined,
    transactionHash: String = null,
    transactionIndex: Int | Double = null,
    transactionLogIndex: Int | Double = null
  ): Log = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any])
    if (blockHash != null) __obj.updateDynamic("blockHash")(blockHash.asInstanceOf[js.Any])
    if (blockNumber != null) __obj.updateDynamic("blockNumber")(blockNumber.asInstanceOf[js.Any])
    if (logIndex != null) __obj.updateDynamic("logIndex")(logIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(removed)) __obj.updateDynamic("removed")(removed.asInstanceOf[js.Any])
    if (transactionHash != null) __obj.updateDynamic("transactionHash")(transactionHash.asInstanceOf[js.Any])
    if (transactionIndex != null) __obj.updateDynamic("transactionIndex")(transactionIndex.asInstanceOf[js.Any])
    if (transactionLogIndex != null) __obj.updateDynamic("transactionLogIndex")(transactionLogIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Log]
  }
}

