package typings
package fpDashTsLib.libStrMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/StrMap", "StrMap")
@js.native
class StrMap[A] protected () extends js.Object {
  def this(value: ScalablyTyped.runtime.StringDictionary[A]) = this()
  val _A: A = js.native
  val _URI: URI = js.native
  val value: ScalablyTyped.runtime.StringDictionary[A] = js.native
  def filter(p: fpDashTsLib.libFunctionMod.Predicate[A]): StrMap[A] = js.native
  /**
       * @since 1.4.0
       */
  @JSName("filter")
  def filter_BA[B /* <: A */](p: fpDashTsLib.libFunctionMod.Refinement[A, B]): StrMap[B] = js.native
  def map[B](f: js.Function1[/* a */ A, B]): StrMap[B] = js.native
  def mapWithKey[B](f: js.Function2[/* k */ java.lang.String, /* a */ A, B]): StrMap[B] = js.native
  def reduce[B](b: B, f: js.Function2[/* b */ B, /* a */ A, B]): B = js.native
}

