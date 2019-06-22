package typings
package fpDashTsLib.es6EqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6/Eq", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: fpDashTsLib.fpDashTsLibStrings.Eq = js.native
  val eqBoolean: Eq[scala.Boolean] = js.native
  val eqDate: Eq[stdLib.Date] = js.native
  val eqNumber: Eq[scala.Double] = js.native
  val eqString: Eq[java.lang.String] = js.native
  @JSName("eq")
  val `eq_F^`: fpDashTsLib.es6ContravariantMod.Contravariant1[URI] = js.native
  def contramap[A, B](f: js.Function1[/* b */ B, A]): js.Function1[/* fa */ Eq[A], Eq[B]] = js.native
  def fromEquals[A](equals: js.Function2[/* x */ A, /* y */ A, scala.Boolean]): Eq[A] = js.native
  def getStructEq[O /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */](
    eqs: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof O ]: fp-ts.fp-ts/es6/Eq.Eq<O[K]>}
    */ fpDashTsLib.fpDashTsLibStrings.getStructEq with O
  ): Eq[O] = js.native
  def getTupleEq[T /* <: fpDashTsLib.libArrayMod.Global.Array[Eq[_]] */](
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param eqs because its type T is not an array type */ eqs: T
  ): Eq[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K] extends fp-ts.fp-ts/es6/Eq.Eq<infer A>? any : never}
    */ fpDashTsLib.fpDashTsLibStrings.getTupleEq with T
  ] = js.native
  def strictEqual[A](a: A, b: A): scala.Boolean = js.native
}

