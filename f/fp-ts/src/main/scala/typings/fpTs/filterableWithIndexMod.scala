package typings.fpTs

import typings.fpTs.eitherMod.Either_
import typings.fpTs.filterableMod.Filterable
import typings.fpTs.filterableMod.Filterable1
import typings.fpTs.filterableMod.Filterable2
import typings.fpTs.filterableMod.Filterable2C
import typings.fpTs.filterableMod.Filterable3
import typings.fpTs.filterableMod.Filterable3C
import typings.fpTs.filterableMod.Filterable4
import typings.fpTs.functorWithIndexMod.FunctorWithIndex
import typings.fpTs.functorWithIndexMod.FunctorWithIndex1
import typings.fpTs.functorWithIndexMod.FunctorWithIndex2
import typings.fpTs.functorWithIndexMod.FunctorWithIndex2C
import typings.fpTs.functorWithIndexMod.FunctorWithIndex3
import typings.fpTs.functorWithIndexMod.FunctorWithIndex3C
import typings.fpTs.functorWithIndexMod.FunctorWithIndex4
import typings.fpTs.optionMod.Option_
import typings.fpTs.separatedMod.Separated_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filterableWithIndexMod {
  
  @js.native
  trait FilterWithIndex[F, I] extends StObject {
    
    def apply[A](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any,
      predicateWithIndex: PredicateWithIndex[I, A]
    ): Any = js.native
  }
  
  @js.native
  trait FilterWithIndex1[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, I] extends StObject {
    
    def apply[A](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any,
      predicateWithIndex: PredicateWithIndex[I, A]
    ): Any = js.native
  }
  
  @js.native
  trait FilterWithIndex2[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, I] extends StObject {
    
    def apply[E, A](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any,
      predicateWithIndex: PredicateWithIndex[I, A]
    ): Any = js.native
  }
  
  @js.native
  trait FilterWithIndex2C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, I, E] extends StObject {
    
    def apply[A](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any,
      predicateWithIndex: PredicateWithIndex[I, A]
    ): Any = js.native
  }
  
  @js.native
  trait FilterWithIndex3[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, I] extends StObject {
    
    def apply[R, E, A](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any,
      predicateWithIndex: PredicateWithIndex[I, A]
    ): Any = js.native
  }
  
  @js.native
  trait FilterWithIndex3C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, I, E] extends StObject {
    
    def apply[R, A](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any,
      predicateWithIndex: PredicateWithIndex[I, A]
    ): Any = js.native
  }
  
  @js.native
  trait FilterWithIndex4[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */, I] extends StObject {
    
    def apply[S, R, E, A](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ Any,
      predicateWithIndex: PredicateWithIndex[I, A]
    ): Any = js.native
  }
  
  @js.native
  trait FilterableWithIndex[F, I]
    extends StObject
       with FunctorWithIndex[F, I]
       with Filterable[F] {
    
    /* InferMemberOverrides */
    override val URI: F = js.native
    
    def filterMapWithIndex[A, B](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any,
      f: js.Function2[/* i */ I, /* a */ A, Option_[B]]
    ): Any = js.native
    
    def filterWithIndex[A](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any,
      predicateWithIndex: PredicateWithIndex[I, A]
    ): Any = js.native
    @JSName("filterWithIndex")
    def filterWithIndex_AB_A[A, B /* <: A */](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any,
      refinementWithIndex: RefinementWithIndex[I, A, B]
    ): Any = js.native
    
    def partitionMapWithIndex[A, B, C](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any,
      f: js.Function2[/* i */ I, /* a */ A, Either_[B, C]]
    ): Separated_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, C> */ Any
      ] = js.native
    
    def partitionWithIndex[A](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any,
      predicateWithIndex: PredicateWithIndex[I, A]
    ): Separated_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any
      ] = js.native
    @JSName("partitionWithIndex")
    def partitionWithIndex_AB_A[A, B /* <: A */](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any,
      refinementWithIndex: RefinementWithIndex[I, A, B]
    ): Separated_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ Any
      ] = js.native
  }
  
  @js.native
  trait FilterableWithIndex1[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, I]
    extends StObject
       with FunctorWithIndex1[F, I]
       with Filterable1[F] {
    
    /* InferMemberOverrides */
    override val URI: F = js.native
    
    def filterMapWithIndex[A, B](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any,
      f: js.Function2[/* i */ I, /* a */ A, Option_[B]]
    ): Any = js.native
    
    def filterWithIndex[A](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any,
      predicateWithIndex: PredicateWithIndex[I, A]
    ): Any = js.native
    @JSName("filterWithIndex")
    def filterWithIndex_AB_A[A, B /* <: A */](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any,
      refinementWithIndex: RefinementWithIndex[I, A, B]
    ): Any = js.native
    
    def partitionMapWithIndex[A, B, C](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any,
      f: js.Function2[/* i */ I, /* a */ A, Either_[B, C]]
    ): Separated_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, C> */ Any
      ] = js.native
    
    def partitionWithIndex[A](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any,
      predicateWithIndex: PredicateWithIndex[I, A]
    ): Separated_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any
      ] = js.native
    @JSName("partitionWithIndex")
    def partitionWithIndex_AB_A[A, B /* <: A */](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any,
      refinementWithIndex: RefinementWithIndex[I, A, B]
    ): Separated_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any
      ] = js.native
  }
  
  @js.native
  trait FilterableWithIndex2[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, I]
    extends StObject
       with FunctorWithIndex2[F, I]
       with Filterable2[F] {
    
    /* InferMemberOverrides */
    override val URI: F = js.native
    
    def filterMapWithIndex[E, A, B](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any,
      f: js.Function2[/* i */ I, /* a */ A, Option_[B]]
    ): Any = js.native
    
    def filterWithIndex[E, A](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any,
      predicateWithIndex: PredicateWithIndex[I, A]
    ): Any = js.native
    @JSName("filterWithIndex")
    def filterWithIndex_EAB_A[E, A, B /* <: A */](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any,
      refinementWithIndex: RefinementWithIndex[I, A, B]
    ): Any = js.native
    
    def partitionMapWithIndex[E, A, B, C](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any,
      f: js.Function2[/* i */ I, /* a */ A, Either_[B, C]]
    ): Separated_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, C> */ Any
      ] = js.native
    
    def partitionWithIndex[E, A](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any,
      predicateWithIndex: PredicateWithIndex[I, A]
    ): Separated_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any
      ] = js.native
    @JSName("partitionWithIndex")
    def partitionWithIndex_EAB_A[E, A, B /* <: A */](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any,
      refinementWithIndex: RefinementWithIndex[I, A, B]
    ): Separated_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ Any
      ] = js.native
  }
  
  @js.native
  trait FilterableWithIndex2C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, I, E]
    extends StObject
       with FunctorWithIndex2C[F, I, E]
       with Filterable2C[F, E] {
    
    /* InferMemberOverrides */
    override val URI: F = js.native
    
    /* InferMemberOverrides */
    override val _E: E = js.native
    
    def filterMapWithIndex[A, B](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any,
      f: js.Function2[/* i */ I, /* a */ A, Option_[B]]
    ): Any = js.native
    
    def filterWithIndex[A](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any,
      predicateWithIndex: PredicateWithIndex[I, A]
    ): Any = js.native
    @JSName("filterWithIndex")
    def filterWithIndex_AB_A[A, B /* <: A */](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any,
      refinementWithIndex: RefinementWithIndex[I, A, B]
    ): Any = js.native
    
    def partitionMapWithIndex[A, B, C](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any,
      f: js.Function2[/* i */ I, /* a */ A, Either_[B, C]]
    ): Separated_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, C> */ Any
      ] = js.native
    
    def partitionWithIndex[A](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any,
      predicateWithIndex: PredicateWithIndex[I, A]
    ): Separated_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any
      ] = js.native
    @JSName("partitionWithIndex")
    def partitionWithIndex_AB_A[A, B /* <: A */](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any,
      refinementWithIndex: RefinementWithIndex[I, A, B]
    ): Separated_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ Any
      ] = js.native
  }
  
  @js.native
  trait FilterableWithIndex3[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, I]
    extends StObject
       with FunctorWithIndex3[F, I]
       with Filterable3[F] {
    
    /* InferMemberOverrides */
    override val URI: F = js.native
    
    def filterMapWithIndex[R, E, A, B](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any,
      f: js.Function2[/* i */ I, /* a */ A, Option_[B]]
    ): Any = js.native
    
    def filterWithIndex[R, E, A](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any,
      predicateWithIndex: PredicateWithIndex[I, A]
    ): Any = js.native
    @JSName("filterWithIndex")
    def filterWithIndex_REAB_A[R, E, A, B /* <: A */](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any,
      refinementWithIndex: RefinementWithIndex[I, A, B]
    ): Any = js.native
    
    def partitionMapWithIndex[R, E, A, B, C](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any,
      f: js.Function2[/* i */ I, /* a */ A, Either_[B, C]]
    ): Separated_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, C> */ Any
      ] = js.native
    
    def partitionWithIndex[R, E, A](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any,
      predicateWithIndex: PredicateWithIndex[I, A]
    ): Separated_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any
      ] = js.native
    @JSName("partitionWithIndex")
    def partitionWithIndex_REAB_A[R, E, A, B /* <: A */](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any,
      refinementWithIndex: RefinementWithIndex[I, A, B]
    ): Separated_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ Any
      ] = js.native
  }
  
  @js.native
  trait FilterableWithIndex3C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, I, E]
    extends StObject
       with FunctorWithIndex3C[F, I, E]
       with Filterable3C[F, E] {
    
    /* InferMemberOverrides */
    override val URI: F = js.native
    
    /* InferMemberOverrides */
    override val _E: E = js.native
    
    def filterMapWithIndex[R, A, B](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any,
      f: js.Function2[/* i */ I, /* a */ A, Option_[B]]
    ): Any = js.native
    
    def filterWithIndex[R, A](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any,
      predicateWithIndex: PredicateWithIndex[I, A]
    ): Any = js.native
    @JSName("filterWithIndex")
    def filterWithIndex_RAB_A[R, A, B /* <: A */](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any,
      refinementWithIndex: RefinementWithIndex[I, A, B]
    ): Any = js.native
    
    def partitionMapWithIndex[R, A, B, C](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any,
      f: js.Function2[/* i */ I, /* a */ A, Either_[B, C]]
    ): Separated_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, C> */ Any
      ] = js.native
    
    def partitionWithIndex[R, A](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any,
      predicateWithIndex: PredicateWithIndex[I, A]
    ): Separated_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any
      ] = js.native
    @JSName("partitionWithIndex")
    def partitionWithIndex_RAB_A[R, A, B /* <: A */](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any,
      refinementWithIndex: RefinementWithIndex[I, A, B]
    ): Separated_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ Any
      ] = js.native
  }
  
  @js.native
  trait FilterableWithIndex4[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */, I]
    extends StObject
       with FunctorWithIndex4[F, I]
       with Filterable4[F] {
    
    /* InferMemberOverrides */
    override val URI: F = js.native
    
    def filterMapWithIndex[S, R, E, A, B](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ Any,
      f: js.Function2[/* i */ I, /* a */ A, Option_[B]]
    ): Any = js.native
    
    def filterWithIndex[S, R, E, A](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ Any,
      predicateWithIndex: PredicateWithIndex[I, A]
    ): Any = js.native
    @JSName("filterWithIndex")
    def filterWithIndex_SREAB_A[S, R, E, A, B /* <: A */](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ Any,
      refinementWithIndex: RefinementWithIndex[I, A, B]
    ): Any = js.native
    
    def partitionMapWithIndex[S, R, E, A, B, C](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ Any,
      f: js.Function2[/* i */ I, /* a */ A, Either_[B, C]]
    ): Separated_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, B> */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, C> */ Any
      ] = js.native
    
    def partitionWithIndex[S, R, E, A](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ Any,
      predicateWithIndex: PredicateWithIndex[I, A]
    ): Separated_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ Any
      ] = js.native
    @JSName("partitionWithIndex")
    def partitionWithIndex_SREAB_A[S, R, E, A, B /* <: A */](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ Any,
      refinementWithIndex: RefinementWithIndex[I, A, B]
    ): Separated_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, B> */ Any
      ] = js.native
  }
  
  @js.native
  trait PartitionWithIndex[F, I] extends StObject {
    
    def apply[A](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any,
      predicateWithIndex: PredicateWithIndex[I, A]
    ): Separated_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any
      ] = js.native
  }
  
  @js.native
  trait PartitionWithIndex1[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, I] extends StObject {
    
    def apply[A](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any,
      predicateWithIndex: PredicateWithIndex[I, A]
    ): Separated_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any
      ] = js.native
  }
  
  @js.native
  trait PartitionWithIndex2[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, I] extends StObject {
    
    def apply[E, A](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any,
      predicateWithIndex: PredicateWithIndex[I, A]
    ): Separated_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any
      ] = js.native
  }
  
  @js.native
  trait PartitionWithIndex2C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, I, E] extends StObject {
    
    def apply[A](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any,
      predicateWithIndex: PredicateWithIndex[I, A]
    ): Separated_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any
      ] = js.native
  }
  
  @js.native
  trait PartitionWithIndex3[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, I] extends StObject {
    
    def apply[R, E, A](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any,
      predicateWithIndex: PredicateWithIndex[I, A]
    ): Separated_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any
      ] = js.native
  }
  
  @js.native
  trait PartitionWithIndex3C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, I, E] extends StObject {
    
    def apply[R, A](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any,
      predicateWithIndex: PredicateWithIndex[I, A]
    ): Separated_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any
      ] = js.native
  }
  
  @js.native
  trait PartitionWithIndex4[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */, I] extends StObject {
    
    def apply[S, R, E, A](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ Any,
      predicateWithIndex: PredicateWithIndex[I, A]
    ): Separated_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ Any
      ] = js.native
  }
  
  type PredicateWithIndex[I, A] = js.Function2[/* i */ I, /* a */ A, Boolean]
  
  type RefinementWithIndex[I, A, B /* <: A */] = js.Function2[/* i */ I, /* a */ A, /* is B */ Boolean]
}
