package typings.ed2curve

import typings.tweetnacl.mod.BoxKeyPair
import typings.tweetnacl.mod.SignKeyPair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ed2curve {
    
    @JSGlobal("ed2curve")
    @js.native
    val ^ : js.Any = js.native
    
    inline def convertKeyPair(keyPair: SignKeyPair): BoxKeyPair | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("convertKeyPair")(keyPair.asInstanceOf[js.Any]).asInstanceOf[BoxKeyPair | Null]
    
    inline def convertPublicKey(publicKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("convertPublicKey")(publicKey.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array | Null]
    
    inline def convertSecretKey(secretKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("convertSecretKey")(secretKey.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  }
}
