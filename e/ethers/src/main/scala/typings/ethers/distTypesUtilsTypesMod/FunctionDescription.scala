package typings.ethers.distTypesUtilsTypesMod

import typings.ethers.ethersStrings.call
import typings.ethers.ethersStrings.transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionDescription extends js.Object {
  val inputs: js.Array[ParamType]
  val name: String
  val outputs: js.Array[ParamType]
  val payable: Boolean
  val sighash: String
  val signature: String
  val `type`: call | transaction
  def decode(data: String): js.Any
  def encode(params: js.Array[_]): String
}

object FunctionDescription {
  @scala.inline
  def apply(
    decode: String => js.Any,
    encode: js.Array[_] => String,
    inputs: js.Array[ParamType],
    name: String,
    outputs: js.Array[ParamType],
    payable: Boolean,
    sighash: String,
    signature: String,
    `type`: call | transaction
  ): FunctionDescription = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), inputs = inputs, name = name, outputs = outputs, payable = payable, sighash = sighash, signature = signature)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionDescription]
  }
}

