package typings
package digibyteLib.digibyteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("digibyte", "URI")
@js.native
class URI protected () extends js.Object {
  def this(data: java.lang.String) = this()
  def this(data: js.Object) = this()
  def parse(): js.Any = js.native
  def toObject(): js.Any = js.native
}

@JSImport("digibyte", "URI")
@js.native
object URI extends js.Object {
  def fromObject(json: js.Object): digibyteLib.digibyteMod.URI = js.native
  def fromSatoshis(amount: scala.Double): digibyteLib.digibyteMod.URI = js.native
  def fromString(str: java.lang.String): digibyteLib.digibyteMod.URI = js.native
  def isValid(data: scala.Boolean): digibyteLib.digibyteMod.URI = js.native
}

