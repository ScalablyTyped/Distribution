package typings.diffieHellman

import typings.node.NodeJS.ArrayBufferView
import typings.node.cryptoMod.DiffieHellman_
import typings.node.cryptoMod.HexBase64Latin1Encoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("diffie-hellman", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def createDiffieHellman(prime_length: Double): DiffieHellman_ = js.native
  def createDiffieHellman(prime_length: Double, generator: Double): DiffieHellman_ = js.native
  def createDiffieHellman(prime_length: Double, generator: ArrayBufferView): DiffieHellman_ = js.native
  def createDiffieHellman(prime: String, prime_encoding: HexBase64Latin1Encoding): DiffieHellman_ = js.native
  def createDiffieHellman(
    prime: String,
    prime_encoding: HexBase64Latin1Encoding,
    generator: String,
    generator_encoding: HexBase64Latin1Encoding
  ): DiffieHellman_ = js.native
  def createDiffieHellman(prime: String, prime_encoding: HexBase64Latin1Encoding, generator: Double): DiffieHellman_ = js.native
  def createDiffieHellman(prime: String, prime_encoding: HexBase64Latin1Encoding, generator: ArrayBufferView): DiffieHellman_ = js.native
  def createDiffieHellman(prime: ArrayBufferView): DiffieHellman_ = js.native
  
  def getDiffieHellman(group_name: String): DiffieHellman_ = js.native
  
  @js.native
  class DiffieHellman protected () extends DiffieHellman_
}
