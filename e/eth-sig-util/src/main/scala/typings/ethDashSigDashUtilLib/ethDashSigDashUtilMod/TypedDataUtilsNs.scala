package typings
package ethDashSigDashUtilLib.ethDashSigDashUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eth-sig-util", "TypedDataUtils")
@js.native
object TypedDataUtilsNs extends js.Object {
  def encodeData(
    primaryType: java.lang.String,
    data: ethDashSigDashUtilLib.ethDashSigDashUtilMod.EIP712Message,
    types: ethDashSigDashUtilLib.ethDashSigDashUtilMod.EIP712Types
  ): nodeLib.Buffer = js.native
  def encodeType(primaryType: java.lang.String, types: ethDashSigDashUtilLib.ethDashSigDashUtilMod.EIP712Types): java.lang.String = js.native
  def findTypeDependencies(primaryType: java.lang.String, types: ethDashSigDashUtilLib.ethDashSigDashUtilMod.EIP712Types): js.Array[java.lang.String] = js.native
  def hashStruct(
    primaryType: java.lang.String,
    data: ethDashSigDashUtilLib.ethDashSigDashUtilMod.EIP712Message,
    types: ethDashSigDashUtilLib.ethDashSigDashUtilMod.EIP712Types
  ): nodeLib.Buffer = js.native
  def hashType(primaryType: java.lang.String, types: ethDashSigDashUtilLib.ethDashSigDashUtilMod.EIP712Types): nodeLib.Buffer = js.native
  def sanitizeData(data: ethDashSigDashUtilLib.ethDashSigDashUtilMod.EIP712TypedData): ethDashSigDashUtilLib.ethDashSigDashUtilMod.EIP712TypedData = js.native
  /**
    * @returns hash of the typed data as defined by EIP712 (contrary to the function's name)
    * @see https://github.com/ethereum/EIPs/blob/master/EIPS/eip-712.md#specification
    */
  def sign(data: ethDashSigDashUtilLib.ethDashSigDashUtilMod.EIP712TypedData): nodeLib.Buffer = js.native
}

