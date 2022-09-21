package typings.fpTs

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

object readonlyTupleMod {
  
  @JSImport("fp-ts/lib/ReadonlyTuple", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/lib/ReadonlyTuple", "Bifunctor")
  @js.native
  val Bifunctor: Bifunctor2[typings.fpTs.readonlyTupleMod.URI] = js.native
  
  @JSImport("fp-ts/lib/ReadonlyTuple", "Comonad")
  @js.native
  val Comonad: Comonad2[typings.fpTs.readonlyTupleMod.URI] = js.native
  
  @JSImport("fp-ts/lib/ReadonlyTuple", "Foldable")
  @js.native
  val Foldable: Foldable2[typings.fpTs.readonlyTupleMod.URI] = js.native
  
  @JSImport("fp-ts/lib/ReadonlyTuple", "Functor")
  @js.native
  val Functor: Functor2[typings.fpTs.readonlyTupleMod.URI] = js.native
  
  @JSImport("fp-ts/lib/ReadonlyTuple", "Semigroupoid")
  @js.native
  val Semigroupoid: Semigroupoid2[typings.fpTs.readonlyTupleMod.URI] = js.native
  
  @JSImport("fp-ts/lib/ReadonlyTuple", "Traversable")
  @js.native
  val Traversable: Traversable2[typings.fpTs.readonlyTupleMod.URI] = js.native
  
  @JSImport("fp-ts/lib/ReadonlyTuple", "URI")
  @js.native
  val URI: /* "ReadonlyTuple" */ String = js.native
  type URI = /* "ReadonlyTuple" */ String
  
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
  
  inline def getApplicative[M](M: Monoid[M]): Applicative2C[typings.fpTs.readonlyTupleMod.URI, M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApplicative")(M.asInstanceOf[js.Any]).asInstanceOf[Applicative2C[typings.fpTs.readonlyTupleMod.URI, M]]
  
  inline def getApply[S](S: Semigroup[S]): Apply2C[typings.fpTs.readonlyTupleMod.URI, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApply")(S.asInstanceOf[js.Any]).asInstanceOf[Apply2C[typings.fpTs.readonlyTupleMod.URI, S]]
  
  inline def getChain[S](S: Semigroup[S]): Chain2C[typings.fpTs.readonlyTupleMod.URI, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChain")(S.asInstanceOf[js.Any]).asInstanceOf[Chain2C[typings.fpTs.readonlyTupleMod.URI, S]]
  
  inline def getChainRec[M](M: Monoid[M]): ChainRec2C[typings.fpTs.readonlyTupleMod.URI, M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChainRec")(M.asInstanceOf[js.Any]).asInstanceOf[ChainRec2C[typings.fpTs.readonlyTupleMod.URI, M]]
  
  inline def getMonad[M](M: Monoid[M]): Monad2C[typings.fpTs.readonlyTupleMod.URI, M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonad")(M.asInstanceOf[js.Any]).asInstanceOf[Monad2C[typings.fpTs.readonlyTupleMod.URI, M]]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ js.Tuple2[A, Any], js.Tuple2[B, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ js.Tuple2[A, Any], js.Tuple2[B, Any]]]
  
  inline def mapFst[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ js.Tuple2[A, Any], js.Tuple2[B, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapFst")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ js.Tuple2[A, Any], js.Tuple2[B, Any]]]
  
  inline def mapLeft[E, G](f: js.Function1[/* e */ E, G]): js.Function1[/* fa */ js.Tuple2[Any, E], js.Tuple2[Any, G]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapLeft")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ js.Tuple2[Any, E], js.Tuple2[Any, G]]]
  
  inline def mapSnd[E, G](f: js.Function1[/* e */ E, G]): js.Function1[/* fa */ js.Tuple2[Any, E], js.Tuple2[Any, G]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapSnd")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ js.Tuple2[Any, E], js.Tuple2[Any, G]]]
  
  @JSImport("fp-ts/lib/ReadonlyTuple", "readonlyTuple")
  @js.native
  val readonlyTuple: Semigroupoid2[typings.fpTs.readonlyTupleMod.URI] & Bifunctor2[typings.fpTs.readonlyTupleMod.URI] & Comonad2[typings.fpTs.readonlyTupleMod.URI] & Foldable2[typings.fpTs.readonlyTupleMod.URI] & Traversable2[typings.fpTs.readonlyTupleMod.URI] = js.native
  
  inline def reduce[A, B](b: B, f: js.Function2[/* b */ B, /* a */ A, B]): js.Function1[/* fa */ js.Tuple2[A, Any], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ js.Tuple2[A, Any], B]]
  
  inline def reduceRight[A, B](b: B, f: js.Function2[/* a */ A, /* b */ B, B]): js.Function1[/* fa */ js.Tuple2[A, Any], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ js.Tuple2[A, Any], B]]
  
  @JSImport("fp-ts/lib/ReadonlyTuple", "sequence")
  @js.native
  val sequence: Sequence2[typings.fpTs.readonlyTupleMod.URI] = js.native
  
  inline def snd[A, E](ea: js.Tuple2[A, E]): E = ^.asInstanceOf[js.Dynamic].applyDynamic("snd")(ea.asInstanceOf[js.Any]).asInstanceOf[E]
  
  inline def swap[A, E](ea: js.Tuple2[A, E]): js.Tuple2[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("swap")(ea.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[E, A]]
  
  @JSImport("fp-ts/lib/ReadonlyTuple", "traverse")
  @js.native
  val traverse: PipeableTraverse2[typings.fpTs.readonlyTupleMod.URI] = js.native
  
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind[A] extends StObject
  }
}
