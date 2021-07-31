package typings.fpTs.pipeableMod

import typings.fpTs.compactableMod.Separated
import typings.fpTs.eitherMod.Either_
import typings.fpTs.filterableWithIndexMod.PredicateWithIndex
import typings.fpTs.filterableWithIndexMod.RefinementWithIndex
import typings.fpTs.optionMod.Option_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PipeableFilterableWithIndex4[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ js.Any */, I]
  extends StObject
     with PipeableFilterable4[F] {
  
  def filterMapWithIndex[A, B](f: js.Function2[/* i */ I, /* a */ A, Option_[B]]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ /* fa */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ js.Any
  ] = js.native
  
  def filterWithIndex[A](predicateWithIndex: PredicateWithIndex[I, A]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ /* fa */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ js.Any
  ] = js.native
  @JSName("filterWithIndex")
  def filterWithIndex_AB_A[A, B /* <: A */](refinementWithIndex: RefinementWithIndex[I, A, B]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ /* fa */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, B> */ js.Any
  ] = js.native
  
  def partitionMapWithIndex[A, B, C](f: js.Function2[/* i */ I, /* a */ A, Either_[B, C]]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ /* fa */ js.Any, 
    Separated[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, B> */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, C> */ js.Any
    ]
  ] = js.native
  
  def partitionWithIndex[A](predicateWithIndex: PredicateWithIndex[I, A]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ /* fa */ js.Any, 
    Separated[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ js.Any
    ]
  ] = js.native
  @JSName("partitionWithIndex")
  def partitionWithIndex_AB_A[A, B /* <: A */](refinementWithIndex: RefinementWithIndex[I, A, B]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ /* fa */ js.Any, 
    Separated[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, B> */ js.Any
    ]
  ] = js.native
}
