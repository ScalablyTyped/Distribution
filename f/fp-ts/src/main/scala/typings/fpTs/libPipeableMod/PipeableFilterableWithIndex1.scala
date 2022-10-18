package typings.fpTs.libPipeableMod

import typings.fpTs.libEitherMod.Either_
import typings.fpTs.libFilterableWithIndexMod.PredicateWithIndex
import typings.fpTs.libFilterableWithIndexMod.RefinementWithIndex
import typings.fpTs.libOptionMod.Option_
import typings.fpTs.libSeparatedMod.Separated_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PipeableFilterableWithIndex1[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, I]
  extends StObject
     with PipeableFilterable1[F] {
  
  def filterMapWithIndex[A, B](f: js.Function2[/* i */ I, /* a */ A, Option_[B]]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any
  ] = js.native
  
  def filterWithIndex[A](predicateWithIndex: PredicateWithIndex[I, A]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any
  ] = js.native
  @JSName("filterWithIndex")
  def filterWithIndex_AB[A, B /* <: A */](refinementWithIndex: RefinementWithIndex[I, A, B]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any
  ] = js.native
  
  def partitionMapWithIndex[A, B, C](f: js.Function2[/* i */ I, /* a */ A, Either_[B, C]]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ Any, 
    Separated_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, C> */ Any
    ]
  ] = js.native
  
  def partitionWithIndex[A](predicateWithIndex: PredicateWithIndex[I, A]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ Any, 
    Separated_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any
    ]
  ] = js.native
  @JSName("partitionWithIndex")
  def partitionWithIndex_AB[A, B /* <: A */](refinementWithIndex: RefinementWithIndex[I, A, B]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ Any, 
    Separated_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any
    ]
  ] = js.native
}
