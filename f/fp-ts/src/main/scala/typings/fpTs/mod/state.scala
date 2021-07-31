package typings.fpTs.mod

import org.scalablytyped.runtime.TopLevel
import typings.fpTs.applicativeMod.Applicative2
import typings.fpTs.functorMod.Functor2
import typings.fpTs.monadMod.Monad2
import typings.fpTs.stateMod.State_
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object state {
  
  @JSImport("fp-ts", "state")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts", "state.Applicative")
  @js.native
  val Applicative: Applicative2[typings.fpTs.stateMod.URI] = js.native
  
  @JSImport("fp-ts", "state.Functor")
  @js.native
  val Functor: Functor2[typings.fpTs.stateMod.URI] = js.native
  
  @JSImport("fp-ts", "state.Monad")
  @js.native
  val Monad: Monad2[typings.fpTs.stateMod.URI] = js.native
  
  @JSImport("fp-ts", "state.URI")
  @js.native
  val URI: /* "State" */ String = js.native
  
  @scala.inline
  def ap[E, A](fa: State_[E, A]): js.Function1[/* fab */ State_[E, js.Function1[/* a */ A, js.Any]], State_[E, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ State_[E, js.Function1[/* a */ A, js.Any]], State_[E, js.Any]]]
  
  @scala.inline
  def apFirst[E, B](fb: State_[E, B]): js.Function1[/* fa */ State_[E, js.Any], State_[E, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apFirst")(fb.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ State_[E, js.Any], State_[E, js.Any]]]
  
  @scala.inline
  def apS[A, N /* <: String */, S, B](name: Exclude[N, /* keyof A */ String], fb: State_[S, B]): js.Function1[
    /* fa */ State_[S, A], 
    State_[
      S, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apS & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apS")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ State_[S, A], 
    State_[
      S, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apS & TopLevel[A]
    ]
  ]]
  
  @scala.inline
  def apSecond[E, B](fb: State_[E, B]): js.Function1[/* fa */ State_[E, js.Any], State_[E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apSecond")(fb.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ State_[E, js.Any], State_[E, B]]]
  
  @scala.inline
  def bind[N /* <: String */, A, S, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, State_[S, B]]): js.Function1[
    /* fa */ State_[S, A], 
    State_[
      S, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bind & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ State_[S, A], 
    State_[
      S, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bind & TopLevel[A]
    ]
  ]]
  
  @scala.inline
  def bindTo[N /* <: String */](name: N): js.Function1[
    /* fa */ State_[js.Any, js.Any], 
    State_[
      js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N ]: any}
    */ typings.fpTs.fpTsStrings.bindTo & TopLevel[js.Any]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindTo")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ State_[js.Any, js.Any], 
    State_[
      js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N ]: any}
    */ typings.fpTs.fpTsStrings.bindTo & TopLevel[js.Any]
    ]
  ]]
  
  @scala.inline
  def chain[E, A, B](f: js.Function1[/* a */ A, State_[E, B]]): js.Function1[/* ma */ State_[E, A], State_[E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ State_[E, A], State_[E, B]]]
  
  @scala.inline
  def chainFirst[E, A, B](f: js.Function1[/* a */ A, State_[E, B]]): js.Function1[/* ma */ State_[E, A], State_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirst")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ State_[E, A], State_[E, A]]]
  
  @scala.inline
  def evalState[S, A](ma: State_[S, A], s: S): A = (^.asInstanceOf[js.Dynamic].applyDynamic("evalState")(ma.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[A]
  
  @scala.inline
  def evaluate[S](s: S): js.Function1[/* ma */ State_[S, js.Any], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("evaluate")(s.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ State_[S, js.Any], js.Any]]
  
  @scala.inline
  def execState[S, A](ma: State_[S, A], s: S): S = (^.asInstanceOf[js.Dynamic].applyDynamic("execState")(ma.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[S]
  
  @scala.inline
  def execute[S](s: S): js.Function1[/* ma */ State_[S, js.Any], S] = ^.asInstanceOf[js.Dynamic].applyDynamic("execute")(s.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ State_[S, js.Any], S]]
  
  @scala.inline
  def flatten[E, A](mma: State_[E, State_[E, A]]): State_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(mma.asInstanceOf[js.Any]).asInstanceOf[State_[E, A]]
  
  @scala.inline
  def get[S](): State_[S, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[State_[S, S]]
  
  @scala.inline
  def gets[S, A](f: js.Function1[/* s */ S, A]): State_[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("gets")(f.asInstanceOf[js.Any]).asInstanceOf[State_[S, A]]
  
  @scala.inline
  def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ State_[js.Any, A], State_[js.Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ State_[js.Any, A], State_[js.Any, B]]]
  
  @scala.inline
  def modify[S](f: js.Function1[/* s */ S, S]): State_[S, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("modify")(f.asInstanceOf[js.Any]).asInstanceOf[State_[S, Unit]]
  
  @JSImport("fp-ts", "state.of")
  @js.native
  val of: js.Function1[
    /* a */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any
  ] = js.native
  
  @scala.inline
  def put[S](s: S): State_[S, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("put")(s.asInstanceOf[js.Any]).asInstanceOf[State_[S, Unit]]
  
  @JSImport("fp-ts", "state.state")
  @js.native
  val state: Monad2[typings.fpTs.stateMod.URI] = js.native
  
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind[A] extends StObject
  }
}
