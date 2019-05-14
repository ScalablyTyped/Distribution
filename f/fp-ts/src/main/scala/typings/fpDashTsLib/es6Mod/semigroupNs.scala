package typings
package fpDashTsLib.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6", "semigroup")
@js.native
object semigroupNs extends js.Object {
  val semigroupAll: fpDashTsLib.es6SemigroupMod.Semigroup[scala.Boolean] = js.native
  val semigroupAny: fpDashTsLib.es6SemigroupMod.Semigroup[scala.Boolean] = js.native
  val semigroupProduct: fpDashTsLib.es6SemigroupMod.Semigroup[scala.Double] = js.native
  val semigroupString: fpDashTsLib.es6SemigroupMod.Semigroup[java.lang.String] = js.native
  val semigroupSum: fpDashTsLib.es6SemigroupMod.Semigroup[scala.Double] = js.native
  val semigroupVoid: fpDashTsLib.es6SemigroupMod.Semigroup[scala.Unit] = js.native
  def fold[A](S: fpDashTsLib.es6SemigroupMod.Semigroup[A]): js.Function1[/* a */ A, js.Function1[/* as */ fpDashTsLib.libArrayMod.Global.Array[A], A]] = js.native
  def getArraySemigroup[A](): fpDashTsLib.es6SemigroupMod.Semigroup[fpDashTsLib.libArrayMod.Global.Array[A]] = js.native
  def getDictionarySemigroup[A](S: fpDashTsLib.es6SemigroupMod.Semigroup[A]): fpDashTsLib.es6SemigroupMod.Semigroup[org.scalablytyped.runtime.StringDictionary[A]] = js.native
  @JSName("getDictionarySemigroup")
  def getDictionarySemigroup_KStringA[K /* <: java.lang.String */, A](S: fpDashTsLib.es6SemigroupMod.Semigroup[A]): fpDashTsLib.es6SemigroupMod.Semigroup[stdLib.Record[K, A]] = js.native
  def getDualSemigroup[A](S: fpDashTsLib.es6SemigroupMod.Semigroup[A]): fpDashTsLib.es6SemigroupMod.Semigroup[A] = js.native
  def getFirstSemigroup[A](): fpDashTsLib.es6SemigroupMod.Semigroup[A] = js.native
  def getFunctionSemigroup[S](S: fpDashTsLib.es6SemigroupMod.Semigroup[S]): js.Function0[fpDashTsLib.es6SemigroupMod.Semigroup[js.Function1[/* a */ _, S]]] = js.native
  def getJoinSemigroup[A](O: fpDashTsLib.es6OrdMod.Ord[A]): fpDashTsLib.es6SemigroupMod.Semigroup[A] = js.native
  def getLastSemigroup[A](): fpDashTsLib.es6SemigroupMod.Semigroup[A] = js.native
  def getMeetSemigroup[A](O: fpDashTsLib.es6OrdMod.Ord[A]): fpDashTsLib.es6SemigroupMod.Semigroup[A] = js.native
  def getObjectSemigroup[A /* <: js.Object */](): fpDashTsLib.es6SemigroupMod.Semigroup[A] = js.native
  def getProductSemigroup[A, B](SA: fpDashTsLib.es6SemigroupMod.Semigroup[A], SB: fpDashTsLib.es6SemigroupMod.Semigroup[B]): fpDashTsLib.es6SemigroupMod.Semigroup[js.Tuple2[A, B]] = js.native
  def getRecordSemigroup[O /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */](
    semigroups: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof O ]: fp-ts.fp-ts/es6/Semigroup.Semigroup<O[K]>}
    */ fpDashTsLib.fpDashTsLibStrings.getRecordSemigroup with O
  ): fpDashTsLib.es6SemigroupMod.Semigroup[O] = js.native
  def getStructSemigroup[O /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */](
    semigroups: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof O ]: fp-ts.fp-ts/es6/Semigroup.Semigroup<O[K]>}
    */ fpDashTsLib.fpDashTsLibStrings.getStructSemigroup with O
  ): fpDashTsLib.es6SemigroupMod.Semigroup[O] = js.native
  def getTupleSemigroup[T /* <: fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.es6SemigroupMod.Semigroup[_]] */](
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param semigroups because its type T is not an array type */ semigroups: T
  ): fpDashTsLib.es6SemigroupMod.Semigroup[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K] extends fp-ts.fp-ts/es6/Semigroup.Semigroup<infer A>? any : never}
    */ fpDashTsLib.fpDashTsLibStrings.getTupleSemigroup with T
  ] = js.native
}

