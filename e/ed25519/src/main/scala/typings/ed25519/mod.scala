package typings.ed25519

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ed25519", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def MakeKeypair(seed: Buffer): CurveKeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("MakeKeypair")(seed.asInstanceOf[js.Any]).asInstanceOf[CurveKeyPair]
  
  inline def Sign(message: Buffer, privateKeyOrKeyPair: CurveKeyPair): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("Sign")(message.asInstanceOf[js.Any], privateKeyOrKeyPair.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def Sign(message: Buffer, privateKeyOrKeyPair: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("Sign")(message.asInstanceOf[js.Any], privateKeyOrKeyPair.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def Verify(message: Buffer, signature: Buffer, publicKey: Buffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("Verify")(message.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait CurveKeyPair extends StObject {
    
    /**
      * A Buffer containing the private, secret portion of the Curve25519 key.
      */
    var privateKey: Buffer
    
    /**
      * A Buffer containing the public portion of the Curve25519 key.
      */
    var publicKey: Buffer
  }
  object CurveKeyPair {
    
    inline def apply(privateKey: Buffer, publicKey: Buffer): CurveKeyPair = {
      val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[CurveKeyPair]
    }
    
    extension [Self <: CurveKeyPair](x: Self) {
      
      inline def setPrivateKey(value: Buffer): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      inline def setPublicKey(value: Buffer): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    }
  }
}
