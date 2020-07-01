package typings.ethersprojectSigningKey

import typings.ethersprojectBytes.mod.BytesLike
import typings.ethersprojectBytes.mod.Signature
import typings.ethersprojectBytes.mod.SignatureLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ethersproject/signing-key", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class SigningKey protected () extends js.Object {
    def this(privateKey: BytesLike) = this()
    val _isSigningKey: Boolean = js.native
    val compressedPublicKey: String = js.native
    val curve: String = js.native
    val privateKey: String = js.native
    val publicKey: String = js.native
    def _addPoint(other: BytesLike): String = js.native
    def computeSharedSecret(otherKey: BytesLike): String = js.native
    def signDigest(digest: BytesLike): Signature = js.native
  }
  
  def computePublicKey(key: BytesLike): String = js.native
  def computePublicKey(key: BytesLike, compressed: Boolean): String = js.native
  def recoverPublicKey(digest: BytesLike, signature: SignatureLike): String = js.native
  /* static members */
  @js.native
  object SigningKey extends js.Object {
    def isSigningKey(value: js.Any): /* is @ethersproject/signing-key.@ethersproject/signing-key.SigningKey */ Boolean = js.native
  }
  
}

