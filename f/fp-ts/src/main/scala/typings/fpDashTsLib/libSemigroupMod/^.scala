package typings
package fpDashTsLib.libSemigroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Semigroup", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val semigroupAll: Semigroup[scala.Boolean] = js.native
  val semigroupAny: Semigroup[scala.Boolean] = js.native
  val semigroupProduct: Semigroup[scala.Double] = js.native
  val semigroupString: Semigroup[java.lang.String] = js.native
  val semigroupSum: Semigroup[scala.Double] = js.native
  val semigroupVoid: Semigroup[scala.Unit] = js.native
  def fold[A](S: Semigroup[A]): js.Function1[/* a */ A, js.Function1[/* as */ fpDashTsLib.libArrayMod.Global.Array[A], A]] = js.native
  def getArraySemigroup[A](): Semigroup[fpDashTsLib.libArrayMod.Global.Array[A]] = js.native
  def getDictionarySemigroup[A](S: Semigroup[A]): Semigroup[org.scalablytyped.runtime.StringDictionary[A]] = js.native
  @JSName("getDictionarySemigroup")
  def getDictionarySemigroup_KStringA[K /* <: java.lang.String */, A](S: Semigroup[A]): Semigroup[stdLib.Record[K, A]] = js.native
  def getDualSemigroup[A](S: Semigroup[A]): Semigroup[A] = js.native
  def getFirstSemigroup[A](): Semigroup[A] = js.native
  def getFunctionSemigroup[S](S: Semigroup[S]): js.Function0[Semigroup[js.Function1[/* a */ _, S]]] = js.native
  def getJoinSemigroup[A](O: fpDashTsLib.libOrdMod.Ord[A]): Semigroup[A] = js.native
  def getLastSemigroup[A](): Semigroup[A] = js.native
  def getMeetSemigroup[A](O: fpDashTsLib.libOrdMod.Ord[A]): Semigroup[A] = js.native
  def getObjectSemigroup[A /* <: js.Object */](): Semigroup[A] = js.native
  def getProductSemigroup[A, B](SA: Semigroup[A], SB: Semigroup[B]): Semigroup[js.Tuple2[A, B]] = js.native
  def getRecordSemigroup[O /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */](
    semigroups: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof O ]: fp-ts.fp-ts/lib/Semigroup.Semigroup<O[K]>}
    */ fpDashTsLib.fpDashTsLibStrings.getRecordSemigroup with O
  ): Semigroup[O] = js.native
  def getStructSemigroup[O /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */](
    semigroups: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof O ]: fp-ts.fp-ts/lib/Semigroup.Semigroup<O[K]>}
    */ fpDashTsLib.fpDashTsLibStrings.getStructSemigroup with O
  ): Semigroup[O] = js.native
  def getTupleSemigroup[T /* <: fpDashTsLib.libArrayMod.Global.Array[Semigroup[_]] */](
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param semigroups because its type T is not an array type */ semigroups: T
  ): Semigroup[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: any}
    */ fpDashTsLib.fpDashTsLibStrings.getTupleSemigroup with js.Any
  ] = js.native
}

