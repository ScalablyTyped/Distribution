package typings.fpTs

import typings.fpTs.libBooleanAlgebraMod.BooleanAlgebra
import typings.fpTs.libMonoidMod.Monoid
import typings.fpTs.libRingMod.Ring
import typings.fpTs.libSemigroupMod.Semigroup
import typings.fpTs.libSemiringMod.Semiring
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFunctionMod {
  
  @JSImport("fp-ts/lib/function", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def SK[A, B](_underscore: A, b: B): B = (^.asInstanceOf[js.Dynamic].applyDynamic("SK")(_underscore.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[B]
  
  inline def absurd[A](_underscore: scala.Nothing): A = ^.asInstanceOf[js.Dynamic].applyDynamic("absurd")(_underscore.asInstanceOf[js.Any]).asInstanceOf[A]
  
  inline def apply[A](a: A): js.Function1[/* f */ js.Function1[/* a */ A, Any], Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("apply")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* f */ js.Function1[/* a */ A, Any], Any]]
  
  @JSImport("fp-ts/lib/function", "constFalse")
  @js.native
  val constFalse: LazyArg[Boolean] = js.native
  
  @JSImport("fp-ts/lib/function", "constNull")
  @js.native
  val constNull: LazyArg[Null] = js.native
  
  @JSImport("fp-ts/lib/function", "constTrue")
  @js.native
  val constTrue: LazyArg[Boolean] = js.native
  
  @JSImport("fp-ts/lib/function", "constUndefined")
  @js.native
  val constUndefined: LazyArg[Unit] = js.native
  
  @JSImport("fp-ts/lib/function", "constVoid")
  @js.native
  val constVoid: LazyArg[Unit] = js.native
  
  inline def constant[A](a: A): LazyArg[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("constant")(a.asInstanceOf[js.Any]).asInstanceOf[LazyArg[A]]
  
  inline def decrement(n: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("decrement")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def flip[A, B, C](f: js.Function1[/* a */ A, js.Function1[/* b */ B, C]]): js.Function1[/* b */ B, js.Function1[/* a */ A, C]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flip")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* b */ B, js.Function1[/* a */ A, C]]]
  inline def flip[A, B, C](f: js.Function2[/* a */ A, /* b */ B, C]): js.Function2[/* b */ B, /* a */ A, C] = ^.asInstanceOf[js.Dynamic].applyDynamic("flip")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* b */ B, /* a */ A, C]]
  
  inline def flow[A /* <: js.Array[Any] */, B](ab: js.Function1[/* a */ A, B]): js.Function1[/* a */ A, B] = ^.asInstanceOf[js.Dynamic].applyDynamic("flow")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, B]]
  inline def flow[A /* <: js.Array[Any] */, B, C](ab: js.Function1[/* a */ A, B], bc: js.Function1[/* b */ B, C]): js.Function1[/* a */ A, C] = (^.asInstanceOf[js.Dynamic].applyDynamic("flow")(ab.asInstanceOf[js.Any], bc.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ A, C]]
  inline def flow[A /* <: js.Array[Any] */, B, C, D](ab: js.Function1[/* a */ A, B], bc: js.Function1[/* b */ B, C], cd: js.Function1[/* c */ C, D]): js.Function1[/* a */ A, D] = (^.asInstanceOf[js.Dynamic].applyDynamic("flow")(ab.asInstanceOf[js.Any], bc.asInstanceOf[js.Any], cd.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ A, D]]
  inline def flow[A /* <: js.Array[Any] */, B, C, D, E](
    ab: js.Function1[/* a */ A, B],
    bc: js.Function1[/* b */ B, C],
    cd: js.Function1[/* c */ C, D],
    de: js.Function1[/* d */ D, E]
  ): js.Function1[/* a */ A, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("flow")(ab.asInstanceOf[js.Any], bc.asInstanceOf[js.Any], cd.asInstanceOf[js.Any], de.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ A, E]]
  inline def flow[A /* <: js.Array[Any] */, B, C, D, E, F](
    ab: js.Function1[/* a */ A, B],
    bc: js.Function1[/* b */ B, C],
    cd: js.Function1[/* c */ C, D],
    de: js.Function1[/* d */ D, E],
    ef: js.Function1[/* e */ E, F]
  ): js.Function1[/* a */ A, F] = (^.asInstanceOf[js.Dynamic].applyDynamic("flow")(ab.asInstanceOf[js.Any], bc.asInstanceOf[js.Any], cd.asInstanceOf[js.Any], de.asInstanceOf[js.Any], ef.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ A, F]]
  inline def flow[A /* <: js.Array[Any] */, B, C, D, E, F, G](
    ab: js.Function1[/* a */ A, B],
    bc: js.Function1[/* b */ B, C],
    cd: js.Function1[/* c */ C, D],
    de: js.Function1[/* d */ D, E],
    ef: js.Function1[/* e */ E, F],
    fg: js.Function1[/* f */ F, G]
  ): js.Function1[/* a */ A, G] = (^.asInstanceOf[js.Dynamic].applyDynamic("flow")(ab.asInstanceOf[js.Any], bc.asInstanceOf[js.Any], cd.asInstanceOf[js.Any], de.asInstanceOf[js.Any], ef.asInstanceOf[js.Any], fg.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ A, G]]
  inline def flow[A /* <: js.Array[Any] */, B, C, D, E, F, G, H](
    ab: js.Function1[/* a */ A, B],
    bc: js.Function1[/* b */ B, C],
    cd: js.Function1[/* c */ C, D],
    de: js.Function1[/* d */ D, E],
    ef: js.Function1[/* e */ E, F],
    fg: js.Function1[/* f */ F, G],
    gh: js.Function1[/* g */ G, H]
  ): js.Function1[/* a */ A, H] = (^.asInstanceOf[js.Dynamic].applyDynamic("flow")(ab.asInstanceOf[js.Any], bc.asInstanceOf[js.Any], cd.asInstanceOf[js.Any], de.asInstanceOf[js.Any], ef.asInstanceOf[js.Any], fg.asInstanceOf[js.Any], gh.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ A, H]]
  inline def flow[A /* <: js.Array[Any] */, B, C, D, E, F, G, H, I](
    ab: js.Function1[/* a */ A, B],
    bc: js.Function1[/* b */ B, C],
    cd: js.Function1[/* c */ C, D],
    de: js.Function1[/* d */ D, E],
    ef: js.Function1[/* e */ E, F],
    fg: js.Function1[/* f */ F, G],
    gh: js.Function1[/* g */ G, H],
    hi: js.Function1[/* h */ H, I]
  ): js.Function1[/* a */ A, I] = (^.asInstanceOf[js.Dynamic].applyDynamic("flow")(ab.asInstanceOf[js.Any], bc.asInstanceOf[js.Any], cd.asInstanceOf[js.Any], de.asInstanceOf[js.Any], ef.asInstanceOf[js.Any], fg.asInstanceOf[js.Any], gh.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ A, I]]
  inline def flow[A /* <: js.Array[Any] */, B, C, D, E, F, G, H, I, J](
    ab: js.Function1[/* a */ A, B],
    bc: js.Function1[/* b */ B, C],
    cd: js.Function1[/* c */ C, D],
    de: js.Function1[/* d */ D, E],
    ef: js.Function1[/* e */ E, F],
    fg: js.Function1[/* f */ F, G],
    gh: js.Function1[/* g */ G, H],
    hi: js.Function1[/* h */ H, I],
    ij: js.Function1[/* i */ I, J]
  ): js.Function1[/* a */ A, J] = (^.asInstanceOf[js.Dynamic].applyDynamic("flow")(ab.asInstanceOf[js.Any], bc.asInstanceOf[js.Any], cd.asInstanceOf[js.Any], de.asInstanceOf[js.Any], ef.asInstanceOf[js.Any], fg.asInstanceOf[js.Any], gh.asInstanceOf[js.Any], hi.asInstanceOf[js.Any], ij.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ A, J]]
  
  inline def getBooleanAlgebra[B](B: BooleanAlgebra[B]): js.Function0[BooleanAlgebra[js.Function1[/* a */ scala.Nothing, B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBooleanAlgebra")(B.asInstanceOf[js.Any]).asInstanceOf[js.Function0[BooleanAlgebra[js.Function1[/* a */ scala.Nothing, B]]]]
  
  inline def getEndomorphismMonoid[A](): Monoid[Endomorphism[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndomorphismMonoid")().asInstanceOf[Monoid[Endomorphism[A]]]
  
  inline def getMonoid[M](M: Monoid[M]): js.Function0[Monoid[js.Function1[/* a */ scala.Nothing, M]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonoid")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Monoid[js.Function1[/* a */ scala.Nothing, M]]]]
  
  inline def getRing[A, B](R: Ring[B]): Ring[js.Function1[/* a */ A, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRing")(R.asInstanceOf[js.Any]).asInstanceOf[Ring[js.Function1[/* a */ A, B]]]
  
  inline def getSemigroup[S](S: Semigroup[S]): js.Function0[Semigroup[js.Function1[/* a */ scala.Nothing, S]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSemigroup")(S.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Semigroup[js.Function1[/* a */ scala.Nothing, S]]]]
  
  inline def getSemiring[A, B](S: Semiring[B]): Semiring[js.Function1[/* a */ A, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSemiring")(S.asInstanceOf[js.Any]).asInstanceOf[Semiring[js.Function1[/* a */ A, B]]]
  
  inline def hole[T](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("hole")().asInstanceOf[T]
  
  inline def identity[A](a: A): A = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")(a.asInstanceOf[js.Any]).asInstanceOf[A]
  
  inline def increment(n: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("increment")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def not[A](predicate: Predicate[A]): Predicate[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(predicate.asInstanceOf[js.Any]).asInstanceOf[Predicate[A]]
  
  inline def pipe[A](a: A): A = ^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(a.asInstanceOf[js.Any]).asInstanceOf[A]
  inline def pipe[A, B](a: A, ab: js.Function1[/* a */ A, B]): B = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(a.asInstanceOf[js.Any], ab.asInstanceOf[js.Any])).asInstanceOf[B]
  inline def pipe[A, B, C](a: A, ab: js.Function1[/* a */ A, B], bc: js.Function1[/* b */ B, C]): C = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(a.asInstanceOf[js.Any], ab.asInstanceOf[js.Any], bc.asInstanceOf[js.Any])).asInstanceOf[C]
  inline def pipe[A, B, C, D](
    a: A,
    ab: js.Function1[/* a */ A, B],
    bc: js.Function1[/* b */ B, C],
    cd: js.Function1[/* c */ C, D]
  ): D = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(a.asInstanceOf[js.Any], ab.asInstanceOf[js.Any], bc.asInstanceOf[js.Any], cd.asInstanceOf[js.Any])).asInstanceOf[D]
  inline def pipe[A, B, C, D, E](
    a: A,
    ab: js.Function1[/* a */ A, B],
    bc: js.Function1[/* b */ B, C],
    cd: js.Function1[/* c */ C, D],
    de: js.Function1[/* d */ D, E]
  ): E = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(a.asInstanceOf[js.Any], ab.asInstanceOf[js.Any], bc.asInstanceOf[js.Any], cd.asInstanceOf[js.Any], de.asInstanceOf[js.Any])).asInstanceOf[E]
  inline def pipe[A, B, C, D, E, F](
    a: A,
    ab: js.Function1[/* a */ A, B],
    bc: js.Function1[/* b */ B, C],
    cd: js.Function1[/* c */ C, D],
    de: js.Function1[/* d */ D, E],
    ef: js.Function1[/* e */ E, F]
  ): F = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(a.asInstanceOf[js.Any], ab.asInstanceOf[js.Any], bc.asInstanceOf[js.Any], cd.asInstanceOf[js.Any], de.asInstanceOf[js.Any], ef.asInstanceOf[js.Any])).asInstanceOf[F]
  inline def pipe[A, B, C, D, E, F, G](
    a: A,
    ab: js.Function1[/* a */ A, B],
    bc: js.Function1[/* b */ B, C],
    cd: js.Function1[/* c */ C, D],
    de: js.Function1[/* d */ D, E],
    ef: js.Function1[/* e */ E, F],
    fg: js.Function1[/* f */ F, G]
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(a.asInstanceOf[js.Any], ab.asInstanceOf[js.Any], bc.asInstanceOf[js.Any], cd.asInstanceOf[js.Any], de.asInstanceOf[js.Any], ef.asInstanceOf[js.Any], fg.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def pipe[A, B, C, D, E, F, G, H](
    a: A,
    ab: js.Function1[/* a */ A, B],
    bc: js.Function1[/* b */ B, C],
    cd: js.Function1[/* c */ C, D],
    de: js.Function1[/* d */ D, E],
    ef: js.Function1[/* e */ E, F],
    fg: js.Function1[/* f */ F, G],
    gh: js.Function1[/* g */ G, H]
  ): H = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(a.asInstanceOf[js.Any], ab.asInstanceOf[js.Any], bc.asInstanceOf[js.Any], cd.asInstanceOf[js.Any], de.asInstanceOf[js.Any], ef.asInstanceOf[js.Any], fg.asInstanceOf[js.Any], gh.asInstanceOf[js.Any])).asInstanceOf[H]
  inline def pipe[A, B, C, D, E, F, G, H, I](
    a: A,
    ab: js.Function1[/* a */ A, B],
    bc: js.Function1[/* b */ B, C],
    cd: js.Function1[/* c */ C, D],
    de: js.Function1[/* d */ D, E],
    ef: js.Function1[/* e */ E, F],
    fg: js.Function1[/* f */ F, G],
    gh: js.Function1[/* g */ G, H],
    hi: js.Function1[/* h */ H, I]
  ): I = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(a.asInstanceOf[js.Any], ab.asInstanceOf[js.Any], bc.asInstanceOf[js.Any], cd.asInstanceOf[js.Any], de.asInstanceOf[js.Any], ef.asInstanceOf[js.Any], fg.asInstanceOf[js.Any], gh.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[I]
  inline def pipe[A, B, C, D, E, F, G, H, I, J](
    a: A,
    ab: js.Function1[/* a */ A, B],
    bc: js.Function1[/* b */ B, C],
    cd: js.Function1[/* c */ C, D],
    de: js.Function1[/* d */ D, E],
    ef: js.Function1[/* e */ E, F],
    fg: js.Function1[/* f */ F, G],
    gh: js.Function1[/* g */ G, H],
    hi: js.Function1[/* h */ H, I],
    ij: js.Function1[/* i */ I, J]
  ): J = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(a.asInstanceOf[js.Any], ab.asInstanceOf[js.Any], bc.asInstanceOf[js.Any], cd.asInstanceOf[js.Any], de.asInstanceOf[js.Any], ef.asInstanceOf[js.Any], fg.asInstanceOf[js.Any], gh.asInstanceOf[js.Any], hi.asInstanceOf[js.Any], ij.asInstanceOf[js.Any])).asInstanceOf[J]
  inline def pipe[A, B, C, D, E, F, G, H, I, J, K](
    a: A,
    ab: js.Function1[/* a */ A, B],
    bc: js.Function1[/* b */ B, C],
    cd: js.Function1[/* c */ C, D],
    de: js.Function1[/* d */ D, E],
    ef: js.Function1[/* e */ E, F],
    fg: js.Function1[/* f */ F, G],
    gh: js.Function1[/* g */ G, H],
    hi: js.Function1[/* h */ H, I],
    ij: js.Function1[/* i */ I, J],
    jk: js.Function1[/* j */ J, K]
  ): K = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(a.asInstanceOf[js.Any], ab.asInstanceOf[js.Any], bc.asInstanceOf[js.Any], cd.asInstanceOf[js.Any], de.asInstanceOf[js.Any], ef.asInstanceOf[js.Any], fg.asInstanceOf[js.Any], gh.asInstanceOf[js.Any], hi.asInstanceOf[js.Any], ij.asInstanceOf[js.Any], jk.asInstanceOf[js.Any])).asInstanceOf[K]
  inline def pipe[A, B, C, D, E, F, G, H, I, J, K, L](
    a: A,
    ab: js.Function1[/* a */ A, B],
    bc: js.Function1[/* b */ B, C],
    cd: js.Function1[/* c */ C, D],
    de: js.Function1[/* d */ D, E],
    ef: js.Function1[/* e */ E, F],
    fg: js.Function1[/* f */ F, G],
    gh: js.Function1[/* g */ G, H],
    hi: js.Function1[/* h */ H, I],
    ij: js.Function1[/* i */ I, J],
    jk: js.Function1[/* j */ J, K],
    kl: js.Function1[/* k */ K, L]
  ): L = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(a.asInstanceOf[js.Any], ab.asInstanceOf[js.Any], bc.asInstanceOf[js.Any], cd.asInstanceOf[js.Any], de.asInstanceOf[js.Any], ef.asInstanceOf[js.Any], fg.asInstanceOf[js.Any], gh.asInstanceOf[js.Any], hi.asInstanceOf[js.Any], ij.asInstanceOf[js.Any], jk.asInstanceOf[js.Any], kl.asInstanceOf[js.Any])).asInstanceOf[L]
  inline def pipe[A, B, C, D, E, F, G, H, I, J, K, L, M](
    a: A,
    ab: js.Function1[/* a */ A, B],
    bc: js.Function1[/* b */ B, C],
    cd: js.Function1[/* c */ C, D],
    de: js.Function1[/* d */ D, E],
    ef: js.Function1[/* e */ E, F],
    fg: js.Function1[/* f */ F, G],
    gh: js.Function1[/* g */ G, H],
    hi: js.Function1[/* h */ H, I],
    ij: js.Function1[/* i */ I, J],
    jk: js.Function1[/* j */ J, K],
    kl: js.Function1[/* k */ K, L],
    lm: js.Function1[/* l */ L, M]
  ): M = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(a.asInstanceOf[js.Any], ab.asInstanceOf[js.Any], bc.asInstanceOf[js.Any], cd.asInstanceOf[js.Any], de.asInstanceOf[js.Any], ef.asInstanceOf[js.Any], fg.asInstanceOf[js.Any], gh.asInstanceOf[js.Any], hi.asInstanceOf[js.Any], ij.asInstanceOf[js.Any], jk.asInstanceOf[js.Any], kl.asInstanceOf[js.Any], lm.asInstanceOf[js.Any])).asInstanceOf[M]
  inline def pipe[A, B, C, D, E, F, G, H, I, J, K, L, M, N](
    a: A,
    ab: js.Function1[/* a */ A, B],
    bc: js.Function1[/* b */ B, C],
    cd: js.Function1[/* c */ C, D],
    de: js.Function1[/* d */ D, E],
    ef: js.Function1[/* e */ E, F],
    fg: js.Function1[/* f */ F, G],
    gh: js.Function1[/* g */ G, H],
    hi: js.Function1[/* h */ H, I],
    ij: js.Function1[/* i */ I, J],
    jk: js.Function1[/* j */ J, K],
    kl: js.Function1[/* k */ K, L],
    lm: js.Function1[/* l */ L, M],
    mn: js.Function1[/* m */ M, N]
  ): N = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(a.asInstanceOf[js.Any], ab.asInstanceOf[js.Any], bc.asInstanceOf[js.Any], cd.asInstanceOf[js.Any], de.asInstanceOf[js.Any], ef.asInstanceOf[js.Any], fg.asInstanceOf[js.Any], gh.asInstanceOf[js.Any], hi.asInstanceOf[js.Any], ij.asInstanceOf[js.Any], jk.asInstanceOf[js.Any], kl.asInstanceOf[js.Any], lm.asInstanceOf[js.Any], mn.asInstanceOf[js.Any])).asInstanceOf[N]
  inline def pipe[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O](
    a: A,
    ab: js.Function1[/* a */ A, B],
    bc: js.Function1[/* b */ B, C],
    cd: js.Function1[/* c */ C, D],
    de: js.Function1[/* d */ D, E],
    ef: js.Function1[/* e */ E, F],
    fg: js.Function1[/* f */ F, G],
    gh: js.Function1[/* g */ G, H],
    hi: js.Function1[/* h */ H, I],
    ij: js.Function1[/* i */ I, J],
    jk: js.Function1[/* j */ J, K],
    kl: js.Function1[/* k */ K, L],
    lm: js.Function1[/* l */ L, M],
    mn: js.Function1[/* m */ M, N],
    no: js.Function1[/* n */ N, O]
  ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(a.asInstanceOf[js.Any], ab.asInstanceOf[js.Any], bc.asInstanceOf[js.Any], cd.asInstanceOf[js.Any], de.asInstanceOf[js.Any], ef.asInstanceOf[js.Any], fg.asInstanceOf[js.Any], gh.asInstanceOf[js.Any], hi.asInstanceOf[js.Any], ij.asInstanceOf[js.Any], jk.asInstanceOf[js.Any], kl.asInstanceOf[js.Any], lm.asInstanceOf[js.Any], mn.asInstanceOf[js.Any], no.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def pipe[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P](
    a: A,
    ab: js.Function1[/* a */ A, B],
    bc: js.Function1[/* b */ B, C],
    cd: js.Function1[/* c */ C, D],
    de: js.Function1[/* d */ D, E],
    ef: js.Function1[/* e */ E, F],
    fg: js.Function1[/* f */ F, G],
    gh: js.Function1[/* g */ G, H],
    hi: js.Function1[/* h */ H, I],
    ij: js.Function1[/* i */ I, J],
    jk: js.Function1[/* j */ J, K],
    kl: js.Function1[/* k */ K, L],
    lm: js.Function1[/* l */ L, M],
    mn: js.Function1[/* m */ M, N],
    no: js.Function1[/* n */ N, O],
    op: js.Function1[/* o */ O, P]
  ): P = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(a.asInstanceOf[js.Any], ab.asInstanceOf[js.Any], bc.asInstanceOf[js.Any], cd.asInstanceOf[js.Any], de.asInstanceOf[js.Any], ef.asInstanceOf[js.Any], fg.asInstanceOf[js.Any], gh.asInstanceOf[js.Any], hi.asInstanceOf[js.Any], ij.asInstanceOf[js.Any], jk.asInstanceOf[js.Any], kl.asInstanceOf[js.Any], lm.asInstanceOf[js.Any], mn.asInstanceOf[js.Any], no.asInstanceOf[js.Any], op.asInstanceOf[js.Any])).asInstanceOf[P]
  inline def pipe[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q](
    a: A,
    ab: js.Function1[/* a */ A, B],
    bc: js.Function1[/* b */ B, C],
    cd: js.Function1[/* c */ C, D],
    de: js.Function1[/* d */ D, E],
    ef: js.Function1[/* e */ E, F],
    fg: js.Function1[/* f */ F, G],
    gh: js.Function1[/* g */ G, H],
    hi: js.Function1[/* h */ H, I],
    ij: js.Function1[/* i */ I, J],
    jk: js.Function1[/* j */ J, K],
    kl: js.Function1[/* k */ K, L],
    lm: js.Function1[/* l */ L, M],
    mn: js.Function1[/* m */ M, N],
    no: js.Function1[/* n */ N, O],
    op: js.Function1[/* o */ O, P],
    pq: js.Function1[/* p */ P, Q]
  ): Q = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(a.asInstanceOf[js.Any], ab.asInstanceOf[js.Any], bc.asInstanceOf[js.Any], cd.asInstanceOf[js.Any], de.asInstanceOf[js.Any], ef.asInstanceOf[js.Any], fg.asInstanceOf[js.Any], gh.asInstanceOf[js.Any], hi.asInstanceOf[js.Any], ij.asInstanceOf[js.Any], jk.asInstanceOf[js.Any], kl.asInstanceOf[js.Any], lm.asInstanceOf[js.Any], mn.asInstanceOf[js.Any], no.asInstanceOf[js.Any], op.asInstanceOf[js.Any], pq.asInstanceOf[js.Any])).asInstanceOf[Q]
  inline def pipe[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R](
    a: A,
    ab: js.Function1[/* a */ A, B],
    bc: js.Function1[/* b */ B, C],
    cd: js.Function1[/* c */ C, D],
    de: js.Function1[/* d */ D, E],
    ef: js.Function1[/* e */ E, F],
    fg: js.Function1[/* f */ F, G],
    gh: js.Function1[/* g */ G, H],
    hi: js.Function1[/* h */ H, I],
    ij: js.Function1[/* i */ I, J],
    jk: js.Function1[/* j */ J, K],
    kl: js.Function1[/* k */ K, L],
    lm: js.Function1[/* l */ L, M],
    mn: js.Function1[/* m */ M, N],
    no: js.Function1[/* n */ N, O],
    op: js.Function1[/* o */ O, P],
    pq: js.Function1[/* p */ P, Q],
    qr: js.Function1[/* q */ Q, R]
  ): R = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(a.asInstanceOf[js.Any], ab.asInstanceOf[js.Any], bc.asInstanceOf[js.Any], cd.asInstanceOf[js.Any], de.asInstanceOf[js.Any], ef.asInstanceOf[js.Any], fg.asInstanceOf[js.Any], gh.asInstanceOf[js.Any], hi.asInstanceOf[js.Any], ij.asInstanceOf[js.Any], jk.asInstanceOf[js.Any], kl.asInstanceOf[js.Any], lm.asInstanceOf[js.Any], mn.asInstanceOf[js.Any], no.asInstanceOf[js.Any], op.asInstanceOf[js.Any], pq.asInstanceOf[js.Any], qr.asInstanceOf[js.Any])).asInstanceOf[R]
  inline def pipe[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S](
    a: A,
    ab: js.Function1[/* a */ A, B],
    bc: js.Function1[/* b */ B, C],
    cd: js.Function1[/* c */ C, D],
    de: js.Function1[/* d */ D, E],
    ef: js.Function1[/* e */ E, F],
    fg: js.Function1[/* f */ F, G],
    gh: js.Function1[/* g */ G, H],
    hi: js.Function1[/* h */ H, I],
    ij: js.Function1[/* i */ I, J],
    jk: js.Function1[/* j */ J, K],
    kl: js.Function1[/* k */ K, L],
    lm: js.Function1[/* l */ L, M],
    mn: js.Function1[/* m */ M, N],
    no: js.Function1[/* n */ N, O],
    op: js.Function1[/* o */ O, P],
    pq: js.Function1[/* p */ P, Q],
    qr: js.Function1[/* q */ Q, R],
    rs: js.Function1[/* r */ R, S]
  ): S = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(a.asInstanceOf[js.Any], ab.asInstanceOf[js.Any], bc.asInstanceOf[js.Any], cd.asInstanceOf[js.Any], de.asInstanceOf[js.Any], ef.asInstanceOf[js.Any], fg.asInstanceOf[js.Any], gh.asInstanceOf[js.Any], hi.asInstanceOf[js.Any], ij.asInstanceOf[js.Any], jk.asInstanceOf[js.Any], kl.asInstanceOf[js.Any], lm.asInstanceOf[js.Any], mn.asInstanceOf[js.Any], no.asInstanceOf[js.Any], op.asInstanceOf[js.Any], pq.asInstanceOf[js.Any], qr.asInstanceOf[js.Any], rs.asInstanceOf[js.Any])).asInstanceOf[S]
  inline def pipe[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T](
    a: A,
    ab: js.Function1[/* a */ A, B],
    bc: js.Function1[/* b */ B, C],
    cd: js.Function1[/* c */ C, D],
    de: js.Function1[/* d */ D, E],
    ef: js.Function1[/* e */ E, F],
    fg: js.Function1[/* f */ F, G],
    gh: js.Function1[/* g */ G, H],
    hi: js.Function1[/* h */ H, I],
    ij: js.Function1[/* i */ I, J],
    jk: js.Function1[/* j */ J, K],
    kl: js.Function1[/* k */ K, L],
    lm: js.Function1[/* l */ L, M],
    mn: js.Function1[/* m */ M, N],
    no: js.Function1[/* n */ N, O],
    op: js.Function1[/* o */ O, P],
    pq: js.Function1[/* p */ P, Q],
    qr: js.Function1[/* q */ Q, R],
    rs: js.Function1[/* r */ R, S],
    st: js.Function1[/* s */ S, T]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(a.asInstanceOf[js.Any], ab.asInstanceOf[js.Any], bc.asInstanceOf[js.Any], cd.asInstanceOf[js.Any], de.asInstanceOf[js.Any], ef.asInstanceOf[js.Any], fg.asInstanceOf[js.Any], gh.asInstanceOf[js.Any], hi.asInstanceOf[js.Any], ij.asInstanceOf[js.Any], jk.asInstanceOf[js.Any], kl.asInstanceOf[js.Any], lm.asInstanceOf[js.Any], mn.asInstanceOf[js.Any], no.asInstanceOf[js.Any], op.asInstanceOf[js.Any], pq.asInstanceOf[js.Any], qr.asInstanceOf[js.Any], rs.asInstanceOf[js.Any], st.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def tuple[T /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param t because its type T is not an array type */ t: T
  ): T = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(t.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def tupled[A /* <: js.Array[Any] */, B](f: js.Function1[/* a */ A, B]): js.Function1[/* a */ A, B] = ^.asInstanceOf[js.Dynamic].applyDynamic("tupled")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, B]]
  
  inline def unsafeCoerce[A, B](a: A): B = ^.asInstanceOf[js.Dynamic].applyDynamic("unsafeCoerce")(a.asInstanceOf[js.Any]).asInstanceOf[B]
  
  inline def untupled[A /* <: js.Array[Any] */, B](f: js.Function1[/* a */ A, B]): js.Function1[/* a */ A, B] = ^.asInstanceOf[js.Dynamic].applyDynamic("untupled")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, B]]
  
  type Endomorphism[A] = js.Function1[/* a */ A, A]
  
  type FunctionN[A /* <: js.Array[Any] */, B] = js.Function1[/* args */ A, B]
  
  type Lazy[A] = js.Function0[A]
  
  type LazyArg[A] = js.Function0[A]
  
  type Predicate[A] = js.Function1[/* a */ A, Boolean]
  
  type Refinement[A, B /* <: A */] = js.Function1[/* a */ A, /* is B */ Boolean]
}
