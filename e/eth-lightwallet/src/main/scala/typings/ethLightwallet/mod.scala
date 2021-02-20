package typings.ethLightwallet

import typings.node.Buffer
import typings.std.Error
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("eth-lightwallet", "keystore")
  @js.native
  class keystore () extends StObject {
    
    def exportPrivateKey(address: String, pwDerivedKey: Uint8Array): String = js.native
    
    def generateNewAddress(pwDerivedKey: Uint8Array, numberOfAddresses: Double): Unit = js.native
    
    def getAddresses(): js.Array[String] = js.native
    
    def getSeed(pwDerivedKey: Uint8Array): String = js.native
    
    def isDerivedKeyCorrect(pwDerivedKey: Uint8Array): Boolean = js.native
    
    def keyFromPassword(password: String): Uint8Array = js.native
    def keyFromPassword(password: String, callback: js.Function2[/* error */ Error, /* pwDerivedKey */ Uint8Array, Unit]): Uint8Array = js.native
    
    def serialize(): String = js.native
  }
  /* static members */
  object keystore {
    
    @JSImport("eth-lightwallet", "keystore.createVault")
    @js.native
    def createVault(options: js.Any): keystore = js.native
    @JSImport("eth-lightwallet", "keystore.createVault")
    @js.native
    def createVault(options: js.Any, callback: js.Function2[/* error */ Error, /* keystore */ this.type, Unit]): keystore = js.native
    
    @JSImport("eth-lightwallet", "keystore.deserialize")
    @js.native
    def deserialize(keystore: String): keystore = js.native
    
    @JSImport("eth-lightwallet", "keystore.generateRandomSeed")
    @js.native
    def generateRandomSeed(): String = js.native
    
    @JSImport("eth-lightwallet", "keystore.isSeedValid")
    @js.native
    def isSeedValid(seed: String): Boolean = js.native
  }
  
  object signing {
    
    @JSImport("eth-lightwallet", "signing.concatSig")
    @js.native
    def concatSig(signature: js.Any): String = js.native
    
    @JSImport("eth-lightwallet", "signing.signMsg")
    @js.native
    def signMsg(keystore: keystore, pwDerivedKey: Uint8Array, rawMsg: String, signingAddress: String): ECSignatureBuffer = js.native
    
    @JSImport("eth-lightwallet", "signing.signMsgHash")
    @js.native
    def signMsgHash(keystore: keystore, pwDerivedKey: Uint8Array, msgHash: String, signingAddress: String): ECSignatureBuffer = js.native
    
    @JSImport("eth-lightwallet", "signing.signTx")
    @js.native
    def signTx(keystore: keystore, pwDerivedKey: Uint8Array, rawTx: String, signingAddress: String): String = js.native
  }
  
  @js.native
  trait ECSignatureBuffer extends StObject {
    
    var r: Buffer = js.native
    
    var s: Buffer = js.native
    
    var v: Double = js.native
  }
  object ECSignatureBuffer {
    
    @scala.inline
    def apply(r: Buffer, s: Buffer, v: Double): ECSignatureBuffer = {
      val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[ECSignatureBuffer]
    }
    
    @scala.inline
    implicit class ECSignatureBufferMutableBuilder[Self <: ECSignatureBuffer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setR(value: Buffer): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS(value: Buffer): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VaultOptions extends StObject {
    
    var hdPathString: String = js.native
    
    var password: String = js.native
    
    var salt: js.UndefOr[String] = js.native
    
    var seedPhrase: String = js.native
  }
  object VaultOptions {
    
    @scala.inline
    def apply(hdPathString: String, password: String, seedPhrase: String): VaultOptions = {
      val __obj = js.Dynamic.literal(hdPathString = hdPathString.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], seedPhrase = seedPhrase.asInstanceOf[js.Any])
      __obj.asInstanceOf[VaultOptions]
    }
    
    @scala.inline
    implicit class VaultOptionsMutableBuilder[Self <: VaultOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHdPathString(value: String): Self = StObject.set(x, "hdPathString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSalt(value: String): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaltUndefined: Self = StObject.set(x, "salt", js.undefined)
      
      @scala.inline
      def setSeedPhrase(value: String): Self = StObject.set(x, "seedPhrase", value.asInstanceOf[js.Any])
    }
  }
}
