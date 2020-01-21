package typings.digibyte.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("digibyte", "URI")
@js.native
class URI protected () extends js.Object {
  def this(data: String) = this()
  def this(data: js.Object) = this()
  def parse(): js.Any = js.native
  def toObject(): js.Any = js.native
}

/* static members */
@JSImport("digibyte", "URI")
@js.native
object URI extends js.Object {
  def fromObject(json: js.Object): URI = js.native
  def fromSatoshis(amount: Double): URI = js.native
  def fromString(str: String): URI = js.native
  def isValid(data: Boolean): URI = js.native
}

