package typings.eccrypto

import typings.eccrypto.anon.EphemPrivateKey
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("eccrypto", "decrypt")
  @js.native
  def decrypt(privateKey: Buffer, opts: Ecies): js.Promise[Buffer] = js.native
  
  @JSImport("eccrypto", "derive")
  @js.native
  def derive(privateKeyA: Buffer, publicKeyB: Buffer): js.Promise[Buffer] = js.native
  
  @JSImport("eccrypto", "encrypt")
  @js.native
  def encrypt(publicKeyTo: Buffer, msg: Buffer): js.Promise[Ecies] = js.native
  @JSImport("eccrypto", "encrypt")
  @js.native
  def encrypt(publicKeyTo: Buffer, msg: Buffer, opts: EphemPrivateKey): js.Promise[Ecies] = js.native
  
  @JSImport("eccrypto", "generatePrivate")
  @js.native
  def generatePrivate(): Buffer = js.native
  
  @JSImport("eccrypto", "getPublic")
  @js.native
  def getPublic(privateKey: Buffer): Buffer = js.native
  
  @JSImport("eccrypto", "getPublicCompressed")
  @js.native
  def getPublicCompressed(privateKey: Buffer): Buffer = js.native
  
  @JSImport("eccrypto", "sign")
  @js.native
  def sign(key: Buffer, msg: Buffer): js.Promise[Buffer] = js.native
  
  @JSImport("eccrypto", "verify")
  @js.native
  def verify(publicKey: Buffer, msg: Buffer, sig: Buffer): js.Promise[Null] = js.native
  
  @js.native
  trait Ecies extends StObject {
    
    var ciphertext: Buffer = js.native
    
    var ephemPublicKey: Buffer = js.native
    
    var iv: Buffer = js.native
    
    var mac: Buffer = js.native
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
