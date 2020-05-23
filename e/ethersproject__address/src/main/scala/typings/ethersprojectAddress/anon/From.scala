package typings.ethersprojectAddress.anon

import typings.ethersprojectBignumber.bignumberMod.BigNumberish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait From extends js.Object {
  var from: String
  var nonce: BigNumberish
}

object From {
  @scala.inline
  def apply(from: String, nonce: BigNumberish): From = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.asInstanceOf[From]
  }
}

