package typings.fpTs.libFilterableMod

import typings.fpTs.libCompactableMod.Compactable4
import typings.fpTs.libEitherMod.Either_
import typings.fpTs.libFunctorMod.Functor4
import typings.fpTs.libOptionMod.Option_
import typings.fpTs.libPredicateMod.Predicate
import typings.fpTs.libRefinementMod.Refinement
import typings.fpTs.libSeparatedMod.Separated_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Filterable4[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */]
  extends StObject
     with Functor4[F]
     with Compactable4[F] {
  
  /* InferMemberOverrides */
  override val URI: F = js.native
  
  def filter[S, R, E, A](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ Any,
    predicate: Predicate[A]
  ): Any = js.native
  
  def filterMap[S, R, E, A, B](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ Any,
    f: js.Function1[/* a */ A, Option_[B]]
  ): Any = js.native
  
  @JSName("filter")
  def filter_SREAB[S, R, E, A, B /* <: A */](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ Any,
    refinement: Refinement[A, B]
  ): Any = js.native
  
  def partition[S, R, E, A](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ Any,
    predicate: Predicate[A]
  ): Separated_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ Any
  ] = js.native
  
  def partitionMap[S, R, E, A, B, C](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ Any,
    f: js.Function1[/* a */ A, Either_[B, C]]
  ): Separated_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, B> */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, C> */ Any
  ] = js.native
  
  @JSName("partition")
  def partition_SREAB[S, R, E, A, B /* <: A */](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ Any,
    refinement: Refinement[A, B]
  ): Separated_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, B> */ Any
  ] = js.native
}
