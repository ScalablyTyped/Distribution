package typings.fpTs.mod

import org.scalablytyped.runtime.TopLevel
import typings.fpTs.altMod.Alt4
import typings.fpTs.applicativeMod.Applicative4
import typings.fpTs.bifunctorMod.Bifunctor4
import typings.fpTs.eitherMod.Either_
import typings.fpTs.functionMod.Lazy
import typings.fpTs.functionMod.Predicate
import typings.fpTs.functionMod.Refinement
import typings.fpTs.functorMod.Functor4
import typings.fpTs.iOMod.IO_
import typings.fpTs.ioeitherMod.IOEither_
import typings.fpTs.monadMod.Monad4
import typings.fpTs.monadTaskMod.MonadTask4
import typings.fpTs.monadThrowMod.MonadThrow4
import typings.fpTs.optionMod.Option_
import typings.fpTs.readerEitherMod.ReaderEither_
import typings.fpTs.readerMod.Reader_
import typings.fpTs.readerTaskEitherMod.ReaderTaskEither_
import typings.fpTs.stateMod.State_
import typings.fpTs.stateReaderTaskEitherMod.StateReaderTaskEither_
import typings.fpTs.taskEitherMod.TaskEither_
import typings.fpTs.taskMod.Task_
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
  val Alt_ : Alt4[typings.fpTs.stateReaderTaskEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "stateReaderTaskEither.Applicative")
  @js.native
  val Applicative: Applicative4[typings.fpTs.stateReaderTaskEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "stateReaderTaskEither.Bifunctor")
  @js.native
  val Bifunctor: Bifunctor4[typings.fpTs.stateReaderTaskEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "stateReaderTaskEither.Functor")
  @js.native
  val Functor: Functor4[typings.fpTs.stateReaderTaskEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "stateReaderTaskEither.URI")
  @js.native
  val URI: /* "StateReaderTaskEither" */ String = js.native
  
  @scala.inline
  def alt[S, R, E, A](that: Lazy[StateReaderTaskEither_[S, R, E, A]]): js.Function1[/* fa */ StateReaderTaskEither_[S, R, E, A], StateReaderTaskEither_[S, R, E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(that.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ StateReaderTaskEither_[S, R, E, A], StateReaderTaskEither_[S, R, E, A]]]
  
  @scala.inline
  def ap[S, R, E, A](fa: StateReaderTaskEither_[S, R, E, A]): js.Function1[
    /* fab */ StateReaderTaskEither_[S, R, E, js.Function1[/* a */ A, js.Any]], 
    StateReaderTaskEither_[S, R, E, js.Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fab */ StateReaderTaskEither_[S, R, E, js.Function1[/* a */ A, js.Any]], 
    StateReaderTaskEither_[S, R, E, js.Any]
  ]]
  
  @scala.inline
  def apFirst[S, R, E, B](fb: StateReaderTaskEither_[S, R, E, B]): js.Function1[
    /* fa */ StateReaderTaskEither_[S, R, E, js.Any], 
    StateReaderTaskEither_[S, R, E, js.Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("apFirst")(fb.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ StateReaderTaskEither_[S, R, E, js.Any], 
    StateReaderTaskEither_[S, R, E, js.Any]
  ]]
  
  @scala.inline
  def apS[A, N /* <: String */, S, R, E, B](name: Exclude[N, /* keyof A */ String], fb: StateReaderTaskEither_[S, R, E, B]): js.Function1[
    /* fa */ StateReaderTaskEither_[S, R, E, A], 
    StateReaderTaskEither_[
      S, 
      R, 
      E, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A | N ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apS & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apS")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ StateReaderTaskEither_[S, R, E, A], 
    StateReaderTaskEither_[
      S, 
      R, 
      E, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A | N ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apS & TopLevel[A]
    ]
  ]]
  
  @scala.inline
  def apSW[A, N /* <: String */, S, Q, D, B](name: Exclude[N, /* keyof A */ String], fb: StateReaderTaskEither_[S, Q, D, B]): js.Function1[
    /* fa */ StateReaderTaskEither_[S, js.Any, js.Any, A], 
    StateReaderTaskEither_[
      S, 
      Q & js.Any, 
      D | js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apSW & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apSW")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ StateReaderTaskEither_[S, js.Any, js.Any, A], 
    StateReaderTaskEither_[
      S, 
      Q & js.Any, 
      D | js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apSW & TopLevel[A]
    ]
  ]]
  
  @scala.inline
  def apSecond[S, R, E, B](fb: StateReaderTaskEither_[S, R, E, B]): js.Function1[
    /* fa */ StateReaderTaskEither_[S, R, E, js.Any], 
    StateReaderTaskEither_[S, R, E, B]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("apSecond")(fb.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ StateReaderTaskEither_[S, R, E, js.Any], 
    StateReaderTaskEither_[S, R, E, B]
  ]]
  
  @scala.inline
  def apW[S, Q, D, A](fa: StateReaderTaskEither_[S, Q, D, A]): js.Function1[
    /* fab */ StateReaderTaskEither_[S, js.Any, js.Any, js.Function1[/* a */ A, js.Any]], 
    StateReaderTaskEither_[S, Q & js.Any, D | js.Any, js.Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("apW")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fab */ StateReaderTaskEither_[S, js.Any, js.Any, js.Function1[/* a */ A, js.Any]], 
    StateReaderTaskEither_[S, Q & js.Any, D | js.Any, js.Any]
  ]]
  
  @scala.inline
  def bimap[E, G, A, B](f: js.Function1[/* e */ E, G], g: js.Function1[/* a */ A, B]): js.Function1[
    /* fa */ StateReaderTaskEither_[js.Any, js.Any, E, A], 
    StateReaderTaskEither_[js.Any, js.Any, G, B]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bimap")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ StateReaderTaskEither_[js.Any, js.Any, E, A], 
    StateReaderTaskEither_[js.Any, js.Any, G, B]
  ]]
  
  @scala.inline
  def bind[N /* <: String */, A, S, R, E, B](
    name: Exclude[N, /* keyof A */ String],
    f: js.Function1[/* a */ A, StateReaderTaskEither_[S, R, E, B]]
  ): js.Function1[
    /* fa */ StateReaderTaskEither_[S, R, E, A], 
    StateReaderTaskEither_[
      S, 
      R, 
      E, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A | N ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bind & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ StateReaderTaskEither_[S, R, E, A], 
    StateReaderTaskEither_[
      S, 
      R, 
      E, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A | N ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bind & TopLevel[A]
    ]
  ]]
  
  @scala.inline
  def bindTo[N /* <: String */](name: N): js.Function1[
    /* fa */ StateReaderTaskEither_[js.Any, js.Any, js.Any, js.Any], 
    StateReaderTaskEither_[
      js.Any, 
      js.Any, 
      js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N ]: any}
    */ typings.fpTs.fpTsStrings.bindTo & TopLevel[js.Any]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindTo")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ StateReaderTaskEither_[js.Any, js.Any, js.Any, js.Any], 
    StateReaderTaskEither_[
      js.Any, 
      js.Any, 
      js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N ]: any}
    */ typings.fpTs.fpTsStrings.bindTo & TopLevel[js.Any]
    ]
  ]]
  
  @scala.inline
  def bindW[N /* <: String */, A, S, Q, D, B](
    name: Exclude[N, /* keyof A */ String],
    f: js.Function1[/* a */ A, StateReaderTaskEither_[S, Q, D, B]]
  ): js.Function1[
    /* fa */ StateReaderTaskEither_[S, js.Any, js.Any, A], 
    StateReaderTaskEither_[
      S, 
      Q & js.Any, 
      D | js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bindW & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindW")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ StateReaderTaskEither_[S, js.Any, js.Any, A], 
    StateReaderTaskEither_[
      S, 
      Q & js.Any, 
      D | js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bindW & TopLevel[A]
    ]
  ]]
  
  @scala.inline
  def chain[S, R, E, A, B](f: js.Function1[/* a */ A, StateReaderTaskEither_[S, R, E, B]]): js.Function1[/* ma */ StateReaderTaskEither_[S, R, E, A], StateReaderTaskEither_[S, R, E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ StateReaderTaskEither_[S, R, E, A], StateReaderTaskEither_[S, R, E, B]]]
  
  @scala.inline
  def chainEitherK[E, A, B](f: js.Function1[/* a */ A, Either_[E, B]]): js.Function1[
    /* ma */ StateReaderTaskEither_[js.Any, js.Any, E, A], 
    StateReaderTaskEither_[js.Any, js.Any, E, B]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainEitherK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ma */ StateReaderTaskEither_[js.Any, js.Any, E, A], 
    StateReaderTaskEither_[js.Any, js.Any, E, B]
  ]]
  
  @scala.inline
  def chainEitherKW[E, A, B](f: js.Function1[/* a */ A, Either_[E, B]]): js.Function1[
    /* ma */ StateReaderTaskEither_[js.Any, js.Any, js.Any, A], 
    StateReaderTaskEither_[js.Any, js.Any, E | js.Any, B]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainEitherKW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ma */ StateReaderTaskEither_[js.Any, js.Any, js.Any, A], 
    StateReaderTaskEither_[js.Any, js.Any, E | js.Any, B]
  ]]
  
  @scala.inline
  def chainFirst[S, R, E, A, B](f: js.Function1[/* a */ A, StateReaderTaskEither_[S, R, E, B]]): js.Function1[/* ma */ StateReaderTaskEither_[S, R, E, A], StateReaderTaskEither_[S, R, E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirst")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ StateReaderTaskEither_[S, R, E, A], StateReaderTaskEither_[S, R, E, A]]]
  
  @scala.inline
  def chainFirstW[S, R, D, A, B](f: js.Function1[/* a */ A, StateReaderTaskEither_[S, R, D, B]]): js.Function1[
    /* ma */ StateReaderTaskEither_[S, js.Any, js.Any, A], 
    StateReaderTaskEither_[S, js.Any & R, D | js.Any, A]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ma */ StateReaderTaskEither_[S, js.Any, js.Any, A], 
    StateReaderTaskEither_[S, js.Any & R, D | js.Any, A]
  ]]
  
  @scala.inline
  def chainIOEitherK[E, A, B](f: js.Function1[/* a */ A, IOEither_[E, B]]): js.Function1[
    /* ma */ StateReaderTaskEither_[js.Any, js.Any, E, A], 
    StateReaderTaskEither_[js.Any, js.Any, E, B]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainIOEitherK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ma */ StateReaderTaskEither_[js.Any, js.Any, E, A], 
    StateReaderTaskEither_[js.Any, js.Any, E, B]
  ]]
  
  @scala.inline
  def chainIOEitherKW[E, A, B](f: js.Function1[/* a */ A, IOEither_[E, B]]): js.Function1[
    /* ma */ StateReaderTaskEither_[js.Any, js.Any, js.Any, A], 
    StateReaderTaskEither_[js.Any, js.Any, E | js.Any, B]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainIOEitherKW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ma */ StateReaderTaskEither_[js.Any, js.Any, js.Any, A], 
    StateReaderTaskEither_[js.Any, js.Any, E | js.Any, B]
  ]]
  
  @scala.inline
  def chainReaderTaskEitherK[R, E, A, B](f: js.Function1[/* a */ A, ReaderTaskEither_[R, E, B]]): js.Function1[
    /* ma */ StateReaderTaskEither_[js.Any, R, E, A], 
    StateReaderTaskEither_[js.Any, R, E, B]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainReaderTaskEitherK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ma */ StateReaderTaskEither_[js.Any, R, E, A], 
    StateReaderTaskEither_[js.Any, R, E, B]
  ]]
  
  @scala.inline
  def chainReaderTaskEitherKW[R, E, A, B](f: js.Function1[/* a */ A, ReaderTaskEither_[R, E, B]]): js.Function1[
    /* ma */ StateReaderTaskEither_[js.Any, R, js.Any, A], 
    StateReaderTaskEither_[js.Any, R, E | js.Any, B]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainReaderTaskEitherKW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ma */ StateReaderTaskEither_[js.Any, R, js.Any, A], 
    StateReaderTaskEither_[js.Any, R, E | js.Any, B]
  ]]
  
  @scala.inline
  def chainTaskEitherK[E, A, B](f: js.Function1[/* a */ A, TaskEither_[E, B]]): js.Function1[
    /* ma */ StateReaderTaskEither_[js.Any, js.Any, E, A], 
    StateReaderTaskEither_[js.Any, js.Any, E, B]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainTaskEitherK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ma */ StateReaderTaskEither_[js.Any, js.Any, E, A], 
    StateReaderTaskEither_[js.Any, js.Any, E, B]
  ]]
  
  @scala.inline
  def chainTaskEitherKW[E, A, B](f: js.Function1[/* a */ A, TaskEither_[E, B]]): js.Function1[
    /* ma */ StateReaderTaskEither_[js.Any, js.Any, js.Any, A], 
    StateReaderTaskEither_[js.Any, js.Any, E | js.Any, B]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainTaskEitherKW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ma */ StateReaderTaskEither_[js.Any, js.Any, js.Any, A], 
    StateReaderTaskEither_[js.Any, js.Any, E | js.Any, B]
  ]]
  
  @scala.inline
  def chainW[S, R, E, A, B](f: js.Function1[/* a */ A, StateReaderTaskEither_[S, R, E, B]]): js.Function1[
    /* ma */ StateReaderTaskEither_[S, js.Any, js.Any, A], 
    StateReaderTaskEither_[S, js.Any & R, js.Any | E, B]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ma */ StateReaderTaskEither_[S, js.Any, js.Any, A], 
    StateReaderTaskEither_[S, js.Any & R, js.Any | E, B]
  ]]
  
  @scala.inline
  def evalState[S, R, E, A](ma: StateReaderTaskEither_[S, R, E, A], s: S): ReaderTaskEither_[R, E, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("evalState")(ma.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[ReaderTaskEither_[R, E, A]]
  
  @scala.inline
  def evaluate[S](s: S): js.Function1[
    /* ma */ StateReaderTaskEither_[S, js.Any, js.Any, js.Any], 
    ReaderTaskEither_[js.Any, js.Any, js.Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("evaluate")(s.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ma */ StateReaderTaskEither_[S, js.Any, js.Any, js.Any], 
    ReaderTaskEither_[js.Any, js.Any, js.Any]
  ]]
  
  @scala.inline
  def execState[S, R, E, A](ma: StateReaderTaskEither_[S, R, E, A], s: S): ReaderTaskEither_[R, E, S] = (^.asInstanceOf[js.Dynamic].applyDynamic("execState")(ma.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[ReaderTaskEither_[R, E, S]]
  
  @scala.inline
  def execute[S](s: S): js.Function1[
    /* ma */ StateReaderTaskEither_[S, js.Any, js.Any, js.Any], 
    ReaderTaskEither_[js.Any, js.Any, S]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("execute")(s.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ma */ StateReaderTaskEither_[S, js.Any, js.Any, js.Any], 
    ReaderTaskEither_[js.Any, js.Any, S]
  ]]
  
  @scala.inline
  def filterOrElse[E, A](predicate: Predicate[A], onFalse: js.Function1[/* a */ A, E]): js.Function1[
    /* ma */ StateReaderTaskEither_[js.Any, js.Any, E, A], 
    StateReaderTaskEither_[js.Any, js.Any, E, A]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterOrElse")(predicate.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* ma */ StateReaderTaskEither_[js.Any, js.Any, E, A], 
    StateReaderTaskEither_[js.Any, js.Any, E, A]
  ]]
  
  @scala.inline
  def filterOrElse_EAB_A[E, A, B /* <: A */](refinement: Refinement[A, B], onFalse: js.Function1[/* a */ A, E]): js.Function1[
    /* ma */ StateReaderTaskEither_[js.Any, js.Any, E, A], 
    StateReaderTaskEither_[js.Any, js.Any, E, B]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterOrElse")(refinement.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* ma */ StateReaderTaskEither_[js.Any, js.Any, E, A], 
    StateReaderTaskEither_[js.Any, js.Any, E, B]
  ]]
  
  @scala.inline
  def flatten[S, R, E, A](mma: StateReaderTaskEither_[S, R, E, StateReaderTaskEither_[S, R, E, A]]): StateReaderTaskEither_[S, R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(mma.asInstanceOf[js.Any]).asInstanceOf[StateReaderTaskEither_[S, R, E, A]]
  
  @scala.inline
  def fromEither[S, R, E, A](ma: Either_[E, A]): StateReaderTaskEither_[S, R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEither")(ma.asInstanceOf[js.Any]).asInstanceOf[StateReaderTaskEither_[S, R, E, A]]
  
  @scala.inline
  def fromEitherK[E, A /* <: js.Array[js.Any] */, B](f: js.Function1[/* a */ A, Either_[E, B]]): js.Function1[/* a */ A, StateReaderTaskEither_[js.Any, js.Any, E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEitherK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, StateReaderTaskEither_[js.Any, js.Any, E, B]]]
  
  @JSImport("fp-ts", "stateReaderTaskEither.fromIO")
  @js.native
  val fromIO: js.Function1[
    /* fa */ IO_[js.Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, R, E, A> */ js.Any
  ] = js.native
  
  @scala.inline
  def fromIOEither[S, R, E, A](ma: IOEither_[E, A]): StateReaderTaskEither_[S, R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIOEither")(ma.asInstanceOf[js.Any]).asInstanceOf[StateReaderTaskEither_[S, R, E, A]]
  
  @scala.inline
  def fromIOEitherK[E, A /* <: js.Array[js.Any] */, B](f: js.Function1[/* a */ A, IOEither_[E, B]]): js.Function1[/* a */ A, StateReaderTaskEither_[js.Any, js.Any, E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIOEitherK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, StateReaderTaskEither_[js.Any, js.Any, E, B]]]
  
  @scala.inline
  def fromOption[E](onNone: Lazy[E]): js.Function1[/* ma */ Option_[js.Any], StateReaderTaskEither_[js.Any, js.Any, E, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOption")(onNone.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Option_[js.Any], StateReaderTaskEither_[js.Any, js.Any, E, js.Any]]]
  
  @scala.inline
  def fromPredicate[E, A](predicate: Predicate[A], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* a */ A, StateReaderTaskEither_[js.Any, js.Any, E, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(predicate.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ A, StateReaderTaskEither_[js.Any, js.Any, E, A]]]
  
  @scala.inline
  def fromPredicate_EAB_A[E, A, B /* <: A */](refinement: Refinement[A, B], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* a */ A, StateReaderTaskEither_[js.Any, js.Any, E, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(refinement.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ A, StateReaderTaskEither_[js.Any, js.Any, E, B]]]
  
  @scala.inline
  def fromReaderEither[S, R, E, A](ma: ReaderEither_[R, E, A]): StateReaderTaskEither_[S, R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromReaderEither")(ma.asInstanceOf[js.Any]).asInstanceOf[StateReaderTaskEither_[S, R, E, A]]
  
  @scala.inline
  def fromReaderTaskEither[S, R, E, A](ma: ReaderTaskEither_[R, E, A]): StateReaderTaskEither_[S, R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromReaderTaskEither")(ma.asInstanceOf[js.Any]).asInstanceOf[StateReaderTaskEither_[S, R, E, A]]
  
  @scala.inline
  def fromReaderTaskEitherK[R, E, A /* <: js.Array[js.Any] */, B](f: js.Function1[/* a */ A, ReaderTaskEither_[R, E, B]]): js.Function1[/* a */ A, StateReaderTaskEither_[js.Any, R, E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromReaderTaskEitherK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, StateReaderTaskEither_[js.Any, R, E, B]]]
  
  @JSImport("fp-ts", "stateReaderTaskEither.fromTask")
  @js.native
  val fromTask: js.Function1[
    /* fa */ Task_[js.Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, R, E, A> */ js.Any
  ] = js.native
  
  @scala.inline
  def fromTaskEither[S, R, E, A](ma: TaskEither_[E, A]): StateReaderTaskEither_[S, R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTaskEither")(ma.asInstanceOf[js.Any]).asInstanceOf[StateReaderTaskEither_[S, R, E, A]]
  
  @scala.inline
  def fromTaskEitherK[E, A /* <: js.Array[js.Any] */, B](f: js.Function1[/* a */ A, TaskEither_[E, B]]): js.Function1[/* a */ A, StateReaderTaskEither_[js.Any, js.Any, E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTaskEitherK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, StateReaderTaskEither_[js.Any, js.Any, E, B]]]
  
  @scala.inline
  def get[S, R, E](): StateReaderTaskEither_[S, R, E, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[StateReaderTaskEither_[S, R, E, S]]
  
  @scala.inline
  def gets[S, R, E, A](f: js.Function1[/* s */ S, A]): StateReaderTaskEither_[S, R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("gets")(f.asInstanceOf[js.Any]).asInstanceOf[StateReaderTaskEither_[S, R, E, A]]
  
  @scala.inline
  def left[S, R, E, A](e: E): StateReaderTaskEither_[S, R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("left")(e.asInstanceOf[js.Any]).asInstanceOf[StateReaderTaskEither_[S, R, E, A]]
  
  @scala.inline
  def leftIO[S, R, E, A](me: IO_[E]): StateReaderTaskEither_[S, R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("leftIO")(me.asInstanceOf[js.Any]).asInstanceOf[StateReaderTaskEither_[S, R, E, A]]
  
  @scala.inline
  def leftReader[S, R, E, A](me: Reader_[R, E]): StateReaderTaskEither_[S, R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("leftReader")(me.asInstanceOf[js.Any]).asInstanceOf[StateReaderTaskEither_[S, R, E, A]]
  
  @scala.inline
  def leftState[S, R, E, A](me: State_[S, E]): StateReaderTaskEither_[S, R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("leftState")(me.asInstanceOf[js.Any]).asInstanceOf[StateReaderTaskEither_[S, R, E, A]]
  
  @scala.inline
  def leftTask[S, R, E, A](me: Task_[E]): StateReaderTaskEither_[S, R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("leftTask")(me.asInstanceOf[js.Any]).asInstanceOf[StateReaderTaskEither_[S, R, E, A]]
  
  @scala.inline
  def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[
    /* fa */ StateReaderTaskEither_[js.Any, js.Any, js.Any, A], 
    StateReaderTaskEither_[js.Any, js.Any, js.Any, B]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ StateReaderTaskEither_[js.Any, js.Any, js.Any, A], 
    StateReaderTaskEither_[js.Any, js.Any, js.Any, B]
  ]]
  
  @scala.inline
  def mapLeft[E, G](f: js.Function1[/* e */ E, G]): js.Function1[
    /* fa */ StateReaderTaskEither_[js.Any, js.Any, E, js.Any], 
    StateReaderTaskEither_[js.Any, js.Any, G, js.Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapLeft")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ StateReaderTaskEither_[js.Any, js.Any, E, js.Any], 
    StateReaderTaskEither_[js.Any, js.Any, G, js.Any]
  ]]
  
  @scala.inline
  def modify[S, R, E](f: js.Function1[/* s */ S, S]): StateReaderTaskEither_[S, R, E, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("modify")(f.asInstanceOf[js.Any]).asInstanceOf[StateReaderTaskEither_[S, R, E, Unit]]
  
  @JSImport("fp-ts", "stateReaderTaskEither.of")
  @js.native
  val of: js.Function1[
    /* a */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ js.Any
  ] = js.native
  
  @scala.inline
  def put[S, R, E](s: S): StateReaderTaskEither_[S, R, E, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("put")(s.asInstanceOf[js.Any]).asInstanceOf[StateReaderTaskEither_[S, R, E, Unit]]
  
  @scala.inline
  def right[S, R, E, A](a: A): StateReaderTaskEither_[S, R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("right")(a.asInstanceOf[js.Any]).asInstanceOf[StateReaderTaskEither_[S, R, E, A]]
  
  @scala.inline
  def rightIO[S, R, E, A](ma: IO_[A]): StateReaderTaskEither_[S, R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("rightIO")(ma.asInstanceOf[js.Any]).asInstanceOf[StateReaderTaskEither_[S, R, E, A]]
  
  @scala.inline
  def rightReader[S, R, E, A](ma: Reader_[R, A]): StateReaderTaskEither_[S, R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("rightReader")(ma.asInstanceOf[js.Any]).asInstanceOf[StateReaderTaskEither_[S, R, E, A]]
  
  @scala.inline
  def rightState[S, R, E, A](ma: State_[S, A]): StateReaderTaskEither_[S, R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("rightState")(ma.asInstanceOf[js.Any]).asInstanceOf[StateReaderTaskEither_[S, R, E, A]]
  
  @scala.inline
  def rightTask[S, R, E, A](ma: Task_[A]): StateReaderTaskEither_[S, R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("rightTask")(ma.asInstanceOf[js.Any]).asInstanceOf[StateReaderTaskEither_[S, R, E, A]]
  
  @scala.inline
  def run[S, R, E, A](ma: StateReaderTaskEither_[S, R, E, A], s: S, r: R): js.Promise[Either_[E, js.Tuple2[A, S]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(ma.asInstanceOf[js.Any], s.asInstanceOf[js.Any], r.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Either_[E, js.Tuple2[A, S]]]]
  
  @JSImport("fp-ts", "stateReaderTaskEither.stateReaderTaskEither")
  @js.native
  val stateReaderTaskEither: Monad4[typings.fpTs.stateReaderTaskEitherMod.URI] & Bifunctor4[typings.fpTs.stateReaderTaskEitherMod.URI] & Alt4[typings.fpTs.stateReaderTaskEitherMod.URI] & MonadTask4[typings.fpTs.stateReaderTaskEitherMod.URI] & MonadThrow4[typings.fpTs.stateReaderTaskEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "stateReaderTaskEither.stateReaderTaskEitherSeq")
  @js.native
  val stateReaderTaskEitherSeq: Monad4[typings.fpTs.stateReaderTaskEitherMod.URI] & Bifunctor4[typings.fpTs.stateReaderTaskEitherMod.URI] & Alt4[typings.fpTs.stateReaderTaskEitherMod.URI] & MonadTask4[typings.fpTs.stateReaderTaskEitherMod.URI] & MonadThrow4[typings.fpTs.stateReaderTaskEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "stateReaderTaskEither.throwError")
  @js.native
  val throwError: js.Function1[
    /* e */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, R, E, A> */ js.Any
  ] = js.native
  
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind[A] extends StObject
  }
}
