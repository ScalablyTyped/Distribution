package typings.ethers.distTypesUtilsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionDescription extends js.Object {
  val args: js.Array[_]
  val name: String
  val sighash: String
  val signature: String
  val value: BigNumber
  def decode(data: String): js.Any
}

object TransactionDescription {
  @scala.inline
  def apply(
    args: js.Array[_],
    decode: String => js.Any,
    name: String,
    sighash: String,
    signature: String,
    value: BigNumber
  ): TransactionDescription = {
    val __obj = js.Dynamic.literal(args = args, decode = js.Any.fromFunction1(decode), name = name, sighash = sighash, signature = signature, value = value)
  
    __obj.asInstanceOf[TransactionDescription]
  }
}

