package typings.ethers.distTypesUtilsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeployDescription extends js.Object {
  val inputs: js.Array[ParamType]
  val payable: Boolean
  def encode(bytecode: String, params: js.Array[_]): String
}

object DeployDescription {
  @scala.inline
  def apply(encode: (String, js.Array[_]) => String, inputs: js.Array[ParamType], payable: Boolean): DeployDescription = {
    val __obj = js.Dynamic.literal(encode = js.Any.fromFunction2(encode), inputs = inputs.asInstanceOf[js.Any], payable = payable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeployDescription]
  }
}

