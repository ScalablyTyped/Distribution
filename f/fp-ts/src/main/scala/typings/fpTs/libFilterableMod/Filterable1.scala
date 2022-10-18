package typings.fpTs.libFilterableMod

import typings.fpTs.libCompactableMod.Compactable1
import typings.fpTs.libEitherMod.Either_
import typings.fpTs.libFunctorMod.Functor1
import typings.fpTs.libOptionMod.Option_
import typings.fpTs.libPredicateMod.Predicate
import typings.fpTs.libRefinementMod.Refinement
import typings.fpTs.libSeparatedMod.Separated_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Filterable1[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */]
  extends StObject
     with Functor1[F]
     with Compactable1[F] {
  
  /* InferMemberOverrides */
  override val URI: F = js.native
  
  def filter[A](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any,
    predicate: Predicate[A]
  ): Any = js.native
  
  def filterMap[A, B](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any,
    f: js.Function1[/* a */ A, Option_[B]]
  ): Any = js.native
  
  @JSName("filter")
  def filter_AB[A, B /* <: A */](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any,
    refinement: Refinement[A, B]
  ): Any = js.native
  
  def partition[A](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any,
    predicate: Predicate[A]
  ): Separated_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any
  ] = js.native
  
  def partitionMap[A, B, C](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any,
    f: js.Function1[/* a */ A, Either_[B, C]]
  ): Separated_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, C> */ Any
  ] = js.native
  
  @JSName("partition")
  def partition_AB[A, B /* <: A */](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any,
    refinement: Refinement[A, B]
  ): Separated_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any
  ] = js.native
}
