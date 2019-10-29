package typings.ethereumDashBloomDashFilters

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethereum-bloom-filters/dist", JSImport.Namespace)
@js.native
object distMod extends js.Object {
  def isAddress(address: String): Boolean = js.native
  def isBloom(bloom: String): Boolean = js.native
  def isContractAddressInBloom(bloom: String, contractAddress: String): Boolean = js.native
  def isInBloom(bloom: String, value: String): Boolean = js.native
  def isInBloom(bloom: String, value: Uint8Array): Boolean = js.native
  def isTopic(topic: String): Boolean = js.native
  def isTopicInBloom(bloom: String, topic: String): Boolean = js.native
  def isUserEthereumAddressInBloom(bloom: String, ethereumAddress: String): Boolean = js.native
}

