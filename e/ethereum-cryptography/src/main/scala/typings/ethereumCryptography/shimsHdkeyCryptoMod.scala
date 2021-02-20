package typings.ethereumCryptography

import typings.node.Buffer
import typings.node.cryptoMod.BinaryLike
import typings.node.cryptoMod.Hash
import typings.node.cryptoMod.HashOptions
import typings.node.cryptoMod.Hmac
import typings.node.cryptoMod.KeyObject
import typings.node.streamMod.TransformOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shimsHdkeyCryptoMod {
  
  @JSImport("ethereum-cryptography/shims/hdkey-crypto", "createHash")
  @js.native
  def createHash(algorithm: String): Hash = js.native
  @JSImport("ethereum-cryptography/shims/hdkey-crypto", "createHash")
  @js.native
  def createHash(algorithm: String, options: HashOptions): Hash = js.native
  
  @JSImport("ethereum-cryptography/shims/hdkey-crypto", "createHmac")
  @js.native
  def createHmac(algorithm: String, key: BinaryLike): Hmac = js.native
  @JSImport("ethereum-cryptography/shims/hdkey-crypto", "createHmac")
  @js.native
  def createHmac(algorithm: String, key: BinaryLike, options: TransformOptions): Hmac = js.native
  @JSImport("ethereum-cryptography/shims/hdkey-crypto", "createHmac")
  @js.native
  def createHmac(algorithm: String, key: KeyObject): Hmac = js.native
  @JSImport("ethereum-cryptography/shims/hdkey-crypto", "createHmac")
  @js.native
  def createHmac(algorithm: String, key: KeyObject, options: TransformOptions): Hmac = js.native
  
  @JSImport("ethereum-cryptography/shims/hdkey-crypto", "randomBytes")
  @js.native
  def randomBytes(size: Double): Buffer = js.native
  @JSImport("ethereum-cryptography/shims/hdkey-crypto", "randomBytes")
  @js.native
  def randomBytes(size: Double, callback: js.Function2[/* err */ Error | Null, /* buf */ Buffer, Unit]): Unit = js.native
}
