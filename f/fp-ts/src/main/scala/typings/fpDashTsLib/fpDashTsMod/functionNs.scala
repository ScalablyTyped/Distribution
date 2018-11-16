package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "function")
@js.native
object functionNs extends js.Object {
  val and: js.Function2[
    /* p1 */ fpDashTsLib.libFunctionMod.Predicate[js.Any], 
    /* p2 */ fpDashTsLib.libFunctionMod.Predicate[js.Any], 
    fpDashTsLib.libFunctionMod.Predicate[js.Any]
  ] = js.native
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
  val constant: js.Function1[/* a */ js.Any, fpDashTsLib.libFunctionMod.Lazy[js.Any]] = js.native
  val decrement: js.Function1[/* n */ scala.Double, scala.Double] = js.native
  val flip: js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Curried2[js.Any, js.Any, js.Any], 
    fpDashTsLib.libFunctionMod.Curried2[js.Any, js.Any, js.Any]
  ] = js.native
  val identity: js.Function1[/* a */ js.Any, js.Any] = js.native
  val increment: js.Function1[/* n */ scala.Double, scala.Double] = js.native
  val not: js.Function1[
    /* predicate */ fpDashTsLib.libFunctionMod.Predicate[js.Any], 
    fpDashTsLib.libFunctionMod.Predicate[js.Any]
  ] = js.native
  val on: js.Function1[
    /* op */ fpDashTsLib.libFunctionMod.BinaryOperation[js.Any, js.Any], 
    js.Function1[
      /* f */ js.Function1[/* a */ js.Any, js.Any], 
      fpDashTsLib.libFunctionMod.BinaryOperation[js.Any, js.Any]
    ]
  ] = js.native
  val phantom: js.Any = js.native
  @JSName("toString")
  val toString_FfunctionNs: js.Function1[/* x */ js.Any, java.lang.String] = js.native
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
  def curry[A, B, C](f: fpDashTsLib.libFunctionMod.Function2[A, B, C]): fpDashTsLib.libFunctionMod.Curried2[A, B, C] = js.native
  def curry[A, B, C, D](f: fpDashTsLib.libFunctionMod.Function3[A, B, C, D]): fpDashTsLib.libFunctionMod.Curried3[A, B, C, D] = js.native
  def curry[A, B, C, D, E](f: fpDashTsLib.libFunctionMod.Function4[A, B, C, D, E]): fpDashTsLib.libFunctionMod.Curried4[A, B, C, D, E] = js.native
  def curry[A, B, C, D, E, F](f: fpDashTsLib.libFunctionMod.Function5[A, B, C, D, E, F]): fpDashTsLib.libFunctionMod.Curried5[A, B, C, D, E, F] = js.native
  def curry[A, B, C, D, E, F, G](f: fpDashTsLib.libFunctionMod.Function6[A, B, C, D, E, F, G]): fpDashTsLib.libFunctionMod.Curried6[A, B, C, D, E, F, G] = js.native
  def curry[A, B, C, D, E, F, G, H](f: fpDashTsLib.libFunctionMod.Function7[A, B, C, D, E, F, G, H]): fpDashTsLib.libFunctionMod.Curried7[A, B, C, D, E, F, G, H] = js.native
  def curry[A, B, C, D, E, F, G, H, I](f: fpDashTsLib.libFunctionMod.Function8[A, B, C, D, E, F, G, H, I]): fpDashTsLib.libFunctionMod.Curried8[A, B, C, D, E, F, G, H, I] = js.native
  def curry[A, B, C, D, E, F, G, H, I, J](f: fpDashTsLib.libFunctionMod.Function9[A, B, C, D, E, F, G, H, I, J]): fpDashTsLib.libFunctionMod.Curried9[A, B, C, D, E, F, G, H, I, J] = js.native
  def or[A](p1: fpDashTsLib.libFunctionMod.Predicate[A], p2: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libFunctionMod.Predicate[A] = js.native
  @JSName("or")
  def or_AB1AB2ARefinement[A, B1 /* <: A */, B2 /* <: A */](p1: fpDashTsLib.libFunctionMod.Refinement[A, B1], p2: fpDashTsLib.libFunctionMod.Refinement[A, B2]): fpDashTsLib.libFunctionMod.Refinement[A, B1 | B2] = js.native
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

