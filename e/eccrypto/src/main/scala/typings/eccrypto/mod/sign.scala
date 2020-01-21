package typings.eccrypto.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eccrypto", "sign")
@js.native
object sign extends js.Object {
  def apply(key: Buffer, msg: Buffer): js.Promise[Buffer] = js.native
  def apply(publicKey: Buffer, msg: Buffer, sig: Buffer): js.Promise[Null] = js.native
}

