package typings.ed2curve

import typings.std.Uint8Array
import typings.tweetnacl.tweetnaclMod.BoxKeyPair
import typings.tweetnacl.tweetnaclMod.SignKeyPair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ed2curve", JSImport.Namespace)
@js.native
object ed2curveMod extends js.Object {
  def convertKeyPair(keyPair: SignKeyPair): BoxKeyPair | Null = js.native
  def convertPublicKey(publicKey: Uint8Array): Uint8Array | Null = js.native
  def convertSecretKey(secretKey: Uint8Array): Uint8Array = js.native
}

