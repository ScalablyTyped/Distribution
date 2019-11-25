package typings.ethers.distTypesUtilsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  var address: js.UndefOr[String] = js.undefined
  var fromBlock: js.UndefOr[BlockTag] = js.undefined
  var toBlock: js.UndefOr[BlockTag] = js.undefined
  var topics: js.UndefOr[js.Array[String | js.Array[String]]] = js.undefined
}

object Filter {
  @scala.inline
  def apply(
    address: String = null,
    fromBlock: BlockTag = null,
    toBlock: BlockTag = null,
    topics: js.Array[String | js.Array[String]] = null
  ): Filter = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (fromBlock != null) __obj.updateDynamic("fromBlock")(fromBlock.asInstanceOf[js.Any])
    if (toBlock != null) __obj.updateDynamic("toBlock")(toBlock.asInstanceOf[js.Any])
    if (topics != null) __obj.updateDynamic("topics")(topics.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
}

