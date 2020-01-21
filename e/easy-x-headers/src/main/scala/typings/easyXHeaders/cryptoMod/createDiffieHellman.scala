package typings.easyXHeaders.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "createDiffieHellman")
@js.native
object createDiffieHellman extends js.Object {
  def apply(prime_length: Double): DiffieHellman = js.native
  def apply(prime: Double, encoding: String): DiffieHellman = js.native
}

