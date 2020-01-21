package typings.ethers

import typings.ethers.typesMod.Arrayish
import typings.ethers.typesMod.BigNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFrom extends js.Object {
  var from: String
  var nonce: Arrayish | BigNumber | Double
}

object AnonFrom {
  @scala.inline
  def apply(from: String, nonce: Arrayish | BigNumber | Double): AnonFrom = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFrom]
  }
}

