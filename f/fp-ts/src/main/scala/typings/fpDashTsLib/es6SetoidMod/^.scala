package typings
package fpDashTsLib.es6SetoidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6/Setoid", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val setoidBoolean: Setoid[scala.Boolean] = js.native
  val setoidDate: Setoid[stdLib.Date] = js.native
  val setoidNumber: Setoid[scala.Double] = js.native
  val setoidString: Setoid[java.lang.String] = js.native
  def contramap[A, B](f: js.Function1[/* b */ B, A], fa: Setoid[A]): Setoid[B] = js.native
  def fromEquals[A](equals: js.Function2[/* x */ A, /* y */ A, scala.Boolean]): Setoid[A] = js.native
  def getArraySetoid[A](S: Setoid[A]): Setoid[fpDashTsLib.libArrayMod.Global.Array[A]] = js.native
  def getProductSetoid[A, B](SA: Setoid[A], SB: Setoid[B]): Setoid[js.Tuple2[A, B]] = js.native
  def getRecordSetoid[O /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */](
    setoids: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof O ]: fp-ts.fp-ts/es6/Setoid.Setoid<O[K]>}
    */ fpDashTsLib.fpDashTsLibStrings.getRecordSetoid with O
  ): Setoid[O] = js.native
  def getStructSetoid[O /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */](
    setoids: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof O ]: fp-ts.fp-ts/es6/Setoid.Setoid<O[K]>}
    */ fpDashTsLib.fpDashTsLibStrings.getStructSetoid with O
  ): Setoid[O] = js.native
  def getTupleSetoid[T /* <: fpDashTsLib.libArrayMod.Global.Array[Setoid[_]] */](
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param setoids because its type T is not an array type */ setoids: T
  ): Setoid[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K] extends fp-ts.fp-ts/es6/Setoid.Setoid<infer A>? any : never}
    */ fpDashTsLib.fpDashTsLibStrings.getTupleSetoid with T
  ] = js.native
  def strictEqual[A](a: A, b: A): scala.Boolean = js.native
}

