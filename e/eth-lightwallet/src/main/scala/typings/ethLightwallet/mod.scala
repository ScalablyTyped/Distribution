package typings.ethLightwallet

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("eth-lightwallet", "keystore")
  @js.native
  open class keystore () extends StObject {
    
    def exportPrivateKey(address: String, pwDerivedKey: js.typedarray.Uint8Array): String = js.native
    
    def generateNewAddress(pwDerivedKey: js.typedarray.Uint8Array, numberOfAddresses: Double): Unit = js.native
    
    def getAddresses(): js.Array[String] = js.native
    
    def getSeed(pwDerivedKey: js.typedarray.Uint8Array): String = js.native
    
    def isDerivedKeyCorrect(pwDerivedKey: js.typedarray.Uint8Array): Boolean = js.native
    
    def keyFromPassword(password: String): js.typedarray.Uint8Array = js.native
    def keyFromPassword(
      password: String,
      callback: js.Function2[/* error */ js.Error, /* pwDerivedKey */ js.typedarray.Uint8Array, Unit]
    ): js.typedarray.Uint8Array = js.native
    
    def serialize(): String = js.native
  }
  /* static members */
  object keystore {
    
    @JSImport("eth-lightwallet", "keystore")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createVault(options: Any): keystore = ^.asInstanceOf[js.Dynamic].applyDynamic("createVault")(options.asInstanceOf[js.Any]).asInstanceOf[keystore]
    inline def createVault(options: Any, callback: js.Function2[/* error */ js.Error, /* keystore */ this.type, Unit]): keystore = (^.asInstanceOf[js.Dynamic].applyDynamic("createVault")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[keystore]
    
    inline def deserialize(keystore: String): keystore = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(keystore.asInstanceOf[js.Any]).asInstanceOf[keystore]
    
    inline def generateRandomSeed(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateRandomSeed")().asInstanceOf[String]
    
    inline def isSeedValid(seed: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSeedValid")(seed.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  object signing {
    
    @JSImport("eth-lightwallet", "signing")
    @js.native
    val ^ : js.Any = js.native
    
    inline def concatSig(signature: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("concatSig")(signature.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def signMsg(keystore: keystore, pwDerivedKey: js.typedarray.Uint8Array, rawMsg: String, signingAddress: String): ECSignatureBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("signMsg")(keystore.asInstanceOf[js.Any], pwDerivedKey.asInstanceOf[js.Any], rawMsg.asInstanceOf[js.Any], signingAddress.asInstanceOf[js.Any])).asInstanceOf[ECSignatureBuffer]
    
    inline def signMsgHash(
      keystore: keystore,
      pwDerivedKey: js.typedarray.Uint8Array,
      msgHash: String,
      signingAddress: String
    ): ECSignatureBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("signMsgHash")(keystore.asInstanceOf[js.Any], pwDerivedKey.asInstanceOf[js.Any], msgHash.asInstanceOf[js.Any], signingAddress.asInstanceOf[js.Any])).asInstanceOf[ECSignatureBuffer]
    
    inline def signTx(keystore: keystore, pwDerivedKey: js.typedarray.Uint8Array, rawTx: String, signingAddress: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("signTx")(keystore.asInstanceOf[js.Any], pwDerivedKey.asInstanceOf[js.Any], rawTx.asInstanceOf[js.Any], signingAddress.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  trait ECSignatureBuffer extends StObject {
    
    var r: Buffer
    
    var s: Buffer
    
    var v: Double
  }
  object ECSignatureBuffer {
    
    inline def apply(r: Buffer, s: Buffer, v: Double): ECSignatureBuffer = {
      val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[ECSignatureBuffer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ECSignatureBuffer] (val x: Self) extends AnyVal {
      
      inline def setR(value: Buffer): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      inline def setS(value: Buffer): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
  
  trait VaultOptions extends StObject {
    
    var hdPathString: String
    
    var password: String
    
    var salt: js.UndefOr[String] = js.undefined
    
    var seedPhrase: String
  }
  object VaultOptions {
    
    inline def apply(hdPathString: String, password: String, seedPhrase: String): VaultOptions = {
      val __obj = js.Dynamic.literal(hdPathString = hdPathString.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], seedPhrase = seedPhrase.asInstanceOf[js.Any])
      __obj.asInstanceOf[VaultOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VaultOptions] (val x: Self) extends AnyVal {
      
      inline def setHdPathString(value: String): Self = StObject.set(x, "hdPathString", value.asInstanceOf[js.Any])
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setSalt(value: String): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
      
      inline def setSaltUndefined: Self = StObject.set(x, "salt", js.undefined)
      
      inline def setSeedPhrase(value: String): Self = StObject.set(x, "seedPhrase", value.asInstanceOf[js.Any])
    }
  }
}
