package typings.ethers.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionReceipt extends js.Object {
  var blockHash: js.UndefOr[String] = js.undefined
  var blockNumber: js.UndefOr[Double] = js.undefined
  var byzantium: Boolean
  var contractAddress: js.UndefOr[String] = js.undefined
  var cumulativeGasUsed: js.UndefOr[BigNumber] = js.undefined
  var gasUsed: js.UndefOr[BigNumber] = js.undefined
  var logs: js.UndefOr[js.Array[Log]] = js.undefined
  var logsBloom: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[Double] = js.undefined
  var transactionHash: js.UndefOr[String] = js.undefined
  var transactionIndex: js.UndefOr[Double] = js.undefined
}

object TransactionReceipt {
  @scala.inline
  def apply(
    byzantium: Boolean,
    blockHash: String = null,
    blockNumber: Int | Double = null,
    contractAddress: String = null,
    cumulativeGasUsed: BigNumber = null,
    gasUsed: BigNumber = null,
    logs: js.Array[Log] = null,
    logsBloom: String = null,
    root: String = null,
    status: Int | Double = null,
    transactionHash: String = null,
    transactionIndex: Int | Double = null
  ): TransactionReceipt = {
    val __obj = js.Dynamic.literal(byzantium = byzantium.asInstanceOf[js.Any])
    if (blockHash != null) __obj.updateDynamic("blockHash")(blockHash.asInstanceOf[js.Any])
    if (blockNumber != null) __obj.updateDynamic("blockNumber")(blockNumber.asInstanceOf[js.Any])
    if (contractAddress != null) __obj.updateDynamic("contractAddress")(contractAddress.asInstanceOf[js.Any])
    if (cumulativeGasUsed != null) __obj.updateDynamic("cumulativeGasUsed")(cumulativeGasUsed.asInstanceOf[js.Any])
    if (gasUsed != null) __obj.updateDynamic("gasUsed")(gasUsed.asInstanceOf[js.Any])
    if (logs != null) __obj.updateDynamic("logs")(logs.asInstanceOf[js.Any])
    if (logsBloom != null) __obj.updateDynamic("logsBloom")(logsBloom.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (transactionHash != null) __obj.updateDynamic("transactionHash")(transactionHash.asInstanceOf[js.Any])
    if (transactionIndex != null) __obj.updateDynamic("transactionIndex")(transactionIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionReceipt]
  }
}

