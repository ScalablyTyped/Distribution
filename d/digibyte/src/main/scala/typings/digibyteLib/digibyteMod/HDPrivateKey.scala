package typings
package digibyteLib.digibyteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("digibyte", "HDPrivateKey")
@js.native
class HDPrivateKey () extends js.Object {
  def this(data: java.lang.String) = this()
  def this(data: js.Object) = this()
  def this(data: nodeLib.Buffer) = this()
  val hdPublicKey: HDPublicKey = js.native
  def derive(arg: java.lang.String): HDPrivateKey = js.native
  def derive(arg: java.lang.String, hardened: scala.Boolean): HDPrivateKey = js.native
  def derive(arg: scala.Double): HDPrivateKey = js.native
  def derive(arg: scala.Double, hardened: scala.Boolean): HDPrivateKey = js.native
  def deriveChild(arg: java.lang.String): HDPrivateKey = js.native
  def deriveChild(arg: java.lang.String, hardened: scala.Boolean): HDPrivateKey = js.native
  def deriveChild(arg: scala.Double): HDPrivateKey = js.native
  def deriveChild(arg: scala.Double, hardened: scala.Boolean): HDPrivateKey = js.native
  def deriveNonCompliantChild(arg: java.lang.String): HDPrivateKey = js.native
  def deriveNonCompliantChild(arg: java.lang.String, hardened: scala.Boolean): HDPrivateKey = js.native
  def deriveNonCompliantChild(arg: scala.Double): HDPrivateKey = js.native
  def deriveNonCompliantChild(arg: scala.Double, hardened: scala.Boolean): HDPrivateKey = js.native
  def toJSON(): js.Object = js.native
  def toObject(): js.Object = js.native
}

