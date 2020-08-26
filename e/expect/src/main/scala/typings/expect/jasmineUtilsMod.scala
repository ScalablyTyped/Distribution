package typings.expect

import typings.expect.typesMod.Tester
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expect/build/jasmineUtils", JSImport.Namespace)
@js.native
object jasmineUtilsMod extends js.Object {
  def equals(a: js.Any, b: js.Any): Boolean = js.native
  def equals(a: js.Any, b: js.Any, customTesters: js.UndefOr[scala.Nothing], strictCheck: Boolean): Boolean = js.native
  def equals(a: js.Any, b: js.Any, customTesters: js.Array[Tester]): Boolean = js.native
  def equals(a: js.Any, b: js.Any, customTesters: js.Array[Tester], strictCheck: Boolean): Boolean = js.native
  def fnNameFor(func: js.Function): String = js.native
  def hasProperty(obj: js.Object, property: String): Boolean = js.native
  def hasProperty(obj: Null, property: String): Boolean = js.native
  def isA(typeName: String, value: js.Any): Boolean = js.native
  def isImmutableUnorderedKeyed(maybeKeyed: js.Any): Boolean = js.native
  def isImmutableUnorderedSet(maybeSet: js.Any): Boolean = js.native
  def isUndefined(obj: js.Any): Boolean = js.native
}

