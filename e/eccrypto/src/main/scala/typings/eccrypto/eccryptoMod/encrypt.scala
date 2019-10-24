package typings.eccrypto.eccryptoMod

import typings.eccrypto.Anon_EphemPrivateKey
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eccrypto", "encrypt")
@js.native
object encrypt extends js.Object {
  def apply(publicKeyTo: Buffer, msg: Buffer): js.Promise[Ecies] = js.native
  def apply(publicKeyTo: Buffer, msg: Buffer, opts: Anon_EphemPrivateKey): js.Promise[Ecies] = js.native
}

