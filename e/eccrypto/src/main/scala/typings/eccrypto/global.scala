package typings.eccrypto

import typings.eccrypto.anon.EphemPrivateKey
import typings.eccrypto.mod.Ecies
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object eccrypto {
    
    @JSGlobal("eccrypto")
    @js.native
    val ^ : js.Any = js.native
    
    inline def decrypt(privateKey: Buffer, opts: Ecies): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(privateKey.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
    
    inline def derive(privateKeyA: Buffer, publicKeyB: Buffer): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("derive")(privateKeyA.asInstanceOf[js.Any], publicKeyB.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
    
    inline def encrypt(publicKeyTo: Buffer, msg: Buffer): js.Promise[Ecies] = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(publicKeyTo.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Ecies]]
    inline def encrypt(publicKeyTo: Buffer, msg: Buffer, opts: EphemPrivateKey): js.Promise[Ecies] = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(publicKeyTo.asInstanceOf[js.Any], msg.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Ecies]]
    
    inline def generatePrivate(): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("generatePrivate")().asInstanceOf[Buffer]
    
    inline def getPublic(privateKey: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("getPublic")(privateKey.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    inline def getPublicCompressed(privateKey: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("getPublicCompressed")(privateKey.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    inline def sign(key: Buffer, msg: Buffer): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(key.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
    
    inline def verify(publicKey: Buffer, msg: Buffer, sig: Buffer): js.Promise[Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(publicKey.asInstanceOf[js.Any], msg.asInstanceOf[js.Any], sig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Null]]
  }
}
