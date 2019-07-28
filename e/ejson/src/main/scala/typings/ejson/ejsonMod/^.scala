package typings.ejson.ejsonMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ejson", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def clone[T](obj: T): T = js.native
  def equals(a: js.Any, b: js.Any): Boolean = js.native
  def equals(a: js.Any, b: js.Any, options: CloneOptions): Boolean = js.native
  def fromJSONValue(obj: String): js.Any = js.native
  def isBinary(value: js.Any): Boolean = js.native
  def newBinary(len: Double): Uint8Array = js.native
  def parse(str: String): js.Any = js.native
  def stringify(obj: js.Any): String = js.native
  def stringify(obj: js.Any, options: StringifyOptions): String = js.native
  def toJSONValue(obj: js.Any): String = js.native
}

