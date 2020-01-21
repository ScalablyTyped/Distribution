package typings.ethSigUtil.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eth-sig-util", "TypedDataUtils")
@js.native
object TypedDataUtils extends js.Object {
  def encodeData(primaryType: String, data: EIP712Message, types: EIP712Types): Buffer = js.native
  def encodeType(primaryType: String, types: EIP712Types): String = js.native
  def findTypeDependencies(primaryType: String, types: EIP712Types): js.Array[String] = js.native
  def hashStruct(primaryType: String, data: EIP712Message, types: EIP712Types): Buffer = js.native
  def hashType(primaryType: String, types: EIP712Types): Buffer = js.native
  def sanitizeData(data: EIP712TypedData): EIP712TypedData = js.native
  /**
    * @returns hash of the typed data as defined by EIP712 (contrary to the function's name)
    * @see https://github.com/ethereum/EIPs/blob/master/EIPS/eip-712.md#specification
    */
  def sign(data: EIP712TypedData): Buffer = js.native
}

