package typings.ed25519

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ed25519", "MakeKeypair")
  @js.native
  def MakeKeypair(seed: Buffer): CurveKeyPair = js.native
  
  @JSImport("ed25519", "Sign")
  @js.native
  def Sign(message: Buffer, privateKeyOrKeyPair: CurveKeyPair): Buffer = js.native
  @JSImport("ed25519", "Sign")
  @js.native
  def Sign(message: Buffer, privateKeyOrKeyPair: Buffer): Buffer = js.native
  
  @JSImport("ed25519", "Verify")
  @js.native
  def Verify(message: Buffer, signature: Buffer, publicKey: Buffer): Boolean = js.native
  
  @js.native
  trait CurveKeyPair extends StObject {
    
    /**
      * A Buffer containing the private, secret portion of the Curve25519 key.
      */
    var privateKey: Buffer = js.native
    
    /**
      * A Buffer containing the public portion of the Curve25519 key.
      */
    var publicKey: Buffer = js.native
  }
  object CurveKeyPair {
    
    @scala.inline
    def apply(privateKey: Buffer, publicKey: Buffer): CurveKeyPair = {
      val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[CurveKeyPair]
    }
    
    @scala.inline
    implicit class CurveKeyPairMutableBuilder[Self <: CurveKeyPair] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrivateKey(value: Buffer): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicKey(value: Buffer): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    }
  }
}
