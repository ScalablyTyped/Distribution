package typings.fpTs.mod

import typings.fpTs.anon.EURI
import typings.fpTs.anon.URI
import typings.fpTs.anon.URIF
import typings.fpTs.pipeableMod.PipeableAlt
import typings.fpTs.pipeableMod.PipeableAlt3C
import typings.fpTs.pipeableMod.PipeableAlt4
import typings.fpTs.pipeableMod.PipeableApply
import typings.fpTs.pipeableMod.PipeableApply3C
import typings.fpTs.pipeableMod.PipeableApply4
import typings.fpTs.pipeableMod.PipeableBifunctor
import typings.fpTs.pipeableMod.PipeableBifunctor3C
import typings.fpTs.pipeableMod.PipeableBifunctor4
import typings.fpTs.pipeableMod.PipeableChain
import typings.fpTs.pipeableMod.PipeableChain3C
import typings.fpTs.pipeableMod.PipeableChain4
import typings.fpTs.pipeableMod.PipeableCompactable
import typings.fpTs.pipeableMod.PipeableCompactable3C
import typings.fpTs.pipeableMod.PipeableCompactable4
import typings.fpTs.pipeableMod.PipeableContravariant
import typings.fpTs.pipeableMod.PipeableContravariant3C
import typings.fpTs.pipeableMod.PipeableContravariant4
import typings.fpTs.pipeableMod.PipeableExtend
import typings.fpTs.pipeableMod.PipeableExtend3C
import typings.fpTs.pipeableMod.PipeableExtend4
import typings.fpTs.pipeableMod.PipeableFilterable
import typings.fpTs.pipeableMod.PipeableFilterable3C
import typings.fpTs.pipeableMod.PipeableFilterable4
import typings.fpTs.pipeableMod.PipeableFilterableWithIndex
import typings.fpTs.pipeableMod.PipeableFilterableWithIndex3C
import typings.fpTs.pipeableMod.PipeableFilterableWithIndex4
import typings.fpTs.pipeableMod.PipeableFoldable
import typings.fpTs.pipeableMod.PipeableFoldable3C
import typings.fpTs.pipeableMod.PipeableFoldable4
import typings.fpTs.pipeableMod.PipeableFoldableWithIndex
import typings.fpTs.pipeableMod.PipeableFoldableWithIndex3C
import typings.fpTs.pipeableMod.PipeableFoldableWithIndex4
import typings.fpTs.pipeableMod.PipeableFunctor
import typings.fpTs.pipeableMod.PipeableFunctor3C
import typings.fpTs.pipeableMod.PipeableFunctor4
import typings.fpTs.pipeableMod.PipeableFunctorWithIndex
import typings.fpTs.pipeableMod.PipeableFunctorWithIndex3C
import typings.fpTs.pipeableMod.PipeableFunctorWithIndex4
import typings.fpTs.pipeableMod.PipeableMonadThrow
import typings.fpTs.pipeableMod.PipeableMonadThrow3C
import typings.fpTs.pipeableMod.PipeableMonadThrow4
import typings.fpTs.pipeableMod.PipeableProfunctor
import typings.fpTs.pipeableMod.PipeableProfunctor3C
import typings.fpTs.pipeableMod.PipeableProfunctor4
import typings.fpTs.pipeableMod.PipeableSemigroupoid
import typings.fpTs.pipeableMod.PipeableSemigroupoid3C
import typings.fpTs.pipeableMod.PipeableSemigroupoid4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pipeable {
  
  @JSImport("fp-ts", "pipeable")
  @js.native
  val ^ : js.Any = js.native
  
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
  def pipeable[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ js.Any */, I](I: URI[F] & I): (js.Object | PipeableFunctor4[F] | PipeableApply4[F] | PipeableChain4[F]) & (js.Object | PipeableContravariant4[F]) & (js.Object | (PipeableFunctorWithIndex4[F, js.Any])) & (js.Object | PipeableBifunctor4[F]) & (js.Object | PipeableExtend4[F]) & (js.Object | PipeableFoldable4[F] | (PipeableFoldableWithIndex4[F, js.Any])) & (js.Object | PipeableAlt4[F]) & (js.Object | PipeableCompactable4[F] | PipeableFilterable4[F] | (PipeableFilterableWithIndex4[F, js.Any])) & (js.Object | PipeableProfunctor4[F]) & (js.Object | PipeableSemigroupoid4[F]) & (js.Object | PipeableMonadThrow4[F]) = ^.asInstanceOf[js.Dynamic].applyDynamic("pipeable")(I.asInstanceOf[js.Any]).asInstanceOf[(js.Object | PipeableFunctor4[F] | PipeableApply4[F] | PipeableChain4[F]) & (js.Object | PipeableContravariant4[F]) & (js.Object | (PipeableFunctorWithIndex4[F, js.Any])) & (js.Object | PipeableBifunctor4[F]) & (js.Object | PipeableExtend4[F]) & (js.Object | PipeableFoldable4[F] | (PipeableFoldableWithIndex4[F, js.Any])) & (js.Object | PipeableAlt4[F]) & (js.Object | PipeableCompactable4[F] | PipeableFilterable4[F] | (PipeableFilterableWithIndex4[F, js.Any])) & (js.Object | PipeableProfunctor4[F]) & (js.Object | PipeableSemigroupoid4[F]) & (js.Object | PipeableMonadThrow4[F])]
  
  @scala.inline
  def pipeable_FI[F, I](I: URIF[F] & I): (js.Object | PipeableFunctor[F] | PipeableApply[F] | PipeableChain[F]) & (js.Object | PipeableContravariant[F]) & (js.Object | (PipeableFunctorWithIndex[F, js.Any])) & (js.Object | PipeableBifunctor[F]) & (js.Object | PipeableExtend[F]) & (js.Object | PipeableFoldable[F] | (PipeableFoldableWithIndex[F, js.Any])) & (js.Object | PipeableAlt[F]) & (js.Object | PipeableCompactable[F] | PipeableFilterable[F] | (PipeableFilterableWithIndex[F, js.Any])) & (js.Object | PipeableProfunctor[F]) & (js.Object | PipeableSemigroupoid[F]) & (js.Object | PipeableMonadThrow[F]) = ^.asInstanceOf[js.Dynamic].applyDynamic("pipeable")(I.asInstanceOf[js.Any]).asInstanceOf[(js.Object | PipeableFunctor[F] | PipeableApply[F] | PipeableChain[F]) & (js.Object | PipeableContravariant[F]) & (js.Object | (PipeableFunctorWithIndex[F, js.Any])) & (js.Object | PipeableBifunctor[F]) & (js.Object | PipeableExtend[F]) & (js.Object | PipeableFoldable[F] | (PipeableFoldableWithIndex[F, js.Any])) & (js.Object | PipeableAlt[F]) & (js.Object | PipeableCompactable[F] | PipeableFilterable[F] | (PipeableFilterableWithIndex[F, js.Any])) & (js.Object | PipeableProfunctor[F]) & (js.Object | PipeableSemigroupoid[F]) & (js.Object | PipeableMonadThrow[F])]
  
  @scala.inline
  def pipeable_F_AnyIE[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, I, E](I: URI[F] & I & (EURI[F, E])): (js.Object | (PipeableFunctor3C[F, E]) | (PipeableApply3C[F, E]) | (PipeableChain3C[F, E])) & (js.Object | (PipeableContravariant3C[F, E])) & (js.Object | (PipeableFunctorWithIndex3C[F, js.Any, E])) & (js.Object | (PipeableBifunctor3C[F, E])) & (js.Object | (PipeableExtend3C[F, E])) & (js.Object | (PipeableFoldable3C[F, E]) | (PipeableFoldableWithIndex3C[F, js.Any, E])) & (js.Object | (PipeableAlt3C[F, E])) & (js.Object | (PipeableCompactable3C[F, E]) | (PipeableFilterable3C[F, E]) | (PipeableFilterableWithIndex3C[F, js.Any, E])) & (js.Object | (PipeableProfunctor3C[F, E])) & (js.Object | (PipeableSemigroupoid3C[F, E])) & (js.Object | (PipeableMonadThrow3C[F, E])) = ^.asInstanceOf[js.Dynamic].applyDynamic("pipeable")(I.asInstanceOf[js.Any]).asInstanceOf[(js.Object | (PipeableFunctor3C[F, E]) | (PipeableApply3C[F, E]) | (PipeableChain3C[F, E])) & (js.Object | (PipeableContravariant3C[F, E])) & (js.Object | (PipeableFunctorWithIndex3C[F, js.Any, E])) & (js.Object | (PipeableBifunctor3C[F, E])) & (js.Object | (PipeableExtend3C[F, E])) & (js.Object | (PipeableFoldable3C[F, E]) | (PipeableFoldableWithIndex3C[F, js.Any, E])) & (js.Object | (PipeableAlt3C[F, E])) & (js.Object | (PipeableCompactable3C[F, E]) | (PipeableFilterable3C[F, E]) | (PipeableFilterableWithIndex3C[F, js.Any, E])) & (js.Object | (PipeableProfunctor3C[F, E])) & (js.Object | (PipeableSemigroupoid3C[F, E])) & (js.Object | (PipeableMonadThrow3C[F, E]))]
}
