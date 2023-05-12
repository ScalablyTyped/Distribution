package typings.fpTs

import typings.fpTs.libApplicativeMod.Applicative2
import typings.fpTs.libApplyMod.Apply2
import typings.fpTs.libCategoryMod.Category2
import typings.fpTs.libChainMod.Chain2
import typings.fpTs.libChoiceMod.Choice2
import typings.fpTs.libFunctorMod.Functor2
import typings.fpTs.libMonadMod.Monad2
import typings.fpTs.libMonoidMod.Monoid
import typings.fpTs.libPointedMod.Pointed2
import typings.fpTs.libProfunctorMod.Profunctor2
import typings.fpTs.libReadonlyNonEmptyArrayMod.ReadonlyNonEmptyArray_
import typings.fpTs.libSemigroupMod.Semigroup
import typings.fpTs.libStrongMod.Strong2
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libReaderMod {
  
  @JSImport("fp-ts/lib/Reader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/lib/Reader", "ApT")
  @js.native
  val ApT: Reader_[Any, js.Array[Any]] = js.native
  
  @JSImport("fp-ts/lib/Reader", "Applicative")
  @js.native
  val Applicative: Applicative2[typings.fpTs.libReaderMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Reader", "Apply")
  @js.native
  val Apply: Apply2[typings.fpTs.libReaderMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Reader", "Category")
  @js.native
  val Category: Category2[typings.fpTs.libReaderMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Reader", "Chain")
  @js.native
  val Chain_ : Chain2[typings.fpTs.libReaderMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Reader", "Choice")
  @js.native
  val Choice: Choice2[typings.fpTs.libReaderMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Reader", "Do")
  @js.native
  val Do: Reader_[Any, js.Object] = js.native
  
  @JSImport("fp-ts/lib/Reader", "Functor")
  @js.native
  val Functor: Functor2[typings.fpTs.libReaderMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Reader", "Monad")
  @js.native
  val Monad: Monad2[typings.fpTs.libReaderMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Reader", "Pointed")
  @js.native
  val Pointed: Pointed2[typings.fpTs.libReaderMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Reader", "Profunctor")
  @js.native
  val Profunctor: Profunctor2[typings.fpTs.libReaderMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Reader", "Strong")
  @js.native
  val Strong: Strong2[typings.fpTs.libReaderMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Reader", "URI")
  @js.native
  val URI: /* "Reader" */ String = js.native
  type URI = /* "Reader" */ String
  
  inline def ap[R, A](fa: Reader_[R, A]): js.Function1[/* fab */ Reader_[R, js.Function1[/* a */ A, Any]], Reader_[R, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ Reader_[R, js.Function1[/* a */ A, Any]], Reader_[R, Any]]]
  
  inline def apFirst[E, B](second: Reader_[E, B]): js.Function1[/* first */ Reader_[E, Any], Reader_[E, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apFirst")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ Reader_[E, Any], Reader_[E, Any]]]
  
  inline def apFirstW[R2, B](second: Reader_[R2, B]): js.Function1[/* first */ Reader_[Any, Any], Reader_[Any & R2, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apFirstW")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ Reader_[Any, Any], Reader_[Any & R2, Any]]]
  
  inline def apS[N /* <: String */, A, E, B](name: Exclude[N, /* keyof A */ String], fb: Reader_[E, B]): js.Function1[
    /* fa */ Reader_[E, A], 
    Reader_[
      E, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apS")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ Reader_[E, A], 
    Reader_[
      E, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def apSW[A, N /* <: String */, R2, B](name: Exclude[N, /* keyof A */ String], fb: Reader_[R2, B]): js.Function1[
    /* fa */ Reader_[Any, A], 
    Reader_[
      Any & R2, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in keyof A | N ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apSW")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ Reader_[Any, A], 
    Reader_[
      Any & R2, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in keyof A | N ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def apSecond[E, B](second: Reader_[E, B]): js.Function1[/* first */ Reader_[E, Any], Reader_[E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apSecond")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ Reader_[E, Any], Reader_[E, B]]]
  
  inline def apSecondW[R2, B](second: Reader_[R2, B]): js.Function1[/* first */ Reader_[Any, Any], Reader_[Any & R2, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apSecondW")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ Reader_[Any, Any], Reader_[Any & R2, B]]]
  
  inline def apW[R2, A](fa: Reader_[R2, A]): js.Function1[/* fab */ Reader_[Any, js.Function1[/* a */ A, Any]], Reader_[Any & R2, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apW")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ Reader_[Any, js.Function1[/* a */ A, Any]], Reader_[Any & R2, Any]]]
  
  inline def ask[R](): Reader_[R, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("ask")().asInstanceOf[Reader_[R, R]]
  
  inline def asks[R, A](f: js.Function1[/* r */ R, A]): Reader_[R, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("asks")(f.asInstanceOf[js.Any]).asInstanceOf[Reader_[R, A]]
  
  inline def asksReader[R, A](f: js.Function1[/* r */ R, Reader_[R, A]]): Reader_[R, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("asksReader")(f.asInstanceOf[js.Any]).asInstanceOf[Reader_[R, A]]
  
  inline def asksReaderW[R1, R2, A](f: js.Function1[/* r1 */ R1, Reader_[R2, A]]): Reader_[R1 & R2, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("asksReaderW")(f.asInstanceOf[js.Any]).asInstanceOf[Reader_[R1 & R2, A]]
  
  inline def bind[N /* <: String */, A, E, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, Reader_[E, B]]): js.Function1[
    /* ma */ Reader_[E, A], 
    Reader_[
      E, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* ma */ Reader_[E, A], 
    Reader_[
      E, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def bindTo[N /* <: String */](name: N): js.Function1[
    /* fa */ Reader_[Any, Any], 
    Reader_[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N ]: any} */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindTo")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ Reader_[Any, Any], 
    Reader_[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N ]: any} */ js.Any
    ]
  ]]
  
  inline def bindW[N /* <: String */, A, R2, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, Reader_[R2, B]]): js.Function1[
    /* fa */ Reader_[Any, A], 
    Reader_[
      Any & R2, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in keyof A | N ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindW")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ Reader_[Any, A], 
    Reader_[
      Any & R2, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in keyof A | N ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def chain[A, R, B](f: js.Function1[/* a */ A, Reader_[R, B]]): js.Function1[/* ma */ Reader_[R, A], Reader_[R, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Reader_[R, A], Reader_[R, B]]]
  
  inline def chainFirst[A, R, B](f: js.Function1[/* a */ A, Reader_[R, B]]): js.Function1[/* first */ Reader_[R, A], Reader_[R, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirst")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ Reader_[R, A], Reader_[R, A]]]
  
  inline def chainFirstW[R2, A, B](f: js.Function1[/* a */ A, Reader_[R2, B]]): js.Function1[/* ma */ Reader_[Any, A], Reader_[Any & R2, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Reader_[Any, A], Reader_[Any & R2, A]]]
  
  inline def chainW[R2, A, B](f: js.Function1[/* a */ A, Reader_[R2, B]]): js.Function1[/* ma */ Reader_[Any, A], Reader_[Any & R2, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Reader_[Any, A], Reader_[Any & R2, B]]]
  
  inline def compose[A, B](ab: Reader_[A, B]): js.Function1[/* bc */ Reader_[B, Any], Reader_[A, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* bc */ Reader_[B, Any], Reader_[A, Any]]]
  
  @JSImport("fp-ts/lib/Reader", "first")
  @js.native
  val first: js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, A, B> */ /* pab */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, [A, C], [B, C]> */ Any
  ] = js.native
  
  inline def flap[A](a: A): js.Function1[/* fab */ Reader_[Any, js.Function1[/* a */ A, Any]], Reader_[Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flap")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ Reader_[Any, js.Function1[/* a */ A, Any]], Reader_[Any, Any]]]
  
  inline def flatMap[A, R2, B](f: js.Function1[/* a */ A, Reader_[R2, B]]): js.Function1[/* ma */ Reader_[Any, A], Reader_[Any & R2, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Reader_[Any, A], Reader_[Any & R2, B]]]
  inline def flatMap[R1, A, R2, B](ma: Reader_[R1, A], f: js.Function1[/* a */ A, Reader_[R2, B]]): Reader_[R1 & R2, B] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(ma.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Reader_[R1 & R2, B]]
  
  inline def flatten[R, A](mma: Reader_[R, Reader_[R, A]]): Reader_[R, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(mma.asInstanceOf[js.Any]).asInstanceOf[Reader_[R, A]]
  
  inline def flattenW[R1, R2, A](mma: Reader_[R1, Reader_[R2, A]]): Reader_[R1 & R2, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("flattenW")(mma.asInstanceOf[js.Any]).asInstanceOf[Reader_[R1 & R2, A]]
  
  inline def getMonoid[R, A](M: Monoid[A]): Monoid[Reader_[R, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonoid")(M.asInstanceOf[js.Any]).asInstanceOf[Monoid[Reader_[R, A]]]
  
  inline def getSemigroup[R, A](S: Semigroup[A]): Semigroup[Reader_[R, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSemigroup")(S.asInstanceOf[js.Any]).asInstanceOf[Semigroup[Reader_[R, A]]]
  
  @JSImport("fp-ts/lib/Reader", "id")
  @js.native
  val id: js.Function0[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, A, A> */ Any
  ] = js.native
  
  @JSImport("fp-ts/lib/Reader", "left")
  @js.native
  val left: js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, A, B> */ /* pab */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, Either<A, C>, Either<B, C>> */ Any
  ] = js.native
  
  inline def let[N /* <: String */, A, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, B]): js.Function1[
    /* fa */ Reader_[Any, A], 
    Reader_[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("let")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ Reader_[Any, A], 
    Reader_[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def local[R2, R1](f: js.Function1[/* r2 */ R2, R1]): js.Function1[/* ma */ Reader_[R1, Any], Reader_[R2, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("local")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Reader_[R1, Any], Reader_[R2, Any]]]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ Reader_[Any, A], Reader_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Reader_[Any, A], Reader_[Any, B]]]
  
  inline def of[R, A](a: A): Reader_[R, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any]).asInstanceOf[Reader_[R, A]]
  
  inline def promap[E, A, D, B](f: js.Function1[/* d */ D, E], g: js.Function1[/* a */ A, B]): js.Function1[/* fea */ Reader_[E, A], Reader_[D, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("promap")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fea */ Reader_[E, A], Reader_[D, B]]]
  
  @JSImport("fp-ts/lib/Reader", "reader")
  @js.native
  val reader: Monad2[typings.fpTs.libReaderMod.URI] & Profunctor2[typings.fpTs.libReaderMod.URI] & Category2[typings.fpTs.libReaderMod.URI] & Strong2[typings.fpTs.libReaderMod.URI] & Choice2[typings.fpTs.libReaderMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Reader", "right")
  @js.native
  val right: js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, B, C> */ /* pbc */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, Either<A, B>, Either<A, C>> */ Any
  ] = js.native
  
  @JSImport("fp-ts/lib/Reader", "second")
  @js.native
  val second: js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, B, C> */ /* pab */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, [A, B], [A, C]> */ Any
  ] = js.native
  
  inline def sequenceArray[R, A](arr: js.Array[Reader_[R, A]]): Reader_[R, js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequenceArray")(arr.asInstanceOf[js.Any]).asInstanceOf[Reader_[R, js.Array[A]]]
  
  inline def tap[A, R2, _underscore](f: js.Function1[/* a */ A, Reader_[R2, _underscore]]): js.Function1[/* self */ Reader_[Any, A], Reader_[R2 & Any, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("tap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* self */ Reader_[Any, A], Reader_[R2 & Any, A]]]
  inline def tap[R1, A, R2, _underscore](self: Reader_[R1, A], f: js.Function1[/* a */ A, Reader_[R2, _underscore]]): Reader_[R1 & R2, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(self.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Reader_[R1 & R2, A]]
  
  inline def traverseArray[R, A, B](f: js.Function1[/* a */ A, Reader_[R, B]]): js.Function1[/* as */ js.Array[A], Reader_[R, js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseArray")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], Reader_[R, js.Array[B]]]]
  
  inline def traverseArrayWithIndex[R, A, B](f: js.Function2[/* index */ Double, /* a */ A, Reader_[R, B]]): js.Function1[/* as */ js.Array[A], Reader_[R, js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], Reader_[R, js.Array[B]]]]
  
  inline def traverseReadonlyArrayWithIndex[A, R, B](f: js.Function2[/* index */ Double, /* a */ A, Reader_[R, B]]): js.Function1[/* as */ js.Array[A], Reader_[R, js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], Reader_[R, js.Array[B]]]]
  
  inline def traverseReadonlyNonEmptyArrayWithIndex[A, R, B](f: js.Function2[/* index */ Double, /* a */ A, Reader_[R, B]]): js.Function1[/* as */ ReadonlyNonEmptyArray_[A], Reader_[R, ReadonlyNonEmptyArray_[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyNonEmptyArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ ReadonlyNonEmptyArray_[A], Reader_[R, ReadonlyNonEmptyArray_[B]]]]
  
  /* augmented module */
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind2[E, A] extends StObject
  }
  
  type Reader_[R, A] = js.Function1[/* r */ R, A]
}
