package typings
package fpDashTsLib.libSemigroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Semigroup", JSImport.Namespace)
@js.native
object libSemigroupModMembers extends js.Object {
  val semigroupAll: Semigroup[scala.Boolean] = js.native
  val semigroupAny: Semigroup[scala.Boolean] = js.native
  val semigroupProduct: Semigroup[scala.Double] = js.native
  val semigroupString: Semigroup[java.lang.String] = js.native
  val semigroupSum: Semigroup[scala.Double] = js.native
  val semigroupVoid: Semigroup[scala.Unit] = js.native
  def fold[A](S: Semigroup[A]): js.Function1[/* a */ A, js.Function1[/* as */ fpDashTsLib.libArrayMod.Global.Array[A], A]] = js.native
  def getArraySemigroup[A](): Semigroup[fpDashTsLib.libArrayMod.Global.Array[A]] = js.native
  def getDictionarySemigroup[A](S: Semigroup[A]): Semigroup[ScalablyTyped.runtime.StringDictionary[A]] = js.native
  def getDualSemigroup[A](S: Semigroup[A]): Semigroup[A] = js.native
  def getFirstSemigroup[A](): Semigroup[A] = js.native
  def getFunctionSemigroup[S](S: Semigroup[S]): js.Function0[Semigroup[js.Function1[/* a */ _, S]]] = js.native
  def getJoinSemigroup[A](O: fpDashTsLib.libOrdMod.Ord[A]): Semigroup[A] = js.native
  def getLastSemigroup[A](): Semigroup[A] = js.native
  def getMeetSemigroup[A](O: fpDashTsLib.libOrdMod.Ord[A]): Semigroup[A] = js.native
  def getObjectSemigroup[A /* <: js.Object */](): Semigroup[A] = js.native
  def getProductSemigroup[A, B](SA: Semigroup[A], SB: Semigroup[B]): Semigroup[js.Tuple2[A, B]] = js.native
  def getRecordSemigroup[O /* <: ScalablyTyped.runtime.StringDictionary[js.Any] */](semigroups: fpDashTsLib.fpDashTsLibStrings.getRecordSemigroup with O): Semigroup[O] = js.native
}

