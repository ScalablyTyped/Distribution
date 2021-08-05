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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shimsHdkeyCryptoMod {
  
  @JSImport("ethereum-cryptography/shims/hdkey-crypto", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createHash(algorithm: String): Hash = ^.asInstanceOf[js.Dynamic].applyDynamic("createHash")(algorithm.asInstanceOf[js.Any]).asInstanceOf[Hash]
  inline def createHash(algorithm: String, options: HashOptions): Hash = (^.asInstanceOf[js.Dynamic].applyDynamic("createHash")(algorithm.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Hash]
  
  inline def createHmac(algorithm: String, key: BinaryLike): Hmac = (^.asInstanceOf[js.Dynamic].applyDynamic("createHmac")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Hmac]
  inline def createHmac(algorithm: String, key: BinaryLike, options: TransformOptions): Hmac = (^.asInstanceOf[js.Dynamic].applyDynamic("createHmac")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Hmac]
  inline def createHmac(algorithm: String, key: KeyObject): Hmac = (^.asInstanceOf[js.Dynamic].applyDynamic("createHmac")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Hmac]
  inline def createHmac(algorithm: String, key: KeyObject, options: TransformOptions): Hmac = (^.asInstanceOf[js.Dynamic].applyDynamic("createHmac")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Hmac]
  
  inline def randomBytes(size: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("randomBytes")(size.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def randomBytes(size: Double, callback: js.Function2[/* err */ Error | Null, /* buf */ Buffer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomBytes")(size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
