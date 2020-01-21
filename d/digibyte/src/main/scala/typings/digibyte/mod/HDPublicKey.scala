package typings.digibyte.mod

import typings.digibyte.mod.Networks.Network
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("digibyte", "HDPublicKey")
@js.native
class HDPublicKey protected () extends js.Object {
  def this(arg: String) = this()
  def this(arg: js.Object) = this()
  def this(arg: Buffer) = this()
  val depth: Double = js.native
  val fingerPrint: Buffer = js.native
  val network: Network = js.native
  val publicKey: PublicKey = js.native
  val xpubkey: Buffer = js.native
  def derive(arg: String): HDPublicKey = js.native
  def derive(arg: String, hardened: Boolean): HDPublicKey = js.native
  def derive(arg: Double): HDPublicKey = js.native
  def derive(arg: Double, hardened: Boolean): HDPublicKey = js.native
  def deriveChild(arg: String): HDPublicKey = js.native
  def deriveChild(arg: String, hardened: Boolean): HDPublicKey = js.native
  def deriveChild(arg: Double): HDPublicKey = js.native
  def deriveChild(arg: Double, hardened: Boolean): HDPublicKey = js.native
}

