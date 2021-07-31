package typings.fpTs.filterableMod

import typings.fpTs.compactableMod.Compactable2C
import typings.fpTs.compactableMod.Separated
import typings.fpTs.eitherMod.Either_
import typings.fpTs.functionMod.Predicate
import typings.fpTs.functionMod.Refinement
import typings.fpTs.functorMod.Functor2C
import typings.fpTs.optionMod.Option_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Filterable2C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E]
  extends StObject
     with Functor2C[F, E]
     with Compactable2C[F, E] {
  
  /* InferMemberOverrides */
  override val URI: F = js.native
  
  /* InferMemberOverrides */
  override val _E: E = js.native
  
  def filter[A](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any,
    predicate: Predicate[A]
  ): js.Any = js.native
  
  def filterMap[A, B](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any,
    f: js.Function1[/* a */ A, Option_[B]]
  ): js.Any = js.native
  
  @JSName("filter")
  def filter_AB_A[A, B /* <: A */](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any,
    refinement: Refinement[A, B]
  ): js.Any = js.native
  
  def partition[A](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any,
    predicate: Predicate[A]
  ): Separated[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any
  ] = js.native
  
  def partitionMap[A, B, C](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any,
    f: js.Function1[/* a */ A, Either_[B, C]]
  ): Separated[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, C> */ js.Any
  ] = js.native
  
  @JSName("partition")
  def partition_AB_A[A, B /* <: A */](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any,
    refinement: Refinement[A, B]
  ): Separated[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ js.Any
  ] = js.native
}
