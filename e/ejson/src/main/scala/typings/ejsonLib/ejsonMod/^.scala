package typings
package ejsonLib.ejsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ejson", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def clone[T](obj: T): T = js.native
  def equals(a: js.Any, b: js.Any): scala.Boolean = js.native
  def equals(a: js.Any, b: js.Any, options: CloneOptions): scala.Boolean = js.native
  def fromJSONValue(obj: java.lang.String): js.Any = js.native
  def isBinary(value: js.Any): scala.Boolean = js.native
  def newBinary(len: scala.Double): stdLib.Uint8Array = js.native
  def parse(str: java.lang.String): js.Any = js.native
  def stringify(obj: js.Any): java.lang.String = js.native
  def stringify(obj: js.Any, options: StringifyOptions): java.lang.String = js.native
  def toJSONValue(obj: js.Any): java.lang.String = js.native
}

