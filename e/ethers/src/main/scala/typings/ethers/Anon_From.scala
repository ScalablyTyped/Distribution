package typings.ethers

import typings.ethers.distTypesUtilsTypesMod.Arrayish
import typings.ethers.distTypesUtilsTypesMod.BigNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_From extends js.Object {
  var from: String
  var nonce: Arrayish | BigNumber | Double
}

object Anon_From {
  @scala.inline
  def apply(from: String, nonce: Arrayish | BigNumber | Double): Anon_From = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_From]
  }
}

