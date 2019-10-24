package typings.eccrypto.eccryptoMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eccrypto", "derive")
@js.native
object derive extends js.Object {
  def apply(privateKeyA: Buffer, publicKeyB: Buffer): js.Promise[Buffer] = js.native
}

