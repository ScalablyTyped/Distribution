package typings.ethereumProtocol.mod

import typings.bignumberJs.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbstractBlock extends js.Object {
  var difficulty: default = js.native
  var extraData: String = js.native
  var gasLimit: Double = js.native
  var gasUsed: Double = js.native
  var hash: String | Null = js.native
  var logsBloom: String | Null = js.native
  var miner: String = js.native
  var nonce: String | Null = js.native
  var number: Double | Null = js.native
  var parentHash: String = js.native
  var sha3Uncles: String = js.native
  var size: Double = js.native
  var stateRoot: String = js.native
  var timestamp: Double = js.native
  var totalDifficulty: default = js.native
  var transactionsRoot: String = js.native
  var uncles: js.Array[String] = js.native
}

object AbstractBlock {
  @scala.inline
  def apply(
    difficulty: default,
    extraData: String,
    gasLimit: Double,
    gasUsed: Double,
    miner: String,
    parentHash: String,
    sha3Uncles: String,
    size: Double,
    stateRoot: String,
    timestamp: Double,
    totalDifficulty: default,
    transactionsRoot: String,
    uncles: js.Array[String]
  ): AbstractBlock = {
    val __obj = js.Dynamic.literal(difficulty = difficulty.asInstanceOf[js.Any], extraData = extraData.asInstanceOf[js.Any], gasLimit = gasLimit.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any], miner = miner.asInstanceOf[js.Any], parentHash = parentHash.asInstanceOf[js.Any], sha3Uncles = sha3Uncles.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], stateRoot = stateRoot.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], totalDifficulty = totalDifficulty.asInstanceOf[js.Any], transactionsRoot = transactionsRoot.asInstanceOf[js.Any], uncles = uncles.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractBlock]
  }
  @scala.inline
  implicit class AbstractBlockOps[Self <: AbstractBlock] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDifficulty(value: default): Self = this.set("difficulty", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtraData(value: String): Self = this.set("extraData", value.asInstanceOf[js.Any])
    @scala.inline
    def setGasLimit(value: Double): Self = this.set("gasLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def setGasUsed(value: Double): Self = this.set("gasUsed", value.asInstanceOf[js.Any])
    @scala.inline
    def setMiner(value: String): Self = this.set("miner", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentHash(value: String): Self = this.set("parentHash", value.asInstanceOf[js.Any])
    @scala.inline
    def setSha3Uncles(value: String): Self = this.set("sha3Uncles", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setStateRoot(value: String): Self = this.set("stateRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalDifficulty(value: default): Self = this.set("totalDifficulty", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransactionsRoot(value: String): Self = this.set("transactionsRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnclesVarargs(value: String*): Self = this.set("uncles", js.Array(value :_*))
    @scala.inline
    def setUncles(value: js.Array[String]): Self = this.set("uncles", value.asInstanceOf[js.Any])
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def setHashNull: Self = this.set("hash", null)
    @scala.inline
    def setLogsBloom(value: String): Self = this.set("logsBloom", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogsBloomNull: Self = this.set("logsBloom", null)
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    @scala.inline
    def setNonceNull: Self = this.set("nonce", null)
    @scala.inline
    def setNumber(value: Double): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberNull: Self = this.set("number", null)
  }
  
}

