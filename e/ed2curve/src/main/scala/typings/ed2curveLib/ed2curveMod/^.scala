package typings
package ed2curveLib.ed2curveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ed2curve", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def convertKeyPair(keyPair: tweetnaclLib.tweetnaclMod.naclNs.SignKeyPair): tweetnaclLib.tweetnaclMod.naclNs.BoxKeyPair | scala.Null = js.native
  def convertPublicKey(publicKey: stdLib.Uint8Array): stdLib.Uint8Array | scala.Null = js.native
  def convertSecretKey(secretKey: stdLib.Uint8Array): stdLib.Uint8Array = js.native
}

