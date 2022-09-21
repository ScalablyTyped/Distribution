package typings.fpTs.filterableMod

import typings.fpTs.compactableMod.Compactable
import typings.fpTs.eitherMod.Either_
import typings.fpTs.functorMod.Functor
import typings.fpTs.optionMod.Option_
import typings.fpTs.predicateMod.Predicate
import typings.fpTs.refinementMod.Refinement
import typings.fpTs.separatedMod.Separated_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Filterable[F]
  extends StObject
     with Functor[F]
     with Compactable[F] {
  
  /* InferMemberOverrides */
  override val URI: F = js.native
  
  /**
    * Filter a data structure based on a boolean predicate.
    */
  def filter[A](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any,
    predicate: Predicate[A]
  ): Any = js.native
  
  /**
    * Map over a data structure and filter based on an option predicate.
    */
  def filterMap[A, B](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any,
    f: js.Function1[/* a */ A, Option_[B]]
  ): Any = js.native
  
  /**
    * Filter a data structure based on a boolean predicate.
    */
  @JSName("filter")
  def filter_AB_A[A, B /* <: A */](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any,
    refinement: Refinement[A, B]
  ): Any = js.native
  
  /**
    * Partition a data structure based on a boolean predicate.
    */
  def partition[A](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any,
    predicate: Predicate[A]
  ): Separated_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any
  ] = js.native
  
  /**
    * Partition a data structure based on an either predicate.
    */
  def partitionMap[A, B, C](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any,
    f: js.Function1[/* a */ A, Either_[B, C]]
  ): Separated_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, C> */ Any
  ] = js.native
  
  /**
    * Partition a data structure based on a boolean predicate.
    */
  @JSName("partition")
  def partition_AB_A[A, B /* <: A */](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any,
    refinement: Refinement[A, B]
  ): Separated_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ Any
  ] = js.native
}
