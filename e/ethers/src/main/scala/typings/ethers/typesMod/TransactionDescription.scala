package typings.ethers.typesMod

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
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], decode = js.Any.fromFunction1(decode), name = name.asInstanceOf[js.Any], sighash = sighash.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TransactionDescription]
  }
}

