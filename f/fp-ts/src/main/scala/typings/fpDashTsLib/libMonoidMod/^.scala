package typings
package fpDashTsLib.libMonoidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Monoid", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val monoidAll: Monoid[scala.Boolean] = js.native
  val monoidAny: Monoid[scala.Boolean] = js.native
  val monoidProduct: Monoid[scala.Double] = js.native
  val monoidString: Monoid[java.lang.String] = js.native
  val monoidSum: Monoid[scala.Double] = js.native
  val monoidVoid: Monoid[scala.Unit] = js.native
  val unsafeMonoidArray: Monoid[fpDashTsLib.libArrayMod.Global.Array[js.Any]] = js.native
  def fold[A](M: Monoid[A]): js.Function1[/* as */ fpDashTsLib.libArrayMod.Global.Array[A], A] = js.native
  def getArrayMonoid[A](): Monoid[fpDashTsLib.libArrayMod.Global.Array[A]] = js.native
  def getDictionaryMonoid[A](S: fpDashTsLib.libSemigroupMod.Semigroup[A]): Monoid[org.scalablytyped.runtime.StringDictionary[A]] = js.native
  @JSName("getDictionaryMonoid")
  def getDictionaryMonoid_KStringA[K /* <: java.lang.String */, A](S: fpDashTsLib.libSemigroupMod.Semigroup[A]): Monoid[stdLib.Record[K, A]] = js.native
  def getDualMonoid[A](M: Monoid[A]): Monoid[A] = js.native
  def getEndomorphismMonoid[A](): Monoid[fpDashTsLib.libFunctionMod.Endomorphism[A]] = js.native
  def getFunctionMonoid[M](M: Monoid[M]): js.Function0[Monoid[js.Function1[/* a */ _, M]]] = js.native
  def getJoinMonoid[A](B: fpDashTsLib.libBoundedMod.Bounded[A]): Monoid[A] = js.native
  def getMeetMonoid[A](B: fpDashTsLib.libBoundedMod.Bounded[A]): Monoid[A] = js.native
  def getProductMonoid[A, B](MA: Monoid[A], MB: Monoid[B]): Monoid[js.Tuple2[A, B]] = js.native
  def getRecordMonoid[O /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */](
    monoids: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof O ]: fp-ts.fp-ts/lib/Monoid.Monoid<O[K]>}
    */ fpDashTsLib.fpDashTsLibStrings.getRecordMonoid with O
  ): Monoid[O] = js.native
  def getStructMonoid[O /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */](
    monoids: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof O ]: fp-ts.fp-ts/lib/Monoid.Monoid<O[K]>}
    */ fpDashTsLib.fpDashTsLibStrings.getStructMonoid with O
  ): Monoid[O] = js.native
  def getTupleMonoid[A, B](MA: Monoid[A], MB: Monoid[B]): Monoid[js.Tuple2[A, B]] = js.native
}

