package typings.ethereumCryptography

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ethereum-cryptography/aes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def decrypt(cypherText: Buffer, key: Buffer, iv: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(cypherText.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def decrypt(cypherText: Buffer, key: Buffer, iv: Buffer, mode: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(cypherText.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def decrypt(cypherText: Buffer, key: Buffer, iv: Buffer, mode: String, pkcs7PaddingEnabled: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(cypherText.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], pkcs7PaddingEnabled.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def decrypt(cypherText: Buffer, key: Buffer, iv: Buffer, mode: Unit, pkcs7PaddingEnabled: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(cypherText.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], pkcs7PaddingEnabled.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @scala.inline
  def encrypt(msg: Buffer, key: Buffer, iv: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(msg.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def encrypt(msg: Buffer, key: Buffer, iv: Buffer, mode: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(msg.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def encrypt(msg: Buffer, key: Buffer, iv: Buffer, mode: String, pkcs7PaddingEnabled: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(msg.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], pkcs7PaddingEnabled.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def encrypt(msg: Buffer, key: Buffer, iv: Buffer, mode: Unit, pkcs7PaddingEnabled: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(msg.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], pkcs7PaddingEnabled.asInstanceOf[js.Any])).asInstanceOf[Buffer]
}
