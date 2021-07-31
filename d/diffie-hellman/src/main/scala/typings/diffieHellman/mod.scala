package typings.diffieHellman

import typings.node.NodeJS.ArrayBufferView
import typings.node.cryptoMod.DiffieHellman_
import typings.node.cryptoMod.HexBase64Latin1Encoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("diffie-hellman", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("diffie-hellman", "DiffieHellman")
  @js.native
  class DiffieHellman protected () extends DiffieHellman_
  
  @scala.inline
  def createDiffieHellman(prime_length: Double): DiffieHellman_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime_length.asInstanceOf[js.Any]).asInstanceOf[DiffieHellman_]
  @scala.inline
  def createDiffieHellman(prime_length: Double, generator: Double): DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime_length.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[DiffieHellman_]
  @scala.inline
  def createDiffieHellman(prime_length: Double, generator: ArrayBufferView): DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime_length.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[DiffieHellman_]
  @scala.inline
  def createDiffieHellman(prime: String, prime_encoding: HexBase64Latin1Encoding): DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], prime_encoding.asInstanceOf[js.Any])).asInstanceOf[DiffieHellman_]
  @scala.inline
  def createDiffieHellman(
    prime: String,
    prime_encoding: HexBase64Latin1Encoding,
    generator: String,
    generator_encoding: HexBase64Latin1Encoding
  ): DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], prime_encoding.asInstanceOf[js.Any], generator.asInstanceOf[js.Any], generator_encoding.asInstanceOf[js.Any])).asInstanceOf[DiffieHellman_]
  @scala.inline
  def createDiffieHellman(prime: String, prime_encoding: HexBase64Latin1Encoding, generator: Double): DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], prime_encoding.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[DiffieHellman_]
  @scala.inline
  def createDiffieHellman(prime: String, prime_encoding: HexBase64Latin1Encoding, generator: ArrayBufferView): DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], prime_encoding.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[DiffieHellman_]
  @scala.inline
  def createDiffieHellman(prime: ArrayBufferView): DiffieHellman_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any]).asInstanceOf[DiffieHellman_]
  
  @scala.inline
  def getDiffieHellman(group_name: String): DiffieHellman_ = ^.asInstanceOf[js.Dynamic].applyDynamic("getDiffieHellman")(group_name.asInstanceOf[js.Any]).asInstanceOf[DiffieHellman_]
}
