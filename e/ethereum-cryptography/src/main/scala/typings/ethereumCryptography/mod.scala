package typings.ethereumCryptography

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethereum-cryptography/aes", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def decrypt(cypherText: Buffer, key: Buffer, iv: Buffer): Buffer = js.native
  def decrypt(
    cypherText: Buffer,
    key: Buffer,
    iv: Buffer,
    mode: js.UndefOr[scala.Nothing],
    pkcs7PaddingEnabled: Boolean
  ): Buffer = js.native
  def decrypt(cypherText: Buffer, key: Buffer, iv: Buffer, mode: String): Buffer = js.native
  def decrypt(cypherText: Buffer, key: Buffer, iv: Buffer, mode: String, pkcs7PaddingEnabled: Boolean): Buffer = js.native
  
  def encrypt(msg: Buffer, key: Buffer, iv: Buffer): Buffer = js.native
  def encrypt(
    msg: Buffer,
    key: Buffer,
    iv: Buffer,
    mode: js.UndefOr[scala.Nothing],
    pkcs7PaddingEnabled: Boolean
  ): Buffer = js.native
  def encrypt(msg: Buffer, key: Buffer, iv: Buffer, mode: String): Buffer = js.native
  def encrypt(msg: Buffer, key: Buffer, iv: Buffer, mode: String, pkcs7PaddingEnabled: Boolean): Buffer = js.native
}
