package typings.fpTs.libPipeableMod

import typings.fpTs.libEitherMod.Either_
import typings.fpTs.libFunctionMod.Lazy
import typings.fpTs.libOptionMod.Option_
import typings.fpTs.libPredicateMod.Predicate
import typings.fpTs.libRefinementMod.Refinement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PipeableMonadThrow3[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */] extends StObject {
  
  def filterOrElse[E, A](predicate: Predicate[A], onFalse: js.Function1[/* a */ A, E]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* ma */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any
  ] = js.native
  @JSName("filterOrElse")
  def filterOrElse_EAB[E, A, B /* <: A */](refinement: Refinement[A, B], onFalse: js.Function1[/* a */ A, E]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* ma */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ Any
  ] = js.native
  
  def fromEither[R, E, A](ma: Either_[E, A]): Any = js.native
  
  def fromOption[E](onNone: Lazy[E]): js.Function1[
    /* ma */ Option_[Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any
  ] = js.native
  
  def fromPredicate[E, A](predicate: Predicate[A], onFalse: js.Function1[/* a */ A, E]): js.Function1[
    /* a */ A, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any
  ] = js.native
  @JSName("fromPredicate")
  def fromPredicate_EAB[E, A, B /* <: A */](refinement: Refinement[A, B], onFalse: js.Function1[/* a */ A, E]): js.Function1[
    /* a */ A, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, U, E, B> */ Any
  ] = js.native
}
