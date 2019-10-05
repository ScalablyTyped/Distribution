package typings.diffieDashHellman

import typings.node.cryptoMod.Binary
import typings.node.cryptoMod.HexBase64Latin1Encoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("diffie-hellman", JSImport.Namespace)
@js.native
object diffieDashHellmanMod extends js.Object {
  @js.native
  class DiffieHellman protected ()
    extends typings.node.cryptoMod.DiffieHellman
  
  def createDiffieHellman(prime_length: Double): typings.node.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(prime_length: Double, generator: Double): typings.node.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(prime_length: Double, generator: Binary): typings.node.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(prime: String, prime_encoding: HexBase64Latin1Encoding): typings.node.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(
    prime: String,
    prime_encoding: HexBase64Latin1Encoding,
    generator: String,
    generator_encoding: HexBase64Latin1Encoding
  ): typings.node.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(prime: String, prime_encoding: HexBase64Latin1Encoding, generator: Double): typings.node.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(prime: String, prime_encoding: HexBase64Latin1Encoding, generator: Binary): typings.node.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(prime: Binary): typings.node.cryptoMod.DiffieHellman = js.native
  def getDiffieHellman(group_name: String): typings.node.cryptoMod.DiffieHellman = js.native
}

