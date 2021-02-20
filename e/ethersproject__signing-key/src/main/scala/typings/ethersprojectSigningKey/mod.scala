package typings.ethersprojectSigningKey

import typings.ethersprojectBytes.mod.BytesLike
import typings.ethersprojectBytes.mod.Signature
import typings.ethersprojectBytes.mod.SignatureLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ethersproject/signing-key", "SigningKey")
  @js.native
  class SigningKey protected () extends StObject {
    def this(privateKey: BytesLike) = this()
    
    def _addPoint(other: BytesLike): String = js.native
    
    val _isSigningKey: Boolean = js.native
    
    val compressedPublicKey: String = js.native
    
    def computeSharedSecret(otherKey: BytesLike): String = js.native
    
    val curve: String = js.native
    
    val privateKey: String = js.native
    
    val publicKey: String = js.native
    
    def signDigest(digest: BytesLike): Signature = js.native
  }
  /* static members */
  object SigningKey {
    
    @JSImport("@ethersproject/signing-key", "SigningKey.isSigningKey")
    @js.native
    def isSigningKey(value: js.Any): /* is @ethersproject/signing-key.@ethersproject/signing-key.SigningKey */ Boolean = js.native
  }
  
  @JSImport("@ethersproject/signing-key", "computePublicKey")
  @js.native
  def computePublicKey(key: BytesLike): String = js.native
  @JSImport("@ethersproject/signing-key", "computePublicKey")
  @js.native
  def computePublicKey(key: BytesLike, compressed: Boolean): String = js.native
  
  @JSImport("@ethersproject/signing-key", "recoverPublicKey")
  @js.native
  def recoverPublicKey(digest: BytesLike, signature: SignatureLike): String = js.native
}
