package typings.fpTs.mod

import typings.fpTs.libApplicativeMod.Applicative1
import typings.fpTs.libApplyMod.Apply1
import typings.fpTs.libChainMod.Chain1
import typings.fpTs.libChainRecMod.ChainRec1
import typings.fpTs.libFromIOMod.FromIO1
import typings.fpTs.libFunctorMod.Functor1
import typings.fpTs.libIOMod.IO_
import typings.fpTs.libMonadIOMod.MonadIO1
import typings.fpTs.libMonadMod.Monad1
import typings.fpTs.libMonoidMod.Monoid
import typings.fpTs.libPointedMod.Pointed1
import typings.fpTs.libReadonlyNonEmptyArrayMod.ReadonlyNonEmptyArray_
import typings.fpTs.libSemigroupMod.Semigroup
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object io {
  
  @JSImport("fp-ts", "io")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts", "io.ApT")
  @js.native
  val ApT: IO_[js.Array[Any]] = js.native
  
  @JSImport("fp-ts", "io.Applicative")
  @js.native
  val Applicative: Applicative1[typings.fpTs.libIOMod.URI] = js.native
  
  @JSImport("fp-ts", "io.Apply")
  @js.native
  val Apply: Apply1[typings.fpTs.libIOMod.URI] = js.native
  
  @JSImport("fp-ts", "io.ChainRec")
  @js.native
  val ChainRec: ChainRec1[typings.fpTs.libIOMod.URI] = js.native
  
  @JSImport("fp-ts", "io.Chain")
  @js.native
  val Chain_ : Chain1[typings.fpTs.libIOMod.URI] = js.native
  
  @JSImport("fp-ts", "io.Do")
  @js.native
  val Do: IO_[js.Object] = js.native
  
  @JSImport("fp-ts", "io.FromIO")
  @js.native
  val FromIO_ : FromIO1[typings.fpTs.libIOMod.URI] = js.native
  
  @JSImport("fp-ts", "io.Functor")
  @js.native
  val Functor: Functor1[typings.fpTs.libIOMod.URI] = js.native
  
  @JSImport("fp-ts", "io.Monad")
  @js.native
  val Monad: Monad1[typings.fpTs.libIOMod.URI] = js.native
  
  @JSImport("fp-ts", "io.MonadIO")
  @js.native
  val MonadIO: MonadIO1[typings.fpTs.libIOMod.URI] = js.native
  
  @JSImport("fp-ts", "io.Pointed")
  @js.native
  val Pointed: Pointed1[typings.fpTs.libIOMod.URI] = js.native
  
  @JSImport("fp-ts", "io.URI")
  @js.native
  val URI: /* "IO" */ String = js.native
  
  inline def ap[A](fa: IO_[A]): js.Function1[/* fab */ IO_[js.Function1[/* a */ A, Any]], IO_[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ IO_[js.Function1[/* a */ A, Any]], IO_[Any]]]
  
  inline def apFirst[B](second: IO_[B]): js.Function1[/* first */ IO_[Any], IO_[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apFirst")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ IO_[Any], IO_[Any]]]
  
  inline def apS[N /* <: String */, A, B](name: Exclude[N, /* keyof A */ String], fb: IO_[B]): js.Function1[
    /* fa */ IO_[A], 
    IO_[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apS")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ IO_[A], 
    IO_[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def apSecond[B](second: IO_[B]): js.Function1[/* first */ IO_[Any], IO_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apSecond")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ IO_[Any], IO_[B]]]
  
  inline def bind[N /* <: String */, A, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, IO_[B]]): js.Function1[
    /* ma */ IO_[A], 
    IO_[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* ma */ IO_[A], 
    IO_[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def bindTo[N /* <: String */](name: N): js.Function1[
    /* fa */ IO_[Any], 
    IO_[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N ]: any} */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindTo")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ IO_[Any], 
    IO_[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N ]: any} */ js.Any
    ]
  ]]
  
  inline def chain[A, B](f: js.Function1[/* a */ A, IO_[B]]): js.Function1[/* ma */ IO_[A], IO_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ IO_[A], IO_[B]]]
  
  inline def chainFirst[A, B](f: js.Function1[/* a */ A, IO_[B]]): js.Function1[/* first */ IO_[A], IO_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirst")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ IO_[A], IO_[A]]]
  
  inline def flap[A](a: A): js.Function1[/* fab */ IO_[js.Function1[/* a */ A, Any]], IO_[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flap")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ IO_[js.Function1[/* a */ A, Any]], IO_[Any]]]
  
  inline def flatMap[A, B](f: js.Function1[/* a */ A, IO_[B]]): js.Function1[/* ma */ IO_[A], IO_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ IO_[A], IO_[B]]]
  inline def flatMap[A, B](ma: IO_[A], f: js.Function1[/* a */ A, IO_[B]]): IO_[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(ma.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[IO_[B]]
  
  inline def flatten[A](mma: IO_[IO_[A]]): IO_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(mma.asInstanceOf[js.Any]).asInstanceOf[IO_[A]]
  
  inline def fromIO[A](fa: IO_[A]): IO_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIO")(fa.asInstanceOf[js.Any]).asInstanceOf[IO_[A]]
  
  inline def getMonoid[A](M: Monoid[A]): Monoid[IO_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonoid")(M.asInstanceOf[js.Any]).asInstanceOf[Monoid[IO_[A]]]
  
  inline def getSemigroup[A](S: Semigroup[A]): Semigroup[IO_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSemigroup")(S.asInstanceOf[js.Any]).asInstanceOf[Semigroup[IO_[A]]]
  
  @JSImport("fp-ts", "io.io")
  @js.native
  val io: Monad1[typings.fpTs.libIOMod.URI] & MonadIO1[typings.fpTs.libIOMod.URI] & ChainRec1[typings.fpTs.libIOMod.URI] = js.native
  
  inline def let[N /* <: String */, A, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, B]): js.Function1[
    /* fa */ IO_[A], 
    IO_[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("let")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ IO_[A], 
    IO_[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ IO_[A], IO_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ IO_[A], IO_[B]]]
  
  inline def of[A](a: A): IO_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any]).asInstanceOf[IO_[A]]
  
  inline def sequenceArray[A](arr: js.Array[IO_[A]]): IO_[js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequenceArray")(arr.asInstanceOf[js.Any]).asInstanceOf[IO_[js.Array[A]]]
  
  inline def tap[A, _underscore](f: js.Function1[/* a */ A, IO_[_underscore]]): js.Function1[/* self */ IO_[A], IO_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("tap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* self */ IO_[A], IO_[A]]]
  inline def tap[A, _underscore](self: IO_[A], f: js.Function1[/* a */ A, IO_[_underscore]]): IO_[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(self.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[IO_[A]]
  
  inline def traverseArray[A, B](f: js.Function1[/* a */ A, IO_[B]]): js.Function1[/* as */ js.Array[A], IO_[js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseArray")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], IO_[js.Array[B]]]]
  
  inline def traverseArrayWithIndex[A, B](f: js.Function2[/* index */ Double, /* a */ A, IO_[B]]): js.Function1[/* as */ js.Array[A], IO_[js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], IO_[js.Array[B]]]]
  
  inline def traverseReadonlyArrayWithIndex[A, B](f: js.Function2[/* index */ Double, /* a */ A, IO_[B]]): js.Function1[/* as */ js.Array[A], IO_[js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], IO_[js.Array[B]]]]
  
  inline def traverseReadonlyNonEmptyArrayWithIndex[A, B](f: js.Function2[/* index */ Double, /* a */ A, IO_[B]]): js.Function1[/* as */ ReadonlyNonEmptyArray_[A], IO_[ReadonlyNonEmptyArray_[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyNonEmptyArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ ReadonlyNonEmptyArray_[A], IO_[ReadonlyNonEmptyArray_[B]]]]
  
  /* augmented module */
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind[A] extends StObject
  }
}
