package typings.fpTs.mod

import typings.fpTs.functionMod.Lazy
import typings.fpTs.functionMod.Predicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object function {
  
  @JSImport("fp-ts", "function")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def absurd[A](_underscore: scala.Nothing): A = ^.asInstanceOf[js.Dynamic].applyDynamic("absurd")(_underscore.asInstanceOf[js.Any]).asInstanceOf[A]
  
  @scala.inline
  def constFalse(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("constFalse")().asInstanceOf[Boolean]
  
  @scala.inline
  def constNull(): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("constNull")().asInstanceOf[Null]
  
  @scala.inline
  def constTrue(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("constTrue")().asInstanceOf[Boolean]
  
  @scala.inline
  def constUndefined(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("constUndefined")().asInstanceOf[Unit]
  
  @scala.inline
  def constVoid(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("constVoid")().asInstanceOf[Unit]
  
  @scala.inline
  def constant[A](a: A): Lazy[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("constant")(a.asInstanceOf[js.Any]).asInstanceOf[Lazy[A]]
  
  @scala.inline
  def decrement(n: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("decrement")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def flip[A, B, C](f: js.Function2[/* a */ A, /* b */ B, C]): js.Function2[/* b */ B, /* a */ A, C] = ^.asInstanceOf[js.Dynamic].applyDynamic("flip")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* b */ B, /* a */ A, C]]
  
  @scala.inline
  def flow[A /* <: js.Array[js.Any] */, B](ab: js.Function1[/* a */ A, B]): js.Function1[/* a */ A, B] = ^.asInstanceOf[js.Dynamic].applyDynamic("flow")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, B]]
  @scala.inline
  def flow[A /* <: js.Array[js.Any] */, B, C](ab: js.Function1[/* a */ A, B], bc: js.Function1[/* b */ B, C]): js.Function1[/* a */ A, C] = (^.asInstanceOf[js.Dynamic].applyDynamic("flow")(ab.asInstanceOf[js.Any], bc.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ A, C]]
  @scala.inline
  def flow[A /* <: js.Array[js.Any] */, B, C, D](ab: js.Function1[/* a */ A, B], bc: js.Function1[/* b */ B, C], cd: js.Function1[/* c */ C, D]): js.Function1[/* a */ A, D] = (^.asInstanceOf[js.Dynamic].applyDynamic("flow")(ab.asInstanceOf[js.Any], bc.asInstanceOf[js.Any], cd.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ A, D]]
  @scala.inline
  def flow[A /* <: js.Array[js.Any] */, B, C, D, E](
    ab: js.Function1[/* a */ A, B],
    bc: js.Function1[/* b */ B, C],
    cd: js.Function1[/* c */ C, D],
    de: js.Function1[/* d */ D, E]
  ): js.Function1[/* a */ A, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("flow")(ab.asInstanceOf[js.Any], bc.asInstanceOf[js.Any], cd.asInstanceOf[js.Any], de.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ A, E]]
  @scala.inline
  def flow[A /* <: js.Array[js.Any] */, B, C, D, E, F](
    ab: js.Function1[/* a */ A, B],
    bc: js.Function1[/* b */ B, C],
    cd: js.Function1[/* c */ C, D],
    de: js.Function1[/* d */ D, E],
    ef: js.Function1[/* e */ E, F]
  ): js.Function1[/* a */ A, F] = (^.asInstanceOf[js.Dynamic].applyDynamic("flow")(ab.asInstanceOf[js.Any], bc.asInstanceOf[js.Any], cd.asInstanceOf[js.Any], de.asInstanceOf[js.Any], ef.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ A, F]]
  @scala.inline
  def flow[A /* <: js.Array[js.Any] */, B, C, D, E, F, G](
    ab: js.Function1[/* a */ A, B],
    bc: js.Function1[/* b */ B, C],
    cd: js.Function1[/* c */ C, D],
    de: js.Function1[/* d */ D, E],
    ef: js.Function1[/* e */ E, F],
    fg: js.Function1[/* f */ F, G]
  ): js.Function1[/* a */ A, G] = (^.asInstanceOf[js.Dynamic].applyDynamic("flow")(ab.asInstanceOf[js.Any], bc.asInstanceOf[js.Any], cd.asInstanceOf[js.Any], de.asInstanceOf[js.Any], ef.asInstanceOf[js.Any], fg.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ A, G]]
  @scala.inline
  def flow[A /* <: js.Array[js.Any] */, B, C, D, E, F, G, H](
    ab: js.Function1[/* a */ A, B],
    bc: js.Function1[/* b */ B, C],
    cd: js.Function1[/* c */ C, D],
    de: js.Function1[/* d */ D, E],
    ef: js.Function1[/* e */ E, F],
    fg: js.Function1[/* f */ F, G],
    gh: js.Function1[/* g */ G, H]
  ): js.Function1[/* a */ A, H] = (^.asInstanceOf[js.Dynamic].applyDynamic("flow")(ab.asInstanceOf[js.Any], bc.asInstanceOf[js.Any], cd.asInstanceOf[js.Any], de.asInstanceOf[js.Any], ef.asInstanceOf[js.Any], fg.asInstanceOf[js.Any], gh.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ A, H]]
  @scala.inline
  def flow[A /* <: js.Array[js.Any] */, B, C, D, E, F, G, H, I](
    ab: js.Function1[/* a */ A, B],
    bc: js.Function1[/* b */ B, C],
    cd: js.Function1[/* c */ C, D],
    de: js.Function1[/* d */ D, E],
    ef: js.Function1[/* e */ E, F],
    fg: js.Function1[/* f */ F, G],
    gh: js.Function1[/* g */ G, H],
    hi: js.Function1[/* h */ H, I]
  ): js.Function1[/* a */ A, I] = (^.asInstanceOf[js.Dynamic].applyDynamic("flow")(ab.asInstanceOf[js.Any], bc.asInstanceOf[js.Any], cd.asInstanceOf[js.Any], de.asInstanceOf[js.Any], ef.asInstanceOf[js.Any], fg.asInstanceOf[js.Any], gh.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ A, I]]
  @scala.inline
  def flow[A /* <: js.Array[js.Any] */, B, C, D, E, F, G, H, I, J](
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
  
  @scala.inline
  def hole[T](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("hole")().asInstanceOf[T]
  
  @scala.inline
  def identity[A](a: A): A = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")(a.asInstanceOf[js.Any]).asInstanceOf[A]
  
  @scala.inline
  def increment(n: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("increment")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def not[A](predicate: Predicate[A]): Predicate[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(predicate.asInstanceOf[js.Any]).asInstanceOf[Predicate[A]]
  
  @scala.inline
  def pipe[A](a: A): A = ^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(a.asInstanceOf[js.Any]).asInstanceOf[A]
  @scala.inline
  def pipe[A, B](a: A, ab: js.Function1[/* a */ A, B]): B = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(a.asInstanceOf[js.Any], ab.asInstanceOf[js.Any])).asInstanceOf[B]
  @scala.inline
  def pipe[A, B, C](a: A, ab: js.Function1[/* a */ A, B], bc: js.Function1[/* b */ B, C]): C = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(a.asInstanceOf[js.Any], ab.asInstanceOf[js.Any], bc.asInstanceOf[js.Any])).asInstanceOf[C]
  @scala.inline
  def pipe[A, B, C, D](
    a: A,
    ab: js.Function1[/* a */ A, B],
    bc: js.Function1[/* b */ B, C],
    cd: js.Function1[/* c */ C, D]
  ): D = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(a.asInstanceOf[js.Any], ab.asInstanceOf[js.Any], bc.asInstanceOf[js.Any], cd.asInstanceOf[js.Any])).asInstanceOf[D]
  @scala.inline
  def pipe[A, B, C, D, E](
    a: A,
    ab: js.Function1[/* a */ A, B],
    bc: js.Function1[/* b */ B, C],
    cd: js.Function1[/* c */ C, D],
    de: js.Function1[/* d */ D, E]
  ): E = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(a.asInstanceOf[js.Any], ab.asInstanceOf[js.Any], bc.asInstanceOf[js.Any], cd.asInstanceOf[js.Any], de.asInstanceOf[js.Any])).asInstanceOf[E]
  @scala.inline
  def pipe[A, B, C, D, E, F](
    a: A,
    ab: js.Function1[/* a */ A, B],
    bc: js.Function1[/* b */ B, C],
    cd: js.Function1[/* c */ C, D],
    de: js.Function1[/* d */ D, E],
    ef: js.Function1[/* e */ E, F]
  ): F = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(a.asInstanceOf[js.Any], ab.asInstanceOf[js.Any], bc.asInstanceOf[js.Any], cd.asInstanceOf[js.Any], de.asInstanceOf[js.Any], ef.asInstanceOf[js.Any])).asInstanceOf[F]
  @scala.inline
  def pipe[A, B, C, D, E, F, G](
    a: A,
    ab: js.Function1[/* a */ A, B],
    bc: js.Function1[/* b */ B, C],
    cd: js.Function1[/* c */ C, D],
    de: js.Function1[/* d */ D, E],
    ef: js.Function1[/* e */ E, F],
    fg: js.Function1[/* f */ F, G]
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(a.asInstanceOf[js.Any], ab.asInstanceOf[js.Any], bc.asInstanceOf[js.Any], cd.asInstanceOf[js.Any], de.asInstanceOf[js.Any], ef.asInstanceOf[js.Any], fg.asInstanceOf[js.Any])).asInstanceOf[G]
  @scala.inline
  def pipe[A, B, C, D, E, F, G, H](
    a: A,
    ab: js.Function1[/* a */ A, B],
    bc: js.Function1[/* b */ B, C],
    cd: js.Function1[/* c */ C, D],
    de: js.Function1[/* d */ D, E],
    ef: js.Function1[/* e */ E, F],
    fg: js.Function1[/* f */ F, G],
    gh: js.Function1[/* g */ G, H]
  ): H = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(a.asInstanceOf[js.Any], ab.asInstanceOf[js.Any], bc.asInstanceOf[js.Any], cd.asInstanceOf[js.Any], de.asInstanceOf[js.Any], ef.asInstanceOf[js.Any], fg.asInstanceOf[js.Any], gh.asInstanceOf[js.Any])).asInstanceOf[H]
  @scala.inline
  def pipe[A, B, C, D, E, F, G, H, I](
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
  @scala.inline
  def pipe[A, B, C, D, E, F, G, H, I, J](
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
  @scala.inline
  def pipe[A, B, C, D, E, F, G, H, I, J, K](
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
  @scala.inline
  def pipe[A, B, C, D, E, F, G, H, I, J, K, L](
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
  @scala.inline
  def pipe[A, B, C, D, E, F, G, H, I, J, K, L, M](
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
  @scala.inline
  def pipe[A, B, C, D, E, F, G, H, I, J, K, L, M, N](
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
  @scala.inline
  def pipe[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O](
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
  @scala.inline
  def pipe[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P](
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
  @scala.inline
  def pipe[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q](
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
  @scala.inline
  def pipe[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R](
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
  @scala.inline
  def pipe[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S](
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
  @scala.inline
  def pipe[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T](
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
  
  @scala.inline
  def tuple[T /* <: js.Array[js.Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param t because its type T is not an array type */ t: T
  ): T = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(t.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def tupled[A /* <: js.Array[js.Any] */, B](f: js.Function1[/* a */ A, B]): js.Function1[/* a */ A, B] = ^.asInstanceOf[js.Dynamic].applyDynamic("tupled")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, B]]
  
  @scala.inline
  def unsafeCoerce[A, B](a: A): B = ^.asInstanceOf[js.Dynamic].applyDynamic("unsafeCoerce")(a.asInstanceOf[js.Any]).asInstanceOf[B]
  
  @scala.inline
  def untupled[A /* <: js.Array[js.Any] */, B](f: js.Function1[/* a */ A, B]): js.Function1[/* a */ A, B] = ^.asInstanceOf[js.Dynamic].applyDynamic("untupled")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, B]]
}
