package typings.fpTs.libPipeableMod

import typings.fpTs.libEitherMod.Either_
import typings.fpTs.libOptionMod.Option_
import typings.fpTs.libPredicateMod.Predicate
import typings.fpTs.libRefinementMod.Refinement
import typings.fpTs.libSeparatedMod.Separated_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PipeableFilterable[F]
  extends StObject
     with PipeableCompactable[F] {
  
  def filter[A](predicate: Predicate[A]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ /* fa */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any
  ] = js.native
  
  def filterMap[A, B](f: js.Function1[/* a */ A, Option_[B]]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ /* fa */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ Any
  ] = js.native
  
  @JSName("filter")
  def filter_AB[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ /* fa */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ Any
  ] = js.native
  
  def partition[A](predicate: Predicate[A]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ /* fa */ Any, 
    Separated_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any
    ]
  ] = js.native
  
  def partitionMap[A, B, C](f: js.Function1[/* a */ A, Either_[B, C]]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ /* fa */ Any, 
    Separated_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, C> */ Any
    ]
  ] = js.native
  
  @JSName("partition")
  def partition_AB[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ /* fa */ Any, 
    Separated_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ Any
    ]
  ] = js.native
}
