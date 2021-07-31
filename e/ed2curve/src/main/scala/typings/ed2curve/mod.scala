package typings.ed2curve

import typings.std.Uint8Array
import typings.tweetnacl.mod.BoxKeyPair
import typings.tweetnacl.mod.SignKeyPair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ed2curve", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def convertKeyPair(keyPair: SignKeyPair): BoxKeyPair | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("convertKeyPair")(keyPair.asInstanceOf[js.Any]).asInstanceOf[BoxKeyPair | Null]
  
  @scala.inline
  def convertPublicKey(publicKey: Uint8Array): Uint8Array | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("convertPublicKey")(publicKey.asInstanceOf[js.Any]).asInstanceOf[Uint8Array | Null]
  
  @scala.inline
  def convertSecretKey(secretKey: Uint8Array): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("convertSecretKey")(secretKey.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
}
