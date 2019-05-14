package typings
package fpDashTsLib.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6", "monoid")
@js.native
object monoidNs extends js.Object {
  val monoidAll: fpDashTsLib.es6MonoidMod.Monoid[scala.Boolean] = js.native
  val monoidAny: fpDashTsLib.es6MonoidMod.Monoid[scala.Boolean] = js.native
  val monoidProduct: fpDashTsLib.es6MonoidMod.Monoid[scala.Double] = js.native
  val monoidString: fpDashTsLib.es6MonoidMod.Monoid[java.lang.String] = js.native
  val monoidSum: fpDashTsLib.es6MonoidMod.Monoid[scala.Double] = js.native
  val monoidVoid: fpDashTsLib.es6MonoidMod.Monoid[scala.Unit] = js.native
  val unsafeMonoidArray: fpDashTsLib.es6MonoidMod.Monoid[fpDashTsLib.libArrayMod.Global.Array[js.Any]] = js.native
  def fold[A](M: fpDashTsLib.es6MonoidMod.Monoid[A]): js.Function1[/* as */ fpDashTsLib.libArrayMod.Global.Array[A], A] = js.native
  def getArrayMonoid[A](): fpDashTsLib.es6MonoidMod.Monoid[fpDashTsLib.libArrayMod.Global.Array[A]] = js.native
  def getDictionaryMonoid[A](S: fpDashTsLib.es6SemigroupMod.Semigroup[A]): fpDashTsLib.es6MonoidMod.Monoid[org.scalablytyped.runtime.StringDictionary[A]] = js.native
  @JSName("getDictionaryMonoid")
  def getDictionaryMonoid_KStringA[K /* <: java.lang.String */, A](S: fpDashTsLib.es6SemigroupMod.Semigroup[A]): fpDashTsLib.es6MonoidMod.Monoid[stdLib.Record[K, A]] = js.native
  def getDualMonoid[A](M: fpDashTsLib.es6MonoidMod.Monoid[A]): fpDashTsLib.es6MonoidMod.Monoid[A] = js.native
  def getEndomorphismMonoid[A](): fpDashTsLib.es6MonoidMod.Monoid[fpDashTsLib.es6FunctionMod.Endomorphism[A]] = js.native
  def getFunctionMonoid[M](M: fpDashTsLib.es6MonoidMod.Monoid[M]): js.Function0[fpDashTsLib.es6MonoidMod.Monoid[js.Function1[/* a */ _, M]]] = js.native
  def getJoinMonoid[A](B: fpDashTsLib.es6BoundedMod.Bounded[A]): fpDashTsLib.es6MonoidMod.Monoid[A] = js.native
  def getMeetMonoid[A](B: fpDashTsLib.es6BoundedMod.Bounded[A]): fpDashTsLib.es6MonoidMod.Monoid[A] = js.native
  def getProductMonoid[A, B](MA: fpDashTsLib.es6MonoidMod.Monoid[A], MB: fpDashTsLib.es6MonoidMod.Monoid[B]): fpDashTsLib.es6MonoidMod.Monoid[js.Tuple2[A, B]] = js.native
  def getRecordMonoid[O /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */](
    monoids: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof O ]: fp-ts.fp-ts/es6/Monoid.Monoid<O[K]>}
    */ fpDashTsLib.fpDashTsLibStrings.getRecordMonoid with O
  ): fpDashTsLib.es6MonoidMod.Monoid[O] = js.native
  def getStructMonoid[O /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */](
    monoids: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof O ]: fp-ts.fp-ts/es6/Monoid.Monoid<O[K]>}
    */ fpDashTsLib.fpDashTsLibStrings.getStructMonoid with O
  ): fpDashTsLib.es6MonoidMod.Monoid[O] = js.native
  def getTupleMonoid[T /* <: fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.es6MonoidMod.Monoid[_]] */](
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param monoids because its type T is not an array type */ monoids: T
  ): fpDashTsLib.es6MonoidMod.Monoid[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K] extends fp-ts.fp-ts/es6/Semigroup.Semigroup<infer A>? any : never}
    */ fpDashTsLib.fpDashTsLibStrings.getTupleMonoid with T
  ] = js.native
}

