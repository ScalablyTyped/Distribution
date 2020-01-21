package typings.easyXHeaders.cryptoMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "createHmac")
@js.native
object createHmac extends js.Object {
  def apply(algorithm: String, key: String): Hmac = js.native
  def apply(algorithm: String, key: Buffer): Hmac = js.native
}

