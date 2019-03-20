package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "monoid")
@js.native
object monoidNs extends js.Object {
  val monoidAll: fpDashTsLib.libMonoidMod.Monoid[scala.Boolean] = js.native
  val monoidAny: fpDashTsLib.libMonoidMod.Monoid[scala.Boolean] = js.native
  val monoidProduct: fpDashTsLib.libMonoidMod.Monoid[scala.Double] = js.native
  val monoidString: fpDashTsLib.libMonoidMod.Monoid[java.lang.String] = js.native
  val monoidSum: fpDashTsLib.libMonoidMod.Monoid[scala.Double] = js.native
  val monoidVoid: fpDashTsLib.libMonoidMod.Monoid[scala.Unit] = js.native
  val unsafeMonoidArray: fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libArrayMod.Global.Array[js.Any]] = js.native
  def fold[A](M: fpDashTsLib.libMonoidMod.Monoid[A]): js.Function1[/* as */ fpDashTsLib.libArrayMod.Global.Array[A], A] = js.native
  def getArrayMonoid[A](): fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libArrayMod.Global.Array[A]] = js.native
  def getDictionaryMonoid[A](S: fpDashTsLib.libSemigroupMod.Semigroup[A]): fpDashTsLib.libMonoidMod.Monoid[org.scalablytyped.runtime.StringDictionary[A]] = js.native
  @JSName("getDictionaryMonoid")
  def getDictionaryMonoid_KStringA[K /* <: java.lang.String */, A](S: fpDashTsLib.libSemigroupMod.Semigroup[A]): fpDashTsLib.libMonoidMod.Monoid[stdLib.Record[K, A]] = js.native
  def getDualMonoid[A](M: fpDashTsLib.libMonoidMod.Monoid[A]): fpDashTsLib.libMonoidMod.Monoid[A] = js.native
  def getEndomorphismMonoid[A](): fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libFunctionMod.Endomorphism[A]] = js.native
  def getFunctionMonoid[M](M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function0[fpDashTsLib.libMonoidMod.Monoid[js.Function1[/* a */ _, M]]] = js.native
  def getJoinMonoid[A](B: fpDashTsLib.libBoundedMod.Bounded[A]): fpDashTsLib.libMonoidMod.Monoid[A] = js.native
  def getMeetMonoid[A](B: fpDashTsLib.libBoundedMod.Bounded[A]): fpDashTsLib.libMonoidMod.Monoid[A] = js.native
  def getProductMonoid[A, B](MA: fpDashTsLib.libMonoidMod.Monoid[A], MB: fpDashTsLib.libMonoidMod.Monoid[B]): fpDashTsLib.libMonoidMod.Monoid[js.Tuple2[A, B]] = js.native
  def getRecordMonoid[O /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */](
    monoids: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof O ]: fp-ts.fp-ts/lib/Monoid.Monoid<O[K]>}
    */ fpDashTsLib.fpDashTsLibStrings.getRecordMonoid with O
  ): fpDashTsLib.libMonoidMod.Monoid[O] = js.native
  def getStructMonoid[O /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */](
    monoids: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof O ]: fp-ts.fp-ts/lib/Monoid.Monoid<O[K]>}
    */ fpDashTsLib.fpDashTsLibStrings.getStructMonoid with O
  ): fpDashTsLib.libMonoidMod.Monoid[O] = js.native
  def getTupleMonoid[T /* <: fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libMonoidMod.Monoid[_]] */](
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param monoids because its type T is not an array type */ monoids: T
  ): fpDashTsLib.libMonoidMod.Monoid[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: any}
    */ fpDashTsLib.fpDashTsLibStrings.getTupleMonoid with js.Any
  ] = js.native
}

