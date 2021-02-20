package typings.ed2curve

import typings.std.Uint8Array
import typings.tweetnacl.mod.BoxKeyPair
import typings.tweetnacl.mod.SignKeyPair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ed2curve", "convertKeyPair")
  @js.native
  def convertKeyPair(keyPair: SignKeyPair): BoxKeyPair | Null = js.native
  
  @JSImport("ed2curve", "convertPublicKey")
  @js.native
  def convertPublicKey(publicKey: Uint8Array): Uint8Array | Null = js.native
  
  @JSImport("ed2curve", "convertSecretKey")
  @js.native
  def convertSecretKey(secretKey: Uint8Array): Uint8Array = js.native
}
