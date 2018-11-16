package typings
package fpDashTsLib.libFunctionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/function", JSImport.Namespace)
@js.native
object libFunctionModMembers extends js.Object {
  val and: js.Function2[/* p1 */ Predicate[js.Any], /* p2 */ Predicate[js.Any], Predicate[js.Any]] = js.native
  @JSName("apply")
  val apply: js.Function1[/* f */ js.Function1[/* a */ js.Any, js.Any], js.Function1[/* a */ js.Any, js.Any]] = js.native
  val applyFlipped: js.Function1[/* a */ js.Any, js.Function1[/* f */ js.Function1[/* a */ js.Any, js.Any], js.Any]] = js.native
  val concat: js.Function2[
    /* x */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
    /* y */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
    fpDashTsLib.libArrayMod.Global.Array[js.Any]
  ] = js.native
  val constFalse: js.Function0[scala.Boolean] = js.native
  val constIdentity: js.Function0[js.Function1[/* a */ js.Any, js.Any]] = js.native
  val constNull: js.Function0[scala.Null] = js.native
  val constTrue: js.Function0[scala.Boolean] = js.native
  val constUndefined: js.Function0[js.UndefOr[scala.Nothing]] = js.native
  val constant: js.Function1[/* a */ js.Any, Lazy[js.Any]] = js.native
  val decrement: js.Function1[/* n */ scala.Double, scala.Double] = js.native
  val flip: js.Function1[/* f */ Curried2[js.Any, js.Any, js.Any], Curried2[js.Any, js.Any, js.Any]] = js.native
  val identity: js.Function1[/* a */ js.Any, js.Any] = js.native
  val increment: js.Function1[/* n */ scala.Double, scala.Double] = js.native
  val not: js.Function1[/* predicate */ Predicate[js.Any], Predicate[js.Any]] = js.native
  val on: js.Function1[
    /* op */ BinaryOperation[js.Any, js.Any], 
    js.Function1[/* f */ js.Function1[/* a */ js.Any, js.Any], BinaryOperation[js.Any, js.Any]]
  ] = js.native
  val phantom: js.Any = js.native
  @JSName("toString")
  val toString_FlibFunctionModMembers: js.Function1[/* x */ js.Any, java.lang.String] = js.native
  val tuple: js.Function2[/* a */ js.Any, /* b */ js.Any, js.Tuple2[js.Any, js.Any]] = js.native
  val tupleCurried: js.Function1[/* a */ js.Any, js.Function1[/* b */ js.Any, js.Tuple2[js.Any, js.Any]]] = js.native
  val unsafeCoerce: js.Function1[/* a */ js.Any, js.Any] = js.native
  def compose[A, B, C](bc: js.Function1[/* b */ B, C], ab: js.Function1[/* a */ A, B]): js.Function1[/* a */ A, C] = js.native
  def compose[A, B, C, D](cd: js.Function1[/* c */ C, D], bc: js.Function1[/* b */ B, C], ab: js.Function1[/* a */ A, B]): js.Function1[/* a */ A, D] = js.native
  def compose[A, B, C, D, E](
    de: js.Function1[/* d */ D, E],
    cd: js.Function1[/* c */ C, D],
    bc: js.Function1[/* b */ B, C],
    ab: js.Function1[/* a */ A, B]
  ): js.Function1[/* a */ A, E] = js.native
  def compose[A, B, C, D, E, F](
    ef: js.Function1[/* e */ E, F],
    de: js.Function1[/* d */ D, E],
    cd: js.Function1[/* c */ C, D],
    bc: js.Function1[/* b */ B, C],
    ab: js.Function1[/* a */ A, B]
  ): js.Function1[/* a */ A, F] = js.native
  def compose[A, B, C, D, E, F, G](
    fg: js.Function1[/* f */ F, G],
    ef: js.Function1[/* e */ E, F],
    de: js.Function1[/* d */ D, E],
    cd: js.Function1[/* c */ C, D],
    bc: js.Function1[/* b */ B, C],
    ab: js.Function1[/* a */ A, B]
  ): js.Function1[/* a */ A, G] = js.native
  def compose[A, B, C, D, E, F, G, H](
    gh: js.Function1[/* g */ G, H],
    fg: js.Function1[/* f */ F, G],
    ef: js.Function1[/* e */ E, F],
    de: js.Function1[/* d */ D, E],
    cd: js.Function1[/* c */ C, D],
    bc: js.Function1[/* b */ B, C],
    ab: js.Function1[/* a */ A, B]
  ): js.Function1[/* a */ A, H] = js.native
  def compose[A, B, C, D, E, F, G, H, I](
    hi: js.Function1[/* h */ H, I],
    gh: js.Function1[/* g */ G, H],
    fg: js.Function1[/* f */ F, G],
    ef: js.Function1[/* e */ E, F],
    de: js.Function1[/* d */ D, E],
    cd: js.Function1[/* c */ C, D],
    bc: js.Function1[/* b */ B, C],
    ab: js.Function1[/* a */ A, B]
  ): js.Function1[/* a */ A, I] = js.native
  def compose[A, B, C, D, E, F, G, H, I, J](
    ij: js.Function1[/* i */ I, J],
    hi: js.Function1[/* h */ H, I],
    gh: js.Function1[/* g */ G, H],
    fg: js.Function1[/* f */ F, G],
    ef: js.Function1[/* e */ E, F],
    de: js.Function1[/* d */ D, E],
    cd: js.Function1[/* c */ C, D],
    bc: js.Function1[/* b */ B, C],
    ab: js.Function1[/* a */ A, B]
  ): js.Function1[/* a */ A, J] = js.native
  def curried(f: js.Function, n: scala.Double, acc: fpDashTsLib.libArrayMod.Global.Array[_]): js.ThisFunction1[/* this */ js.Any, /* x */ js.Any, _] = js.native
  def curry[A, B, C](f: Function2[A, B, C]): Curried2[A, B, C] = js.native
  def curry[A, B, C, D](f: Function3[A, B, C, D]): Curried3[A, B, C, D] = js.native
  def curry[A, B, C, D, E](f: Function4[A, B, C, D, E]): Curried4[A, B, C, D, E] = js.native
  def curry[A, B, C, D, E, F](f: Function5[A, B, C, D, E, F]): Curried5[A, B, C, D, E, F] = js.native
  def curry[A, B, C, D, E, F, G](f: Function6[A, B, C, D, E, F, G]): Curried6[A, B, C, D, E, F, G] = js.native
  def curry[A, B, C, D, E, F, G, H](f: Function7[A, B, C, D, E, F, G, H]): Curried7[A, B, C, D, E, F, G, H] = js.native
  def curry[A, B, C, D, E, F, G, H, I](f: Function8[A, B, C, D, E, F, G, H, I]): Curried8[A, B, C, D, E, F, G, H, I] = js.native
  def curry[A, B, C, D, E, F, G, H, I, J](f: Function9[A, B, C, D, E, F, G, H, I, J]): Curried9[A, B, C, D, E, F, G, H, I, J] = js.native
  def or[A](p1: Predicate[A], p2: Predicate[A]): Predicate[A] = js.native
  @JSName("or")
  def or_AB1AB2ARefinement[A, B1 /* <: A */, B2 /* <: A */](p1: Refinement[A, B1], p2: Refinement[A, B2]): Refinement[A, B1 | B2] = js.native
  def pipe[A, B, C](ab: js.Function1[/* a */ A, B], bc: js.Function1[/* b */ B, C]): js.Function1[/* a */ A, C] = js.native
  def pipe[A, B, C, D](ab: js.Function1[/* a */ A, B], bc: js.Function1[/* b */ B, C], cd: js.Function1[/* c */ C, D]): js.Function1[/* a */ A, D] = js.native
  def pipe[A, B, C, D, E](
    ab: js.Function1[/* a */ A, B],
    bc: js.Function1[/* b */ B, C],
    cd: js.Function1[/* c */ C, D],
    de: js.Function1[/* d */ D, E]
  ): js.Function1[/* a */ A, E] = js.native
  def pipe[A, B, C, D, E, F](
    ab: js.Function1[/* a */ A, B],
    bc: js.Function1[/* b */ B, C],
    cd: js.Function1[/* c */ C, D],
    de: js.Function1[/* d */ D, E],
    ef: js.Function1[/* e */ E, F]
  ): js.Function1[/* a */ A, F] = js.native
  def pipe[A, B, C, D, E, F, G](
    ab: js.Function1[/* a */ A, B],
    bc: js.Function1[/* b */ B, C],
    cd: js.Function1[/* c */ C, D],
    de: js.Function1[/* d */ D, E],
    ef: js.Function1[/* e */ E, F],
    fg: js.Function1[/* f */ F, G]
  ): js.Function1[/* a */ A, G] = js.native
  def pipe[A, B, C, D, E, F, G, H](
    ab: js.Function1[/* a */ A, B],
    bc: js.Function1[/* b */ B, C],
    cd: js.Function1[/* c */ C, D],
    de: js.Function1[/* d */ D, E],
    ef: js.Function1[/* e */ E, F],
    fg: js.Function1[/* f */ F, G],
    gh: js.Function1[/* g */ G, H]
  ): js.Function1[/* a */ A, H] = js.native
  def pipe[A, B, C, D, E, F, G, H, I](
    ab: js.Function1[/* a */ A, B],
    bc: js.Function1[/* b */ B, C],
    cd: js.Function1[/* c */ C, D],
    de: js.Function1[/* d */ D, E],
    ef: js.Function1[/* e */ E, F],
    fg: js.Function1[/* f */ F, G],
    gh: js.Function1[/* g */ G, H],
    hi: js.Function1[/* h */ H, I]
  ): js.Function1[/* a */ A, I] = js.native
  def pipe[A, B, C, D, E, F, G, H, I, J](
    ab: js.Function1[/* a */ A, B],
    bc: js.Function1[/* b */ B, C],
    cd: js.Function1[/* c */ C, D],
    de: js.Function1[/* d */ D, E],
    ef: js.Function1[/* e */ E, F],
    fg: js.Function1[/* f */ F, G],
    gh: js.Function1[/* g */ G, H],
    hi: js.Function1[/* h */ H, I],
    ij: js.Function1[/* i */ I, J]
  ): js.Function1[/* a */ A, J] = js.native
}

