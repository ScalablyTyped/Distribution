package typings.fpTs.mod

import typings.fpTs.libApplicativeMod.Applicative2C
import typings.fpTs.libApplyMod.Apply2C
import typings.fpTs.libBifunctorMod.Bifunctor2
import typings.fpTs.libChainMod.Chain2C
import typings.fpTs.libChainRecMod.ChainRec2C
import typings.fpTs.libComonadMod.Comonad2
import typings.fpTs.libFoldableMod.Foldable2
import typings.fpTs.libFunctorMod.Functor2
import typings.fpTs.libMonadMod.Monad2C
import typings.fpTs.libMonoidMod.Monoid
import typings.fpTs.libSemigroupMod.Semigroup
import typings.fpTs.libSemigroupoidMod.Semigroupoid2
import typings.fpTs.libTraversableMod.PipeableTraverse2
import typings.fpTs.libTraversableMod.Sequence2
import typings.fpTs.libTraversableMod.Traversable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readonlyTuple {
  
  @JSImport("fp-ts", "readonlyTuple")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts", "readonlyTuple.Bifunctor")
  @js.native
  val Bifunctor: Bifunctor2[typings.fpTs.libReadonlyTupleMod.URI] = js.native
  
  @JSImport("fp-ts", "readonlyTuple.Comonad")
  @js.native
  val Comonad: Comonad2[typings.fpTs.libReadonlyTupleMod.URI] = js.native
  
  @JSImport("fp-ts", "readonlyTuple.Foldable")
  @js.native
  val Foldable: Foldable2[typings.fpTs.libReadonlyTupleMod.URI] = js.native
  
  @JSImport("fp-ts", "readonlyTuple.Functor")
  @js.native
  val Functor: Functor2[typings.fpTs.libReadonlyTupleMod.URI] = js.native
  
  @JSImport("fp-ts", "readonlyTuple.Semigroupoid")
  @js.native
  val Semigroupoid: Semigroupoid2[typings.fpTs.libReadonlyTupleMod.URI] = js.native
  
  @JSImport("fp-ts", "readonlyTuple.Traversable")
  @js.native
  val Traversable: Traversable2[typings.fpTs.libReadonlyTupleMod.URI] = js.native
  
  @JSImport("fp-ts", "readonlyTuple.URI")
  @js.native
  val URI: /* "ReadonlyTuple" */ String = js.native
  
  inline def bimap[E, G, A, B](mapSnd: js.Function1[/* e */ E, G], mapFst: js.Function1[/* a */ A, B]): js.Function1[/* fa */ js.Tuple2[A, E], js.Tuple2[B, G]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bimap")(mapSnd.asInstanceOf[js.Any], mapFst.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ js.Tuple2[A, E], js.Tuple2[B, G]]]
  
  inline def compose[A, B](ab: js.Tuple2[B, A]): js.Function1[/* bc */ js.Tuple2[Any, B], js.Tuple2[Any, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* bc */ js.Tuple2[Any, B], js.Tuple2[Any, A]]]
  
  inline def duplicate[E, A](wa: js.Tuple2[A, E]): js.Tuple2[js.Tuple2[A, E], E] = ^.asInstanceOf[js.Dynamic].applyDynamic("duplicate")(wa.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Tuple2[A, E], E]]
  
  inline def extend[E, A, B](f: js.Function1[/* wa */ js.Tuple2[A, E], B]): js.Function1[/* wa */ js.Tuple2[A, E], js.Tuple2[B, E]] = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* wa */ js.Tuple2[A, E], js.Tuple2[B, E]]]
  
  inline def extract[E, A](wa: js.Tuple2[A, E]): A = ^.asInstanceOf[js.Dynamic].applyDynamic("extract")(wa.asInstanceOf[js.Any]).asInstanceOf[A]
  
  inline def flap[A](a: A): js.Function1[/* fab */ js.Tuple2[js.Function1[/* a */ A, Any], Any], js.Tuple2[Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flap")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ js.Tuple2[js.Function1[/* a */ A, Any], Any], js.Tuple2[Any, Any]]]
  
  inline def foldMap[M](M: Monoid[M]): js.Function1[
    /* f */ js.Function1[/* a */ Any, M], 
    js.Function1[/* fa */ js.Tuple2[Any, Any], M]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("foldMap")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, M], 
    js.Function1[/* fa */ js.Tuple2[Any, Any], M]
  ]]
  
  inline def fst[A, E](ea: js.Tuple2[A, E]): A = ^.asInstanceOf[js.Dynamic].applyDynamic("fst")(ea.asInstanceOf[js.Any]).asInstanceOf[A]
  
  inline def getApplicative[M](M: Monoid[M]): Applicative2C[typings.fpTs.libReadonlyTupleMod.URI, M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApplicative")(M.asInstanceOf[js.Any]).asInstanceOf[Applicative2C[typings.fpTs.libReadonlyTupleMod.URI, M]]
  
  inline def getApply[S](S: Semigroup[S]): Apply2C[typings.fpTs.libReadonlyTupleMod.URI, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApply")(S.asInstanceOf[js.Any]).asInstanceOf[Apply2C[typings.fpTs.libReadonlyTupleMod.URI, S]]
  
  inline def getChain[S](S: Semigroup[S]): Chain2C[typings.fpTs.libReadonlyTupleMod.URI, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChain")(S.asInstanceOf[js.Any]).asInstanceOf[Chain2C[typings.fpTs.libReadonlyTupleMod.URI, S]]
  
  inline def getChainRec[M](M: Monoid[M]): ChainRec2C[typings.fpTs.libReadonlyTupleMod.URI, M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChainRec")(M.asInstanceOf[js.Any]).asInstanceOf[ChainRec2C[typings.fpTs.libReadonlyTupleMod.URI, M]]
  
  inline def getMonad[M](M: Monoid[M]): Monad2C[typings.fpTs.libReadonlyTupleMod.URI, M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonad")(M.asInstanceOf[js.Any]).asInstanceOf[Monad2C[typings.fpTs.libReadonlyTupleMod.URI, M]]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ js.Tuple2[A, Any], js.Tuple2[B, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ js.Tuple2[A, Any], js.Tuple2[B, Any]]]
  
  inline def mapFst[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ js.Tuple2[A, Any], js.Tuple2[B, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapFst")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ js.Tuple2[A, Any], js.Tuple2[B, Any]]]
  
  inline def mapLeft[E, G](f: js.Function1[/* e */ E, G]): js.Function1[/* fa */ js.Tuple2[Any, E], js.Tuple2[Any, G]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapLeft")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ js.Tuple2[Any, E], js.Tuple2[Any, G]]]
  
  inline def mapSnd[E, G](f: js.Function1[/* e */ E, G]): js.Function1[/* fa */ js.Tuple2[Any, E], js.Tuple2[Any, G]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapSnd")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ js.Tuple2[Any, E], js.Tuple2[Any, G]]]
  
  @JSImport("fp-ts", "readonlyTuple.readonlyTuple")
  @js.native
  val readonlyTuple: Semigroupoid2[typings.fpTs.libReadonlyTupleMod.URI] & Bifunctor2[typings.fpTs.libReadonlyTupleMod.URI] & Comonad2[typings.fpTs.libReadonlyTupleMod.URI] & Foldable2[typings.fpTs.libReadonlyTupleMod.URI] & Traversable2[typings.fpTs.libReadonlyTupleMod.URI] = js.native
  
  inline def reduce[A, B](b: B, f: js.Function2[/* b */ B, /* a */ A, B]): js.Function1[/* fa */ js.Tuple2[A, Any], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ js.Tuple2[A, Any], B]]
  
  inline def reduceRight[A, B](b: B, f: js.Function2[/* a */ A, /* b */ B, B]): js.Function1[/* fa */ js.Tuple2[A, Any], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ js.Tuple2[A, Any], B]]
  
  @JSImport("fp-ts", "readonlyTuple.sequence")
  @js.native
  val sequence: Sequence2[typings.fpTs.libReadonlyTupleMod.URI] = js.native
  
  inline def snd[A, E](ea: js.Tuple2[A, E]): E = ^.asInstanceOf[js.Dynamic].applyDynamic("snd")(ea.asInstanceOf[js.Any]).asInstanceOf[E]
  
  inline def swap[A, E](ea: js.Tuple2[A, E]): js.Tuple2[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("swap")(ea.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[E, A]]
  
  @JSImport("fp-ts", "readonlyTuple.traverse")
  @js.native
  val traverse: PipeableTraverse2[typings.fpTs.libReadonlyTupleMod.URI] = js.native
  
  /* augmented module */
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind2[E, A] extends StObject
  }
}
