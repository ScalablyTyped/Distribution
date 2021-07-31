package typings.fpTs.pipeableMod

import typings.fpTs.eitherMod.Either_
import typings.fpTs.functionMod.Lazy
import typings.fpTs.functionMod.Predicate
import typings.fpTs.functionMod.Refinement
import typings.fpTs.optionMod.Option_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PipeableMonadThrow1[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */] extends StObject {
  
  def filterOrElse[E, A](predicate: Predicate[A], onFalse: js.Function1[/* a */ A, E]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* ma */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ js.Any
  ] = js.native
  @JSName("filterOrElse")
  def filterOrElse_EAB_A[E, A, B /* <: A */](refinement: Refinement[A, B], onFalse: js.Function1[/* a */ A, E]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* ma */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ js.Any
  ] = js.native
  
  def fromEither[E, A](ma: Either_[E, A]): js.Any = js.native
  
  def fromOption[E](onNone: Lazy[E]): js.Function1[
    /* ma */ Option_[js.Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ js.Any
  ] = js.native
  
  def fromPredicate[E, A](predicate: Predicate[A], onFalse: js.Function1[/* a */ A, E]): js.Function1[
    /* a */ A, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ js.Any
  ] = js.native
  @JSName("fromPredicate")
  def fromPredicate_EAB_A[E, A, B /* <: A */](refinement: Refinement[A, B], onFalse: js.Function1[/* a */ A, E]): js.Function1[
    /* a */ A, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ js.Any
  ] = js.native
}
