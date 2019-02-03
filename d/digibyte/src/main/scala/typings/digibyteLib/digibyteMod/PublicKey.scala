package typings
package digibyteLib.digibyteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("digibyte", "PublicKey")
@js.native
class PublicKey protected () extends js.Object {
  def this(source: java.lang.String) = this()
  def toBuffer(): nodeLib.Buffer = js.native
  def toDER(): nodeLib.Buffer = js.native
}

/* static members */
@JSImport("digibyte", "PublicKey")
@js.native
object PublicKey extends js.Object {
  def fromPrivateKey(privateKey: digibyteLib.digibyteMod.PrivateKey): digibyteLib.digibyteMod.PublicKey = js.native
}

