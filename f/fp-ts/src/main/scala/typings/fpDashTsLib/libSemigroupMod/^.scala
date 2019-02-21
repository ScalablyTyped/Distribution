package typings
package fpDashTsLib.libSemigroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Semigroup", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val semigroupAll: fpDashTsLib.libSemigroupMod.Semigroup[scala.Boolean] = js.native
  val semigroupAny: fpDashTsLib.libSemigroupMod.Semigroup[scala.Boolean] = js.native
  val semigroupProduct: fpDashTsLib.libSemigroupMod.Semigroup[scala.Double] = js.native
  val semigroupString: fpDashTsLib.libSemigroupMod.Semigroup[java.lang.String] = js.native
  val semigroupSum: fpDashTsLib.libSemigroupMod.Semigroup[scala.Double] = js.native
  val semigroupVoid: fpDashTsLib.libSemigroupMod.Semigroup[scala.Unit] = js.native
  def fold[A](S: fpDashTsLib.libSemigroupMod.Semigroup[A]): js.Function1[/* a */ A, js.Function1[/* as */ fpDashTsLib.libArrayMod.Global.Array[A], A]] = js.native
  def getArraySemigroup[A](): fpDashTsLib.libSemigroupMod.Semigroup[fpDashTsLib.libArrayMod.Global.Array[A]] = js.native
  def getDictionarySemigroup[A](S: fpDashTsLib.libSemigroupMod.Semigroup[A]): fpDashTsLib.libSemigroupMod.Semigroup[org.scalablytyped.runtime.StringDictionary[A]] = js.native
  @JSName("getDictionarySemigroup")
  def getDictionarySemigroup_KStringA[K /* <: java.lang.String */, A](S: fpDashTsLib.libSemigroupMod.Semigroup[A]): fpDashTsLib.libSemigroupMod.Semigroup[stdLib.Record[K, A]] = js.native
  def getDualSemigroup[A](S: fpDashTsLib.libSemigroupMod.Semigroup[A]): fpDashTsLib.libSemigroupMod.Semigroup[A] = js.native
  def getFirstSemigroup[A](): fpDashTsLib.libSemigroupMod.Semigroup[A] = js.native
  def getFunctionSemigroup[S](S: fpDashTsLib.libSemigroupMod.Semigroup[S]): js.Function0[fpDashTsLib.libSemigroupMod.Semigroup[js.Function1[/* a */ _, S]]] = js.native
  def getJoinSemigroup[A](O: fpDashTsLib.libOrdMod.Ord[A]): fpDashTsLib.libSemigroupMod.Semigroup[A] = js.native
  def getLastSemigroup[A](): fpDashTsLib.libSemigroupMod.Semigroup[A] = js.native
  def getMeetSemigroup[A](O: fpDashTsLib.libOrdMod.Ord[A]): fpDashTsLib.libSemigroupMod.Semigroup[A] = js.native
  def getObjectSemigroup[A /* <: js.Object */](): fpDashTsLib.libSemigroupMod.Semigroup[A] = js.native
  def getProductSemigroup[A, B](SA: fpDashTsLib.libSemigroupMod.Semigroup[A], SB: fpDashTsLib.libSemigroupMod.Semigroup[B]): fpDashTsLib.libSemigroupMod.Semigroup[js.Tuple2[A, B]] = js.native
  def getRecordSemigroup[O /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */](
    semigroups: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof O ]: fp-ts.fp-ts/lib/Semigroup.Semigroup<O[K]>}
    */ fpDashTsLib.fpDashTsLibStrings.getRecordSemigroup with O
  ): fpDashTsLib.libSemigroupMod.Semigroup[O] = js.native
  def getStructSemigroup[O /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */](
    semigroups: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof O ]: fp-ts.fp-ts/lib/Semigroup.Semigroup<O[K]>}
    */ fpDashTsLib.fpDashTsLibStrings.getStructSemigroup with O
  ): fpDashTsLib.libSemigroupMod.Semigroup[O] = js.native
  def getTupleSemigroup[A, B](SA: fpDashTsLib.libSemigroupMod.Semigroup[A], SB: fpDashTsLib.libSemigroupMod.Semigroup[B]): fpDashTsLib.libSemigroupMod.Semigroup[js.Tuple2[A, B]] = js.native
}

