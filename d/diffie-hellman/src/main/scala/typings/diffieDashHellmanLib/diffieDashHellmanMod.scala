package typings
package diffieDashHellmanLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("diffie-hellman", JSImport.Namespace)
@js.native
object diffieDashHellmanMod extends js.Object {
  def createDiffieHellman(prime_length: scala.Double): nodeLib.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(prime_length: scala.Double, generator: nodeLib.cryptoMod.Binary): nodeLib.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(prime_length: scala.Double, generator: scala.Double): nodeLib.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(prime: java.lang.String, prime_encoding: nodeLib.cryptoMod.HexBase64Latin1Encoding): nodeLib.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(
    prime: java.lang.String,
    prime_encoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    generator: java.lang.String,
    generator_encoding: nodeLib.cryptoMod.HexBase64Latin1Encoding
  ): nodeLib.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(
    prime: java.lang.String,
    prime_encoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    generator: nodeLib.cryptoMod.Binary
  ): nodeLib.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(
    prime: java.lang.String,
    prime_encoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    generator: scala.Double
  ): nodeLib.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(prime: nodeLib.cryptoMod.Binary): nodeLib.cryptoMod.DiffieHellman = js.native
  def getDiffieHellman(group_name: java.lang.String): nodeLib.cryptoMod.DiffieHellman = js.native
}

