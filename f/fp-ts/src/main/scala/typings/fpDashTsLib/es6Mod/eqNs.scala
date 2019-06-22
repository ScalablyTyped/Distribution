package typings
package fpDashTsLib.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6", "eq")
@js.native
object eqNs extends js.Object {
  val URI: fpDashTsLib.fpDashTsLibStrings.Eq = js.native
  val eqBoolean: fpDashTsLib.es6EqMod.Eq[scala.Boolean] = js.native
  val eqDate: fpDashTsLib.es6EqMod.Eq[stdLib.Date] = js.native
  val eqNumber: fpDashTsLib.es6EqMod.Eq[scala.Double] = js.native
  val eqString: fpDashTsLib.es6EqMod.Eq[java.lang.String] = js.native
  @JSName("eq")
  val eq_FeqNs: fpDashTsLib.es6ContravariantMod.Contravariant1[fpDashTsLib.es6EqMod.URI] = js.native
  def contramap[A, B](f: js.Function1[/* b */ B, A]): js.Function1[/* fa */ fpDashTsLib.es6EqMod.Eq[A], fpDashTsLib.es6EqMod.Eq[B]] = js.native
  def fromEquals[A](equals: js.Function2[/* x */ A, /* y */ A, scala.Boolean]): fpDashTsLib.es6EqMod.Eq[A] = js.native
  def getStructEq[O /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */](
    eqs: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof O ]: fp-ts.fp-ts/es6/Eq.Eq<O[K]>}
    */ fpDashTsLib.fpDashTsLibStrings.getStructEq with O
  ): fpDashTsLib.es6EqMod.Eq[O] = js.native
  def getTupleEq[T /* <: fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.es6EqMod.Eq[_]] */](
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param eqs because its type T is not an array type */ eqs: T
  ): fpDashTsLib.es6EqMod.Eq[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K] extends fp-ts.fp-ts/es6/Eq.Eq<infer A>? any : never}
    */ fpDashTsLib.fpDashTsLibStrings.getTupleEq with T
  ] = js.native
  def strictEqual[A](a: A, b: A): scala.Boolean = js.native
}

