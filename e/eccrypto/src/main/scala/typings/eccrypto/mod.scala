package typings.eccrypto

import typings.eccrypto.anon.EphemPrivateKey
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("eccrypto", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def decrypt(privateKey: Buffer, opts: Ecies): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(privateKey.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  
  @scala.inline
  def derive(privateKeyA: Buffer, publicKeyB: Buffer): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("derive")(privateKeyA.asInstanceOf[js.Any], publicKeyB.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  
  @scala.inline
  def encrypt(publicKeyTo: Buffer, msg: Buffer): js.Promise[Ecies] = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(publicKeyTo.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Ecies]]
  @scala.inline
  def encrypt(publicKeyTo: Buffer, msg: Buffer, opts: EphemPrivateKey): js.Promise[Ecies] = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(publicKeyTo.asInstanceOf[js.Any], msg.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Ecies]]
  
  @scala.inline
  def generatePrivate(): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("generatePrivate")().asInstanceOf[Buffer]
  
  @scala.inline
  def getPublic(privateKey: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("getPublic")(privateKey.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  @scala.inline
  def getPublicCompressed(privateKey: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("getPublicCompressed")(privateKey.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  @scala.inline
  def sign(key: Buffer, msg: Buffer): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(key.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  
  @scala.inline
  def verify(publicKey: Buffer, msg: Buffer, sig: Buffer): js.Promise[Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(publicKey.asInstanceOf[js.Any], msg.asInstanceOf[js.Any], sig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Null]]
  
  trait Ecies extends StObject {
    
    var ciphertext: Buffer
    
    var ephemPublicKey: Buffer
    
    var iv: Buffer
    
    var mac: Buffer
  }
  object Ecies {
    
    @scala.inline
    def apply(ciphertext: Buffer, ephemPublicKey: Buffer, iv: Buffer, mac: Buffer): Ecies = {
      val __obj = js.Dynamic.literal(ciphertext = ciphertext.asInstanceOf[js.Any], ephemPublicKey = ephemPublicKey.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ecies]
    }
    
    @scala.inline
    implicit class EciesMutableBuilder[Self <: Ecies] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCiphertext(value: Buffer): Self = StObject.set(x, "ciphertext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEphemPublicKey(value: Buffer): Self = StObject.set(x, "ephemPublicKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIv(value: Buffer): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMac(value: Buffer): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
    }
  }
}
