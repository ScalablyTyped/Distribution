package typings.easyDashXDashHeaders.cryptoMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "pbkdf2Sync")
@js.native
object pbkdf2Sync extends js.Object {
  def apply(password: String, salt: String, iterations: Double, keylen: Double): Buffer = js.native
  def apply(password: String, salt: String, iterations: Double, keylen: Double, digest: String): Buffer = js.native
}

