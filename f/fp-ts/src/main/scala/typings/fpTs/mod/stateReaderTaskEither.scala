package typings.fpTs.mod

import typings.fpTs.libAltMod.Alt4
import typings.fpTs.libApplicativeMod.Applicative4
import typings.fpTs.libApplyMod.Apply4
import typings.fpTs.libBifunctorMod.Bifunctor4
import typings.fpTs.libChainMod.Chain4
import typings.fpTs.libEitherMod.Either_
import typings.fpTs.libEndomorphismMod.Endomorphism
import typings.fpTs.libFromEitherMod.FromEither4
import typings.fpTs.libFromIOMod.FromIO4
import typings.fpTs.libFromReaderMod.FromReader4
import typings.fpTs.libFromStateMod.FromState4
import typings.fpTs.libFromTaskMod.FromTask4
import typings.fpTs.libFunctionMod.LazyArg
import typings.fpTs.libFunctorMod.Functor4
import typings.fpTs.libIOMod.IO_
import typings.fpTs.libIoeitherMod.IOEither_
import typings.fpTs.libMonadIOMod.MonadIO4
import typings.fpTs.libMonadMod.Monad4
import typings.fpTs.libMonadTaskMod.MonadTask4
import typings.fpTs.libMonadThrowMod.MonadThrow4
import typings.fpTs.libOptionMod.Option_
import typings.fpTs.libPointedMod.Pointed4
import typings.fpTs.libPredicateMod.Predicate
import typings.fpTs.libReaderEitherMod.ReaderEither_
import typings.fpTs.libReaderMod.Reader_
import typings.fpTs.libReaderTaskEitherMod.ReaderTaskEither_
import typings.fpTs.libReadonlyNonEmptyArrayMod.ReadonlyNonEmptyArray_
import typings.fpTs.libRefinementMod.Refinement
import typings.fpTs.libStateMod.State_
import typings.fpTs.libStateReaderTaskEitherMod.StateReaderTaskEither_
import typings.fpTs.libTaskEitherMod.TaskEither_
import typings.fpTs.libTaskMod.Task_
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stateReaderTaskEither {
  
  @JSImport("fp-ts", "stateReaderTaskEither")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts", "stateReaderTaskEither.Alt")
  @js.native
  val Alt_ : Alt4[typings.fpTs.libStateReaderTaskEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "stateReaderTaskEither.Applicative")
  @js.native
  val Applicative: Applicative4[typings.fpTs.libStateReaderTaskEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "stateReaderTaskEither.Apply")
  @js.native
  val Apply: Apply4[typings.fpTs.libStateReaderTaskEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "stateReaderTaskEither.Bifunctor")
  @js.native
  val Bifunctor: Bifunctor4[typings.fpTs.libStateReaderTaskEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "stateReaderTaskEither.Chain")
  @js.native
  val Chain_ : Chain4[typings.fpTs.libStateReaderTaskEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "stateReaderTaskEither.FromEither")
  @js.native
  val FromEither_ : FromEither4[typings.fpTs.libStateReaderTaskEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "stateReaderTaskEither.FromIO")
  @js.native
  val FromIO_ : FromIO4[typings.fpTs.libStateReaderTaskEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "stateReaderTaskEither.FromReader")
  @js.native
  val FromReader_ : FromReader4[typings.fpTs.libStateReaderTaskEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "stateReaderTaskEither.FromState")
  @js.native
  val FromState_ : FromState4[typings.fpTs.libStateReaderTaskEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "stateReaderTaskEither.FromTask")
  @js.native
  val FromTask_ : FromTask4[typings.fpTs.libStateReaderTaskEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "stateReaderTaskEither.Functor")
  @js.native
  val Functor: Functor4[typings.fpTs.libStateReaderTaskEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "stateReaderTaskEither.Monad")
  @js.native
  val Monad: Monad4[typings.fpTs.libStateReaderTaskEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "stateReaderTaskEither.MonadIO")
  @js.native
  val MonadIO: MonadIO4[typings.fpTs.libStateReaderTaskEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "stateReaderTaskEither.MonadTask")
  @js.native
  val MonadTask: MonadTask4[typings.fpTs.libStateReaderTaskEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "stateReaderTaskEither.MonadThrow")
  @js.native
  val MonadThrow: MonadThrow4[typings.fpTs.libStateReaderTaskEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "stateReaderTaskEither.Pointed")
  @js.native
  val Pointed: Pointed4[typings.fpTs.libStateReaderTaskEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "stateReaderTaskEither.URI")
  @js.native
  val URI: /* "StateReaderTaskEither" */ String = js.native
  
  inline def alt[S, R, E, A](that: LazyArg[StateReaderTaskEither_[S, R, E, A]]): js.Function1[/* fa */ StateReaderTaskEither_[S, R, E, A], StateReaderTaskEither_[S, R, E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(that.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ StateReaderTaskEither_[S, R, E, A], StateReaderTaskEither_[S, R, E, A]]]
  
  inline def altW[S, R2, E2, B](that: js.Function0[StateReaderTaskEither_[S, R2, E2, B]]): js.Function1[
    /* fa */ StateReaderTaskEither_[S, Any, Any, Any], 
    StateReaderTaskEither_[S, Any & R2, E2, B | Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("altW")(that.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ StateReaderTaskEither_[S, Any, Any, Any], 
    StateReaderTaskEither_[S, Any & R2, E2, B | Any]
  ]]
  
  inline def ap[S, R, E, A](fa: StateReaderTaskEither_[S, R, E, A]): js.Function1[
    /* fab */ StateReaderTaskEither_[S, R, E, js.Function1[/* a */ A, Any]], 
    StateReaderTaskEither_[S, R, E, Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fab */ StateReaderTaskEither_[S, R, E, js.Function1[/* a */ A, Any]], 
    StateReaderTaskEither_[S, R, E, Any]
  ]]
  
  inline def apFirst[S, R, E, B](second: StateReaderTaskEither_[S, R, E, B]): js.Function1[
    /* first */ StateReaderTaskEither_[S, R, E, Any], 
    StateReaderTaskEither_[S, R, E, Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("apFirst")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* first */ StateReaderTaskEither_[S, R, E, Any], 
    StateReaderTaskEither_[S, R, E, Any]
  ]]
  
  inline def apFirstW[S, R2, E2, A, B](second: StateReaderTaskEither_[S, R2, E2, B]): js.Function1[
    /* first */ StateReaderTaskEither_[S, Any, Any, A], 
    StateReaderTaskEither_[S, Any & R2, Any | E2, A]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("apFirstW")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* first */ StateReaderTaskEither_[S, Any, Any, A], 
    StateReaderTaskEither_[S, Any & R2, Any | E2, A]
  ]]
  
  inline def apS[N /* <: String */, A, S, R, E, B](name: Exclude[N, /* keyof A */ String], fb: StateReaderTaskEither_[S, R, E, B]): js.Function1[
    /* fa */ StateReaderTaskEither_[S, R, E, A], 
    StateReaderTaskEither_[
      S, 
      R, 
      E, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apS")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ StateReaderTaskEither_[S, R, E, A], 
    StateReaderTaskEither_[
      S, 
      R, 
      E, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def apSW[A, N /* <: String */, S, R2, E2, B](name: Exclude[N, /* keyof A */ String], fb: StateReaderTaskEither_[S, R2, E2, B]): js.Function1[
    /* fa */ StateReaderTaskEither_[S, Any, Any, A], 
    StateReaderTaskEither_[
      S, 
      Any & R2, 
      Any | E2, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in keyof A | N ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apSW")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ StateReaderTaskEither_[S, Any, Any, A], 
    StateReaderTaskEither_[
      S, 
      Any & R2, 
      Any | E2, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in keyof A | N ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def apSecond[S, R, E, B](second: StateReaderTaskEither_[S, R, E, B]): js.Function1[
    /* first */ StateReaderTaskEither_[S, R, E, Any], 
    StateReaderTaskEither_[S, R, E, B]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("apSecond")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* first */ StateReaderTaskEither_[S, R, E, Any], 
    StateReaderTaskEither_[S, R, E, B]
  ]]
  
  inline def apSecondW[S, R2, E2, A, B](second: StateReaderTaskEither_[S, R2, E2, B]): js.Function1[
    /* first */ StateReaderTaskEither_[S, Any, Any, A], 
    StateReaderTaskEither_[S, Any & R2, Any | E2, B]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("apSecondW")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* first */ StateReaderTaskEither_[S, Any, Any, A], 
    StateReaderTaskEither_[S, Any & R2, Any | E2, B]
  ]]
  
  inline def apW[S, R2, E2, A](fa: StateReaderTaskEither_[S, R2, E2, A]): js.Function1[
    /* fab */ StateReaderTaskEither_[S, Any, Any, js.Function1[/* a */ A, Any]], 
    StateReaderTaskEither_[S, Any & R2, Any | E2, Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("apW")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fab */ StateReaderTaskEither_[S, Any, Any, js.Function1[/* a */ A, Any]], 
    StateReaderTaskEither_[S, Any & R2, Any | E2, Any]
  ]]
  
  inline def ask[S, R, E](): StateReaderTaskEither_[S, R, E, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("ask")().asInstanceOf[StateReaderTaskEither_[S, R, E, R]]
  
  inline def asks[S, R, A, E](f: js.Function1[/* r */ R, A]): StateReaderTaskEither_[S, R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("asks")(f.asInstanceOf[js.Any]).asInstanceOf[StateReaderTaskEither_[S, R, E, A]]
  
  inline def asksStateReaderTaskEither[R, S, E, A](f: js.Function1[/* r */ R, StateReaderTaskEither_[S, R, E, A]]): StateReaderTaskEither_[S, R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("asksStateReaderTaskEither")(f.asInstanceOf[js.Any]).asInstanceOf[StateReaderTaskEither_[S, R, E, A]]
  
  inline def asksStateReaderTaskEitherW[R1, S, R2, E, A](f: js.Function1[/* r1 */ R1, StateReaderTaskEither_[S, R2, E, A]]): StateReaderTaskEither_[S, R1 & R2, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("asksStateReaderTaskEitherW")(f.asInstanceOf[js.Any]).asInstanceOf[StateReaderTaskEither_[S, R1 & R2, E, A]]
  
  inline def bimap[E, G, A, B](f: js.Function1[/* e */ E, G], g: js.Function1[/* a */ A, B]): js.Function1[
    /* fa */ StateReaderTaskEither_[Any, Any, E, A], 
    StateReaderTaskEither_[Any, Any, G, B]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bimap")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ StateReaderTaskEither_[Any, Any, E, A], 
    StateReaderTaskEither_[Any, Any, G, B]
  ]]
  
  inline def bind[N /* <: String */, A, S, R, E, B](
    name: Exclude[N, /* keyof A */ String],
    f: js.Function1[/* a */ A, StateReaderTaskEither_[S, R, E, B]]
  ): js.Function1[
    /* ma */ StateReaderTaskEither_[S, R, E, A], 
    StateReaderTaskEither_[
      S, 
      R, 
      E, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* ma */ StateReaderTaskEither_[S, R, E, A], 
    StateReaderTaskEither_[
      S, 
      R, 
      E, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def bindTo[N /* <: String */](name: N): js.Function1[
    /* fa */ StateReaderTaskEither_[Any, Any, Any, Any], 
    StateReaderTaskEither_[
      Any, 
      Any, 
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N ]: any} */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindTo")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ StateReaderTaskEither_[Any, Any, Any, Any], 
    StateReaderTaskEither_[
      Any, 
      Any, 
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N ]: any} */ js.Any
    ]
  ]]
  
  inline def bindW[N /* <: String */, A, S, R2, E2, B](
    name: Exclude[N, /* keyof A */ String],
    f: js.Function1[/* a */ A, StateReaderTaskEither_[S, R2, E2, B]]
  ): js.Function1[
    /* fa */ StateReaderTaskEither_[S, Any, Any, A], 
    StateReaderTaskEither_[
      S, 
      Any & R2, 
      Any | E2, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in keyof A | N ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindW")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ StateReaderTaskEither_[S, Any, Any, A], 
    StateReaderTaskEither_[
      S, 
      Any & R2, 
      Any | E2, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in keyof A | N ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def chain[S, R, E, A, B](f: js.Function1[/* a */ A, StateReaderTaskEither_[S, R, E, B]]): js.Function1[/* ma */ StateReaderTaskEither_[S, R, E, A], StateReaderTaskEither_[S, R, E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ StateReaderTaskEither_[S, R, E, A], StateReaderTaskEither_[S, R, E, B]]]
  
  inline def chainEitherK[E, A, B](f: js.Function1[/* a */ A, Either_[E, B]]): js.Function1[
    /* ma */ StateReaderTaskEither_[Any, Any, E, A], 
    StateReaderTaskEither_[Any, Any, E, B]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainEitherK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ma */ StateReaderTaskEither_[Any, Any, E, A], 
    StateReaderTaskEither_[Any, Any, E, B]
  ]]
  
  inline def chainEitherKW[E2, A, B](f: js.Function1[/* a */ A, Either_[E2, B]]): js.Function1[
    /* ma */ StateReaderTaskEither_[Any, Any, Any, A], 
    StateReaderTaskEither_[Any, Any, Any | E2, B]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainEitherKW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ma */ StateReaderTaskEither_[Any, Any, Any, A], 
    StateReaderTaskEither_[Any, Any, Any | E2, B]
  ]]
  
  inline def chainFirst[S, R, E, A, B](f: js.Function1[/* a */ A, StateReaderTaskEither_[S, R, E, B]]): js.Function1[/* ma */ StateReaderTaskEither_[S, R, E, A], StateReaderTaskEither_[S, R, E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirst")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ StateReaderTaskEither_[S, R, E, A], StateReaderTaskEither_[S, R, E, A]]]
  
  inline def chainFirstEitherK[A, E, B](f: js.Function1[/* a */ A, Either_[E, B]]): js.Function1[
    /* ma */ StateReaderTaskEither_[Any, Any, E, A], 
    StateReaderTaskEither_[Any, Any, E, A]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstEitherK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ma */ StateReaderTaskEither_[Any, Any, E, A], 
    StateReaderTaskEither_[Any, Any, E, A]
  ]]
  
  inline def chainFirstEitherKW[A, E2, B](f: js.Function1[/* a */ A, Either_[E2, B]]): js.Function1[
    /* ma */ StateReaderTaskEither_[Any, Any, Any, A], 
    StateReaderTaskEither_[Any, Any, Any | E2, A]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstEitherKW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ma */ StateReaderTaskEither_[Any, Any, Any, A], 
    StateReaderTaskEither_[Any, Any, Any | E2, A]
  ]]
  
  inline def chainFirstIOK[A, B](f: js.Function1[/* a */ A, IO_[B]]): js.Function1[
    /* first */ StateReaderTaskEither_[Any, Any, Any, A], 
    StateReaderTaskEither_[Any, Any, Any, A]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstIOK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* first */ StateReaderTaskEither_[Any, Any, Any, A], 
    StateReaderTaskEither_[Any, Any, Any, A]
  ]]
  
  inline def chainFirstReaderK[A, R, B](f: js.Function1[/* a */ A, Reader_[R, B]]): js.Function1[
    /* ma */ StateReaderTaskEither_[Any, R, Any, A], 
    StateReaderTaskEither_[Any, R, Any, A]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstReaderK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ma */ StateReaderTaskEither_[Any, R, Any, A], 
    StateReaderTaskEither_[Any, R, Any, A]
  ]]
  
  inline def chainFirstReaderKW[A, R1, B](f: js.Function1[/* a */ A, Reader_[R1, B]]): js.Function1[
    /* ma */ StateReaderTaskEither_[Any, Any, Any, A], 
    StateReaderTaskEither_[Any, R1 & Any, Any, A]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstReaderKW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ma */ StateReaderTaskEither_[Any, Any, Any, A], 
    StateReaderTaskEither_[Any, R1 & Any, Any, A]
  ]]
  
  inline def chainFirstTaskK[A, B](f: js.Function1[/* a */ A, Task_[B]]): js.Function1[
    /* first */ StateReaderTaskEither_[Any, Any, Any, A], 
    StateReaderTaskEither_[Any, Any, Any, A]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstTaskK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* first */ StateReaderTaskEither_[Any, Any, Any, A], 
    StateReaderTaskEither_[Any, Any, Any, A]
  ]]
  
  inline def chainFirstW[S, R2, E2, A, B](f: js.Function1[/* a */ A, StateReaderTaskEither_[S, R2, E2, B]]): js.Function1[
    /* ma */ StateReaderTaskEither_[S, Any, Any, A], 
    StateReaderTaskEither_[S, Any & R2, Any | E2, A]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ma */ StateReaderTaskEither_[S, Any, Any, A], 
    StateReaderTaskEither_[S, Any & R2, Any | E2, A]
  ]]
  
  inline def chainIOEitherK[E, A, B](f: js.Function1[/* a */ A, IOEither_[E, B]]): js.Function1[
    /* ma */ StateReaderTaskEither_[Any, Any, E, A], 
    StateReaderTaskEither_[Any, Any, E, B]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainIOEitherK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ma */ StateReaderTaskEither_[Any, Any, E, A], 
    StateReaderTaskEither_[Any, Any, E, B]
  ]]
  
  inline def chainIOEitherKW[E2, A, B](f: js.Function1[/* a */ A, IOEither_[E2, B]]): js.Function1[
    /* ma */ StateReaderTaskEither_[Any, Any, Any, A], 
    StateReaderTaskEither_[Any, Any, E2 | Any, B]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainIOEitherKW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ma */ StateReaderTaskEither_[Any, Any, Any, A], 
    StateReaderTaskEither_[Any, Any, E2 | Any, B]
  ]]
  
  inline def chainIOK[A, B](f: js.Function1[/* a */ A, IO_[B]]): js.Function1[
    /* first */ StateReaderTaskEither_[Any, Any, Any, A], 
    StateReaderTaskEither_[Any, Any, Any, B]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainIOK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* first */ StateReaderTaskEither_[Any, Any, Any, A], 
    StateReaderTaskEither_[Any, Any, Any, B]
  ]]
  
  inline def chainOptionK[E](onNone: LazyArg[E]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Option_[Any]], 
    js.Function1[
      /* ma */ StateReaderTaskEither_[Any, Any, E, Any], 
      StateReaderTaskEither_[Any, Any, E, Any]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainOptionK")(onNone.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Option_[Any]], 
    js.Function1[
      /* ma */ StateReaderTaskEither_[Any, Any, E, Any], 
      StateReaderTaskEither_[Any, Any, E, Any]
    ]
  ]]
  
  inline def chainOptionKW[E2](onNone: LazyArg[E2]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Option_[Any]], 
    js.Function1[
      /* ma */ StateReaderTaskEither_[Any, Any, Any, Any], 
      StateReaderTaskEither_[Any, Any, Any | E2, Any]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainOptionKW")(onNone.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Option_[Any]], 
    js.Function1[
      /* ma */ StateReaderTaskEither_[Any, Any, Any, Any], 
      StateReaderTaskEither_[Any, Any, Any | E2, Any]
    ]
  ]]
  
  inline def chainReaderK[A, R, B](f: js.Function1[/* a */ A, Reader_[R, B]]): js.Function1[
    /* ma */ StateReaderTaskEither_[Any, R, Any, A], 
    StateReaderTaskEither_[Any, R, Any, B]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainReaderK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ma */ StateReaderTaskEither_[Any, R, Any, A], 
    StateReaderTaskEither_[Any, R, Any, B]
  ]]
  
  inline def chainReaderKW[A, R1, B](f: js.Function1[/* a */ A, Reader_[R1, B]]): js.Function1[
    /* ma */ StateReaderTaskEither_[Any, Any, Any, A], 
    StateReaderTaskEither_[Any, R1 & Any, Any, B]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainReaderKW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ma */ StateReaderTaskEither_[Any, Any, Any, A], 
    StateReaderTaskEither_[Any, R1 & Any, Any, B]
  ]]
  
  inline def chainReaderTaskEitherK[R, E, A, B](f: js.Function1[/* a */ A, ReaderTaskEither_[R, E, B]]): js.Function1[
    /* ma */ StateReaderTaskEither_[Any, R, E, A], 
    StateReaderTaskEither_[Any, R, E, B]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainReaderTaskEitherK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ma */ StateReaderTaskEither_[Any, R, E, A], 
    StateReaderTaskEither_[Any, R, E, B]
  ]]
  
  inline def chainReaderTaskEitherKW[R, E2, A, B](f: js.Function1[/* a */ A, ReaderTaskEither_[R, E2, B]]): js.Function1[
    /* ma */ StateReaderTaskEither_[Any, R, Any, A], 
    StateReaderTaskEither_[Any, R, E2 | Any, B]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainReaderTaskEitherKW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ma */ StateReaderTaskEither_[Any, R, Any, A], 
    StateReaderTaskEither_[Any, R, E2 | Any, B]
  ]]
  
  inline def chainStateK[A, S, B](f: js.Function1[/* a */ A, State_[S, B]]): js.Function1[
    /* ma */ StateReaderTaskEither_[S, Any, Any, A], 
    StateReaderTaskEither_[S, Any, Any, B]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainStateK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ma */ StateReaderTaskEither_[S, Any, Any, A], 
    StateReaderTaskEither_[S, Any, Any, B]
  ]]
  
  inline def chainTaskEitherK[E, A, B](f: js.Function1[/* a */ A, TaskEither_[E, B]]): js.Function1[
    /* ma */ StateReaderTaskEither_[Any, Any, E, A], 
    StateReaderTaskEither_[Any, Any, E, B]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainTaskEitherK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ma */ StateReaderTaskEither_[Any, Any, E, A], 
    StateReaderTaskEither_[Any, Any, E, B]
  ]]
  
  inline def chainTaskEitherKW[E2, A, B](f: js.Function1[/* a */ A, TaskEither_[E2, B]]): js.Function1[
    /* ma */ StateReaderTaskEither_[Any, Any, Any, A], 
    StateReaderTaskEither_[Any, Any, E2 | Any, B]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainTaskEitherKW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ma */ StateReaderTaskEither_[Any, Any, Any, A], 
    StateReaderTaskEither_[Any, Any, E2 | Any, B]
  ]]
  
  inline def chainTaskK[A, B](f: js.Function1[/* a */ A, Task_[B]]): js.Function1[
    /* first */ StateReaderTaskEither_[Any, Any, Any, A], 
    StateReaderTaskEither_[Any, Any, Any, B]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainTaskK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* first */ StateReaderTaskEither_[Any, Any, Any, A], 
    StateReaderTaskEither_[Any, Any, Any, B]
  ]]
  
  inline def chainW[S, R2, E2, A, B](f: js.Function1[/* a */ A, StateReaderTaskEither_[S, R2, E2, B]]): js.Function1[
    /* ma */ StateReaderTaskEither_[S, Any, Any, A], 
    StateReaderTaskEither_[S, Any & R2, Any | E2, B]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ma */ StateReaderTaskEither_[S, Any, Any, A], 
    StateReaderTaskEither_[S, Any & R2, Any | E2, B]
  ]]
  
  inline def evalState[S, R, E, A](ma: StateReaderTaskEither_[S, R, E, A], s: S): ReaderTaskEither_[R, E, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("evalState")(ma.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[ReaderTaskEither_[R, E, A]]
  
  inline def evaluate[S](s: S): js.Function1[
    /* ma */ StateReaderTaskEither_[S, Any, Any, Any], 
    ReaderTaskEither_[Any, Any, Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("evaluate")(s.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ma */ StateReaderTaskEither_[S, Any, Any, Any], 
    ReaderTaskEither_[Any, Any, Any]
  ]]
  
  inline def execState[S, R, E, A](ma: StateReaderTaskEither_[S, R, E, A], s: S): ReaderTaskEither_[R, E, S] = (^.asInstanceOf[js.Dynamic].applyDynamic("execState")(ma.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[ReaderTaskEither_[R, E, S]]
  
  inline def execute[S](s: S): js.Function1[/* ma */ StateReaderTaskEither_[S, Any, Any, Any], ReaderTaskEither_[Any, Any, S]] = ^.asInstanceOf[js.Dynamic].applyDynamic("execute")(s.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ StateReaderTaskEither_[S, Any, Any, Any], ReaderTaskEither_[Any, Any, S]]]
  
  inline def filterOrElse[E, A](predicate: Predicate[A], onFalse: js.Function1[/* a */ A, E]): js.Function1[
    /* mb */ StateReaderTaskEither_[Any, Any, E, A], 
    StateReaderTaskEither_[Any, Any, E, A]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterOrElse")(predicate.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* mb */ StateReaderTaskEither_[Any, Any, E, A], 
    StateReaderTaskEither_[Any, Any, E, A]
  ]]
  
  inline def filterOrElseW[A, E2](predicate: Predicate[A], onFalse: js.Function1[/* a */ A, E2]): js.Function1[
    /* mb */ StateReaderTaskEither_[Any, Any, Any, A], 
    StateReaderTaskEither_[Any, Any, Any | E2, A]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterOrElseW")(predicate.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* mb */ StateReaderTaskEither_[Any, Any, Any, A], 
    StateReaderTaskEither_[Any, Any, Any | E2, A]
  ]]
  
  inline def filterOrElseW_ABE2[A, B /* <: A */, E2](refinement: Refinement[A, B], onFalse: js.Function1[/* a */ A, E2]): js.Function1[
    /* ma */ StateReaderTaskEither_[Any, Any, Any, A], 
    StateReaderTaskEither_[Any, Any, Any | E2, B]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterOrElseW")(refinement.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* ma */ StateReaderTaskEither_[Any, Any, Any, A], 
    StateReaderTaskEither_[Any, Any, Any | E2, B]
  ]]
  
  inline def filterOrElse_EAB[E, A, B /* <: A */](refinement: Refinement[A, B], onFalse: js.Function1[/* a */ A, E]): js.Function1[
    /* ma */ StateReaderTaskEither_[Any, Any, E, A], 
    StateReaderTaskEither_[Any, Any, E, B]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterOrElse")(refinement.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* ma */ StateReaderTaskEither_[Any, Any, E, A], 
    StateReaderTaskEither_[Any, Any, E, B]
  ]]
  
  inline def flap[A](a: A): js.Function1[
    /* fab */ StateReaderTaskEither_[Any, Any, Any, js.Function1[/* a */ A, Any]], 
    StateReaderTaskEither_[Any, Any, Any, Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("flap")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fab */ StateReaderTaskEither_[Any, Any, Any, js.Function1[/* a */ A, Any]], 
    StateReaderTaskEither_[Any, Any, Any, Any]
  ]]
  
  inline def flatMap[A, S, R2, E2, B](f: js.Function1[/* a */ A, StateReaderTaskEither_[S, R2, E2, B]]): js.Function1[
    /* ma */ StateReaderTaskEither_[S, Any, Any, A], 
    StateReaderTaskEither_[S, Any & R2, Any | E2, B]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ma */ StateReaderTaskEither_[S, Any, Any, A], 
    StateReaderTaskEither_[S, Any & R2, Any | E2, B]
  ]]
  inline def flatMap[S, R1, E1, A, R2, E2, B](
    ma: StateReaderTaskEither_[S, R1, E1, A],
    f: js.Function1[/* a */ A, StateReaderTaskEither_[S, R2, E2, B]]
  ): StateReaderTaskEither_[S, R1 & R2, E1 | E2, B] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(ma.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[StateReaderTaskEither_[S, R1 & R2, E1 | E2, B]]
  
  inline def flatten[S, R, E, A](mma: StateReaderTaskEither_[S, R, E, StateReaderTaskEither_[S, R, E, A]]): StateReaderTaskEither_[S, R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(mma.asInstanceOf[js.Any]).asInstanceOf[StateReaderTaskEither_[S, R, E, A]]
  
  inline def flattenW[S, R1, E1, R2, E2, A](mma: StateReaderTaskEither_[S, R1, E1, StateReaderTaskEither_[S, R2, E2, A]]): StateReaderTaskEither_[S, R1 & R2, E1 | E2, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("flattenW")(mma.asInstanceOf[js.Any]).asInstanceOf[StateReaderTaskEither_[S, R1 & R2, E1 | E2, A]]
  
  inline def fromEither[E, A, S, R](fa: Either_[E, A]): StateReaderTaskEither_[S, R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEither")(fa.asInstanceOf[js.Any]).asInstanceOf[StateReaderTaskEither_[S, R, E, A]]
  
  inline def fromEitherK[E, A /* <: js.Array[Any] */, B](f: js.Function1[/* a */ A, Either_[E, B]]): js.Function1[/* a */ A, StateReaderTaskEither_[Any, Any, E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEitherK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, StateReaderTaskEither_[Any, Any, E, B]]]
  
  inline def fromIO[A, S, R, E](fa: IO_[A]): StateReaderTaskEither_[S, R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIO")(fa.asInstanceOf[js.Any]).asInstanceOf[StateReaderTaskEither_[S, R, E, A]]
  
  inline def fromIOEither[E, A, S, R](fa: IOEither_[E, A]): StateReaderTaskEither_[S, R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIOEither")(fa.asInstanceOf[js.Any]).asInstanceOf[StateReaderTaskEither_[S, R, E, A]]
  
  inline def fromIOEitherK[E, A /* <: js.Array[Any] */, B](f: js.Function1[/* a */ A, IOEither_[E, B]]): js.Function1[/* a */ A, StateReaderTaskEither_[Any, Any, E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIOEitherK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, StateReaderTaskEither_[Any, Any, E, B]]]
  
  inline def fromIOK[A /* <: js.Array[Any] */, B](f: js.Function1[/* a */ A, IO_[B]]): js.Function1[/* a */ A, StateReaderTaskEither_[Any, Any, scala.Nothing, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIOK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, StateReaderTaskEither_[Any, Any, scala.Nothing, B]]]
  
  inline def fromOption[E](onNone: LazyArg[E]): js.Function1[/* fa */ Option_[Any], StateReaderTaskEither_[Any, Any, E, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOption")(onNone.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Option_[Any], StateReaderTaskEither_[Any, Any, E, Any]]]
  
  inline def fromOptionK[E](onNone: LazyArg[E]): js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], Option_[Any]], 
    js.Function1[/* a */ js.Array[Any], StateReaderTaskEither_[Any, Any, E, Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOptionK")(onNone.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], Option_[Any]], 
    js.Function1[/* a */ js.Array[Any], StateReaderTaskEither_[Any, Any, E, Any]]
  ]]
  
  inline def fromPredicate[E, A](predicate: Predicate[A], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* b */ A, StateReaderTaskEither_[Any, Any, E, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(predicate.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* b */ A, StateReaderTaskEither_[Any, Any, E, A]]]
  
  inline def fromPredicate_EAB[E, A, B /* <: A */](refinement: Refinement[A, B], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* a */ A, StateReaderTaskEither_[Any, Any, E, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(refinement.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ A, StateReaderTaskEither_[Any, Any, E, B]]]
  
  inline def fromReader[R, A, S, E](fa: Reader_[R, A]): StateReaderTaskEither_[S, R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromReader")(fa.asInstanceOf[js.Any]).asInstanceOf[StateReaderTaskEither_[S, R, E, A]]
  
  inline def fromReaderEither[R, E, A, S](fa: ReaderEither_[R, E, A]): StateReaderTaskEither_[S, R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromReaderEither")(fa.asInstanceOf[js.Any]).asInstanceOf[StateReaderTaskEither_[S, R, E, A]]
  
  inline def fromReaderK[A /* <: js.Array[Any] */, R, B](f: js.Function1[/* a */ A, Reader_[R, B]]): js.Function1[/* a */ A, StateReaderTaskEither_[Any, R, scala.Nothing, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromReaderK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, StateReaderTaskEither_[Any, R, scala.Nothing, B]]]
  
  inline def fromReaderTaskEither[R, E, A, S](fa: ReaderTaskEither_[R, E, A]): StateReaderTaskEither_[S, R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromReaderTaskEither")(fa.asInstanceOf[js.Any]).asInstanceOf[StateReaderTaskEither_[S, R, E, A]]
  
  inline def fromReaderTaskEitherK[R, E, A /* <: js.Array[Any] */, B](f: js.Function1[/* a */ A, ReaderTaskEither_[R, E, B]]): js.Function1[/* a */ A, StateReaderTaskEither_[Any, R, E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromReaderTaskEitherK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, StateReaderTaskEither_[Any, R, E, B]]]
  
  inline def fromState[S, A, R, E](fa: State_[S, A]): StateReaderTaskEither_[S, R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromState")(fa.asInstanceOf[js.Any]).asInstanceOf[StateReaderTaskEither_[S, R, E, A]]
  
  inline def fromStateK[A /* <: js.Array[Any] */, S, B](f: js.Function1[/* a */ A, State_[S, B]]): js.Function1[/* a */ A, StateReaderTaskEither_[S, Any, scala.Nothing, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromStateK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, StateReaderTaskEither_[S, Any, scala.Nothing, B]]]
  
  inline def fromTask[A, S, R, E](fa: Task_[A]): StateReaderTaskEither_[S, R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTask")(fa.asInstanceOf[js.Any]).asInstanceOf[StateReaderTaskEither_[S, R, E, A]]
  
  inline def fromTaskEither[E, A, S, R](fa: TaskEither_[E, A]): StateReaderTaskEither_[S, R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTaskEither")(fa.asInstanceOf[js.Any]).asInstanceOf[StateReaderTaskEither_[S, R, E, A]]
  
  inline def fromTaskEitherK[E, A /* <: js.Array[Any] */, B](f: js.Function1[/* a */ A, TaskEither_[E, B]]): js.Function1[/* a */ A, StateReaderTaskEither_[Any, Any, E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTaskEitherK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, StateReaderTaskEither_[Any, Any, E, B]]]
  
  inline def fromTaskK[A /* <: js.Array[Any] */, B](f: js.Function1[/* a */ A, Task_[B]]): js.Function1[/* a */ A, StateReaderTaskEither_[Any, Any, scala.Nothing, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTaskK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, StateReaderTaskEither_[Any, Any, scala.Nothing, B]]]
  
  inline def get[S, R, E](): StateReaderTaskEither_[S, R, E, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[StateReaderTaskEither_[S, R, E, S]]
  
  inline def gets[S, R, E, A](f: js.Function1[/* s */ S, A]): StateReaderTaskEither_[S, R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("gets")(f.asInstanceOf[js.Any]).asInstanceOf[StateReaderTaskEither_[S, R, E, A]]
  
  inline def left[S, R, E, A](e: E): StateReaderTaskEither_[S, R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("left")(e.asInstanceOf[js.Any]).asInstanceOf[StateReaderTaskEither_[S, R, E, A]]
  
  inline def leftIO[S, R, E, A](me: IO_[E]): StateReaderTaskEither_[S, R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("leftIO")(me.asInstanceOf[js.Any]).asInstanceOf[StateReaderTaskEither_[S, R, E, A]]
  
  inline def leftReader[S, R, E, A](me: Reader_[R, E]): StateReaderTaskEither_[S, R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("leftReader")(me.asInstanceOf[js.Any]).asInstanceOf[StateReaderTaskEither_[S, R, E, A]]
  
  inline def leftState[S, R, E, A](me: State_[S, E]): StateReaderTaskEither_[S, R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("leftState")(me.asInstanceOf[js.Any]).asInstanceOf[StateReaderTaskEither_[S, R, E, A]]
  
  inline def leftTask[S, R, E, A](me: Task_[E]): StateReaderTaskEither_[S, R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("leftTask")(me.asInstanceOf[js.Any]).asInstanceOf[StateReaderTaskEither_[S, R, E, A]]
  
  inline def let[N /* <: String */, A, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, B]): js.Function1[
    /* fa */ StateReaderTaskEither_[Any, Any, Any, A], 
    StateReaderTaskEither_[
      Any, 
      Any, 
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("let")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ StateReaderTaskEither_[Any, Any, Any, A], 
    StateReaderTaskEither_[
      Any, 
      Any, 
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def local[R2, R1](f: js.Function1[/* r2 */ R2, R1]): js.Function1[
    /* ma */ StateReaderTaskEither_[Any, R1, Any, Any], 
    StateReaderTaskEither_[Any, R2, Any, Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("local")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ma */ StateReaderTaskEither_[Any, R1, Any, Any], 
    StateReaderTaskEither_[Any, R2, Any, Any]
  ]]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[
    /* fa */ StateReaderTaskEither_[Any, Any, Any, A], 
    StateReaderTaskEither_[Any, Any, Any, B]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ StateReaderTaskEither_[Any, Any, Any, A], 
    StateReaderTaskEither_[Any, Any, Any, B]
  ]]
  
  inline def mapLeft[E, G](f: js.Function1[/* e */ E, G]): js.Function1[
    /* fa */ StateReaderTaskEither_[Any, Any, E, Any], 
    StateReaderTaskEither_[Any, Any, G, Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapLeft")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ StateReaderTaskEither_[Any, Any, E, Any], 
    StateReaderTaskEither_[Any, Any, G, Any]
  ]]
  
  inline def modify[S, R, E](f: Endomorphism[S]): StateReaderTaskEither_[S, R, E, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("modify")(f.asInstanceOf[js.Any]).asInstanceOf[StateReaderTaskEither_[S, R, E, Unit]]
  
  inline def of[S, R, E, A](a: A): StateReaderTaskEither_[S, R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any]).asInstanceOf[StateReaderTaskEither_[S, R, E, A]]
  
  inline def put[S, R, E](s: S): StateReaderTaskEither_[S, R, E, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("put")(s.asInstanceOf[js.Any]).asInstanceOf[StateReaderTaskEither_[S, R, E, Unit]]
  
  inline def right[S, R, E, A](a: A): StateReaderTaskEither_[S, R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("right")(a.asInstanceOf[js.Any]).asInstanceOf[StateReaderTaskEither_[S, R, E, A]]
  
  inline def rightIO[S, R, E, A](ma: IO_[A]): StateReaderTaskEither_[S, R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("rightIO")(ma.asInstanceOf[js.Any]).asInstanceOf[StateReaderTaskEither_[S, R, E, A]]
  
  inline def rightReader[S, R, E, A](ma: Reader_[R, A]): StateReaderTaskEither_[S, R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("rightReader")(ma.asInstanceOf[js.Any]).asInstanceOf[StateReaderTaskEither_[S, R, E, A]]
  
  inline def rightState[S, R, E, A](ma: State_[S, A]): StateReaderTaskEither_[S, R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("rightState")(ma.asInstanceOf[js.Any]).asInstanceOf[StateReaderTaskEither_[S, R, E, A]]
  
  inline def rightTask[S, R, E, A](ma: Task_[A]): StateReaderTaskEither_[S, R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("rightTask")(ma.asInstanceOf[js.Any]).asInstanceOf[StateReaderTaskEither_[S, R, E, A]]
  
  inline def run[S, R, E, A](ma: StateReaderTaskEither_[S, R, E, A], s: S, r: R): js.Promise[Either_[E, js.Tuple2[A, S]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(ma.asInstanceOf[js.Any], s.asInstanceOf[js.Any], r.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Either_[E, js.Tuple2[A, S]]]]
  
  inline def sequenceArray[S, R, E, A](arr: js.Array[StateReaderTaskEither_[S, R, E, A]]): StateReaderTaskEither_[S, R, E, js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequenceArray")(arr.asInstanceOf[js.Any]).asInstanceOf[StateReaderTaskEither_[S, R, E, js.Array[A]]]
  
  @JSImport("fp-ts", "stateReaderTaskEither.stateReaderTaskEither")
  @js.native
  val stateReaderTaskEither: Monad4[typings.fpTs.libStateReaderTaskEitherMod.URI] & Bifunctor4[typings.fpTs.libStateReaderTaskEitherMod.URI] & Alt4[typings.fpTs.libStateReaderTaskEitherMod.URI] & MonadTask4[typings.fpTs.libStateReaderTaskEitherMod.URI] & MonadThrow4[typings.fpTs.libStateReaderTaskEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "stateReaderTaskEither.stateReaderTaskEitherSeq")
  @js.native
  val stateReaderTaskEitherSeq: Monad4[typings.fpTs.libStateReaderTaskEitherMod.URI] & Bifunctor4[typings.fpTs.libStateReaderTaskEitherMod.URI] & Alt4[typings.fpTs.libStateReaderTaskEitherMod.URI] & MonadTask4[typings.fpTs.libStateReaderTaskEitherMod.URI] & MonadThrow4[typings.fpTs.libStateReaderTaskEitherMod.URI] = js.native
  
  inline def tap[A, S, R2, E2, _underscore](f: js.Function1[/* a */ A, StateReaderTaskEither_[S, R2, E2, _underscore]]): js.Function1[
    /* self */ StateReaderTaskEither_[S, Any, Any, A], 
    StateReaderTaskEither_[S, Any & R2, E2 | Any, A]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("tap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* self */ StateReaderTaskEither_[S, Any, Any, A], 
    StateReaderTaskEither_[S, Any & R2, E2 | Any, A]
  ]]
  inline def tap[S, R1, E1, A, R2, E2, _underscore](
    self: StateReaderTaskEither_[S, R1, E1, A],
    f: js.Function1[/* a */ A, StateReaderTaskEither_[S, R2, E2, _underscore]]
  ): StateReaderTaskEither_[S, R1 & R2, E1 | E2, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(self.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[StateReaderTaskEither_[S, R1 & R2, E1 | E2, A]]
  
  @JSImport("fp-ts", "stateReaderTaskEither.throwError")
  @js.native
  val throwError: js.Function1[
    /* e */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, R, E, A> */ Any
  ] = js.native
  
  inline def traverseArray[S, R, E, A, B](f: js.Function1[/* a */ A, StateReaderTaskEither_[S, R, E, B]]): js.Function1[/* as */ js.Array[A], StateReaderTaskEither_[S, R, E, js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseArray")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], StateReaderTaskEither_[S, R, E, js.Array[B]]]]
  
  inline def traverseArrayWithIndex[S, R, E, A, B](f: js.Function2[/* index */ Double, /* a */ A, StateReaderTaskEither_[S, R, E, B]]): js.Function1[/* as */ js.Array[A], StateReaderTaskEither_[S, R, E, js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], StateReaderTaskEither_[S, R, E, js.Array[B]]]]
  
  inline def traverseReadonlyArrayWithIndex[A, S, R, E, B](f: js.Function2[/* index */ Double, /* a */ A, StateReaderTaskEither_[S, R, E, B]]): js.Function1[/* as */ js.Array[A], StateReaderTaskEither_[S, R, E, js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], StateReaderTaskEither_[S, R, E, js.Array[B]]]]
  
  inline def traverseReadonlyNonEmptyArrayWithIndex[A, S, R, E, B](f: js.Function2[/* index */ Double, /* a */ A, StateReaderTaskEither_[S, R, E, B]]): js.Function1[
    /* as */ ReadonlyNonEmptyArray_[A], 
    StateReaderTaskEither_[S, R, E, ReadonlyNonEmptyArray_[B]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyNonEmptyArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* as */ ReadonlyNonEmptyArray_[A], 
    StateReaderTaskEither_[S, R, E, ReadonlyNonEmptyArray_[B]]
  ]]
  
  /* augmented module */
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind4[S, R, E, A] extends StObject
  }
}
