package typings.eccrypto.mod

import typings.eccrypto.AnonEphemPrivateKey
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eccrypto", "encrypt")
@js.native
object encrypt extends js.Object {
  def apply(publicKeyTo: Buffer, msg: Buffer): js.Promise[Ecies] = js.native
  def apply(publicKeyTo: Buffer, msg: Buffer, opts: AnonEphemPrivateKey): js.Promise[Ecies] = js.native
}

