package typings
package fpDashTsLib.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6", "setoid")
@js.native
object setoidNs extends js.Object {
  val setoidBoolean: fpDashTsLib.es6SetoidMod.Setoid[scala.Boolean] = js.native
  val setoidDate: fpDashTsLib.es6SetoidMod.Setoid[stdLib.Date] = js.native
  val setoidNumber: fpDashTsLib.es6SetoidMod.Setoid[scala.Double] = js.native
  val setoidString: fpDashTsLib.es6SetoidMod.Setoid[java.lang.String] = js.native
  def contramap[A, B](f: js.Function1[/* b */ B, A], fa: fpDashTsLib.es6SetoidMod.Setoid[A]): fpDashTsLib.es6SetoidMod.Setoid[B] = js.native
  def fromEquals[A](equals: js.Function2[/* x */ A, /* y */ A, scala.Boolean]): fpDashTsLib.es6SetoidMod.Setoid[A] = js.native
  def getArraySetoid[A](S: fpDashTsLib.es6SetoidMod.Setoid[A]): fpDashTsLib.es6SetoidMod.Setoid[fpDashTsLib.libArrayMod.Global.Array[A]] = js.native
  def getProductSetoid[A, B](SA: fpDashTsLib.es6SetoidMod.Setoid[A], SB: fpDashTsLib.es6SetoidMod.Setoid[B]): fpDashTsLib.es6SetoidMod.Setoid[js.Tuple2[A, B]] = js.native
  def getRecordSetoid[O /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */](
    setoids: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof O ]: fp-ts.fp-ts/es6/Setoid.Setoid<O[K]>}
    */ fpDashTsLib.fpDashTsLibStrings.getRecordSetoid with O
  ): fpDashTsLib.es6SetoidMod.Setoid[O] = js.native
  def getStructSetoid[O /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */](
    setoids: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof O ]: fp-ts.fp-ts/es6/Setoid.Setoid<O[K]>}
    */ fpDashTsLib.fpDashTsLibStrings.getStructSetoid with O
  ): fpDashTsLib.es6SetoidMod.Setoid[O] = js.native
  def getTupleSetoid[T /* <: fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.es6SetoidMod.Setoid[_]] */](
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param setoids because its type T is not an array type */ setoids: T
  ): fpDashTsLib.es6SetoidMod.Setoid[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K] extends fp-ts.fp-ts/es6/Setoid.Setoid<infer A>? any : never}
    */ fpDashTsLib.fpDashTsLibStrings.getTupleSetoid with T
  ] = js.native
  def strictEqual[A](a: A, b: A): scala.Boolean = js.native
}

