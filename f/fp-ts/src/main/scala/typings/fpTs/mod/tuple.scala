package typings.fpTs.mod

import typings.fpTs.applicativeMod.Applicative2C
import typings.fpTs.applyMod.Apply2C
import typings.fpTs.bifunctorMod.Bifunctor2
import typings.fpTs.chainMod.Chain2C
import typings.fpTs.chainRecMod.ChainRec2C
import typings.fpTs.comonadMod.Comonad2
import typings.fpTs.foldableMod.Foldable2
import typings.fpTs.functorMod.Functor2
import typings.fpTs.monadMod.Monad2C
import typings.fpTs.monoidMod.Monoid
import typings.fpTs.semigroupMod.Semigroup
import typings.fpTs.semigroupoidMod.Semigroupoid2
import typings.fpTs.traversableMod.PipeableTraverse2
import typings.fpTs.traversableMod.Sequence2
import typings.fpTs.traversableMod.Traversable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tuple {
  
  @JSImport("fp-ts", "tuple")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts", "tuple.Bifunctor")
  @js.native
  val Bifunctor: Bifunctor2[typings.fpTs.tupleMod.URI] = js.native
  
  @JSImport("fp-ts", "tuple.Comonad")
  @js.native
  val Comonad: Comonad2[typings.fpTs.tupleMod.URI] = js.native
  
  @JSImport("fp-ts", "tuple.Foldable")
  @js.native
  val Foldable: Foldable2[typings.fpTs.tupleMod.URI] = js.native
  
  @JSImport("fp-ts", "tuple.Functor")
  @js.native
  val Functor: Functor2[typings.fpTs.tupleMod.URI] = js.native
  
  @JSImport("fp-ts", "tuple.Semigroupoid")
  @js.native
  val Semigroupoid: Semigroupoid2[typings.fpTs.tupleMod.URI] = js.native
  
  @JSImport("fp-ts", "tuple.Traversable")
  @js.native
  val Traversable: Traversable2[typings.fpTs.tupleMod.URI] = js.native
  
  @JSImport("fp-ts", "tuple.URI")
  @js.native
  val URI: /* "Tuple" */ String = js.native
  
  @scala.inline
  def bimap[E, G, A, B](f: js.Function1[/* e */ E, G], g: js.Function1[/* a */ A, B]): js.Function1[/* fa */ js.Tuple2[A, E], js.Tuple2[B, G]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bimap")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ js.Tuple2[A, E], js.Tuple2[B, G]]]
  
  @scala.inline
  def compose[A, B](ab: js.Tuple2[B, A]): js.Function1[/* bc */ js.Tuple2[js.Any, B], js.Tuple2[js.Any, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* bc */ js.Tuple2[js.Any, B], js.Tuple2[js.Any, A]]]
  
  @scala.inline
  def duplicate[E, A](wa: js.Tuple2[A, E]): js.Tuple2[js.Tuple2[A, E], E] = ^.asInstanceOf[js.Dynamic].applyDynamic("duplicate")(wa.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Tuple2[A, E], E]]
  
  @scala.inline
  def extend[E, A, B](f: js.Function1[/* wa */ js.Tuple2[A, E], B]): js.Function1[/* wa */ js.Tuple2[A, E], js.Tuple2[B, E]] = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* wa */ js.Tuple2[A, E], js.Tuple2[B, E]]]
  
  @scala.inline
  def extract[E, A](wa: js.Tuple2[A, E]): A = ^.asInstanceOf[js.Dynamic].applyDynamic("extract")(wa.asInstanceOf[js.Any]).asInstanceOf[A]
  
  @scala.inline
  def foldMap[M](M: Monoid[M]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, M], 
    js.Function1[/* fa */ js.Tuple2[js.Any, js.Any], M]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("foldMap")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ js.Any, M], 
    js.Function1[/* fa */ js.Tuple2[js.Any, js.Any], M]
  ]]
  
  @scala.inline
  def fst[A, E](ea: js.Tuple2[A, E]): A = ^.asInstanceOf[js.Dynamic].applyDynamic("fst")(ea.asInstanceOf[js.Any]).asInstanceOf[A]
  
  @scala.inline
  def getApplicative[M](M: Monoid[M]): Applicative2C[typings.fpTs.tupleMod.URI, M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApplicative")(M.asInstanceOf[js.Any]).asInstanceOf[Applicative2C[typings.fpTs.tupleMod.URI, M]]
  
  @scala.inline
  def getApply[S](S: Semigroup[S]): Apply2C[typings.fpTs.tupleMod.URI, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApply")(S.asInstanceOf[js.Any]).asInstanceOf[Apply2C[typings.fpTs.tupleMod.URI, S]]
  
  @scala.inline
  def getChain[S](S: Semigroup[S]): Chain2C[typings.fpTs.tupleMod.URI, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChain")(S.asInstanceOf[js.Any]).asInstanceOf[Chain2C[typings.fpTs.tupleMod.URI, S]]
  
  @scala.inline
  def getChainRec[M](M: Monoid[M]): ChainRec2C[typings.fpTs.tupleMod.URI, M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChainRec")(M.asInstanceOf[js.Any]).asInstanceOf[ChainRec2C[typings.fpTs.tupleMod.URI, M]]
  
  @scala.inline
  def getMonad[M](M: Monoid[M]): Monad2C[typings.fpTs.tupleMod.URI, M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonad")(M.asInstanceOf[js.Any]).asInstanceOf[Monad2C[typings.fpTs.tupleMod.URI, M]]
  
  @scala.inline
  def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ js.Tuple2[A, js.Any], js.Tuple2[B, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ js.Tuple2[A, js.Any], js.Tuple2[B, js.Any]]]
  
  @scala.inline
  def mapLeft[E, G](f: js.Function1[/* e */ E, G]): js.Function1[/* fa */ js.Tuple2[js.Any, E], js.Tuple2[js.Any, G]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapLeft")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ js.Tuple2[js.Any, E], js.Tuple2[js.Any, G]]]
  
  @scala.inline
  def reduce[A, B](b: B, f: js.Function2[/* b */ B, /* a */ A, B]): js.Function1[/* fa */ js.Tuple2[A, js.Any], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ js.Tuple2[A, js.Any], B]]
  
  @scala.inline
  def reduceRight[A, B](b: B, f: js.Function2[/* a */ A, /* b */ B, B]): js.Function1[/* fa */ js.Tuple2[A, js.Any], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ js.Tuple2[A, js.Any], B]]
  
  @JSImport("fp-ts", "tuple.sequence")
  @js.native
  val sequence: Sequence2[typings.fpTs.tupleMod.URI] = js.native
  
  @scala.inline
  def snd[A, E](ea: js.Tuple2[A, E]): E = ^.asInstanceOf[js.Dynamic].applyDynamic("snd")(ea.asInstanceOf[js.Any]).asInstanceOf[E]
  
  @scala.inline
  def swap[A, E](sa: js.Tuple2[A, E]): js.Tuple2[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("swap")(sa.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[E, A]]
  
  @JSImport("fp-ts", "tuple.traverse")
  @js.native
  val traverse: PipeableTraverse2[typings.fpTs.tupleMod.URI] = js.native
  
  @JSImport("fp-ts", "tuple.tuple")
  @js.native
  val tuple: Semigroupoid2[typings.fpTs.tupleMod.URI] & Bifunctor2[typings.fpTs.tupleMod.URI] & Comonad2[typings.fpTs.tupleMod.URI] & Foldable2[typings.fpTs.tupleMod.URI] & Traversable2[typings.fpTs.tupleMod.URI] = js.native
  
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind[A] extends StObject
  }
}
